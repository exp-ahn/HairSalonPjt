package com.office.salon.user.config;

public class SalonUserConfig {
    /*
     * 사용자 회원가입, 로그인, 정보수정, 탈퇴
     */
    final static public byte USER_SIGN_UP             = 1;
    final static public byte USER_SIGN_IN             = 2;
    final static public byte USER_SIGN_OUT             = 3;
    final static public byte USER_MODIFY             = 4;
    final static public byte USER_SIGN_DOWN            = 5;

    /*
     * 사용자 예약, 예약 조회, 예약 취소, 예약 수정
     */
    final static public byte USER_RESERVATION   = 11;
    final static public byte USER_RESERVATION_HISTORY_INQUIRY   = 12;
    final static public byte USER_RESERVATION_CANCEL   = 13;
    final static public byte USER_RESERVATION_MODIFY   = 14;
    final static public byte USER_PAYMENT   = 21;
    final static public byte USER_PAYMENT_HISTORY_INQUIRY   = 22;
    final static public byte USER_PAYMENT_CANCEL   = 23;

    /*
     * 사용자 회원가입, 로그인 결과
     */
    final static public byte USER_SIGN_UP_SUCCESS       = 1;
    final static public byte USER_SIGN_UP_ALREADY       = -1;
    final static public byte USER_SIGN_UP_FAIL          = 0;
    final static public byte USER_SIGN_IN_SUCCESS       = 1;
    final static public byte USER_SIGN_IN_FAIL          = 0;
}
