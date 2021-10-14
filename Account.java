package exe2printing;
public class Account {
    private int id;
    private double balance;
    private double annualRate;
    static String color;
    public Account(int id, double balance, double annualRate) {
        this.id = id;
        this.balance = balance;
        this.annualRate = annualRate;
    }   
    public String toString(){
        return id+", you have RM"+balance+"!"+"\n";
    }
    public void printing(){   //version 3
        System.out.println(id+", you have RM"+balance+"!");
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getAnnualRate() {
        return annualRate;
    }
    public void setAnnualRate(double annualRate) {
        this.annualRate = annualRate;
    }
    public double getMonthRate(){
        return annualRate/12;
    }
    public void deposit(double amt){
        balance=balance+amt;
    }
    public void withdraw(double amt){
        balance=balance-amt;
    }

}    
