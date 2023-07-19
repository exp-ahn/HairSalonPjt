package com.office.salon.user.member.impl;

import com.office.salon.user.container.UserContainer;
import com.office.salon.user.member.SalonUserController;

import java.util.Scanner;

public class UserSignIn implements IUserMember{
    @Override
    public void execute(Scanner sc) {
        SalonUserController salonUserController = UserContainer.getInstance().getSalonUserController();
    }
}
