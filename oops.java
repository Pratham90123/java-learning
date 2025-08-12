 public class oops{
    class car {
        private static int car_count=0;
        private final String model;
        private final String brand;
        private int top_speed;

        public car(String model, String brand, int top_speed) {
            this.model = model;
            this.brand = brand;
            setTopSpeed(top_speed);
            car_count++;
        }

        public int setTopSpeed(int top_speed) {
            if (top_speed > 0) {
                this.top_speed = top_speed;
            } else {
                System.out.println("invalid top speed. Setting to default value of 100 km/h.");
                this.top_speed = 100;
            }
            return this.top_speed;
        }


        

        public void info() {
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Top Speed: " + top_speed + " km/h");
        }
        public static int getCarCount() {
            return car_count;
        }





    }
    public static void main(String[] args) {
        oops obj = new oops();
        car myCar = obj.new car("Model S", "Tesla", 250);
        myCar.info();
        car myCar1 = obj.new car("Mustang", "Ford", 0);
        myCar1.info();
        System.out.println("Total cars: " + car.getCarCount());

    }
 }

