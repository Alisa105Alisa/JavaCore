package JavaCore.HomeWork01;

public class Hill implements Course{
    private int height;

    public Hill(int height) {
        this.height = height;
    }
    public void overcome (Team team){
        team.jump(height);
    }

}
