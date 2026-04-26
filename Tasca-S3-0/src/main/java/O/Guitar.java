package O;

public class Guitar extends Instrument implements Playable {

    @Override
    public void play() {
        System.out.println("🎸 Strumming the guitar");
    }
}
