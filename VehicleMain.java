public class VehicleMain {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle("Toyota", "Camry",
                                  "White", 420000, 18);
        Vehicle v3 = new Vehicle(v2); // Copy constructor

        Vehicle[] vehicles = { v1, v2, v3 };

        System.out.printf("%-12s %-12s %-12s %-10s\n",
                "Brand", "Model", "Price", "Mileage");
        System.out.println("--------------------------------------------");

        for (Vehicle v : vehicles) {
            v.printRow();
        }
    }
}
