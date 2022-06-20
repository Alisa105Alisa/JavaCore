package HomeWork01;


public class Dog  extends Animal implements CanSwim, CanJump, Team {
    public Dog (int jumpHeight, int swimLength){
        super (jumpHeight, swimLength);
    }


    public void jump(int height){
        if(height > jumpHeight) {
            System.out.println("Я пёс, я не перепрыгнул!");
        }
        else {
            System.out.println("Я пёс, я перепрыгнул!");
        }

    }

    public void swim (int length){
        if (length > swimLength){
            System.out.println("Я пёс, я не переплыл!");
        }
        else {
            System.out.println("Я пёс, я переплыл!");
        }
    }
}
