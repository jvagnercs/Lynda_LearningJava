import java.awt.*;

public class Car {
    // data types
    // int -> 1, 2, 3
    // double -> 30.3, 0.1
    // String -> "ala2", "hello"
    // Color -> from awt
    
    double averageMilesPerGalon;
    String licensePlate;
    Color paintColor;
    boolean areTailingWorking;

    public Car(double inputAverageMPG,
            String inputLicensePlate,
            Color inputPaintColor,
            boolean inputAreTaillightsWorking) {
        this.averageMilesPerGalon = inputAverageMPG;
        this.licensePlate = inputLicensePlate;
        this.paintColor = inputPaintColor;
        this.areTailingWorking = inputAreTaillightsWorking;
    }

    public void changePaintColor(Color newPaintColor) {
        this.paintColor = newPaintColor;
    }

}