package com.example.user_registration.utils;

public class ResponseCodeUtil {

    public static final String SUCCESS_CODE = "0000";
    public static final String INTERNAL_SERVER_ERROR_CODE = "1010";
    public static final String FAILED_CODE = "2020";
    public static final String PARAMETER_MISSING = "2026";
    public static final String FAILED = "FAILED";

    // FOR JWT token
    public static final String JWT_TOKEN_VALIDATE_ERROR_CODE = "4000";
    public static final String JWT_TOKEN_EXPIRED_ERROR_CODE = "4001";
    public static final String INVALID_TOKEN_ERROR_CODE = "4002";
    public static final String OTP_EXPIRED = "4006";

    public static final String USER_EXISTS_ERROR_CODE = "6001";
    public static final String DISABLE_USER_ERROR_CODE = "6002";
    public static final String DEVICE_LIMIT_EXCEED_ERROR_CODE = "6003";
    public static final String INVALID_LOGIN_METHOD_ERROR_CODE = "6004";
    public static final String USER_NOT_ACTIVE_ERROR_CODE = "6005";
    public static final String CANNOT_FIND_USER_ROLES = "6010";
    public static final String USER_DOESNT_HAVE_PERMISSION = "6020";
    public static final String CANNOT_FIND_USER = "6030";
    public static final String EMPTY_PARAMETER = "6050";
    public static final String LOCKED_USER_ERROR_CODE = "6006";
}
