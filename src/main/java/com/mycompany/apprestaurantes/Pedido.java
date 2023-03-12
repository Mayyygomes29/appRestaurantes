
package com.mycompany.apprestaurantes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


public class Pedido {
    protected LocalDate data = LocalDate.now();
    protected LocalTime hora = LocalTime.now();
    protected boolean pedidoConcluido;
    protected int  refeicao;
    
     


    public Pedido(String usuario, String senha) {
        Cliente c = new Cliente();
        c.usuario = usuario;
        c.senha = senha;
    }

    Pedido() {}
    
       public void ListaRest() {

        List<String> listaRestaurantes = new ArrayList<String>();
        listaRestaurantes.add(0, "McDonalds");
        listaRestaurantes.add(1, "Outback");
        listaRestaurantes.add(2, "Parmê");
        listaRestaurantes.add(3, "Habib's");
        listaRestaurantes.add(4, "Burger King");

        System.out.println("[1]" + listaRestaurantes.get(0));
        System.out.println("[2]" + listaRestaurantes.get(1));
        System.out.println("[3]" + listaRestaurantes.get(2));
        System.out.println("[4]" + listaRestaurantes.get(3));
        System.out.println("[5]" + listaRestaurantes.get(4));
     
       }
       
        public void Cardapio(int opcao){
      
            switch(opcao){
           case 1:System.out.println("[1] McDonalds");
               System.out.println("Big Mac");
               System.out.println("Mc Lanche Feliz");
               System.out.println("Quarteirão");
           break;
           case 2:System.out.println("[2] Outback");;
               System.out.println("Jr Ribs");
               System.out.println("Blom Petals");
               System.out.println("Wings");
               break;
           case 3:System.out.println("[3] Parmê");
               System.out.println("Pizza Portuguesa");
               System.out.println("Pizza Calabresa");
               System.out.println("Pizza 4 Queijos");
               break;
           case 4: System.out.println("[4] Habibs");
               System.out.println("Mini Kibe");
               System.out.println("Esfiha Queijo");
               System.out.println("Esfiha Carne");
               break;
           case 5: System.out.println("[5] Burger King");
               System.out.println("Whoper");
               System.out.println("King Jr");
               System.out.println("Mega Stacker");
               break;
           default :
               System.out.println("Restaurante indisponível");
               break;
                      
       }
          
        } 
     public void DadosPedido(){
    this.pedidoConcluido = true;
         System.out.println("Pedido: " +  this.getRefeicao());
         System.out.println("Data: " +  this.getData());
         System.out.println("Hora: " +  this.getHora());
         System.out.println("Pedido concluído: " +  this.getPedidoConcluido());
     
}
   public void FazerPedido(int escolher){
      switch(escolher){
           case 1:System.out.println("[1] McDonalds");
               System.out.println("Big Mac");           
           break;
           case 2 :  System.out.println("McDonalds");
               System.out.println("Quarteirão");
               break;
           case 3 :   System.out.println("McDonalds");
               System.out.println("McLanche Feliz"); 
               break;
           case 4:System.out.println("Outback");;
               System.out.println("Jr Ribs");
               break;
           case 5 :  System.out.println("Outback");
               System.out.println("Wings");
                 break;
           case 6 : System.out.println("Outback");
               System.out.println("Blom Petals");  
               break;
           case 7 :System.out.println(" Parmê");
               System.out.println("Pizza Portuguesa");
               break;
           case 8: System.out.println(" Parmê");
               System.out.println("Pizza Calabresa");
               break;
           case 9: System.out.println(" Parmê");
               System.out.println("Pizza 4 Queijos");
               break;
           case 10: System.out.println("[ Habibs");
               System.out.println("Mini Kibe");
               break;
           case 11: System.out.println("[ Habibs");
               System.out.println("Esfiha Queijo");
               break;
           case 12: System.out.println("[ Habibs");
               System.out.println("Esfiha Carne");
               break;
           case 13: System.out.println(" Burger King");
               System.out.println("Whoper");    
               break;
           case 14: System.out.println("Burger King");
               System.out.println("Mega Stacker");
               break;
           case 15: System.out.println(" Burger King");
               System.out.println("King Jr");
               break;
           default :
               System.out.println("Não encontramos essa opção");
               break;
   
   }
        this.refeicao = escolher;
   } 
    public void Avaliacao(String a){
       if (this.getPedidoConcluido() == true) {
           System.out.println("Faça um comentário sobre a sua experiência nesse restaurante: " + a );
       } else {
           System.out.println("Contamos com sua avaliação brevemente!");
       }
     }
    public int getRefeicao() {
        return refeicao;
    }

    public void setRefeicao(int refeicao) {
        this.refeicao = refeicao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public boolean getPedidoConcluido() {
        return pedidoConcluido;
    }

    public void setPedidoConcluido(boolean pedidoConcluido) {
        this.pedidoConcluido = pedidoConcluido;
    }
     
}