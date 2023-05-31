package org.techit.week7.day2;

import java.sql.*;

public class DBMain {
    public static void main(String[] args) {
        String sql = "select 1+1 as result";
        Connection conn = null;

        try {
            conn = DriverManager.getConnection("jdbc:sqlite:world.db");

            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("result"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
