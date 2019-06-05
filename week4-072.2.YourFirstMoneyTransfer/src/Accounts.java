
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        Account Matt_account = new Account("Matt's account",1000.0);
        Account My_account= new Account("My account",0);
        Matt_account.withdrawal(100.0);
        My_account.deposit(100.0);
        System.out.println(Matt_account);
        System.out.println(My_account);

    }

}
