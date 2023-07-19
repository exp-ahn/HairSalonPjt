package com.office.salon.admin.reservation;

public interface IAdminReservationService {
    public int reservationRegist();
    public int modifyReservation();
    public int deleteReservation();
    public AdminReservationDto reservationListSearch();
    public int payConfirm();
    public int payDeleteConfirm();

    public AdminReservationPaymentDto paymentListSearch();
}
