package com.office.salon.user.member.impl;

import com.office.salon.user.container.UserContainer;
import com.office.salon.user.member.SalonUserController;
import com.office.salon.user.member.SalonUserDto;

import java.util.Scanner;

public class UserSignIn implements IUserMember{
    @Override
    public void execute(Scanner sc) {
        SalonUserController salonUserController = UserContainer.getInstance().getSalonUserController();
        System.out.println("Please enter User ID");
        String u_id = sc.next();
        System.out.println("Please enter User PW");
        String u_pw = sc.next();

        SalonUserDto salonUserDto = salonUserController.signInConfirm(new SalonUserDto(u_id, u_pw));

        if (salonUserDto != null) {
            System.out.println("USER SIGN-UP SUCCESS!!");
        } else {
            System.out.println("USER SIGN-UP FAIL!!");
        }
    }
}
