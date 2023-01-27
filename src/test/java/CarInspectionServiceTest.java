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

    @Test
    void carHasAirbag() {
        Car carAirbag = new Car();
        carAirbag.setAirbag(true);
        Assertions.assertTrue(testInspectionService.testAirbag(carAirbag));
    }

    @Test
    void carHasNoAirbag() {
        Car carNoAirbag = new Car();
        carNoAirbag.setSeatBelt(false);
        Assertions.assertFalse(testInspectionService.testAirbag(carNoAirbag));
    }

    @Test
    void carHasFiveDoors() {
        Car carFiveDoors = new Car();
        carFiveDoors.setNumberOfDoors(5);
        Assertions.assertTrue(testInspectionService.testDoors(carFiveDoors));
    }

    @Test
    void carHasNoFiveDoors() {
        Car carThreeDoors = new Car();
        carThreeDoors.setNumberOfDoors(3);
        Assertions.assertFalse(testInspectionService.testDoors(carThreeDoors));
    }
    @Test
    void carCheckAll() {
        Car carCheckAll = new Car(4, 5, true, true);
        Assertions.assertTrue(testInspectionService.testAll(carCheckAll));
    }
    @Test
    void carCheckAllTireFailure() {
        Car carCheckAll = new Car(6, 5, true, true);
        Assertions.assertFalse(testInspectionService.testAll(carCheckAll));
    }
}

