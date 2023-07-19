package com.office.salon;

import com.office.salon.config.SalonConfig;
import com.office.salon.user.container.UserContainer;
import com.office.salon.user.member.SalonUserController;
import com.office.salon.user.member.SalonUserDao;
import com.office.salon.user.member.SalonUserService;
import com.office.salon.user.reservation.SalonReservationController;
import com.office.salon.user.reservation.SalonReservationDao;
import com.office.salon.user.reservation.SalonReservationService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        UserContainer userContainer = UserContainer.getInstance();

        userContainer.setSalonUserController(new SalonUserController());
        userContainer.setSalonUserService(new SalonUserService());
        userContainer.setSalonUserDao(new SalonUserDao());

        userContainer.setSalonReservationController(new SalonReservationController());
        userContainer.setSalonReservationService(new SalonReservationService());
        userContainer.setSalonReservationDao(new SalonReservationDao());


        Scanner sc = new Scanner(System.in);

        boolean isSystem = true;

        while(isSystem){
            System.out.println("CHOOSE MODE");
            System.out.println("1. ADMIN 2. USER");

            switch (sc.nextInt()){
                case SalonConfig.ADMIN_MODE:
                    boolean isAdmin = true;
                    while (isAdmin){

                    }

                    break;
                case SalonConfig.USER_MODE:
                    boolean isUser = true;
                    while (isUser){

                    }
                    break;
                case SalonConfig.SYSTEM_SHUTDOWN:
                    isSystem = false;
                    break;
            }
        }

    }
}
