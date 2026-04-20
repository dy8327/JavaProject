package Java_Exception_0420.BalnceExample;

public class Account {
    private long balanace;

    public Account(){}

    public long getBalance(){
        return balanace;
    }
    public void deposit(int money){
        balanace += money;
    }
    public void withdraw(int money) throws BalanceException{
        if(balanace<money){
            throw new BalanceException("잔고부족: "+(money-balanace)+"원 모자람");
        }
        balanace -= money;
    }
}
