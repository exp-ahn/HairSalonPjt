package com.office.salon.user.container;

import com.office.salon.user.member.SalonUserController;
import com.office.salon.user.member.SalonUserDao;
import com.office.salon.user.member.SalonUserService;
import com.office.salon.user.reservation.SalonReservationController;
import com.office.salon.user.reservation.SalonReservationDao;
import com.office.salon.user.reservation.SalonReservationService;

public class UserContainer {
    private static UserContainer userContainer;
    private SalonUserController salonUserController;
    private SalonUserService salonUserService;
    private SalonUserDao salonUserDao;

    private SalonReservationController salonReservationController;
    private SalonReservationService salonReservationService;
    private SalonReservationDao salonReservationDao;

    private UserContainer() {};

    public static UserContainer getInstance() {

        if (userContainer == null)
            userContainer = new UserContainer();

        return userContainer;
    };

    public SalonUserController getSalonUserController() {
        return salonUserController;
    }

    public void setSalonUserController(SalonUserController salonUserController) {
        this.salonUserController = salonUserController;
    }

    public SalonUserService getSalonUserService() {
        return salonUserService;
    }

    public void setSalonUserService(SalonUserService salonUserService) {
        this.salonUserService = salonUserService;
    }

    public SalonUserDao getSalonUserDao() {
        return salonUserDao;
    }

    public void setSalonUserDao(SalonUserDao salonUserDao) {
        this.salonUserDao = salonUserDao;
    }

    public SalonReservationController getSalonReservationController() {
        return salonReservationController;
    }

    public void setSalonReservationController(SalonReservationController salonReservationController) {
        this.salonReservationController = salonReservationController;
    }

    public SalonReservationService getSalonReservationService() {
        return salonReservationService;
    }

    public void setSalonReservationService(SalonReservationService salonReservationService) {
        this.salonReservationService = salonReservationService;
    }

    public SalonReservationDao getSalonReservationDao() {
        return salonReservationDao;
    }

    public void setSalonReservationDao(SalonReservationDao salonReservationDao) {
        this.salonReservationDao = salonReservationDao;
    }
}
