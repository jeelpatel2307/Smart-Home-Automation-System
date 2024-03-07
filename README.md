### Smart Home Automation System

This project provides a basic implementation of a Smart Home Automation System in Java. The system allows users to control various smart devices remotely, such as lights and thermostats, within their home environment.

### Features:

- **Device Management:** Users can add, remove, turn on, and turn off smart devices.
- **Device Types:** Currently, the system supports two types of devices: Smart Lights and Smart Thermostats. However, it can be easily extended to support other types of devices.
- **Simple Interface:** The system provides a straightforward interface for interacting with smart devices.

### Usage:

1. **Add Devices:** Use the `addDevice()` method to add smart devices to the system, specifying a unique name for each device.
2. **Control Devices:** Use the `turnOnDevice()` and `turnOffDevice()` methods to control the state of smart devices by providing their names.
3. **Remove Devices:** If needed, use the `removeDevice()` method to remove smart devices from the system.

### Example:

```java
HomeAutomationSystem system = new HomeAutomationSystem();

// Add smart devices to the system
system.addDevice("Living Room Light", new SmartLight());
system.addDevice("Bedroom Light", new SmartLight());
system.addDevice("Thermostat", new SmartThermostat());

// Turn on a device
system.turnOnDevice("Living Room Light");

// Turn off a device
system.turnOffDevice("Bedroom Light");

```

### Future Enhancements:

- **Additional Device Types:** Extend the system to support more types of smart devices, such as security cameras, smart locks, etc.
- **User Authentication:** Implement user authentication to allow multiple users to control the system securely.
- **Voice Control:** Integrate with a voice recognition system to enable voice commands for controlling devices.
- **Automation Rules:** Add support for defining automation rules, such as scheduling device actions based on time or sensor inputs.
