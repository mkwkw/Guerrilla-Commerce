package com.github.commerce.web.dto.cart;

public enum OrderStateEnum {
    주문대기(1, "주문대기"),
    결제완료(2, "결제완료"),
    배송대기(3, "배송대기"),
    배송중(4, "배송중"),
    배송완료(5, "배송완료");

    private final int value;
    private final String label;

    OrderStateEnum(int value, String label) {
        this.value = value;
        this.label = label;
    }

    public static String getByCode(int code) {
        switch(code){
            case 1: return 주문대기.label;
            case 2: return 결제완료.label;
            case 3: return 배송대기.label;
            case 4: return 배송중.label;
            case 5: return 배송완료.label;
            //case 7: return ETC.name;
            default: return 주문대기.label;
        }
    }
}