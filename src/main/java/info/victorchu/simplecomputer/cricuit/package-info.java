/**
 * 计算机电路层的抽象.
 * <pre>
 * 1. 与门
 * 2. 或门
 * 3. 非门
 * 4. 与非门
 * 5. 或非门
 * 6. 异或门
 *
 *
 * 关于为什么要抽象 Potential类，而不是将门写成方法。
 *
 * 例如:
 * <code>
 *
 * public class ANDGate {
 *   public boolean connect(boolean input1, boolean input2) {
 *     return input1 & input2;
 *   }
 * }
 * </code>
 *
 * 1. 一切都是对象。
 * 2. 方便留存中间状态。
 * </pre>
 */
package info.victorchu.simplecomputer.cricuit;