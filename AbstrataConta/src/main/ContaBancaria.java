package main;
// classe abstrata com os metodos abstratos
public abstract class ContaBancaria {

	// metodo abstrato de consulta
    abstract void consulta();
    
    // metodo abstrato de saque
    abstract void saque(float valorSaque);
    
    // metodo abstrato de deposito
    abstract void deposito(float valorDeposito);
    
}