package com.office.salon.user.session;

import com.office.salon.user.member.SalonUserDto;

public class UserSession {
    private SalonUserDto loginedSalonUserDto;
    /*
     * 싱글턴 기본 형태 START
     */
    private static UserSession userSession;
    private UserSession() {

    }
    public static UserSession getInstance() {

        if (userSession == null)
            userSession = new UserSession();

        return userSession;
    }
    /*
     * 싱글턴 기본 형태 END
     */

    public SalonUserDto getLoginedSalonUserDto() {
        return loginedSalonUserDto;
    }

    public void setLoginedSalonUserDto(SalonUserDto loginedSalonUserDto) {
        this.loginedSalonUserDto = loginedSalonUserDto;
    }
}
