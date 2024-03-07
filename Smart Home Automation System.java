import java.util.HashMap;
import java.util.Map;

// Abstract class representing a smart device
abstract class SmartDevice {
    private boolean isOn;

    public SmartDevice() {
        this.isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Device turned on");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Device turned off");
    }
}

// Concrete class representing a smart light
class SmartLight extends SmartDevice {
    // Additional attributes and methods specific to SmartLight
}

// Concrete class representing a smart thermostat
class SmartThermostat extends SmartDevice {
    // Additional attributes and methods specific to SmartThermostat
}

// Class representing the smart home automation system
class HomeAutomationSystem {
    private Map<String, SmartDevice> devices;

    public HomeAutomationSystem() {
        this.devices = new HashMap<>();
    }

    public void addDevice(String name, SmartDevice device) {
        devices.put(name, device);
    }

    public void removeDevice(String name) {
        devices.remove(name);
    }

    public void turnOnDevice(String name) {
        SmartDevice device = devices.get(name);
        if (device != null) {
            device.turnOn();
        } else {
            System.out.println("Device not found");
        }
    }

    public void turnOffDevice(String name) {
        SmartDevice device = devices.get(name);
        if (device != null) {
            device.turnOff();
        } else {
            System.out.println("Device not found");
        }
    }
}

// Main class to demonstrate usage
public class Main {
    public static void main(String[] args) {
        HomeAutomationSystem system = new HomeAutomationSystem();

        // Add smart devices to the system
        system.addDevice("Living Room Light", new SmartLight());
        system.addDevice("Bedroom Light", new SmartLight());
        system.addDevice("Thermostat", new SmartThermostat());

        // Turn on a device
        system.turnOnDevice("Living Room Light");

        // Turn off a device
        system.turnOffDevice("Bedroom Light");
    }
}
