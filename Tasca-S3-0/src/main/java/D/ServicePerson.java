package D;

public class ServicePerson {
    public void savePerson(Person person) {
        MySQL mysql = new MySQL();
        mysql.savePerson(person);
    }

}