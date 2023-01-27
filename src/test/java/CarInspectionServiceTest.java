import org.example.Car;
import org.example.CarInspectionService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarInspectionServiceTest {
    CarInspectionService testInspectionService = new CarInspectionService();


    @Test
    void carHasFourWheels() {
        Car carFourWheels = new Car();
        carFourWheels.setNumberOfTires(4);
        Assertions.assertTrue(testInspectionService.testNumberOfTires(carFourWheels));

    }

    @Test
    void carHasNotFourWheels() {
        Car carTwoWheels = new Car();
        carTwoWheels.setNumberOfTires(2);
        Assertions.assertFalse(testInspectionService.testNumberOfTires(carTwoWheels));
    }

    @Test
    void carHasSeatBelts() {
        Car carSeatBelt = new Car();
        carSeatBelt.setSeatBelt(true);
        Assertions.assertTrue(testInspectionService.testSeatBelts(carSeatBelt));

    }

    @Test
    void carHasNoSeatBelts() {
        Car carNoSeatBelt = new Car();
        carNoSeatBelt.setSeatBelt(false);
        Assertions.assertFalse(testInspectionService.testSeatBelts(carNoSeatBelt));

    }
}
