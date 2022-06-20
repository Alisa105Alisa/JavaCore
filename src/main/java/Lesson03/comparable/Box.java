package Lesson03.comparable;

public class Box implements Comparable {
    public int size;

    public Box(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Box{" +
                "size=" + size +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        //this       otherBox:  0 - this==otherBox; отрицательное - this < otherBox; положительное - this > otherBox
        return ((Box) o).size - size;
    }

    public static void main(String[] args) {
        Box box1 = new Box(50);
        Box box2 = new Box(10);
    }
}
