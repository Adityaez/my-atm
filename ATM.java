
import java.util.Scanner;

public class ATM {
    float Balance;
    int PIN = 1234;

    public ATM() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the PIN: ");
            int EnteredPin = sc.nextInt();
            if (EnteredPin == PIN) {
                menu();
                break;
            } else {
                System.out.println("Invalid PIN. Please try again.");
            }
        }
    }
        public void menu() {
            System.out.println("Enter your choice : ");
            System.out.println("1.Check A/C balance ");
            System.out.println("2.Withdraw Money");
            System.out.println("3.Deposit Money");
            System.out.println("4.Exit");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();

            switch (option){
                case 1:
                    checkbalance();
                    break;
                case 2:
                    withdrawmoney();
                    break;
                case 3:
                    Depostemoney();
                    break;
                case 4:
                    Exit();
                default:
                    System.out.println("Input is invalid");
            }}


           public void checkbalance(){
                System.out.println("Balance"+Balance);
                menu();

            }
            public void withdrawmoney() {
                System.out.println("Enter Amount :");
                Scanner scanner = new Scanner(System.in);
                float amount = scanner.nextFloat();
                if (amount > Balance) {
                    System.out.println("Insufficient Balance");
                } else {
                    Balance -= amount;
                    System.out.println("Money withdrawn successfully");
                }
                menu();
            }


            public void  Depostemoney() {
                System.out.println("Enter the amount to Deposit :");
                Scanner scanner = new Scanner(System.in);
                 float addmoney =  scanner.nextFloat();
                Balance += addmoney;
                System.out.println("Money deposited  successfully");

                menu();
            }
    public void Exit() {
        System.out.println("Thank you for using the ATM. Goodbye!");
        System.exit(0);
    }
            }








