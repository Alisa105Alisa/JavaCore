package HomeWork01;

public class Wolf extends Animal implements CanSwim, CanJump, Team {
    public Wolf (int jumpHeight, int swimLength){
        super (jumpHeight, swimLength);
    }


    public void jump(int height){
        if(height > jumpHeight) {
            System.out.println("Я волк, я не перепрыгнул!");
        }
        else {
            System.out.println("Я волк, я перепрыгнул!");
        }

    }

    public void swim (int length){
        if (length > swimLength){
            System.out.println("Я волк, я не переплыл!");
        }
        else {
            System.out.println("Я волк, я переплыл!");
        }
    }
}

