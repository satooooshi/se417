package iloveyouboss;

import static org.junit.Assert.*;
import org.junit.rules.*;
import org.junit.Test;
import org.junit.Rule;

public class MainTest {




    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void exceptionRule() {
        thrown.expect(Exception.class);
        thrown.expectMessage("balance only 0");

    }

}