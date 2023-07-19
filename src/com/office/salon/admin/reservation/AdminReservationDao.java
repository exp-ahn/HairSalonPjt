package com.office.salon.admin.reservation;

import com.office.salon.config.SalonDBConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AdminReservationDao {
    public int reservationTimeRegist(int atTime) {

        Connection conn = null;
        PreparedStatement pstmt = null;
        int result = 0;

        try{
            Class.forName(SalonDBConfig.DB_DRIVER_NAME);

            conn = DriverManager.getConnection(SalonDBConfig.DB_URL, SalonDBConfig.DB_USER, SalonDBConfig.DB_PW);

            String sql = "INSERT INTO abletime_tbl (at_time) " +
                    "values (?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, atTime);

            result = pstmt.executeUpdate();


        }catch (Exception e){
            e.printStackTrace();
            result = -1;
        }
        finally {
            try{
                if(pstmt != null)
                    pstmt.close();
                if(conn != null)
                    conn.close();

            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return result;
    }

    public boolean isReservationTime(int at_time) {

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        int result = 0;

        try{
            Class.forName(SalonDBConfig.DB_DRIVER_NAME);

            conn = DriverManager.getConnection(SalonDBConfig.DB_URL, SalonDBConfig.DB_USER, SalonDBConfig.DB_PW);

            String sql = "select count(*) as cnt from abletime_tbl " +
                    "where at_time = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, at_time);

            rs = pstmt.executeQuery();
            while(rs.next()){
                result = rs.getInt("cnt");
            }


        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                if(pstmt != null)
                    pstmt.close();
                if(conn != null)
                    conn.close();

            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return result >  0 ? true : false;
    }

    public ArrayList<AdminReservationTimeDto> reservationTimeList() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        ArrayList<AdminReservationTimeDto> timeList = null;

        int result = 0;

        try{
            Class.forName(SalonDBConfig.DB_DRIVER_NAME);

            conn = DriverManager.getConnection(SalonDBConfig.DB_URL, SalonDBConfig.DB_USER, SalonDBConfig.DB_PW);

            String sql = "select * as cnt from abletime_tbl";
            pstmt = conn.prepareStatement(sql);

            rs = pstmt.executeQuery();

            while(rs.next()){
                AdminReservationTimeDto adminReservationTimeDto = new AdminReservationTimeDto();

                adminReservationTimeDto.setAt_no(rs.getInt("at_no"));
                adminReservationTimeDto.setAt_time(rs.getString("at_time"));

                timeList.add(adminReservationTimeDto);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                if(pstmt != null)
                    pstmt.close();
                if(conn != null)
                    conn.close();

            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return timeList;
    }

    public int reservationTimeModify(AdminReservationTimeDto adminReservationTimeDto) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        int result = 0;

        try{
            Class.forName(SalonDBConfig.DB_DRIVER_NAME);

            conn = DriverManager.getConnection(SalonDBConfig.DB_URL, SalonDBConfig.DB_USER, SalonDBConfig.DB_PW);

            String sql = "update abletime_tbl set at_time = ? " +
                    "where at_no = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(2, adminReservationTimeDto.getAt_no());
            pstmt.setString(1, adminReservationTimeDto.getAt_time());

            result = pstmt.executeUpdate();


        }catch (Exception e){
            e.printStackTrace();
            result = -1;
        }
        finally {
            try{
                if(pstmt != null)
                    pstmt.close();
                if(conn != null)
                    conn.close();

            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return result;
    }
}
