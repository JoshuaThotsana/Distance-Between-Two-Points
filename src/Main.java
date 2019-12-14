import java.util.Arrays;

public class Main {

    static String point;
    static double[] coordinates = {};

    public static void main(String[] args) {

        GetCoordinates getCoordinates = new GetCoordinates();
        Validator validator = new Validator();
        Calculation calculation = new Calculation();

        for (int i = 1; i <= 2; i++) {

            do {
                if (i == 1) {
                    point = getCoordinates.getPoint("A");
                } else {
                    point = getCoordinates.getPoint("B");
                }
                if (validator.validator(point)) {
                    coordinates = Arrays.copyOf(coordinates, coordinates.length + 1);
                    coordinates[coordinates.length - 1] = validator.getXCoordinate(point);

                    coordinates = Arrays.copyOf(coordinates, coordinates.length + 1);
                    coordinates[coordinates.length - 1] = validator.getYCoordinate(point);
                    break;
                }
            } while (true);

        }
        System.out.printf("The distance between point A and point B is %1.2f",calculation.calculation(coordinates));
    }
}
