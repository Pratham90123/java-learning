public class opps {
    public static void main(String[] args) {
        pen pen1=new pen();
        pen1.color="blue";
        pen1.type="ball";
        pen1.brand="natraj";
        pen1.write();


    }

    
}

class pen {
    String color;
    String type;
    String brand;
    public void write(){
        System.out.println("writeing something");


    }
}
