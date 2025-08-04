package Day_13;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Food_Item_JDBC {


    static final String URL = "jdbc:mysql://localhost:3306/Food_item";
    static final String USER = "root";
    static final String PASSWORD = "root"; 

    public static void main(String[] args) {
        try {
          
            Class.forName("com.mysql.cj.jdbc.Driver");

        
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

      
            String insertFoodItem = "INSERT INTO FoodItem (name, description, is_combo) VALUES (?, ?, ?)";
            PreparedStatement ps1 = conn.prepareStatement(insertFoodItem, Statement.RETURN_GENERATED_KEYS);
            ps1.setString(1, "Popcorn");
            ps1.setString(2, "Buttery popcorn");
            ps1.setBoolean(3, false);
            ps1.executeUpdate();
            ResultSet rs1 = ps1.getGeneratedKeys();
            int foodItemId = 0;
            if (rs1.next()) foodItemId = rs1.getInt(1);
            System.out.println("Inserted FoodItem ID: " + foodItemId);
            

            // === 2. Insert into FoodItemSize ===
            String insertSize = "INSERT INTO FoodItemSize (item_id, size_name, rate) VALUES (?, ?, ?)";
            PreparedStatement ps2 = conn.prepareStatement(insertSize);
            ps2.setInt(1, foodItemId);
            ps2.setString(2, "Large");
            ps2.setDouble(3, 5.99);
            ps2.executeUpdate();
            System.out.println("Inserted FoodItemSize for item ID: " + foodItemId);

         
            
            String insertOrder = "INSERT INTO FoodOrder (booking_id, screen_id, seat_id, order_datetime, total_cost, delivery_method) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps3 = conn.prepareStatement(insertOrder);
            ps3.setInt(1, 1); 
            ps3.setInt(2, 2); 
            ps3.setInt(3, 10); 
            ps3.setString(4, LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            ps3.setDouble(5, 5.99); 
            ps3.setString(6, "At Seat");
            ps3.executeUpdate();
            System.out.println("Inserted FoodOrder.");
            

            ps1.close();
            ps2.close();
            ps3.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
