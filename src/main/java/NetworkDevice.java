public class NetworkDevice {
    private String IPAddress;
    private String Status;

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
}