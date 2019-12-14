import java.util.Scanner;

public class GetCoordinates {

    Scanner scanner = new Scanner(System.in);

    String getPoint(String pointName) {

        System.out.print("Please enter the coordinates for point " + pointName + ": ");

        return scanner.nextLine();
    }
}
