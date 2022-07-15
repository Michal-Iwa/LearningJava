package com.ClassesJava;

public class Main {
    public static void main(String[] args) {
        //Car porsche = new Car();
        //Car holden = new Car();
        //porsche.setModel("Carrera");
        //System.out.println("Model is " + porsche.getModel());
        BankAccount EmptyAccount = new BankAccount("1",322.32);
        BankAccount bankAccount = new BankAccount("123",0.00,"Bob Brown", "email@gmail.com", "823921992");
        bankAccount.depositFunds(1213);
        bankAccount.withdrawFunds(32);

    }
}
