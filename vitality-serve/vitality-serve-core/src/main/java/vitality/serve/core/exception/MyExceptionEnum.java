package vitality.serve.core.exception;

import lombok.Getter;

/**
 * @Description:
 * @Author: huanghz
 * @DateTime: 2021/1/18 10:12
 */

@Getter
public enum MyExceptionEnum {
    SUCCESS(0, ""),
    ERROR(1, "系统错误"),
    NO_LOGIN(2, "用户未登录"),
    UK_ERROR(3, "名称重复"),
    ;
    private final int code;
    private final String msg;

    MyExceptionEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
