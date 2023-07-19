package com.office.salon.user.member;

import com.office.salon.user.member.service.impl.UserSignUpConfirm;

public class SalonUserController {
    SalonUserService salonUserService = new SalonUserService();
    public int signUpConfirm(SalonUserDto salonUserDto) {
        System.out.println("[SalonUserController] signUpConfirm");
        return this.salonUserService.signUpUserConfirm(new UserSignUpConfirm(salonUserDto));
    }
}
