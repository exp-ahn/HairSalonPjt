package com.office.salon.admin.reservation.impl;

import com.office.salon.admin.container.AdminContainer;
import com.office.salon.admin.reservation.AdminReservationController;

import java.util.Scanner;

public class AdminReservationTimeRegist implements IAdminReservation{

    @Override
    public void execute(Scanner sc) {

        AdminReservationController adminReservationController = AdminContainer.getAdminContainer().getAdminReservationController();

        System.out.println("INPUT TIME");
        int at_time = sc.nextInt();

        boolean isReservationTime = adminReservationController.isReservationTime(at_time);

        int result = 0;
        if (isReservationTime){
            System.out.println("ALREADY EXISTS!!!!");
        } else {
            result = adminReservationController.reservationTimeRegist(at_time);
        }

        if (result > 0){
            System.out.println("RESERVATIONTIME REGIST SUCCESS!!");
        } else if (result < 0){
            System.out.println("DB SERVER ERROR!!! FAIL TO REGIST");
        } else {
            System.out.println("RESERVATIONTIME REGIST FAIL!!!!");
        }

    }
}
