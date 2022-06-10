import java.util.ArrayList;
import java.util.List;

public class Board implements Observable {
    private List<Observer> observers;
    private String toyNeeded;

    public Board(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void setToyNeeded(String toyNeeded){
        System.out.println("Message on board: " + toyNeeded);
        this.toyNeeded = toyNeeded;
        this.notifyObservers();
    }

    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
        observer.setBoard(this);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.observers.remove(observer);
        observer.setBoard(null);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update(this.toyNeeded);
        }
    }

}
