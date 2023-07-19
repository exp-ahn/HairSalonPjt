package com.office.salon.admin.member;

import com.office.salon.config.SalonDBConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AdminMemberDao {

    //관리자 회원가입
    public int adminSignUpResult(SalonAdminDto salonAdminDto) {
        System.out.println("[AdminMemberDao] adminSignUpResult");

        Connection conn 		= null;
        PreparedStatement pstmt = null;
        int result 				= 0;

        try {

            Class.forName(SalonDBConfig.DB_DRIVER_NAME);

            conn = DriverManager.getConnection(SalonDBConfig.DB_URL,
                    SalonDBConfig.DB_USER,
                    SalonDBConfig.DB_PW);

            String sql =  "insert into admin_tbl (a_id, a_pw, a_mail, a_grade, a_reg_date, a_mod_date) values (?, ?, ?, ?, now(), now());";

            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, salonAdminDto.getA_id());
            pstmt.setString(2, salonAdminDto.getA_pw());
            pstmt.setString(3, salonAdminDto.getA_mail());
            pstmt.setInt(4, salonAdminDto.getA_grade());


            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();

        } finally {

            try {

                if (pstmt != null) 	pstmt.close();
                if (conn != null) 	conn.close();

            } catch (Exception e) {
                e.printStackTrace();

            }

        }

        return result;
    }
}
