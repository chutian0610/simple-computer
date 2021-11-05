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
    /**
     * 测试输入信号是 1 1 的case
     */
    @Test
    void input11() {
        gate.input(true,true);
        assertFalse(gate.output());
    }

    /**
     * 测试输入信号是 0 0 的case
     */
    @Test
    void input00() {
        gate.input(false,false);
        assertTrue(gate.output());
    }

    /**
     * 测试输入信号是 0 1 的case
     */
    @Test
    void input01() {
        gate.input(false,true);
        assertFalse(gate.output());
    }
    /**
     * 测试输入信号是 1 0 的case
     */
    @Test
    void input10() {
        gate.input(true,false);
        assertFalse(gate.output());
    }
}