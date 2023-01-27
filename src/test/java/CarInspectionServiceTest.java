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


}
