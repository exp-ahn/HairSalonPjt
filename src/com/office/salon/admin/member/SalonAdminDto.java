package com.office.salon.admin.member;

public class SalonAdminDto {
    private int a_no;
    private String a_id;
    private String a_pw;
    private String a_mail;
    private int a_grade;
    private String a_reg_date;
    private String a_mod_date;

    public SalonAdminDto(){

    }

    public SalonAdminDto(String a_id, String a_pw, String a_mail, int a_grade) {
        this.a_id = a_id;
        this.a_pw = a_pw;
        this.a_mail = a_mail;
        this.a_grade = a_grade;
    }


    public int getA_no() {
        return a_no;
    }

    public void setA_no(int a_no) {
        this.a_no = a_no;
    }

    public String getA_id() {
        return a_id;
    }

    public void setA_id(String a_id) {
        this.a_id = a_id;
    }

    public String getA_pw() {
        return a_pw;
    }

    public void setA_pw(String a_pw) {
        this.a_pw = a_pw;
    }

    public String getA_mail() {
        return a_mail;
    }

    public void setA_mail(String a_mail) {
        this.a_mail = a_mail;
    }

    public int getA_grade() {
        return a_grade;
    }

    public void setA_grade(int a_grade) {
        this.a_grade = a_grade;
    }

    public String getA_reg_date() {
        return a_reg_date;
    }

    public void setA_reg_date(String a_reg_date) {
        this.a_reg_date = a_reg_date;
    }

    public String getA_mod_date() {
        return a_mod_date;
    }

    public void setA_mod_date(String a_mod_date) {
        this.a_mod_date = a_mod_date;
    }
}
