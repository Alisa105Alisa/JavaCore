package Lesson03;
import java.util.Arrays;
public class NumberBox <T extends Number> {// T - будут только числа
    private T[] array;

    public NumberBox(T... array) {
        this.array = array;
    }// можно поместить много значений

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }
    @Override
    public String toString() {
        return "NumbersBox{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public double calcAverage(){
        double sum = 0.0;
        for (T num: array) {// это цикл for-each
            sum += num.doubleValue();// преобразовываем в doubleValue
        }
        return sum / array.length;// делим на длину массива
    }

    public boolean isSameAvg(NumberBox<?> boxToCompare) {
        return Math.abs(calcAverage() - boxToCompare.calcAverage()) < 0.0001;// Math.abs - класс с абсолютными значениями
    }
    public static <U extends Number> U getFirstElement(NumberBox<U> numbersBox) {
        return numbersBox.getArray()[0];
    }
    public static void main(String[] args) {
        NumberBox<Integer> integerNumbersBox1 = new NumberBox<>(1, 3, 4, 5, 6, 7, 7);
        System.out.println(integerNumbersBox1);// распечатать массив
        System.out.println(integerNumbersBox1.calcAverage());
        NumberBox<Integer> integerNumbersBox2 = new NumberBox<>(1, 3, 4, 5, 6, 7, 7);
        NumberBox<Double> doubleNumbersBox1 = new NumberBox<>(1.0, 4.0, 2.6, 8.9);
        System.out.println(integerNumbersBox1.isSameAvg(doubleNumbersBox1));
        System.out.println(integerNumbersBox1.isSameAvg(integerNumbersBox2));
    }

}
