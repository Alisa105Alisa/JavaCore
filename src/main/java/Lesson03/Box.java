package Lesson03;

public class Box {
    private Object object;

    public Box(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "Box{" +
                "object=" + object +
                '}';
    }

    public static void main(String[] args) {
        Box box1 = new Box(5);
        Box box2 = new Box(10);

        System.out.println(box1.getObject().getClass());

        int sum = (Integer) box1.getObject() + (Integer) box2.getObject();// приводим к int - это класс-обертка. Чтобы можно было суммировать
        System.out.println(sum);

        Box box3 = new Box("Test");
        if (box1.getObject() instanceof Integer && box3.getObject() instanceof Integer) {
            //если box1 и box3 - числа, будем считать их сумму. А если нет - ничего не будем считать
            int sum2 = (Integer) box1.getObject() + (Integer) box3.getObject();
            System.out.println(sum2);
        }
    }
}
