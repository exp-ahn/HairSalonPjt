package com.office.salon.admin.reservation.service.impl;


import com.office.salon.admin.container.AdminContainer;

public class ReservationTimeRegist implements IReservationTimeRegist {

    private int at_time;


    public ReservationTimeRegist(int at_time){
        this.at_time = at_time;
    };

    @Override
    public int execute() {
        return AdminContainer.getInstance().getAdminReservationDao().reservationTimeRegist(at_time);
    }
}
