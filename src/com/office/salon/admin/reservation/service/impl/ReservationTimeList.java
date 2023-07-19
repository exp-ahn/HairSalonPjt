package com.office.salon.admin.reservation.service.impl;

import com.office.salon.admin.container.AdminContainer;
import com.office.salon.admin.reservation.AdminReservationTimeDto;

import java.util.ArrayList;

public class ReservationTimeList implements IReservationTimeList {
    public ArrayList<AdminReservationTimeDto> execute(){



        return AdminContainer.getInstance().getAdminReservationDao().reservationTimeList();
    };
}
