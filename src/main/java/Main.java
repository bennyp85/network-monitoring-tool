public class Main {
    public static void main(String[] args) {
        // Create a new instance of the NetworkDevice class
        NetworkDevice device1 = new NetworkDevice();
        // Set the IPAddress property
        device1.setIPAddress("1.1.1.1");
        // Set the Status property
        device1.setStatus("Up");
        // Create a new instance of the NetworkDeviceManager class
        NetworkDeviceManager manager = new NetworkDeviceManager();
        // Register the device with the manager
        manager.addDevice(device1);
        // Create a new instance of the MonitoringTool class
        MonitoringTool tool = new MonitoringTool();
        // Register the MonitoringTool as an observer
        device1.registerObserver(tool);
        // Change the status of the device to trigger an update
        device1.setStatus("Down");
    }
}