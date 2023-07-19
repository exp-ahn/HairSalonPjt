package com.office.salon.admin.container;

import com.office.salon.admin.member.AdminMemberController;
import com.office.salon.admin.member.AdminMemberDao;
import com.office.salon.admin.member.AdminMemberService;
import com.office.salon.admin.reservation.AdminReservationController;
import com.office.salon.admin.reservation.AdminReservationDao;
import com.office.salon.admin.reservation.AdminReservationService;

public class AdminContainer {

    private static AdminContainer adminContainer;
    private AdminMemberController adminMemberController;
    private AdminMemberService adminMemberService;
    private AdminMemberDao adminMemberDao;

    private AdminReservationController adminReservationController;
    private AdminReservationService adminReservationService;
    private AdminReservationDao adminReservationDao;

    public static AdminContainer getInstance(){
        if(adminContainer == null)
            adminContainer = new AdminContainer();
        return adminContainer;
    }

    public static AdminContainer getAdminContainer() {
        return adminContainer;
    }

    public static void setAdminContainer(AdminContainer adminContainer) {
        AdminContainer.adminContainer = adminContainer;
    }

    public AdminMemberController getAdminMemberController() {
        return adminMemberController;
    }

    public void setAdminMemberController(AdminMemberController adminMemberController) {
        this.adminMemberController = adminMemberController;
    }

    public AdminMemberService getAdminMemberService() {
        return adminMemberService;
    }

    public void setAdminMemberService(AdminMemberService adminMemberService) {
        this.adminMemberService = adminMemberService;
    }

    public AdminMemberDao getAdminMemberDao() {
        return adminMemberDao;
    }

    public void setAdminMemberDao(AdminMemberDao adminMemberDao) {
        this.adminMemberDao = adminMemberDao;
    }

    public AdminReservationController getAdminReservationController() {
        return adminReservationController;
    }

    public void setAdminReservationController(AdminReservationController adminReservationController) {
        this.adminReservationController = adminReservationController;
    }

    public AdminReservationService getAdminReservationService() {
        return adminReservationService;
    }

    public void setAdminReservationService(AdminReservationService adminReservationService) {
        this.adminReservationService = adminReservationService;
    }

    public AdminReservationDao getAdminReservationDao() {
        return adminReservationDao;
    }

    public void setAdminReservationDao(AdminReservationDao adminReservationDao) {
        this.adminReservationDao = adminReservationDao;
    }
}
