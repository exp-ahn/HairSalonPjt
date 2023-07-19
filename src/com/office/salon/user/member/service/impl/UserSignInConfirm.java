package com.office.salon.user.member.service.impl;

import com.office.salon.user.member.SalonUserDto;

public class UserSignInConfirm implements IUserSignInConfirm{
    private SalonUserDto salonUserDto;
    public UserSignInConfirm(SalonUserDto salonUserDto) {
        this.salonUserDto = salonUserDto;
    }

    @Override
    public void execute() {

    }
}
