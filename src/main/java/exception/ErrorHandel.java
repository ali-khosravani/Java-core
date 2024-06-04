package main.java.exception;

public class ErrorHandel extends Exception{

    private final int code;
    private final String message;


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
}
