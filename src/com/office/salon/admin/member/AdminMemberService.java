package com.office.salon.admin.member;

import com.office.salon.admin.container.AdminContainer;
import com.office.salon.admin.member.service.impl.IAdminSignUpConfirm;

public class AdminMemberService implements IAdminMemberService{

    //관리자 회원가입
    public int adminSignUpConfirm(IAdminSignUpConfirm adminSignUpConfirm) {
        System.out.println("[AdminMemberService] adminSignUp");
        AdminMemberDao adminMemberDao = AdminContainer.getInstance().getAdminMemberDao();
        return adminSignUpConfirm.execute();


    }

}
