package Cofrinho;

//Nessa parte do projeto eu fiz o cofrinho que lista e converte o valor das moedas

import java.util.ArrayList;

public class Cofrinho {
	

private ArrayList<Moeda> ListaMoedas;
	
public Cofrinho() {
	this.ListaMoedas = new ArrayList<>();	
	}
	
public void adicionar(Moeda moeda) {
	this.ListaMoedas.add(moeda);
	}
	
public void remover(Moeda moeda) {
	this.ListaMoedas.remove(moeda);
	}
	
public void ListagemMoedas() {
		
	if (this.ListaMoedas.isEmpty()){
		  System.out.println("Nenhuma moeda guardada no cofrinho");
		  return;
	}

	for(Moeda moeda : this.ListaMoedas) {
		  moeda.info();
		}
	
	}

public double totalConvertido() {
		
	if (this.ListaMoedas.isEmpty()) {
		  return 0;
		}
		
	double valorAcumulado = 0;
		
	for(Moeda moeda : this.ListaMoedas) {
		  valorAcumulado = valorAcumulado + moeda.converter();
		
	}
		
		return valorAcumulado;
		
	}
}
