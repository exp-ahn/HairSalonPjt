package com.office.salon.admin.reservation.service.impl;


import com.office.salon.admin.container.AdminContainer;
import com.office.salon.admin.reservation.AdminReservationDto;
import com.office.salon.admin.reservation.AdminReservationTimeDto;

public class ReservationTimeModify implements IReservationTimeRegist {

    private AdminReservationTimeDto adminReservationTimeDto;


    public ReservationTimeModify(AdminReservationTimeDto adminReservationTimeDto){
        this.adminReservationTimeDto = adminReservationTimeDto;
    };

    @Override
    public int execute() {
        return AdminContainer.getInstance().getAdminReservationDao().reservationTimeModify(adminReservationTimeDto);
    }
}
