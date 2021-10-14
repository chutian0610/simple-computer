package info.victorchu.simplecomputer.cricuit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NANDGateTest {
    static NANDGate gate;
    @BeforeAll
    static void init(){
        gate= new NANDGate();
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
        assertTrue(gate.output());
    }


    @Test
    void input10() {
        gate.input(true,false);
        assertTrue(gate.output());
    }
}