public class Car {

    private double fuelLevel;
    private int direction;      
    private int speed;
    private boolean engineRunning;
    private boolean gTurning;

    // "static" means this value belongs to the Car class itself, not to any one
    // Car object — so all cars share the same MAX_SPEED instead of each having
    // their own copy. "final" means once it's set here, it can never be changed
    // anywhere else in the code (it's a constant).
    private static final int Max_Speed = 220;

    public Car() {
        this.fuelLevel = 100.0;
        this.direction = 0;
        this.speed = 0;
        this.engineRunning = false;
        this.gTurning = false;
    }

    public void engineOn() {
        if (fuelLevel <= 0) {
            System.out.println("Cannot start engine fuel tank is empty!");
            return;
        }
        engineRunning = true;
        System.out.println("Engine started.");
    }

    public void drive() {
        if (!engineRunning) 
        return; // no accelerating when engine is off
        speed += 20;
        if (speed > Max_Speed) 
            speed = Max_Speed; 
        fuelLevel -= 2;
        System.out.println("Driving with speed = " + speed + " km/h");
    }

    public void fast() {
        if (!engineRunning) return;
        speed += 35;
        if (speed > Max_Speed) 
            speed = Max_Speed;
        fuelLevel -= 3;
        System.out.println("Speeding with speed of = " + speed + " km/h");
    }

    public void slow() {
        if (!engineRunning) 
            return;
        speed -= 15;
        if (speed < 0) 
            speed = 0; // since speed can't be negative
        System.out.println("Slowing down with speed = " + speed + " km/h");
    }

    public void moveLeft(int degrees) {
        if (!engineRunning) 
            return;
        direction = direction - degrees; // turning left reduces the heading like counter clockwise rotation
        System.out.println("Turning left in direction = " + direction + " degrees.");
    }

    public void moveRight(int degrees) {
        if (!engineRunning) 
            return;
        direction = direction + degrees; // turning right increases the heading like clockwise rotation
        System.out.println("Turning right in direction = " + direction + " degrees.");
    }

    // Thrilling feature of gWagon G-Turn  spins the car 180 degrees in place.
    // Only makes sense while stationary, so it also resets speed to 0.
    public void gTurn() {
        if (!engineRunning) return;
        gTurning = true;
        direction = direction + 180;
        speed = 0;
        fuelLevel -= 5; // spinning in place still costs fuel/energy
        System.out.println("G-Turn! Car spins 180 degrees. New direction = " + direction + " degrees.");
    }

    public void engineStop() {
        engineRunning = false;
        speed = 0;      
        gTurning = false;
        System.out.println("Engine stopped. Speed reset to 0.");
    }

    
    public void display() {
        System.out.println("Engine: " + engineRunning + ", Speed: " + speed
                + ", Direction: " + direction + " degrees, Fuel: " + fuelLevel + ", GTurning: " + gTurning);
    }
} 
