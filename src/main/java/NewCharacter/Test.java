package NewCharacter;

public class Test {
    public static void main(String[] args) {
        // 函数式接口使用
        MyLamdaInterface m = a ->a.concat(a);
        System.out.println(m.test("sadas"));
    }
    
}
