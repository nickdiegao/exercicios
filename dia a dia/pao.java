public class pao {
    
    private char sexo;
    private double alt;

    public pao(char sexo,double alt){
        this.sexo=sexo;
        this.alt=alt;
    }

    public char getSexo(){
        return sexo;
    }

    public void setSexo(char sexo){
        this.sexo=sexo;
    }   

    public double getAlt(){
        return alt;
    }
}
