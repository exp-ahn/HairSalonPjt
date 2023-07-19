package com.office.salon.admin.reservation;

import com.office.salon.admin.reservation.service.impl.IReservationTimeRegist;
import com.office.salon.admin.reservation.service.impl.IsReservationTime;
import com.office.salon.admin.reservation.service.impl.ReservationTimeList;
import com.office.salon.admin.reservation.service.impl.ReservationTimeModify;

import java.util.ArrayList;

public interface IAdminReservationService {
    public int reservationRegist();
    public int modifyReservation();
    public int deleteReservation();
    public AdminReservationDto reservationListSearch();
    public int reservationTimeRegist(IReservationTimeRegist iReservationTimeRegist);
    public int payConfirm();
    public int payDeleteConfirm();

    public AdminReservationPaymentDto paymentListSearch();

    boolean isReservationTime(IsReservationTime isReservationTime);

    public ArrayList<AdminReservationTimeDto> reservationTimeList(ReservationTimeList reservationTimeList);

    int reservationTimeModify(ReservationTimeModify reservationTimeModify);
}
