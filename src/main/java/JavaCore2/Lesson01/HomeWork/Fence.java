package JavaCore2.Lesson01.HomeWork;

public class Fence implements Course {
    private int height;

    public Fence (int height) {
        this.height = height;
    }

    public void overcome (Team team){
        team.jump(height);
    }
}
