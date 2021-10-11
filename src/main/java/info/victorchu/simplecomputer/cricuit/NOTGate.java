package info.victorchu.simplecomputer.cricuit;

/**
 * 非门.
 * <pre>
 * 真值表:
 * input output
 *  0     1
 *  1     0
 * </pre>
 */
public class NOTGate {
    private Wire output;

    public NOTGate(){
        this.output = new Wire(false);
    }
    public void input(boolean input){
        output.input(!input);
    }
    public boolean output(){
        return this.output.output();
    }
}
