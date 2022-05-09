package info.victorchu.simplecomputer.cricuit;

/**
 * 非门.Y=A'
 * <pre>
 * 真值表:
 * input output
 *  0     1
 *  1     0
 * </pre>
 */
public class NOTGate {
    private Potential output;

    public NOTGate() {
        this.output = new Potential(false);
    }

    public void input(boolean input) {
        output.input(!input);
    }

    public boolean output() {
        return this.output.output();
    }
}
