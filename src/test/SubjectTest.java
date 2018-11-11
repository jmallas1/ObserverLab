package test;

import main.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubjectTest {

    Subject subject;
    HexaObserver ephemeralHxo;

    @BeforeEach
    void setUp()
    {
        subject = new Subject();
        new BinaryObserver(subject);
        new OctalObserver(subject);
        new DescriptionObserver(subject);
    }

    @Test
    void attach()
    {
        assertEquals(3, subject.getObserverCount(), "Subject should have 3 observers");
        ephemeralHxo = new HexaObserver(subject);
        assertEquals(4, subject.getObserverCount(), "Subject should have 4 observers after attaching");
    }

    @Test
    void detach()
    {
        ephemeralHxo = new HexaObserver(subject);
        assertEquals(4, subject.getObserverCount(), "Subject should have 4 observers after attaching");
        subject.detach(ephemeralHxo);
        assertEquals(3, subject.getObserverCount(), "Subject should have 3 observers after detaching");
    }
}