package com.office.salon.admin.reservation.impl;

import com.office.salon.admin.container.AdminContainer;
import com.office.salon.admin.reservation.AdminReservationController;

import java.util.Scanner;

public class AdminMileagePercentModify implements IAdminReservation{

    @Override
    public void execute(Scanner sc) {

        AdminReservationController adminReservationController = AdminContainer.getAdminContainer().getAdminReservationController();
    }
}
