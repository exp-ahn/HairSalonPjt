package com.office.salon.user.member;

import com.office.salon.user.member.service.impl.*;

public interface ISalonUserService {
    public int signUpUserConfirm(IUserSignUpConfirm userSignUpConfirm);
    public SalonUserDto signInUserConfirm(IUserSignInConfirm userSignInConfirm);
    public void signOutUserConfirm(IUserSignOutConfirm userSignOutConfirm);
    public int modifyUserConfirm(IUserModifyConfirm userModifyConfirm);
    public int deleteUserConfirm(IUserDeleteConfirm userDeleteConfirm);
}
