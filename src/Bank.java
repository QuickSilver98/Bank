import java.util.Scanner;

public class Bank {

    Scanner input = new Scanner(System.in);
    private int accountNumber;
   private double accountBalance = 0;
   private String holderName;

   private double amountDeposited;
   private double amountWithdrawn;

   public int choice1;


   public void savingsAccount(){
       accountNumber = 769845673;
       holderName = "Takehiro Tomiyasu";

       intro();

       switch (choice1){
           case 1:
               checkAccountBalance();
               break;
           case 2:
               depositCash();
               break;

           case 3:
               System.out.println("Enter amount you want to withdraw");
               amountWithdrawn = input.nextDouble();

               if(amountWithdrawn > accountBalance){
                   System.out.println("You cannot withdraw this amount");
               }else {
                   withdrawCash();
               }
               break;

           default: System.out.println("Error,try again");
       }
   }

   public void currentAccount(){

       accountNumber = 763790235;
       holderName = "Takehiro Tomiyasu";
       double overdraftLimit = 500;

       intro();

      switch (choice1){
          case 1:
              checkAccountBalance();
              break;
          case 2:
              depositCash();
              break;

          case 3:
              if(amountWithdrawn > accountBalance && amountWithdrawn > overdraftLimit){
                  System.out.println("You cannot complete this transaction");
              }else {
                  withdrawCash();
              }
              break;

          default: System.out.println("Error,try again");
      }

   }

   public void depositCash(){
       System.out.println("Enter amount you want to deposit");
       amountDeposited = input.nextDouble();

       accountBalance += amountDeposited;

       System.out.println("You have successfully deposited " + amountDeposited + "ksh");
   }

   public void withdrawCash(){
       System.out.println("Enter amount you want to withdraw");
       amountWithdrawn = input.nextDouble();

       accountBalance -= amountWithdrawn;

       System.out.println("You have successfully withdrawn " + amountWithdrawn + "ksh");
   }

   public void checkAccountBalance(){
       System.out.println("Your account balance is " + accountBalance);
   }

   public void intro(){

       System.out.println("Welcome");
       System.out.println();

       System.out.println("1.Check account balance\n2.Deposit cash\n3.Withdraw cash");
       System.out.println();

       System.out.println("Enter operation you want to perform");
       choice1 = input.nextInt();
   }


}
