package springmvc.helloworld.bean;




/**
 * 服务器返回的json基类
 */
public class BaseResponse<T>{
    private int code;
    private T response;
    private String message;
    public int dataType;

    public int getDataType() {
        return dataType;
    }

    public void setDataType(int dataType) {
        this.dataType = dataType;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getResponse() {
        return response;
    }

    public void setResponse(T response) {
        this.response = response;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "BaseResponse{" +
                ", code=" + code +
                ", response=" + response +
                ", message='" + message + '\'' +
                '}';
    }
}
