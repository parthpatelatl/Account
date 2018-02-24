/*
* Course: CS 1302
* Name: Parth Patel
*/



public class TestAccount{
   
    
 public static void main(String[] args) {

     //Creating 3 account objects
     Account account = new Account(1122, 20000);
     Account myAccount = new Account(1123, 40000);
     Account yourAccount = new Account(1124, 24000);
     
     //Transactions for first account
     account.setAnnualInterestRate(4.5);
     account.withdraw(2500);
     account.deposit(3000);
     
     //Transactions for second account
     myAccount.setAnnualInterestRate(5.6);
     myAccount.withdraw(5000);
     myAccount.deposit(2200);
     
     //Transactions for third account
     yourAccount.setAnnualInterestRate(7.1);
     yourAccount.withdraw(1750);
     yourAccount.deposit(2470);
     
    
     //Printing out details using the toString method.
     System.out.println(account);
     System.out.println();
     System.out.println(myAccount);
     System.out.println();
     System.out.println(yourAccount);
     
     
     
    }
 
 
}