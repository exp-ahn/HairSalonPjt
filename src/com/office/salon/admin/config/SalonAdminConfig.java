package com.office.salon.admin.config;

public class SalonAdminConfig {
    /*
     * 관리자 회원가입, 로그인, 정보수정, 탈퇴
     */
    final static public byte ADMIN_SIGN_UP          = 1;
    final static public byte ADMIN_SIGN_IN          = 2;
    final static public byte ADMIN_SIGN_OUT       = 3;
    final static public byte ADMIN_MODIFY          = 4;
    final static public byte ADMIN_SIGN_DOWN      = 5;
    final static public byte ADMIN_APPROVAL         = 6;

    /*
     * 관리자 예약시간, 서비스, 마일리지 등록(수정)
     */
    final static public byte ADMIN_REGIST_RESERVATION_TIME   = 11;
    final static public byte ADMIN_MODIFY_RESERVATION_TIME   = 12;
    final static public byte ADMIN_REGIST_SERVICE   = 13;
    final static public byte ADMIN_MODIFY_SERVICE   = 14;
    final static public byte ADMIN_MODIFY_MILEAGE_PERCENT   = 15;
    /*
     * 관리자 회원가입, 로그인 결과
     */
    final static public byte ADMIN_SIGN_UP_SUCCESS    = 1;
    final static public byte ADMIN_SIGN_UP_ALREADY    = -1;
    final static public byte ADMIN_SIGN_UP_FAIL    = 0;
    final static public byte ADMIN_SIGN_IN_SUCCESS    = 1;
    final static public byte ADMIN_SIGN_IN_FAIL       = 0;
}
