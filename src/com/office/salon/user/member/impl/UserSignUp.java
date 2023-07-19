package com.office.salon.user.member.impl;

import com.office.salon.user.container.UserContainer;
import com.office.salon.user.member.SalonUserController;

import java.util.Scanner;

public class UserSignUp implements IUserMember{

    @Override
    public void execute(Scanner sc) {
        SalonUserController salonUserController = UserContainer.getInstance().getSalonUserController();
        System.out.println("Please input User ID.");
        String u_id = sc.nextLine();
        System.out.println("Please input User PW.");
        String u_pw = sc.nextLine();
        System.out.println("Please input User Name.");
        String u_name = sc.nextLine();
        System.out.println("Please input User Mail.");
        String u_mail = sc.nextLine();
        System.out.println("Please input User Phone Number.");
        String u_phone = sc.nextLine();

    }
}
