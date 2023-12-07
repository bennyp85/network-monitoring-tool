# Network Monitoring Tool

This is a simple network monitoring tool written in Java. It includes classes for network devices and a monitoring tool that checks the status of each device.

## Classes

- `NetworkDevice`: Represents a network device with an IP address and status.
- `MonitoringTool`: Checks the status of a `NetworkDevice`.
- `NetworkDeviceManager`: Manages a list of `NetworkDevice` objects and notifies the `MonitoringTool` to check their status.

## How to Run

1. Compile the Java files: `javac Main.java NetworkDevice.java MonitoringTool.java NetworkDeviceManager.java`
2. Run the main class: `java Main`

## Testing

This project uses JUnit for testing. To run the tests, compile the test files and then run them with the JUnit runner.

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License

[MIT](https://choosealicense.com/licenses/mit/)