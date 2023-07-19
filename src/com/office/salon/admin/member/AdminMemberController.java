package com.office.salon.admin.member;

import com.office.salon.admin.container.AdminContainer;
import com.office.salon.admin.member.service.impl.AdminSignUpConfirm;

public class AdminMemberController {



    //관리자 회원가입
    public int adminSignUp(SalonAdminDto salonAdminDto) {
        System.out.println("[AdminMemberController] adminSignUp");
        AdminMemberService adminMemberService = AdminContainer.getInstance().getAdminMemberService();

        return adminMemberService.adminSignUpConfirm(new AdminSignUpConfirm(salonAdminDto));


    }
}
