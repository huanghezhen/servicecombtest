package vitality.serve.core.exception;

import lombok.Getter;

/**
 * @Description: (描述)
 * @Author: huanghz
 * @Date: 2020/11/15 8:10
 */
@Getter
public class MyException extends RuntimeException {
    private final int code;
    private final String msg;

    private MyException(Throwable cause) {
        super(cause);
        this.msg = MyExceptionEnum.ERROR.getMsg();
        this.code = MyExceptionEnum.ERROR.getCode();
    }

    private MyException(MyExceptionEnum myExceptionEnum) {
        super(myExceptionEnum.getMsg());
        this.msg = myExceptionEnum.getMsg();
        this.code = myExceptionEnum.getCode();
    }

    private MyException(MyExceptionEnum myExceptionEnum, String msg) {
        super(msg);
        this.msg = msg;
        this.code = myExceptionEnum.getCode();
    }

    public static MyException newInstance(MyExceptionEnum myExceptionEnum) {
        return new MyException(myExceptionEnum);
    }

    public static MyException newInstance(Throwable cause) {
        return new MyException(cause);
    }

    public static MyException newInstance() {
        return new MyException(MyExceptionEnum.ERROR);
    }
    public static MyException newInstance(String msg) {
        return new MyException(MyExceptionEnum.ERROR,msg);
    }

}
