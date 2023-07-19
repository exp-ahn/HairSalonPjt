package com.office.salon.admin.reservation.impl;

import com.office.salon.admin.member.impl.IAdminMember;

import java.util.Scanner;

public interface IAdminReservation extends IAdminMember {
    public void execute(Scanner sc);
}
