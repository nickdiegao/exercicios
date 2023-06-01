public class help {
    
    private int number;
    private String name;
    private double balance;
    
    public help(int number, String name){
        this.number = number;
        this.name = name;
    }
    
    public help(int number, String name, double deposito) {
		this.number = number;
		this.name = name;
		deposit(deposito);
	}

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public int getNumber() {
		return number;
	}
	
    public void deposit(double amount){
        balance += amount;
    }

    public void retirada(double amount){
        balance -= amount;
    }
    
    public String toString(){
        return "Conta: "
                +number
                +", Cliente "
                +name
                +", Valor na conta: R$"
                +balance; 
    }
    

}


