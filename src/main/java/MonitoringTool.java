public class MonitoringTool implements Observer {
    public void CheckStatus(NetworkDevice device) {
        // Register as observer to receive updates
        device.registerObserver(this);
    }

    @Override
    public void update(NetworkDevice device) {
        // Perform actions based on the device status change
    }
}