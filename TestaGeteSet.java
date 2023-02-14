package ByteBankComposto;

public class TestaGeteSet {
	
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 22422);
		conta.setNumero(1337);
		
		Cliente paulo = new Cliente();
		paulo.setNome("paulo silveira");
		
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		
		//outra forma de usar
		
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		}
}
