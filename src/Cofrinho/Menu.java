package Cofrinho;

//Nessa parte do projeto eu cirei um menu interativo para fazer as funções principais do programa

import java.util.Scanner;

public class Menu {
	
private Scanner sc;
private Cofrinho cofrinho;
	
	
public Menu() {
	sc = new Scanner(System.in);
	cofrinho = new Cofrinho();
		
	}

public void exibirMenuPrincipal() {
	 System.out.println("COFRINHO:");
	 System.out.println("1-Adicionar moeda");
	 System.out.println("2-Remover moeda");
	 System.out.println("3-Listar moedas");
	 System.out.println("4-Calcular total convertido para Real");
	 System.out.println("0-Encerrar");
	     
	 String opcaoSelecionada = sc.next();
	     
	     
switch (opcaoSelecionada) {
     
     case "0":
	 System.out.println("Operacao finalizada");
	 break;
	    	 
	 case"1":
	 exibirMenuAdicionarMoedas();
	 exibirMenuPrincipal();	    	 
	 break;
	     
	 case"2":
	 exibirMenuRemoverMoedas();
	 exibirMenuPrincipal();	    	 
	 break;
	    	
	 case "3":
	 cofrinho.ListagemMoedas();
	 exibirMenuPrincipal();
     break;	     
	    	
	 case "4":
	 double valorTotalConvertido = cofrinho.totalConvertido();
	 String valorTotalConvertidoTextual = String.format("%.2f",valorTotalConvertido);
	 valorTotalConvertidoTextual = valorTotalConvertidoTextual.replace(".",",");
	 System.out.println("O valor total convertido para real ?" + valorTotalConvertidoTextual);
	 exibirMenuPrincipal();
	 break;
            
	 default:
	 System.out.println("Opcao invalida");
	 exibirMenuPrincipal();
	 break;
	    	 }
	     
}

 private void exibirMenuAdicionarMoedas() {
     System.out.println("Escolha Moeda");
   	 System.out.println("1 - Real");
   	 System.out.println("2 - Dolar");
   	 System.out.println("3 - Euro");
   	 
   	 int opcaoMoeda = sc.nextInt();
   	 
   	 System.out.println("Digite o valor a ser depositado");
   	 
   	 String valorTextualMoeda = sc.next();  
   	 valorTextualMoeda = valorTextualMoeda.replace(",",".");
   	 double valorMoeda =Double.valueOf(valorTextualMoeda);
   	 
   	 Moeda moeda = null;
   	 
   	 if (opcaoMoeda ==1) {
   		moeda = new Real(valorMoeda);
      }else if (opcaoMoeda == 2) {
   	    moeda = new Dolar(valorMoeda);	    	   
      }else if (opcaoMoeda == 3) {
   	    moeda = new Euro(valorMoeda);	    	   
      }else {
   	   System.out.println("Moeda nao existe");
   	   exibirMenuPrincipal();
      }
      
   	 cofrinho.adicionar(moeda);
   	 System.out.println("Moeda adicionada!");
   	 
	}
  
  private void exibirMenuRemoverMoedas() {
	     System.out.println("Escolha Moeda");
	   	 System.out.println("1 - Real");
	   	 System.out.println("2 - Dolar");
	   	 System.out.println("3 - Euro");
	   	 
	   	 int opcaoMoeda = sc.nextInt();
	   	 
	   	 System.out.println("Digite o valor");
	   	 
	   	 String valorTextualMoeda = sc.next();  
	   	 valorTextualMoeda = valorTextualMoeda.replace(",",".");
	   	 double valorMoeda =Double.valueOf(valorTextualMoeda);
	   	 
	   	 Moeda moeda = null;
	   	 
	   	 if (opcaoMoeda ==1) {
	   		moeda = new Real(valorMoeda);
	     }else if (opcaoMoeda == 2) {
	   	    moeda = new Dolar(valorMoeda);	    	   
	     }else if (opcaoMoeda == 3) {
	   	    moeda = new Euro(valorMoeda);	    	   
	     }else {
	   	 System.out.println("Moeda nao existe");
	   	 exibirMenuPrincipal();
	     }
	      
	   	 cofrinho.remover(moeda);
    }
  
}
     
