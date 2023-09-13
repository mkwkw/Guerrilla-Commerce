package com.github.commerce.web.advice.custom;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    //회원가입
//    SIGNUP_DUPLICATE_EMAIL(HttpStatus.BAD_REQUEST, "중복된 이메일입니다.")

    //회원탈퇴
//    SIGN_OUT_NOT_FOUND_EMAIL(HttpStatus.BAD_REQUEST, "토큰에서 이메일을 찾을수 없습니다.")

    //로그인
//    LOGIN_NOT_FOUND_EMAIL(HttpStatus.BAD_REQUEST, "등록되어 있지 않은 이메일 입니다.")

    // 마이페이지
//    MY_PAGE_RESOURCE_NOT_FOUND(HttpStatus.NOT_FOUND,"요청한 정보를 찾을 수 없습니다.")
//    MY_PAGE_PERMISSION_DENIED(HttpStatus.FORBIDDEN,"권한이 거부되었습니다.")
//    MY_PAGE_EMAIL_ALREADY_EXISTS(HttpStatus.CONFLICT,"이미 등록된 이메일 주소입니다.")
//    MY_PAGE_NOT_AUTHORIZED(HttpStatus.UNAUTHORIZED,"권한이 없습니다. 로그인 후 이용해주세요.")

    // 상품
//    CART_PRODUCT_NOT_FOUND(HttpStatus.NOT_FOUND, "해당 물품이 존재하지 않습니다."),
//    SHOP_PRODUCT_NOT_FOUND(HttpStatus.NOT_FOUND, "해당 물품이 존재하지 않습니다.")
    ;

    private final HttpStatus httpStatus;
    private final String errorMsg;

}