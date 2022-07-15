package com.ClassesJava;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customersName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("0",0.00,"Default name","Default email","Default number");
        // zawsze w pierwszej linii konstruktora ( wywołanie innego konstruktora
        System.out.println("Empty constructor called");
    }
    public BankAccount(String accountNumber) {
        this(accountNumber,0.00,"Default name", "Default email", "Default number");
    }
    public BankAccount(String accountNumber, double balance) {
        this(accountNumber,balance,"Default name", "Default email", "Default number");
    }
    public BankAccount(String accountNumber, double balance, String customersName) {
        this(accountNumber,balance,customersName, "Default email", "Default number");
    }
    public BankAccount(String accountNumber, double balance, String customersName, String email) {
        this(accountNumber,balance,customersName, email, "Default number");
    }

    public BankAccount(String accountNumber, double balance, String customersName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customersName = customersName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(String accNum) {
        this.accountNumber = accNum;
    }
    public String getAccountNumber() {
        return this.accountNumber;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return this.balance;
    }
    public void setCustomersName(String customerName) {
        this.customersName = customersName;
    }
    public String setCustomersName() {
        return this.customersName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public void depositFunds(int funds) {
        this.balance += funds;
        System.out.println(funds + " dollars had been added to balance");
    }
    public void withdrawFunds(int funds) {
        this.balance -= funds;
        System.out.println(funds + " dollars had been withdrawn");
    }


}
