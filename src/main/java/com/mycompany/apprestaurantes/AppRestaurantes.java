
package com.mycompany.apprestaurantes;

public class AppRestaurantes {

    public static void main(String[] args) {
      
       Pedido p = new Pedido("mayyy29", "1233");
       p.ListaRest();
       
        System.out.println("============================================");
     
        p.Cardapio(1);
       
        System.out.println("===============================================");
      
        p.FazerPedido(1);
        
        System.out.println("===============================================");
        
        p.DadosPedido();
        
        p.Avaliacao("Otimo restaurante!");
        
        
    
     
     
     
        
        System.out.println("==================================================");
   
    
    }
}
