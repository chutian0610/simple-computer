package info.victorchu.simplecomputer.cricuit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NOTGateTest {
    static NOTGate gate;
    @BeforeAll
    static void init(){
        gate= new NOTGate();
    }
    /**
     * 测试输入信号是 1 的case
     */
    @Test
    void input0() {
        gate.input(false);
        assertTrue(gate.output());
    }
    /**
     * 测试输入信号是 1 0的case
     */
    @Test
    void input1() {
        gate.input(true);
        assertFalse(gate.output());
    }
}