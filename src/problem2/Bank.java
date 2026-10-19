package problem2;


import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;
    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }
    public boolean addCustomer(String customerName){
        for(Customer c : customers){
            if(c.getName().equalsIgnoreCase(customerName)){
                return false;
            }
        }
        customers.add(new Customer(customerName));
        return true;
    }
    public boolean addTransaction(String customerName,double amount) {
        for (Customer c : customers) {
            if (c.getName().equalsIgnoreCase(customerName)) {
                c.addTransactions(amount);
                return true;
            }
        }
        return false;
    }
    public void print(String customerName){
        for(Customer c : customers){
            if(c.getName().equalsIgnoreCase(customerName)){
                System.out.println("Customer :" + customerName);
                System.out.println("Transactions : ");
                for (Double trans : c.getTransactions()){
                    double amount = trans;
                    System.out.println("Amount : " + amount);
                }
                return ;
            }
        }
        System.out.println("Customer not found! ");
    }



}
