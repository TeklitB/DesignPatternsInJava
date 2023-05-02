package builderpattern.builders;

import builderpattern.cars.CarType;
import builderpattern.components.Engine;
import builderpattern.components.GPSNavigator;
import builderpattern.components.Transmission;
import builderpattern.components.TripComputer;

/**
 * Builder interface defines all possible ways to build a product.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
