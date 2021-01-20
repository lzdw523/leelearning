package com.leedcp;

import java.sql.Connection;

public class TestMain {

    public static void main(String[] args) {

        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
