package com.Banking;

import java.util.ArrayList;
import java.util.Objects;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }
    public boolean addBranch(String name){
        Branch branch = findBranch(name);
        if(branch != null) return false;
        branches.add(new Branch(name));
        return true;
    }
    public boolean addCustomer(String branchName, String customerName, double transaction){
        Branch branch = findBranch(branchName);
        if(branch != null) return branch.newCustomer(customerName,transaction);
        return false;
    }
    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){
        Branch branch = findBranch(branchName);
        if(branch != null) return branch.addCustomerTransaction(customerName,transaction);
        return false;
    }
    private Branch findBranch(String name){
        for (int i = 0; i < branches.size(); i++) {
            Branch branch = branches.get(i);
            if (branch.getName().equals(name)) return branch;
        }
        return null;
    }
    public boolean listCustomers(String branchName, boolean printTransactions){
        Branch branch = findBranch(branchName);
        if(branch == null) return false;
        System.out.println("Customer details for branch " + branchName);
        for(int i = 0; i < branch.getCustomers().size(); i++){
            Customer customer = branch.getCustomers().get(i);
            System.out.println("Customer: " + customer.getName() + "[" + (i+1) + "]");
            if(printTransactions) {
                System.out.println("Transactions");
                for( int j = 0; j < customer.getTransactions().size(); j++){
                    System.out.println("[" + (j+1) + "]  Amount " + customer.getTransactions().get(j));
                }
            }
        }
        return true;
    }
}
