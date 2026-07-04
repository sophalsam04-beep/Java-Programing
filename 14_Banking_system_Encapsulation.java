import java.util.Scanner;

class Bank{
    // data member
    private String AccountName;
    private String AccountHolder;
    private double balance;

    // Constructor
        Bank(String AccountName, String AccountHolder, double balance){
                this.AccountName=AccountName;
                this.AccountHolder=AccountHolder;
                this.balance=balance;

        }

    // getter and setter
        public void setAccountName(String accountName){
                this.AccountName = AccountName;
        }

        public String getAccountName(){
                return AccountName;
        }


        public void setAccountHolder(String accountHolder){
                this.AccountHolder = AccountHolder;
        }

    public String getAccountHolder() {
        return AccountHolder;
    }


    public void setBalance(double balance){
            this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }


        public void deposit(double amount){
                if(amount>0){
                      balance+=amount;

                      System.out.println("Deposit Succesfully...!");
                }else{
                    System.out.println("Invalid Deposit...!");
                }
        }

        public void withdraw(double amount){
                if(amount<=balance && amount > 0){
                        balance -=amount;
                        System.out.println("Withdraw succesfully...!");
                }else {
                    System.out.println("Invalid to withdraw...!");
                }
        }

        void displayAcc(){
            System.out.println("AccountName : "+AccountName);
            System.out.println("AccountHolder :"+AccountHolder);
            System.out.println("Balance : "+balance);
        }

}


public class Main {

    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
            Bank b = new Bank("Un virak", "123",500);

            System.out.println("Enter acc Name" );
            String accName = sc.next();

            System.out.println("Enter acc Holder :");
            String accHolder = sc.next();

            System.out.println("Enter acc Balance : ");
            String accBalance = sc.next();
            int choice;

        do {
            System.out.println("=======================");
            System.out.println("|  1. Display Account |");
            System.out.println("|  2. Deposit Account |");
            System.out.println("|  3. Withdraw Accoun |");
            System.out.println("|  4. Exist           |");
            System.out.println("=======================");

            choice = sc.nextInt();

                switch (choice){
                    case 1:
                        b.displayAcc();
                        break;

                    case 2:
                        System.out.println("Enter balance to depost : ");
                        double deposit = sc.nextInt();
                        b.deposit(deposit);
                        System.out.println("Deposit Succesfully...!");
                        break;

                    case 3:
                        System.out.println("Enter balance to withdraw :");
                        double withdraw = sc.nextInt();

                        b.withdraw(withdraw);
                        System.out.println("Withdraw succesfully...!");
                        break;


                    case 4:
                        System.out.println("Thank for using our Banking System...!");
                        break;

                    default:
                        System.out.println("Invalid error...!");
                }


        }while (choice != 4);

        sc.close();

    }
}
