package info.victorchu.simplecomputer.cricuit;

/**
 * 或非门. Y=(A+B)'
 * <pre>
 * 真值表:
 * input1 input2 output
 *  0     0       1
 *  0     1       0
 *  1     0       0
 *  1     1       0
 * </pre>
 */
public class NORGate {
    private Wire output;

    public NORGate() {
        this.output = new Wire(false);
    }

    public void input(boolean input1, boolean input2) {
        output.input(!(input1 | input2));
    }

    public boolean output() {
        return this.output.output();
    }

}