package HomeWork01;

public class Pool implements Course {
    private int length;

    public Pool(int length) {
        this.length = length;
    }
    public void overcome (Team team){
        team.jump(length);
    }
}
