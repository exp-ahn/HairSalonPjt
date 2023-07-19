package com.office.salon.admin.reservation;

import com.office.salon.admin.reservation.service.impl.IReservationTimeRegist;
import com.office.salon.admin.reservation.service.impl.IsReservationTime;
import com.office.salon.admin.reservation.service.impl.ReservationTimeList;
import com.office.salon.admin.reservation.service.impl.ReservationTimeModify;

import java.util.ArrayList;

public class AdminReservationService implements IAdminReservationService {

    @Override
    public int reservationRegist() {
        return 0;
    }

    @Override
    public int modifyReservation() {
        return 0;
    }

    @Override
    public int deleteReservation() {
        return 0;
    }

    @Override
    public AdminReservationDto reservationListSearch() {
        return null;
    }

    @Override
    public int reservationTimeRegist(IReservationTimeRegist reservationTimeRegist) {
        return reservationTimeRegist.execute();
    }

    @Override
    public int payConfirm() {
        return 0;
    }

    @Override
    public int payDeleteConfirm() {
        return 0;
    }

    @Override
    public AdminReservationPaymentDto paymentListSearch() {
        return null;
    }

    @Override
    public boolean isReservationTime(IsReservationTime isReservationTime) {
        return isReservationTime.execute();
    }

    public ArrayList<AdminReservationTimeDto> reservationTimeList(ReservationTimeList reservationTimeList) {
        return reservationTimeList.execute();
    }

    @Override
    public int reservationTimeModify(ReservationTimeModify reservationTimeModify) {
        return reservationTimeModify.execute();
    }
}
