package L;

public class Ghost extends Character implements Attackable{
    @Override
    public void attack() {
        System.out.println("The ghost casts a spooky spell.");
    }


}
