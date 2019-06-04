
package Atividade3;

public class Administrador extends Empregado{
    
    private double ajudadeCusto;
    
    public Administrador(String nome, String endereço, int telefone, int s, double x, double i, double a){
        super(nome, endereço, telefone, s, x, i);
        setAjudaCusto(a);
        
    }
    public double getAjudaCusto(){
        return this.ajudadeCusto;
    }
    public void setAjudaCusto(double a){
        this.ajudadeCusto=a;
    }
    public double calcularSalario(){
        return this.getAjudaCusto()+super.calcularSalario();
    }
}
