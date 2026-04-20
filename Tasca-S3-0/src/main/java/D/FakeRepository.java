package D;

public class FakeRepository implements PersonRepository {

    private boolean called = false;

    @Override
    public void savePerson(Person person) {
        called = true;
    }

    public boolean wasCalled() {
        return called;
    }
}
