package D;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServicePersonTest {

    @Test
    void shouldCallRepositoryWhenSavingPerson() {

        FakeRepository fakeRepository = new FakeRepository();

        ServicePerson service = new ServicePerson(fakeRepository);

        Person person = new Person();
        person.setName("David");

        service.savePerson(person);

        assertTrue(fakeRepository.wasCalled());
    }
}
