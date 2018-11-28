import java.awt.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String userInput = "entertainment";
        String upperCased = userInput.toUpperCase();
        System.out.println(userInput);
        System.out.println(upperCased);

        char firstCharacter = userInput.charAt(0);
        System.out.println(firstCharacter);
        System.out.println("Contains " + userInput.contains("Enter".toLowerCase()));
        System.out.println("Contains " + userInput.contains("Enter".toLowerCase()));

        // System.out.println("Hello World!");
        // System.out.println("Vagner");

        // Car myCar = new Car(25.5, "1BC32E", Color.BLUE, true );
        // Car sallyCar = new Car(13.9, "3D20BN", Color.BLACK,false );
        
        // System.out.println("My Car's license plate: " + myCar.licensePlate);
        // System.out.println("Sally's license plate: " + sallyCar.licensePlate);

        // System.out.print(myCar.paintColor);
        // myCar.changePaintColor(Color.RED);
        // System.out.print(myCar.paintColor);

    }

}