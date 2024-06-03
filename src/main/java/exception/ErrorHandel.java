package main.java.exception;

public class ErrorHandel extends Exception{
    public ErrorHandel() {
    }

    private int code;
    private String message;


    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public ErrorHandel(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
