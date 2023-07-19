package com.office.salon.admin.reservation;

import com.office.salon.admin.container.AdminContainer;
import com.office.salon.admin.reservation.service.impl.IsReservationTime;
import com.office.salon.admin.reservation.service.impl.ReservationTimeList;
import com.office.salon.admin.reservation.service.impl.ReservationTimeModify;
import com.office.salon.admin.reservation.service.impl.ReservationTimeRegist;

import java.util.ArrayList;

public class AdminReservationController {
    public int reservationTimeRegist(int at_time) {

        return AdminContainer.getInstance().getAdminReservationService().reservationTimeRegist(new ReservationTimeRegist(at_time));
    }

    public boolean isReservationTime(int atTime) {

        return AdminContainer.getInstance().getAdminReservationService().isReservationTime(new IsReservationTime(atTime));
    }

    public ArrayList<AdminReservationTimeDto> reservationTimeList() {

        return AdminContainer.getInstance().getAdminReservationService().reservationTimeList(new ReservationTimeList());
    }

    public int reservationTimeModify(int atTime) {

        return AdminContainer.getInstance().getAdminReservationService().reservationTimeModify(new ReservationTimeModify(atTime));
    }
}
