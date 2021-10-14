package info.victorchu.simplecomputer.cricuit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NORGateTest {
    static NORGate gate;
    @BeforeAll
    static void init(){
        gate= new NORGate();
    }

    @Test
    void input11() {
        gate.input(true,true);
        assertFalse(gate.output());
    }


    @Test
    void input00() {
        gate.input(false,false);
        assertTrue(gate.output());
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