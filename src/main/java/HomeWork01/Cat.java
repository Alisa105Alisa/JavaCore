package HomeWork01;


    public class Cat extends Animal implements CanJump, CanSwim, Team {

        public Cat (int jumpHeight, int swimLength){
            super (jumpHeight, swimLength);
        }


        public void jump(int height){
            if(height > jumpHeight) {
                System.out.println("Я котик, я не перепрыгнул!");
            }
            else {
                System.out.println("Я котик, я перепрыгнул!");
            }

        }

        public void swim(int length){
            if (length > swimLength){
                System.out.println("Я котик, я не переплыл!");
            }
            else {
                System.out.println("Я котик, я переплыл!");
            }
        }
    }
