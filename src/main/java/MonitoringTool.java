public class MonitoringTool {
    public void CheckStatus(NetworkDevice device) {
        // return the status of the device
        if (device.getStatus().equals("Up")) {
            System.out.println("The device is up");
        } else {
            System.out.println("The device is down");
        }
    }
}