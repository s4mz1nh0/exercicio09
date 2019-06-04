
package Atividade3;

public class Teste {

    public static void main(String[] args) {
        System.out.println("--Fornecedor--");
        Fornecedor f = new Fornecedor("José", "Rua A","111-1111", 2000, 2200);
        System.out.println(f.obterSaldo());
        System.out.println("--Empregado--");
        Empregado e = new Empregado("Pedro", "Rua B","222-2222", 10, 1800, 8.5);
        System.out.println(e.calcularSalario());
        System.out.println("--Administrador--");
        Administrador a = new Administrador("João", "Rua C","333-3333", 10, 3200, 11, 500);
        System.out.println(a.calcularSalario());
        System.out.println("--Operario--");
        Operario o = new Operario("Ana", "Rua D","444-4444", 10, 1400, 8.5, 25000, 0.5);
        System.out.println(o.calcularSalario());
    }
}