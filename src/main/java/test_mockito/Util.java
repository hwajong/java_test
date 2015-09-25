package test_mockito;

/**
 * Created by Leo
 * Date: 14. 5. 30
 */
public class Util {

    public int add(int a, int b) {
        return a+b;
    }

    public String fullPerson(Person person) {
        return person.getName() + person.getAge();
    }
}
