package com.office.salon.admin.member.service.impl;

import com.office.salon.admin.config.SalonAdminConfig;
import com.office.salon.admin.container.AdminContainer;
import com.office.salon.admin.member.AdminMemberDao;
import com.office.salon.admin.member.SalonAdminDto;

public class AdminSignUpConfirm  implements IAdminSignUpConfirm{

    AdminMemberDao adminMemberDao = null;
    SalonAdminDto salonAdminDto = null;

    public AdminSignUpConfirm (SalonAdminDto salonAdminDto){
        adminMemberDao = AdminContainer.getInstance().getAdminMemberDao();
        this.salonAdminDto = salonAdminDto;
    }

    @Override
    public int execute() {
        int result = adminMemberDao.adminSignUpResult(salonAdminDto);

        if(result > 0){
            System.out.println("SignUp Success!!!");
            return SalonAdminConfig.ADMIN_SIGN_UP_SUCCESS;
        }
        else{
            System.out.println("SignUp Fail...");
            return SalonAdminConfig.ADMIN_SIGN_UP_FAIL;
        }
    }
}
