import java.util.LinkedList;

public class CarPark {
    private String name;
    private LinkedList<String> cars;

    public CarPark(String name, LinkedList<String> cars) {
        this.name = name;
        this.cars = cars;
    }

    public boolean hasCar(String name) {
        for (String car : cars) {
            if (car.equals(name)) return true;
        }
        return false;
    }
}


