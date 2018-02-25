/*
* Course: CS 1302
* Name: Parth Patel
*/

import java.text.NumberFormat;
import java.util.Date;
   

public class Account {
    
    
    //Declaring variables
    private int id; 
    private double balance; 
    private double annualInterestRate;
    private Date dateCreated;
    private double monthlyInterestRate;
    
    
   //Setting default values
   public Account() {
    this.id = 0;
    this.balance = 0;
    this.annualInterestRate = 0;
 }
    
   //Creating a default account
   public Account(int id,double balance) {
    this.id = id;
    this.balance = balance;
    dateCreated = new Date();  //Creating a Date when account is created
}
   
   //Accessors and Mutators for the account data
   public int getId(){
       return id;
   }
   
   public void setId(int myid){
       id = myid;
   }
   
   public double getBalance(){
       return balance;
   }
   
   public void setBalance(double newbalance){
       balance = newbalance;
   }
   
   public double getAnnualInterestRate(){
       return annualInterestRate;
   }
   
   public void setAnnualInterestRate(double newannualInterestRate){
       annualInterestRate = newannualInterestRate;
   }
   
   public Date getDateCreated(){
       return dateCreated;
   }
   
   public double getMonthlyInterestRate(){
       monthlyInterestRate = balance * (annualInterestRate / 12) / 100;
       return monthlyInterestRate;
   }
   
   public double getMonthlyInterest(){
       return balance * monthlyInterestRate;
   }
   
   
   //Withdrawal and Deposit Methods for transactions
   public void withdraw(double withAmount){
       balance = balance - withAmount;
   }
   
   public void deposit(double deposAmount) {
       balance = balance + deposAmount;
   }
   
   
   //The ToString method to display individual account details
   
   NumberFormat money = NumberFormat.getCurrencyInstance();
   
   @Override
   public String toString(){
       return "Account ID: " + id + "\n" + "Account Balance: " + money.format(balance) + "\n" + "Interest Rate: " + annualInterestRate + "%" + "\n" + "Date Opened: " + dateCreated;
       
   }
   
   
           
   
    
}
