package info.victorchu.simplecomputer.cricuit;

/**
 * 异或门.
 * <pre>
 * 真值表:
 * input1 input2 output
 *  0     0       0
 *  0     1       1
 *  1     0       1
 *  1     1       0
 * </pre>
 */
public class XORGate {
    private Wire output;

    public XORGate(){
        this.output = new Wire(false);
    }
    public void input(boolean input1,boolean input2){
        output.input(
                (input1 & !input2)
                | (!input1 & input2)
        );
    }
    public boolean output(){
        return this.output.output();
    }
}
