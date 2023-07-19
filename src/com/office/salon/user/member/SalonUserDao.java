package com.office.salon.user.member;

import com.office.salon.config.SalonDBConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SalonUserDao {

    public boolean isUser(String u_id) {
        System.out.println("[SalonUserDao] isUser()");

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        int result = 0;

        try {
            Class.forName(SalonDBConfig.DB_DRIVER_NAME);

            conn = DriverManager.getConnection(SalonDBConfig.DB_URL, SalonDBConfig.DB_USER, SalonDBConfig.DB_PW);
            String sql = "select count(*) as cnt from user_tbl where u_id = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, u_id);

            for(rs = pstmt.executeQuery();
                rs.next();
                result = rs.getInt("cnt")) {
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                pstmt.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result > 0;
    }

    public int addNewUser(SalonUserDto salonUserDto) {
        System.out.println("[SalonUserDao] addNewUser()");

        Connection conn = null;
        PreparedStatement pstmt = null;
        int result = -1;

        try {
            Class.forName(SalonDBConfig.DB_DRIVER_NAME);

            conn = DriverManager.getConnection(SalonDBConfig.DB_URL, SalonDBConfig.DB_USER, SalonDBConfig.DB_PW);
            String sql = "insert into user_tbl(u_id, u_pw, u_name, u_mail, u_phone, u_grade, u_miles, u_visit, u_reg_date, u_mod_date) " +
                    "values(?, ?, ?, ?, ?, 1, 0, 0, now(), now()) ";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, salonUserDto.getU_id());
            pstmt.setString(1, salonUserDto.getU_pw());
            pstmt.setString(1, salonUserDto.getU_name());
            pstmt.setString(1, salonUserDto.getU_mail());
            pstmt.setString(1, salonUserDto.getU_phone());
            result = pstmt.executeUpdate();

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
