
public class Compensation implements Observer {



	@Override
	public void update(Account a) {
		System.out.println("Saldo: "+a.getSaldo()+" Saldo acreditado: "+a.getSaldo()*0.33);
	

	}

}
