package com.office.salon.admin.member.impl;

import com.office.salon.admin.container.AdminContainer;
import com.office.salon.admin.member.AdminMemberController;
import com.office.salon.admin.member.SalonAdminDto;

import java.awt.*;
import java.util.Scanner;

public class AdminSignUp implements IAdminMember{

    AdminMemberController adminMemberController = AdminContainer.getInstance().getAdminMemberController();

    @Override
    public void execute(Scanner sc) {
        System.out.print("관리자 ID: ");
        String a_id = sc.next();
        System.out.print("관리자 PW: ");
        String a_pw = sc.next();
        System.out.print("관리자 이메일: ");
        String a_mail = sc.next();
        System.out.print("관리자 등급[ 0)super \t 1)admin \t 2)no_admin ]: ");
        int a_grade = sc.nextInt();

        int result = adminMemberController.adminSignUp(new SalonAdminDto(a_id, a_pw, a_mail, a_grade));




    }
}
