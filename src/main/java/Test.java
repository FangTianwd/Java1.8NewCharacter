import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        // 从对象集合中取出某个字段的集合
        List<P> list = Arrays.asList(new P(3,"小明"), new P(2,"小强"), null);
        // map转换
        List<String> nameList = list.stream().map(p -> {
            if (Objects.isNull(p)) {
                return null;
            }
            return p.getName();
        }).collect(Collectors.toList());
        System.out.println(nameList);
        // filter拦截
        List<P> collect = list.stream().filter(d -> {
            
            if (Objects.isNull(d)) {
                return false;
            }
            
            return "小强".equals(d.getName());
        }).collect(Collectors.toList());
        System.out.println(collect);
        // filter拦截不为空的数据
        List<P> collect2 = list.stream().filter(Objects::nonNull).collect(Collectors.toList());
        System.out.println(collect2);
        
        list.stream().filter(Objects::nonNull).collect(Collectors.toList())
        .sort(new Comparator<P>() {
            // 正序
            @Override
            public int compare(P o1, P o2) {
                // TODO Auto-generated method stub
                Integer id1 = o1.getId();
                Integer id2 = o2.getId();
                return id1.compareTo(id2);
            }
        });
        System.out.println("常规重写方法" + list);
        
        
        List<String> asList = Arrays.asList("sad","dsf","fd","wq");
        asList.sort((a,b) -> a.compareTo(b));
        System.out.println("lamba写法" + asList);
        
        
        
        List<String> asLists1 = Arrays.asList("231","dsf","fd","wq");
        asLists1.sort(Comparator.reverseOrder());
        System.out.println("集合反转" + asLists1);
        
        
        
        
    }
}
class P{
    int id ;
    String name;
    
    public P(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "P [id=" + id + ", name=" + name + "]";
    }
    
}