package com.office.salon.admin.reservation;

public class AdminReservationPaymentDto {

    private int p_no;
    private String p_uid;
    private int p_price;
    private int p_way;
    private int p_success;
    private String p_reg_date;
    private String p_mod_date;

    public int getP_no() {
        return p_no;
    }

    public void setP_no(int p_no) {
        this.p_no = p_no;
    }

    public String getP_uid() {
        return p_uid;
    }

    public void setP_uid(String p_uid) {
        this.p_uid = p_uid;
    }

    public int getP_price() {
        return p_price;
    }

    public void setP_price(int p_price) {
        this.p_price = p_price;
    }

    public int getP_way() {
        return p_way;
    }

    public void setP_way(int p_way) {
        this.p_way = p_way;
    }

    public int getP_success() {
        return p_success;
    }

    public void setP_success(int p_success) {
        this.p_success = p_success;
    }

    public String getP_reg_date() {
        return p_reg_date;
    }

    public void setP_reg_date(String p_reg_date) {
        this.p_reg_date = p_reg_date;
    }

    public String getP_mod_date() {
        return p_mod_date;
    }

    public void setP_mod_date(String p_mod_date) {
        this.p_mod_date = p_mod_date;
    }
}
