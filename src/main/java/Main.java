public class Main {
    public static void main(String[] args) {
        // print hello world
        System.out.println("Hello World!");
        // Create a new instance of the NetworkDevice class
        NetworkDevice device1 = new NetworkDevice();
        // Set the IPAddress property
        device1.setIPAddress("1.1.1.1");
        // Set the Status property
        device1.setStatus("Up");
        // Create a new instance of the NetworkDeviceManager class
        NetworkDeviceManager manager = new NetworkDeviceManager();
        // Register the device with the manager
        manager.Register(device1);
        // Create a new instance of the MonitoringTool class
        MonitoringTool tool = new MonitoringTool();
        // Check the status of the device using the MonitoringTool
        tool.CheckStatus(device1);
    }
}