
package Atividade3;

public class Teste {
    public static void main(String[] args){
        Pessoa p = new Pessoa("Samuel","R: 1",555555555);
        Fornecedor f = new Fornecedor("Samara","R: 5",55555555,2000,500);
        Empregado e = new Empregado("Sulamitha","R: 7",444444444,0001,1500,7);
        Administrador a = new Administrador("Iza","R: 21",666666666,0003,1750,5,500);
        Operario o = new Operario("Jurandy","R: 4",666666666,0007,1000,10,300,5);
        
        System.out.println("FORNECEDOR");
        System.out.println(f.obterSaldo());
        
        System.out.println("EMPREGADO");
        System.out.println(e.calcularSalario());

        System.out.println("ADMINISTRADOR");
        System.out.println(a.calcularSalario());
        
        System.out.println("OPERARIO");
        System.out.println(o.calcularSalario());
        
    }    
}