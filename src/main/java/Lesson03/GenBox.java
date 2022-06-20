package Lesson03;
import java.util.ArrayList;
import java.util.List;

    public class GenBox<T> {// <> это обобщение, можно поместить внутрь любой объект
        private T object;

        public GenBox(T object) {
            this.object = object;
        }

        public T getObject() {
            return object;
        }

        public void setObject(T object) {
            this.object = object;
        }

        @Override
        public String toString() {
            return "GenBox{" +
                    "object=" + object +
                    '}';
        }

        public static void main(String[] args) {
            GenBox<Integer> integerGenBox1 = new GenBox<>(5);
            GenBox<Integer> integerGenBox2 = new GenBox<>(10);

            int sum = integerGenBox1.getObject() + integerGenBox2.getObject();
        }


        GenBox<String> stringGenBox1 = new GenBox<>("Test1");
        //tringGenBox1.setObject(4);

        GenBox genBox = new GenBox(5);

        Integer a = new Integer(5);
        Number b = a;

        List<Integer> integerArrayList = new ArrayList<>();
        //ArrayList<Number> numberArrayList = integerArrayList; - нельзя так сделать, несмотря на то, что Number содержить Integer
    }
