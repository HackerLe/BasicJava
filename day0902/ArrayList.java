import java.util.*;

public class ArrayList{
    public static void main(String[] args) {
        List<String> list = new java.util.ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("hahaha");

        //第一种遍历，使用 For-Each 遍历 List
        for(String str : list){
            System.out.println(str);
        }

        //第二种遍历，使用常用的 For循环 遍历
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        //第三种遍历，把链表变为数组相关的内容进行遍历
        String[] strArray = new String[list.size()];
        list.toArray(strArray);
        for (String s : strArray) {
            System.out.println(s);
        }

        //第四种遍历，使用迭代器进行相关遍历
        Iterator<String> ite = list.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
        }
    }
}
