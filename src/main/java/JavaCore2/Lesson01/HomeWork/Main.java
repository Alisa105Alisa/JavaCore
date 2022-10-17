package JavaCore2.Lesson01.HomeWork;


public class Main {
    public static void main(String[] args) {
        System.out.println("Соревнование началось!");
        Team[]teamArray = {new Cat(2,1), new Dog(1,5), new Wolf(2,6), new Turtle(0,20)};

        JavaCore2.Lesson01.HomeWork.Course[]courseArray = {new Pool(2),new Fence(2), new Hill(1)};
        for(Team team : teamArray) {
            for (Course course : courseArray){
                course.overcome(team);
            }
        }
    }
}
