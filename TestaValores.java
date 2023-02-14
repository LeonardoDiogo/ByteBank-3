package ByteBankComposto;

public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1447, 23341);
		Conta conta3 = new Conta(1127, 14523);
		
		System.out.println(Conta.getTotal());
	}

}
