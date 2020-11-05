import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-05
 * Time: 10:22
 **/
public class TestList {

    public static void main(String[] args) {
        //创建list实例
        List<String> list = new ArrayList<>();
        //2、新增元素
        list.add("Java");
        list.add("C语言");
        list.add("python");
        System.out.println(list);
        //3、根据下标获取元素
        System.out.println(list.get(0));
        //4、修改下表元素
        list.set(0,"c++");
        for (String s: list){
            System.out.print(s+"   ");

        }
        //5、获取子序列
        System.out.println();
        System.out.println("获取子序列");
        System.out.println(list.subList(0, 2));

    }
}
