package Java_Exception_0420.BalnceExample;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(10000);
        System.out.println("예금액: "+account.getBalance());
        
        try{
            account.withdraw(30000);
        } catch(BalanceException e){
            String message = e.getMessage();
            System.out.println(message);
            System.out.println();
            e.printStackTrace(); //이 메소드는 실제코드에 넣으면 보안문제생김!!
        }
    }


   
}
