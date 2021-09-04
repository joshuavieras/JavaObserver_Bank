
public class Main {
	public static void main(String[] args) {
		Comission c=new Comission();
		Expense e=new Expense();
		Compensation cs=new Compensation();
		
		AccountPublisher p = new AccountPublisher();
		
		p.Attach(c);
		p.Attach(e);
		p.NotifyUpdate(new Account(100));
		
		p.Detach(c);
		p.Attach(cs);
		
		p.NotifyUpdate(new Account(200));
		
		p.Attach(c);
		p.NotifyUpdate(new Account(300));
	}
}
