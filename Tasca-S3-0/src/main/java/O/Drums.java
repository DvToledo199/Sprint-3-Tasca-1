package O;

public class Drums extends Instrument implements Playable {

    @Override
    public void play() {
        System.out.println("🥁 Beating the drums");
    }
}
