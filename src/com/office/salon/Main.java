package com.office.salon;

import com.office.salon.admin.config.SalonAdminConfig;
import com.office.salon.admin.container.AdminContainer;
import com.office.salon.admin.member.AdminMemberController;
import com.office.salon.admin.member.AdminMemberDao;
import com.office.salon.admin.member.AdminMemberService;
import com.office.salon.admin.reservation.AdminReservationController;
import com.office.salon.admin.reservation.AdminReservationDao;
import com.office.salon.admin.reservation.AdminReservationService;
import com.office.salon.config.SalonConfig;
import com.office.salon.user.config.SalonUserConfig;
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

        /*
        * 관리자 컨테이너
        */
        AdminContainer adminContainer = AdminContainer.getInstance();

        adminContainer.setAdminMemberController(new AdminMemberController());
        adminContainer.setAdminMemberService(new AdminMemberService());
        adminContainer.setAdminMemberDao(new AdminMemberDao());

        adminContainer.setAdminReservationController(new AdminReservationController());
        adminContainer.setAdminReservationService(new AdminReservationService());
        adminContainer.setAdminReservationDao(new AdminReservationDao());

        /*
         * 사용자 컨테이너
         */

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
                        Gnb.showAdminGnb();
                        switch(sc.nextInt()){
                            case SalonAdminConfig.ADMIN_SIGN_UP:
                                break;
                            case SalonAdminConfig.ADMIN_SIGN_IN:
                                break;
                            case SalonAdminConfig.ADMIN_SIGN_OUT:
                                isAdmin = false;
                                break;
                            case SalonAdminConfig.ADMIN_MODIFY:
                                break;
                            case SalonAdminConfig.ADMIN_SIGN_DOWN:
                                break;
                            case SalonAdminConfig.ADMIN_APPROVAL:
                                break;
                            case SalonAdminConfig.ADMIN_REGIST_RESERVATION_TIME:
                                break;
                            case SalonAdminConfig.ADMIN_REGIST_SERVICE:
                                break;
                            case SalonAdminConfig.ADMIN_MODIFY_SERVICE:
                                break;
                            case SalonAdminConfig.ADMIN_MODIFY_MILEAGE_PERCENT:
                                break;
                        }

                    }

                    break;
                case SalonConfig.USER_MODE:
                    boolean isUser = true;
                    while (isUser){
                        Gnb.showUserGnb();
                        switch (sc.nextInt()) {
                            case SalonUserConfig.USER_SIGN_UP:
                                break;
                            case SalonUserConfig.USER_SIGN_IN:
                                break;
                            case SalonUserConfig.USER_SIGN_OUT:
                                isUser = false;
                                break;
                            case SalonUserConfig.USER_MODIFY:
                                break;
                            case SalonUserConfig.USER_SIGN_DOWN:
                                break;
                            case SalonUserConfig.USER_RESERVATION:
                                break;
                            case SalonUserConfig.USER_RESERVATION_HISTORY_INQUIRY:
                                break;
                            case SalonUserConfig.USER_RESERVATION_CANCEL:
                                break;
                            case SalonUserConfig.USER_RESERVATION_MODIFY:
                                break;
                            case SalonUserConfig.USER_PAYMENT:
                                break;
                            case SalonUserConfig.USER_PAYMENT_HISTORY_INQUIRY:
                                break;
                            case SalonUserConfig.USER_PAYMENT_CANCEL:
                                break;
                        }
                    }
                    break;
                case SalonConfig.SYSTEM_SHUTDOWN:
                    isSystem = false;
                    break;
            }
        }

    }
}
