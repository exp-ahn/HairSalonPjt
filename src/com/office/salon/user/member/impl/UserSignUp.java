package com.office.salon.user.member.impl;

import com.office.salon.user.container.UserContainer;
import com.office.salon.user.member.SalonUserController;
import com.office.salon.user.member.SalonUserDto;

import java.util.Scanner;

public class UserSignUp implements IUserMember{

    @Override
    public void execute(Scanner sc) {
        SalonUserController salonUserController = UserContainer.getInstance().getSalonUserController();
        System.out.println("Please input User ID.");
        String u_id = sc.next();
        System.out.println("Please input User PW.");
        String u_pw = sc.next();
        System.out.println("Please input User Name.");
        String u_name = sc.next();
        System.out.println("Please input User Mail.");
        String u_mail = sc.next();
        System.out.println("Please input User Phone Number.");
        String u_phone = sc.next();

        int result = salonUserController.signUpConfirm(new SalonUserDto(0, u_id, u_pw, u_name, u_mail, u_phone));

        if (result > 0) {
            System.out.println("USER SIGN-UP SUCCESS!!");
        } else {
            System.out.println("USER SIGN-UP FAIL!!");
        }

    }
}
