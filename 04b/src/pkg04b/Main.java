
package pkg04b;

public class Main {

    public static void main(String[] args) {
        /// Usando Construtor!
        Caneta c1 = new Caneta("NIC","Amarela", 0.4f);
        c1.status();
        System.out.println("-------------------------");
        Caneta c2 = new Caneta("Bic", "Azul", 0.5f);
        c2.status();

        //****MÉTODO  GET e SET
        //c1.setModelo("BIC");
        //c1.modelo = " Bic";
        //c1.setPonta(0.5f);
        //c1.status();
        
        //System.out.println("Tenho uma caneta: "  + c1.getModelo() + " de ponta " +c1.getPonta() + "!");
        //System.out.println("------------------------------------------------------------------");
        //Caneta c2 = new Caneta();
        //c2.setModelo("Faber Castell");
        //c2.setPonta(0.7f);
        //c2.status();
        //System.out.println("Tenho uma caneta: " +c2.getModelo() + " de ponta " + c2.getPonta() + "!");
        //System.out.println("------------------------------------------------------------------");
        //Caneta c3 = new Caneta();
        //c3.setModelo("Compactor");
        //c3.setPonta(0.07f);
        //c3.status();
        //System.out.println("Tenho uma caneta: " + c3.getModelo() + " de ponta " + c3.getPonta() + "!")
        //System.out.println("-------------------------------------------------------------------");
                
                
    }
    
    
}
