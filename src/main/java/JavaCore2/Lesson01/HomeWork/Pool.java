package JavaCore2.Lesson01.HomeWork;

public class Pool implements Course {
    private int length;

    public Pool(int length) {
        this.length = length;
    }
    public void overcome (Team team){
        team.jump(length);
    }
}

