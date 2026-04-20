package D;

public class ServicePerson {

    private PersonRepository repository;

    public ServicePerson(PersonRepository repository) {
        this.repository = repository;
    }

    public void savePerson(Person person) {
        repository.savePerson(person);
    }
}