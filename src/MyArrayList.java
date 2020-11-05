

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 14342
 * Date: 2020-11-05
 * Time: 9:54
 **/

class Animal{

}
//E是泛型参数
public class MyArrayList<E> {
    private E[] elem = (E[])new Object[100];
    private int size;
    public void add(E data){
        elem[size] = data;
        size++;

    }
    public E get(int index){
        return elem[index];
    }


    public static void main(String[] args) {
       /* MyArrayList <String>myArrayList = new MyArrayList();
        myArrayList.add("aaa");
        myArrayList.add("bbb");
        String str = myArrayList.get(0);
        System.out.println(str);
        MyArrayList<Animal> animal = new MyArrayList<>();*/
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        //将Integer转变为int的操作，称之为自动装箱
        Integer num = new Integer(10);
        myArrayList.add(num);

    }
}
