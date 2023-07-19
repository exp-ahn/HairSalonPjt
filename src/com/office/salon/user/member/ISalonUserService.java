package com.office.salon.user.member;

public interface ISalonUserService {
    public int signUpUserConfirm();
    public SalonUserDto signInUserConfirm();
    public int modifyUser();
    public int deleteUser();
}
