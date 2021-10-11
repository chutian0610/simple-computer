package info.victorchu.simplecomputer.cricuit;

/**
 * 与门.
 * <pre>
 * 真值表:
 * input1 input2 output
 *  0     0       0
 *  0     1       0
 *  1     0       0
 *  1     1       1
 * </pre>
 */
public class ANDGate {

    private Wire output;

    public ANDGate(){
        this.output = new Wire(false);
    }
    public void input(boolean input1,boolean input2){
        output.input(input1 & input2);
    }
    public boolean output(){
        return this.output.output();
    }
}
