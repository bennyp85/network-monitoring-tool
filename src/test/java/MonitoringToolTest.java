import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;public class MonitoringToolTest {
    @Test
    public void testUpdate() {
        MonitoringTool tool = new MonitoringTool();
        NetworkDevice device = new NetworkDevice();
        tool.Update(device);
        // Add assertions here to verify the update method works as expected
    }
}