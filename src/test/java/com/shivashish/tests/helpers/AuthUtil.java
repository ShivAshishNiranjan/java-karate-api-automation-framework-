package com.shivashish.tests.helpers;

import java.util.Base64;

public class AuthUtil {
    public static String basic(String user, String pass) {
        return "Basic " + Base64.getEncoder().encodeToString((user + ":" + pass).getBytes());
    }
}