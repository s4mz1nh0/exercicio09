
package Atividade1e2;

public class TestaAnimais {
    public static void main(String [] args){
        
        Papagaio p = new Papagaio("Louro",true,"Curupaco");
        p.talk();
        p.imprime();
        
        Arara a = new Arara("Cacau",true);
        a.talk();
        a.imprime();
        
        Cachorro c = new Cachorro("Barão",4,true);
        c.talk();
        c.imprime();
        
        Vaca v = new Vaca("Chifruda",4,true);
        v.talk();
        v.imprime();
    }    
}
