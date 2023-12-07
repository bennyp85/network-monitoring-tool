import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;public class NetworkDeviceManagerTest {
    @Test
    public void testRegister() {
        NetworkDeviceManager manager = new NetworkDeviceManager();
        NetworkDevice device = new NetworkDevice();
        manager.Register(device);
        // Add assertions here to verify the device was registered
    }

    @Test
    public void testUnregister() {
        NetworkDeviceManager manager = new NetworkDeviceManager();
        NetworkDevice device = new NetworkDevice();
        manager.Register(device);
        manager.Unregister(device);
        // Add assertions here to verify the device was unregistered
    }

    @Test
    public void testNotify() {
        NetworkDeviceManager manager = new NetworkDeviceManager();
        NetworkDevice device = new NetworkDevice();
        manager.Register(device);
        manager.Notify();
        // Add assertions here to verify the notify method works as expected
    }
}