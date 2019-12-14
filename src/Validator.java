public class Validator {

    boolean validator(String point) {

        try {
            getXCoordinate(point);
            getYCoordinate(point);
            return true;
        } catch (Exception e) {
            System.out.println("Invalid Coordinates. Please use the format (x,y)");
        }

        return false;
    }

    double getXCoordinate(String point) {

        int indexOfOpenBracket  = point.indexOf("(");
        int indexOfComma        = point.indexOf(",");

        return Double.parseDouble(point.substring(indexOfOpenBracket+1,indexOfComma));
    }

    double getYCoordinate(String point) {

        int indexOfComma        = point.indexOf(",");
        int indexOfCloseBracket = point.indexOf(")");

        return Double.parseDouble(point.substring(indexOfComma+1,indexOfCloseBracket));
    }
}
