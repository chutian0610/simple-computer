package info.victorchu.simplecomputer.cricuit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ANDGateTest {
    static ANDGate gate;
    @BeforeAll
    static void init(){
        gate= new ANDGate();
    }

    @Test
    void input11() {
        gate.input(true,true);
        assertTrue(gate.output());
    }


    @Test
    void input00() {
        gate.input(false,false);
        assertFalse(gate.output());
    }

    @Test
    void input01() {
        gate.input(false,true);
        assertFalse(gate.output());
    }


    @Test
    void input10() {
        gate.input(true,false);
        assertFalse(gate.output());
    }

}