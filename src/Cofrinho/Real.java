package Cofrinho;

//Aqui eu criei uma classe exclusiva para a moeda de Real

public class Real extends Moeda {
	
    public Real(double valor) {
		this.valor = valor;
	}
	
     @Override
     public void info() {
		System.out.println("Real - " + valor);

	}

     @Override
     public double converter() {
	    return this.valor;
}
	
     @Override
     public boolean equals(Object objeto) {
	    if (this.getClass() != objeto.getClass()) {
		return false;
}
		
     Real objetoDeReal = (Real) objeto;
		
	 if(this.valor != objetoDeReal.valor) {
		return false;
}
		
	 return true;
	
}

}
