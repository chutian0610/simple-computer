package info.victorchu.simplecomputer.cricuit;

/**
 * 线的抽象.
 * <pre>
 * 真值表:
 * input output
 *  0     0
 *  1     1
 * </pre>
 */
public class Wire {
    /**
     * 电位的抽象，true or false 代表高低电位
     */
    private boolean value;

    public Wire(boolean value) {
        this.value = value;
    }

    public void input(boolean value) {
        this.value = value;
    }

    public boolean output() {
        return this.value;
    }

}
