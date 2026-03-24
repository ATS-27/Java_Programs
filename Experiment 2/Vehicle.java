public class Vehicle {

    // Public data members
    public String brandname;
    public String modelname;
    public String color;
    public double price;
    public boolean auto;
    public int noofwheels;
    public float enginepower;

    // Private data members
    private int noofcylinders;
    private String mfgCode;
    private float mileage;

    //Getters & Setters
    public String getMfgcode() {
        return mfgCode;
    }

    public void setMfgcode(String mCode) {
        mfgCode = mCode;
    }

    public int getCyl() {
        return noofcylinders;
    }

    public void setCyl(int cyl) {
        noofcylinders = cyl;
    }

    public float getMileage() {
        return mileage;
    }

    //Default Constructor
    public Vehicle() {
        brandname = "Honda";
        modelname = "Accord";
        color = "Blue";
        price = 340000;
        auto = true;
        noofwheels = 4;
        noofcylinders = 4;
        mileage = 15;
    }

    //Parameterized Constructor
    public Vehicle(String bName, String mName,
                   String c, double p, float mile) {
        brandname = bName;
        modelname = mName;
        color = c;
        price = p;
        mileage = mile;
    }

    //Copy Constructor
    public Vehicle(Vehicle v) {
        brandname = v.brandname;
        modelname = v.modelname;
        color = v.color;
        price = v.price;
        auto = v.auto;
        noofwheels = v.noofwheels;
        enginepower = v.enginepower;
        noofcylinders = v.noofcylinders;
        mfgCode = v.mfgCode;
        mileage = v.mileage;
    }

    //Methods
    public void start() {
        System.out.println(brandname + " started.");
    }

    public void drive() {
        System.out.println("Vehicle is moving.");
    }

    public void stop() {
        System.out.println("Vehicle stopped.");
    }

    public float calcMileage(float dist, float fuel) {
        mileage = dist / fuel;
        return mileage;
    }

    public void changeSpeed(int speed) {
        if (speed <= 80)
            System.out.println("Ideal speed.");
        else
            System.out.println("Slow down!");
    }

    //Printing in tabular format
    public void printRow() {
        System.out.printf("%-12s %-12s %-12.2f %-10.2f\n",
                brandname, modelname, price, mileage);
    }
}
