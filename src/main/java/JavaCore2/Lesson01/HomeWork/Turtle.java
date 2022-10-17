package JavaCore2.Lesson01.HomeWork;

public class Turtle extends Animal implements CanSwim, Team {

    public Turtle (int jumpHeight, int swimLength){
        super (jumpHeight, swimLength);
    }


    public void jump(int height) {

        System.out.println("Я черепаха, я не умею прыгать!");
    }

    public void swim (int length){
        if (length > swimLength){
            System.out.println("Я черепаха, я не переплыла!");
        }
        else {
            System.out.println("Я черепаха, я переплыла!");
        }
    }
}
