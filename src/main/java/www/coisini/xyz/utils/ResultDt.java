package www.coisini.xyz.utils;

import java.io.Serializable;

public class ResultDt<T> implements Serializable {

    public static final String FAIL_MSG = "sorry~";
    public static final String SUCCESS_MSG = "success";
    String message;
    Boolean success;
    T data;

    public ResultDt() {
    }

    public static <T> ResultDt<T> success(String message, T data, Boolean success) {
        ResultDt<T> result = new ResultDt<>();
        result.setData(data);
        result.setSuccess(success);
        result.setMessage(message);
        return result;
    }

    public static <T> ResultDt<T> success(T data) {
        return success(SUCCESS_MSG, data, true);
    }

    public static <T> ResultDt<T> success() {
        return success(SUCCESS_MSG, null, true);
    }

    public static <T> ResultDt<T> fail(String message) {
        ResultDt resultDt = new ResultDt();
        resultDt.setSuccess(false);
        resultDt.setMessage(message);
        return resultDt;
    }

    public static <T> ResultDt<T> fail() {
        ResultDt resultDt = new ResultDt();
        resultDt.setSuccess(false);
        resultDt.setMessage(FAIL_MSG);
        return resultDt;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
