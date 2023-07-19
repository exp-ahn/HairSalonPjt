package com.office.salon.user.member.service.impl;

import com.office.salon.user.container.UserContainer;
import com.office.salon.user.member.SalonUserDto;
import com.office.salon.user.session.UserSession;

public class UserSignUpConfirm implements IUserSignUpConfirm{
    private SalonUserDto salonUserDto;
    public UserSignUpConfirm(SalonUserDto salonUserDto) {
        this.salonUserDto = salonUserDto;
    }

    @Override
    public int execute() {
        boolean isUser = UserContainer.getInstance().getSalonUserDao().isUser(this.salonUserDto.getU_id()/*, this.salonUserDto.getU_name()*/);

        if (!isUser) {
            int result = UserContainer.getInstance().getSalonUserDao().addNewUser(this.salonUserDto);
            return result > 0 ? 1 : 0;
        } else {
            return -1;
        }

    }
}
