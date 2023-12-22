// FILEPATH: /c:/Users/benny/Scripts/network-monitoring-tool/src/test/java/MainTest.java

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void testNetworkDevice() {
        NetworkDevice device = new NetworkDevice();
        device.setIPAddress("1.1.1.1");
        device.setStatus("Up");
        assertEquals("1.1.1.1", device.getIPAddress());
        assertEquals("Up", device.getStatus());
    }

    @Test
    public void testNetworkDeviceManager() {
        NetworkDevice device = new NetworkDevice();
        NetworkDeviceManager manager = new NetworkDeviceManager();
        manager.Register(device);
        assertTrue(manager.getDevices().contains(device));
    }

    @Test
    public void testMonitoringTool() {
        NetworkDevice device = new NetworkDevice();
        MonitoringTool tool = new MonitoringTool();
        device.registerObserver(tool);
        assertTrue(device.getObservers().contains(tool));
    }

    @Test
    public void testStatusChange() {
        NetworkDevice device = new NetworkDevice();
        MonitoringTool tool = new MonitoringTool();
        device.registerObserver(tool);
        device.setStatus("Down");
        assertEquals("Down", device.getStatus());
        // Add additional assertions here to verify the MonitoringTool reacted as expected
    }
}