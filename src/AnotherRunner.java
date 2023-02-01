import java.util.ArrayList;
import java.util.Arrays;

public class AnotherRunner {
    public static void main(String[] args) {

        Car bob = new Car("Bob", 1000);
        Car sponge = new Car("Sponge", 750);
        Car pants = new Car("Pants", 10000);

        Car[] cars = {bob, sponge, pants};


        ArrayList<Car> carList = new ArrayList<>(Arrays.asList(cars));
        System.out.println(carList);
    }
}
