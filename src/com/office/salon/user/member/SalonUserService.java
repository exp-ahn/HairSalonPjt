package com.office.salon.user.member;

import com.office.salon.user.member.service.impl.*;

public class SalonUserService implements ISalonUserService{

    @Override
    public int signUpUserConfirm(IUserSignUpConfirm userSignUpConfirm) {
        System.out.println("[SalonUserService] signUpUserConfirm");

        return userSignUpConfirm.execute();
    }

    @Override
    public SalonUserDto signInUserConfirm(IUserSignInConfirm userSignInConfirm) {
        return null;
    }

    @Override
    public void signOutUserConfirm(IUserSignOutConfirm userSignOutConfirm) {

    }

    @Override
    public int modifyUserConfirm(IUserModifyConfirm userModifyConfirm) {
        return 0;
    }

    @Override
    public int deleteUserConfirm(IUserDeleteConfirm userDeleteConfirm) {
        return 0;
    }
}
