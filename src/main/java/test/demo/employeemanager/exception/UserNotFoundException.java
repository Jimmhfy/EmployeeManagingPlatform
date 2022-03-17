package test.demo.employeemanager.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String Message) {
        super(Message);
    }
}
