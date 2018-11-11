package test;

import main.DescriptionObserver;
import main.Subject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DescriptionObserverTest {

    Subject sub;
    DescriptionObserver descObsv;
    @BeforeEach
    void setUp()
    {
        sub = new Subject();
        descObsv = new DescriptionObserver(sub);
    }

    @Test
    void getDesc()
    {
        sub.setState(0);
        assertEquals("Equal to 0", descObsv.getDesc(), "Value should be 0");

        sub.setState(5);
        assertEquals("Greater than 0", descObsv.getDesc(), "Value should be greater than 0");

        sub.setState(-5);
        assertEquals("Less than 0", descObsv.getDesc(), "Value should be less than 0");
    }
}