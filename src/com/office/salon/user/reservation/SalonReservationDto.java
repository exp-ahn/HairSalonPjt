package com.office.salon.user.reservation;

public class SalonReservationDto {
    private int r_no;
    private String r_uid;
    private String r_date;
    private String r_time;
    private int r_service;
    private int r_success;
    private String r_reg_date;
    private String r_mod_date;

    public int getR_no() {
        return r_no;
    }

    public void setR_no(int r_no) {
        this.r_no = r_no;
    }

    public String getR_uid() {
        return r_uid;
    }

    public void setR_uid(String r_uid) {
        this.r_uid = r_uid;
    }

    public String getR_date() {
        return r_date;
    }

    public void setR_date(String r_date) {
        this.r_date = r_date;
    }

    public String getR_time() {
        return r_time;
    }

    public void setR_time(String r_time) {
        this.r_time = r_time;
    }

    public int getR_service() {
        return r_service;
    }

    public void setR_service(int r_service) {
        this.r_service = r_service;
    }

    public int getR_success() {
        return r_success;
    }

    public void setR_success(int r_success) {
        this.r_success = r_success;
    }

    public String getR_reg_date() {
        return r_reg_date;
    }

    public void setR_reg_date(String r_reg_date) {
        this.r_reg_date = r_reg_date;
    }

    public String getR_mod_date() {
        return r_mod_date;
    }

    public void setR_mod_date(String r_mod_date) {
        this.r_mod_date = r_mod_date;
    }
}
