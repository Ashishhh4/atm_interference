import java.util.Scanner;

class atm{
    private float balance;



    public  atm(float initialBalance) {
        balance = initialBalance;
    }

    public float getBalance() {
        return balance;
    }

    public void deposit(float amount) {

        balance += amount;
        System.out.println("The amount after deposit is: " + balance);
    }

    public void withdraw(float amount) {

        balance -= amount;
        System.out.println("The amount after withdrawal is: " + balance);
    }
    public void interest_rate(float rate_per_year){

        balance*=rate_per_year;
        System.out.println("interest per year is:"+balance);
    }
}
class bankbook{
    private atm any;
    public bankbook(atm any){
        this.any=any;
    }
    public void check_balance(){
        float balance=any.getBalance();
        System.out.println(+balance);
    }
    public void deposit(float amount){
        any.deposit(amount);
    }
    public  void withdraw(float amount){
        any.withdraw(amount);
    }
}

public class atm_interface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the ATM.");
        System.out.print("Enter initial balance: ");
        float initialBalance = sc.nextFloat();
       atm user =new atm(initialBalance);
        atm atm = new atm(user.getBalance());


        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: " + atm.getBalance());
                    break;
                case 2:
                    System.out.print("Enter the deposit amount: ");
                    float depositAmount = sc.nextFloat();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter the deposit amount: ");
                    float withdrawAmount = sc.nextFloat();
                    atm.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
