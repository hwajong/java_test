package test_mockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Created by Leo
 * Date: 14. 5. 30
 * NOTE : InjectMocks 는 3가지중 한가지 Mock injection 을 지원한다.
 *        Constructor injection, Property injection, Field injection.
 *        http://docs.mockito.googlecode.com/hg-history/58d750bb5b94b6e5a554190315811f746b67f578/1.9.5/org/mockito/InjectMocks.html
 */
@RunWith(MockitoJUnitRunner.class)
public class ApplicationTest {

    @Spy
    private Util util = new Util();

    @Mock
    private Person person;

    @InjectMocks
    private Application app;

    @Test
    public void testRun() {

        when(person.getAge()).thenReturn(100);
        when(person.getName()).thenReturn("good");

        assertThat(person.getAge(), is(100));

        assertThat(app.getPerson(), is(person));

        assertThat(app.run(), is("good100"));
    }
}
