package main;

// classe ContaCorrente que herda os metodos abstratos da classe contaBancaria
public class ContaCorrente extends ContaBancaria {
		// atributos necessários
		protected float saldoConta;
		protected float limiteConta;
		protected float taxaSaque = 0.1f; // percentual da taxa
		protected float taxaDeposito = 0.05f;
		protected float taxaConsulta = 0.01f;
		
		// metodo construtor para montar as caracteristicas
		public ContaCorrente(float saldoConta, float limiteConta) {
		    this.saldoConta = saldoConta;
		    this.limiteConta = limiteConta;
		}
		// método get para acessar o atributo
	public float getSaldoConta() {
			return saldoConta;
		}
		// método set para modificar o valor do atributo
		public void setSaldoConta(float saldoConta) {
			this.saldoConta = saldoConta;
		}

	public float getLimiteConta() {
			return limiteConta;
		}

		public void setLimiteConta(float limiteConta) {
			this.limiteConta = limiteConta;
		}
		
		public float getTaxaSaque() {
			return taxaSaque;
		}

		public void setTaxaSaque(float taxaSaque) {
			this.taxaSaque = taxaSaque;
		}

		public float getTaxaDeposito() {
			return taxaDeposito;
		}

		public void setTaxaDeposito(float taxaDeposito) {
			this.taxaDeposito = taxaDeposito;
		}

		public float getTaxaConsulta() {
			return taxaConsulta;
		}

		public void setTaxaConsulta(float taxaConsulta) {
			this.taxaConsulta = taxaConsulta;
		}
		
		// metodo String para descrever o tipo de conta 
		public String conta() {
			return "Conta Corrente\n";
		}

	// metodo abstrato da classe Contabancaria com o metodo de saque
	@Override
	void saque(float valorSaque) {
		System.out.println("Saldo atual: " + saldoConta);
		float taxa = valorSaque * taxaSaque;
		float totalSaque = valorSaque + taxa;
		if(totalSaque > saldoConta + limiteConta) { // se o valor do saque for superior ao saldo + limite vai dar exceção
			throw new IllegalArgumentException("Valor do saque superior ao limite");
		}
		// aplica a taxa e subtrai o saque realizado do saldo da Conta
		 saldoConta -= totalSaque;
		 	// informa o saque realizado e a taxa cobrada
		    System.out.println("Saque realizado: " + valorSaque + "\nTaxa cobrada automaticamente de: " + taxaSaque + "%" + "\nValor da taxa cobrada: " + taxa);
		    System.out.println("Novo Saldo: " + saldoConta + "\n");
	}
	// metodo abstrato da classe Contabancaria com o metodo de deposito
	@Override
	void deposito(float valorDeposito) {
		System.out.println("Saldo atual: " + saldoConta);
		float taxaDep = valorDeposito * taxaDeposito;
		float totalDeposito = valorDeposito - taxaDep;
		
		if(valorDeposito <= 0) { // se tentar fazer um deposito de 0 ou um numero negativo vai dar exceção
			throw new IllegalArgumentException("O valor do deposito deve ser superior a 0");
		}
		// aplica a taxa e atualiza o saldo da conta após o deposito
		saldoConta += totalDeposito;
		// informa o deposito realizado e a taxa cobrada
		System.out.println("Deposito realizado: " + valorDeposito + "\nTaxa cobrada automaticamente de: " + taxaDeposito + "%" + 	"\nValor da taxa cobrada: " + taxaDep);
		System.out.println("Novo Saldo: " + saldoConta  + "\n");
	}
	// metodo abstrato da classe Contabancaria com o metodo de consulta
	@Override
	void consulta() {
		System.out.println("Saldo atual: " + saldoConta);
		float taxaFinal = saldoConta * taxaConsulta;
		// realiza a aplicação da taxa por realizar uma consulta
		saldoConta -= taxaFinal;
		// mostra a consulta e a taxa cobrada
		System.out.println("Saldo final após cobrança de taxa: " + saldoConta + "\nTaxa cobrada automaticamente de: " + taxaConsulta + "%" + "\nValor da taxa cobrada: " + taxaFinal);
	}
	
}
