public class bankaccount {
    String accountholder;
    int acnum;
    int balance;

    public bankaccount(String accountholder, int acnum, int balance) {
        this.accountholder = accountholder;
        this.acnum = acnum;
        this.balance = balance;

    }

    public void deposit(int val) {
        balance = balance - val;
        System.out.println("Deposit: " + val);
        System.out.println("new balance" + balance);
    }

    public void withdraw(int val) {
        balance = balance - val;
        System.out.println("Deposit: " + val);
        System.out.println("new balance" + balance);
    }

    void display(int balance) {
        System.out.println("Account holder: " + accountholder);
        System.out.println("Account number: " + acnum);
        System.out.println("Balance: " + balance);

    }

    public static void main(String[] args) {
        bankaccount b = new bankaccount("Ananya", 1234, 5000);
        b.display(50000);
        b.deposit(300);
        b.withdraw(500);
    }
}