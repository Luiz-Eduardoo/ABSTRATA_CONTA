package main;

public class Main {
	
	public static void main(String[] args) {
		// criando novo objeto dando valor aos atributos
		ContaCorrente contaC = new ContaCorrente(1000f, 3000f);
		ContaPoupança contaP = new ContaPoupança(1500f);
		
		// imprimindo as informações formatadas de cada objeto
		System.out.println(contaC.conta()); // informa o tipo de conta
		contaC.saque(100); // realiza um saque de 100
		contaC.deposito(200); // realiza um saque de 200
        contaC.consulta(); // realiza uma consulta
		System.out.println("\n------------------------------\n");
		System.out.println(contaP.conta()); // informa o tipo de conta
        contaP.saque(500); // realiza um saque de 500
		contaP.deposito(300); // realiza um deposito de 300
        contaP.consulta(); // realiza uma consulta
	}

}
