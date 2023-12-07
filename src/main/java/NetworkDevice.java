import java.util.List;
import java.util.ArrayList;

public class NetworkDevice implements Observer {
    private String IPAddress;
    private String Status;

    private List<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void setIPAddress(String IPAddress) {
        this.IPAddress = IPAddress;
    }

    public String getIPAddress() {
        return this.IPAddress;
    }

    public String getStatus() {
        return this.Status;
    }

    public void setStatus(String status) {
        this.Status = status;
    }

    @Override
    public void update(NetworkDevice device) {
        // Perform actions based on the device status change
    }
}