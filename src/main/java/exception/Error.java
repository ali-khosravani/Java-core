package main.java.exception;

public class Error extends Exception{
    public Error(String message, int code) {
        this.message = message;
        this.code = code;
    }

    public Error() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    private String message;
    private int code;
}
