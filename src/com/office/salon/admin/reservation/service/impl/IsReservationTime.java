package com.office.salon.admin.reservation.service.impl;


import com.office.salon.admin.container.AdminContainer;

public class IsReservationTime implements IIsReservationTime {

    private int at_time;


    public IsReservationTime(int at_time){
        this.at_time = at_time;
    };

    @Override
    public boolean execute() {
        return AdminContainer.getInstance().getAdminReservationDao().isReservationTime(at_time);
    }
}
