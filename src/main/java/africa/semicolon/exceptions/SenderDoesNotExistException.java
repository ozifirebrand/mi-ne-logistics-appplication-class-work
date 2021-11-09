package africa.semicolon.exceptions;

public class SenderDoesNotExistException extends LogisticAppException{
    public SenderDoesNotExistException(String message){
        super(message);
    }
}
