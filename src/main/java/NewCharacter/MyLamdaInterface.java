package NewCharacter;

/**
 * @author JiangSC
 * @date 2020年12月18日 下午2:50:12
 * 函数式接口
 */
@FunctionalInterface
public interface MyLamdaInterface {
    public String test(String a);
    default void test1() {
        System.out.println("MyLamda默认方法");
    }
    
    static void test2() {
        System.out.println("MyLamda静态方法");
    }
    
}
