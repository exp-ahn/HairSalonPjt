package com.office.salon;

import com.office.salon.admin.session.AdminSession;
import com.office.salon.user.session.UserSession;

public class Gnb {
    public static void showAdminGnb() {

        if (AdminSession.getInstance().getLoginedSalonAdminDto() == null) {
            System.out.println("1)ADMIN SIGN UP \t 2)ADMIN SIGN IN \t 99)SYSTEM SHUTDOWN");
        } else {
            System.out.print("3)ADMIN SIGN OUT \t 4)ADMIN MODIFY \t 5)ADMIN DOWN \t ");
            if (AdminSession.getInstance().getLoginedSalonAdminDto().getA_id().equals("super")) {
                System.out.println("6)ADMIN APPROVAL");

            } else {
                System.out.println();
            }

            System.out.println("11)REGIST RESERVATION \t 13)MODIFY RESERVATION \t 14)REGIST SERVICE \t 14)MODIFY SERVICE \t 15)MODIFY MILEAGE PERCENT \t 99)SYSTEM SHUTDOWN");

        }

    }

    public static void showUserGnb() {

        if (UserSession.getInstance().getLoginedSalonUserDto() == null) {
            System.out.println("1)USER SIGN UP \t 2)USER SIGN IN \t 99)SYSTEM SHUTDOWN");
        } else {
            System.out.println("3)USER SIGN OUT \t 4)USER MODIFY \t 5)USER SIGN DOWN \t 11) USER RESERVATION \t 12) USER RESERVATION HISTORY \t 13) USER RESERVATION CANCEL \t 14) USER RESERVATION MODIFY \t 21) USER PAYMENT \t 22) USER PAYMENT HISTORY \t 23) USER PAYMENT CANCEL \t 99)SYSTEM SHUTDOWN");

        }

    }
}
