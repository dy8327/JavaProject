package Java_Exception_0420.BalnceExample;

public class BalanceException extends Exception{ //최고단위인 Exception 을 상속
    public BalanceException(){}
    public BalanceException(String message){
        super(message);
    }
}
