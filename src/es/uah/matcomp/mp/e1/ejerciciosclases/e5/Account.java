package es.uah.matcomp.mp.e1.ejerciciosclases.e5;

public class Account {
    private String id;
    private String name;
    private int balance;
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getID() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }
    public int credit(int amount){
        balance= balance+amount;
        return balance;
    }
    public int debit(int amount){
        if(amount<=balance){
            balance=balance-amount;
        }
        else{
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public int transferTo(Account Another, int amount){
        if(amount<=balance){
            this.debit(amount);
            Another.credit(amount);
        }
        else{
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", balance=" + balance + '}';
    }
}
