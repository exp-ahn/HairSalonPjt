package com.office.salon.admin.session;

import com.office.salon.admin.member.SalonAdminDto;

public class AdminSession {
    private SalonAdminDto loginedSalonAdminDto;
    /*
     * 싱글턴 기본 형태 START
     */
    private static AdminSession adminSession;
    private AdminSession() {

    }
    public static AdminSession getInstance() {

        if (adminSession == null)
            adminSession = new AdminSession();

        return adminSession;
    }
    /*
     * 싱글턴 기본 형태 END
     */

    public SalonAdminDto getLoginedSalonAdminDto() {
        return loginedSalonAdminDto;
    }

    public void setLoginedSalonAdminDto(SalonAdminDto loginedSalonAdminDto) {
        this.loginedSalonAdminDto = loginedSalonAdminDto;
    }
}
