package com.office.salon.admin.reservation.impl;

import com.office.salon.admin.container.AdminContainer;
import com.office.salon.admin.reservation.AdminReservationController;
import com.office.salon.admin.reservation.AdminReservationTimeDto;

import java.util.ArrayList;
import java.util.Scanner;

public class AdminReservationTimeModify implements IAdminReservation{

    @Override
    public void execute(Scanner sc) {

        AdminReservationController adminReservationController = AdminContainer.getAdminContainer().getAdminReservationController();

        ArrayList<AdminReservationTimeDto> able_time_list = adminReservationController.reservationTimeList();

        if (able_time_list != null) {
            System.out.println("Available Time List");
            for (AdminReservationTimeDto at_time : able_time_list) {
                System.out.println(at_time.getAt_no() + "\t" + at_time.getAt_time());
            }
        }

        System.out.println("INPUT NUMBER TO MODIFY");
        int at_no = sc.nextInt();
        System.out.println("INPUT TIME TO MODIFY");
        String at_time = sc.next();

        int result = adminReservationController.reservationTimeModify(new AdminReservationTimeDto(at_no, at_time));

        if (result > 0){
            System.out.println("RESERVATIONTIME MODIFY SUCCESS!!");
        } else if (result < 0){
            System.out.println("DB SERVER ERROR!!! FAIL TO MODIFY");
        } else {
            System.out.println("RESERVATIONTIME MODIFY FAIL!!!!");
        }

    }
}
