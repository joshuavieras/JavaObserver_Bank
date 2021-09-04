
public interface Subject {
public void Attach(Observer observer);
public void NotifyUpdate(Account a);
public void Detach(Observer o);
}
