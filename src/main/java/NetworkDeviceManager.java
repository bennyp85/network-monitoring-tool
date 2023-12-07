import java.util.ArrayList;
import java.util.List;

public class NetworkDeviceManager {
    private List<NetworkDevice> devices = new ArrayList<>();

    public void Register(NetworkDevice device) {
        devices.add(device);
        // print that we are registering the device
        System.out.println("Registering device with IP Address: " + device.getIPAddress());
    }

    public void Unregister(NetworkDevice device) {
        devices.remove(device);
        // print that we are unregistering the device
        System.out.println("Unregistering device with IP Address: " + device.getIPAddress());

    }

    public void Notify() {
        for (NetworkDevice device : devices) {
            device.getStatus();
        }
    }
}