package musementpark.base.factory;

import org.junit.jupiter.api.Test;

class FactoryTest {
    @Test
    public void FactoryTest() {
        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle vehicle1 = vehicleFactory.getVehicle("Bus");

        vehicle1.create();

        Vehicle vehicle2 = vehicleFactory.getVehicle("Bicycle");

        vehicle2.create();

    }
}