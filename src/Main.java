import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        selectAccount();
    }

    private static void selectAccount(){
        Scanner input = new Scanner(System.in);
        Bank bankObject = new Bank();
        int option;

        System.out.println("1.Savings account\n2.Current account");
        System.out.println();

        System.out.println("Enter account you want to login to");
        option = input.nextInt();

        if(option == 1){
            bankObject.savingsAccount();
        } else if (option == 2) {
            bankObject.currentAccount();
        }else {
            System.out.println("Wrong input");
        }
    }

}
