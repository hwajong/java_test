package test_mockito;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

/**
 * Created by Leo
 * Date: 14. 5. 30
 */
public class UtilTest {

    @Test
    public void testAdd() {

        Util util = new Util();

        assertThat(util.add(1,5), is(6));
        assertThat(util.add(0,0), is(0));
    }
}
