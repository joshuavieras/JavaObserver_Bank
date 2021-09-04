import java.util.ArrayList;
import java.util.List;

public class AccountPublisher implements Subject{

	private List <Observer> obs= new ArrayList<>();
	@Override
	public void Attach(Observer o) {
		obs.add(o);

	}

	@Override
	public void Detach(Observer o) {
		obs.remove(o);

	}

	@Override
	public void NotifyUpdate(Account m) {
		for(Observer o: obs) {
			o.update(m);
		}

	}

}
