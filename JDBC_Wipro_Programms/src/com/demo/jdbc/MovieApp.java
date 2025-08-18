package com.demo.jdbc;

import java.sql.*;
import java.util.*;

import java.sql.*;

public class MovieApp {

    private static final String URL = "jdbc:mysql://localhost:3306/MovieDB";
    private static final String USER = "root";
    private static final String PASS = "root";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
            System.out.println("Connected!");

            // movie
            int movieId = insertMovie(conn, "The Matrix", "Action", 8.7, "Now Showing", "http://image.url/matrix.jpg");

            // cast
            insertMovieCast(conn, movieId, "Keanu Reeves", "Neo");
            insertMovieCast(conn, movieId, "Laurence Fishburne", "Morpheus");

            // review
            insertReview(conn, movieId, "Mind-blowing sci-fi classic!", "John Doe");

            // Fetch and display movies
            fetchMovies(conn);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Insert into Movie table
    public static int insertMovie(Connection conn, String title, String genre, double rating, String status, String posterUrl) throws SQLException {
        String sql = "INSERT INTO Movie (title, genre, rating, status, poster_image_url) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, title);
            ps.setString(2, genre);
            ps.setDouble(3, rating);
            ps.setString(4, status);
            ps.setString(5, posterUrl);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) return rs.getInt(1);
        }
        return -1;
    }

    // Insert into MovieCast table
    public static void insertMovieCast(Connection conn, int movieId, String name, String role) throws SQLException {
        String sql = "INSERT INTO MovieCast (movie_id, person_name, role) VALUES (?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, movieId);
            ps.setString(2, name);
            ps.setString(3, role);
            ps.executeUpdate();
        }
    }

    // Insert into Review table
    public static void insertReview(Connection conn, int movieId, String content, String reviewer) throws SQLException {
        String sql = "INSERT INTO Review (movie_id, content, review_date, reviewer_name) VALUES (?, ?, NOW(), ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, movieId);
            ps.setString(2, content);
            ps.setString(3, reviewer);
            ps.executeUpdate();
        }
    }

    // Fetch and display movies
    public static void fetchMovies(Connection conn) throws SQLException {
        String sql = "SELECT * FROM Movie";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            System.out.println("\n--- Movies ---");
            while (rs.next()) {
                System.out.printf("ID: %d | Title: %s | Genre: %s | Rating: %.1f | Status: %s\n",
                        rs.getInt("movie_id"),
                        rs.getString("title"),
                        rs.getString("genre"),
                        rs.getDouble("rating"),
                        rs.getString("status"));
            }
        }
    }
}
