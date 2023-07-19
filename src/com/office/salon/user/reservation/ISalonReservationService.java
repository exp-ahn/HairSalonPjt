package com.office.salon.user.reservation;

import com.office.salon.user.member.SalonUserDto;

public interface ISalonReservationService {
    public int reservationRegist();
    public int modifyReservation();
    public int deleteReservation();
    public SalonReservationDto reservationListSearch();
    public int payConfirm();
    public int payDeleteConfirm();

    public SalonReservationPaymentDto paymentListSearch();
}
