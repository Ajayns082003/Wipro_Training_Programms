package com.demo.nop.core;

import java.util.HashMap;
import java.util.Map;

public class Config {
    private static final Map<String, String> TEAM_URLS = new HashMap<>();

    static {
        TEAM_URLS.put("teamA", "https://demo.nopcommerce.com/");
        TEAM_URLS.put("teamB", "https://demo.nopcommerce.com/");
        // add more teams if needed
    }

    public static String getUrlForTeam(String team) {
        return TEAM_URLS.getOrDefault(team, "https://demo.nopcommerce.com/");
    }
}
