public class salsicha {
    
    private int number;
    private String name;
    private double balance;

    public salsicha(int number, String name, double balance){
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    public salsicha(int number, String name){
        this.number = number;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getNumber(){
        return number;
    }

    public double getBalance(){
        return balance;
    }

    public void deposito(double amount){
        balance += amount;
    }

    public void retirada(double amount){
        balance -= amount + 5;
    }

    public String toString(){
        return "Conta: "
                +number
                +", cliente: "
                +name
                +", valor da conta: "
                +balance;
            }



}
