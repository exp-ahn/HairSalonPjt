package com.office.salon.user.reservation.impl;

import com.office.salon.user.member.impl.IUserMember;

import java.util.Scanner;

public interface ISalonUserReservation extends IUserMember {
    public void execute(Scanner sc);
}
