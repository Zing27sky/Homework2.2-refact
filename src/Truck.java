public class Truck extends Vehicle {

    private String modelName;
    private int wheelsCount;


    public Truck() {

    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}

