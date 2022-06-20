package Lesson02;

public class CalculateSquare {
    public static void main(String[] args) {
       int square = calcRectangleSquare(2, -4);

        System.out.println("Я жив!");
    }

    private static int calcRectangleSquare (int sideA, int sideB) throws OneOrBothRectangleSideIsNegativeException{

        if (sideA <= 0|| sideB <=0)
            throw new OneOrBothRectangleSideIsNegativeException ("Одна из сторон отрицательная: " + sideA + "," + sideB);
        return sideA * sideB;
    }
}
