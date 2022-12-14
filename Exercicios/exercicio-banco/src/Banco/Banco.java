package Banco;

// conta corrente já ganha 50 reais na conta
// polpansa ganha 150 reais
// para fechar conta deve ser esvaziada a conta e não pode estar em débito
// para depositar a conta tem que estar aberta
// para sacar a conta tem que estar aberta e ter saldo

// nao deixar sacar um valor maior que a conta
// mensalidade todo mes. CC 12 reais / CP 20 reais

public class Banco {
	
	int numConta;
	protected String tipo; // cc conta corrente / cp conta polpança
	private String dono;
	private double saldo;
	private boolean status;
	
	public Banco() {
		
	}
	
	public Banco(int numConta, String tipo, String dono) {
		super();
		this.numConta = numConta;
		this.tipo = tipo;
		this.dono = dono;
		this.saldo = 0;
		this.status = false;
	}
		
	void abrirConta(String tipoConta){
		if(isStatus() == false) {
			setStatus(true);
			if(this.tipo.equals(tipoConta)) {
				setSaldo(50);
			}else {
				setSaldo(150);
			}
		}else {
			System.out.println("Conta já foi aberta!");
		}
	}
	
	void fecharConta(){
		if(getSaldo() == 0 && isStatus() == true)  {
			setStatus(false);
		}else if(isStatus() == false) {
			System.out.println("Essa conta ainda não foi aberta!");
		}else {
			System.out.println("Não é possível fechar a conta. Seu status é de R$" + this.saldo + " na conta");
		}
	}
	
	void depositar(double valor) {
		if(isStatus()) {
			this.setSaldo(this.getSaldo() + valor);
		}
	}
	
	void sacar(double valor){
		if(isStatus() == true && getSaldo() >= valor) {
			this.saldo -= valor;
		}else if(!isStatus()) {
			System.out.println("Esta conta não foi aberta!");
		}else {
			System.out.println("Valor inválido!");
		}
	}
	
	String imprimeSaldo() {
		if(isStatus()) {
			return getDono() + ": R$" + getSaldo();			
		}else {
			return "Esta conta não está aberta!";
		}
	}
	
	void pagarMensal(){
		if(isStatus()) {
			if(this.tipo.equals("cc") && this.saldo >= 12) {
				this.saldo -= 12;
			}else if(this.tipo.equals("cp") && this.saldo >= 20) {
				this.saldo -= 20;
			}else {
				System.out.println("Saldo insuficiente!");
			}
		}else {
			System.out.println("Esta conta não está aberta!");
		}

	}
	
	// --------------------------------------------------------
	
	public int getNumConta() {
		return numConta;
	}


	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getDono() {
		return dono;
	}


	public void setDono(String dono) {
		this.dono = dono;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}

	

	
}
