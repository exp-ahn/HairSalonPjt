package com.office.salon;

import com.office.salon.config.SalonConfig;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean isSystem = true;

        while(isSystem){
            System.out.println("CHOOSE MODE");
            System.out.println("1. ADMIN 2. USER");

            switch (sc.nextInt()){
                case SalonConfig.ADMIN_MODE:
                    boolean isAdmin = true;

                    break;
                case SalonConfig.USER_MODE:
                    boolean isUser = true;
                    break;
                case SalonConfig.SYSTEM_SHUTDOWN:
                    isSystem = false;
                    break;
            }
        }

    }
}
