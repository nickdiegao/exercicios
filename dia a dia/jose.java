public class jose {

	public double dolar;

	public void doleta(double dolar){
		this.dolar *= dolar;
	}

	public void valor(double pneu){
		pneu *= this.dolar;
	}

	public static double conversao(double pneu){
		return pneu * 0.06;
	}	

}	