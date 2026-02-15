/**
 * Main.java
 * Demonstrates class construction, multiple constructors, 
 * and encapsulation through the Fan class.
 */
public class Main {
    public static void main(String[] args) {
        // 1. Create a fan using the default (no-argument) constructor
        Fan defaultFan = new Fan();
        
        // 2. Create a fan using the parameterized constructor
        // Settings: FAST (3), true (on), 12.5 (radius), "red" (color)
        Fan customFan = new Fan(Fan.FAST, true, 12.5, "red");

        // 3. Display initial states
        System.out.println("--- Initial Fan States ---");
        System.out.println("Fan 1: " + defaultFan.toString());
        System.out.println("Fan 2: " + customFan.toString());

        // 4. Demonstrate functionality of methods
        System.out.println("\n--- Testing Mutator Methods on Fan 1 ---");
        defaultFan.setOn(true);
        defaultFan.setSpeed(Fan.MEDIUM);
        defaultFan.setColor("yellow");
        defaultFan.setRadius(8.0);
        
        System.out.println("Updated Fan 1: " + defaultFan.toString());
        
        System.out.println("\n--- Testing Accessor Methods on Fan 2 ---");
        System.out.println("Fan 2 Color is: " + customFan.getColor());
        System.out.println("Fan 2 Radius is: " + customFan.getRadius());
    }
}

class Fan {
    // Four constants for speed
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields (Encapsulation)
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-argument constructor
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }

    // Constructor with arguments
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // --- Getter and Setter Methods ---

    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { this.speed = speed; }

    public boolean isOn() { return on; }
    public void setOn(boolean on) { this.on = on; }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    // toString method
    public String toString() {
        String state = on ? "ON" : "OFF";
        return "Fan [State: " + state + ", Speed: " + speed + 
               ", Radius: " + radius + ", Color: " + color + "]";
    }
}