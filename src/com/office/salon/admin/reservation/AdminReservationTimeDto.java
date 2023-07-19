package com.office.salon.admin.reservation;

public class AdminReservationTimeDto {
    private int at_no;

    private String at_time;

    public int getAt_no() {
        return at_no;
    }
    public AdminReservationTimeDto() {}

    public AdminReservationTimeDto(int at_no, String at_time){
        this.at_no = at_no;
        this.at_time = at_time;
    }

    public void setAt_no(int at_no) {
        this.at_no = at_no;
    }

    public String getAt_time() {
        return at_time;
    }

    public void setAt_time(String at_time) {
        this.at_time = at_time;
    }
}
