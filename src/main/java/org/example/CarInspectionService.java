package org.example;

public class CarInspectionService {
    public boolean testNumberOfTires(Car testCar) {

if (testCar.getNumberOfTires() == 4) {
    return true;
} else {
    return false;
}

    }


    public boolean testSeatBelts(Car carSeatBelt) {
        if(carSeatBelt.isSeatBelt() == true) {
            return true;
        } else {
            return false;
        }
    }
}
