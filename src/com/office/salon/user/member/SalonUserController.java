package com.office.salon.user.member;

import com.office.salon.user.member.service.impl.UserSignInConfirm;
import com.office.salon.user.member.service.impl.UserSignUpConfirm;

public class SalonUserController {
    SalonUserService salonUserService = new SalonUserService();
    public int signUpConfirm(SalonUserDto salonUserDto) {
        System.out.println("[SalonUserController] signUpConfirm");
        return this.salonUserService.signUpUserConfirm(new UserSignUpConfirm(salonUserDto));
    }

    public SalonUserDto signInConfirm(SalonUserDto salonUserDto) {
        System.out.println("[SalonUserController] signInConfirm");
        return this.salonUserService.signInUserConfirm(new UserSignInConfirm(salonUserDto));
    }
}
