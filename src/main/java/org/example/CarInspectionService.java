package org.example;

public class CarInspectionService {
    public boolean testNumberOfTires(Car testCar) {
        return testCar.getNumberOfTires() == 4;
    }

    public boolean testSeatBelts(Car carSeatBelt) {
        return carSeatBelt.isSeatBelt();
    }

    public boolean testAirbag(Car carAirbag) {
        return carAirbag.isAirbag();
    }

    public boolean testDoors(Car carFiveDoors) {
        return carFiveDoors.getNumberOfDoors() == 5;
    }

    public boolean testAll(Car carCheckAll) {
        return carCheckAll.getNumberOfDoors() == 5
                && carCheckAll.getNumberOfTires() == 4
                && carCheckAll.isAirbag()
                && carCheckAll.isSeatBelt();
    }
}
