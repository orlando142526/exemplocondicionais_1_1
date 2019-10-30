
package exemplocondicionais;

import java.util.Scanner;


public class Exemplocondicionais {

 
    public static void main(String[] args) {
        // TODO code application logic here
        Condicional obx1=new Condicional();
      int ed;
      ed=obx1.pedirInt();
      obx1.entrar(ed);
      obx1.permiso(ed);
      String resposta=obx1.permiso(ed);
      System.out.println(resposta);
            System.out.println(obx1.permiso(ed));
      
        
        
        
        
    }
    
}
