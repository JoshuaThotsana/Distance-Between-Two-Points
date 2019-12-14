public class Calculation {

    double calculation(double[] coordinates) {

        double x1 = coordinates[0];
        double y1 = coordinates[1];
        double x2 = coordinates[2];
        double y2 = coordinates[3];

        return Math.sqrt((x1 - y1)*(x1 - y1) + (x2 - y2)*(x2 - y2));
    }

}
