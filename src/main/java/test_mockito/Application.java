package test_mockito;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Leo
 * Date: 14. 5. 30
 */
public class Application {

    @Getter
    private Person person;


    private Util util;


//    public Application(Person person) {
//        this.person = person;
//    }

    public String run() {
        return util.fullPerson(person);
    }

}
