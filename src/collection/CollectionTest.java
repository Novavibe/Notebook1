package collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Predicate;

/**
 * Created by Administrator on 2017/3/5.
 */
public class CollectionTest {
    public static void main(String[] args) {
        Collection cc=new HashSet();
        cc.add("abandon");
        cc.add("abrupt");
        cc.add("astonished");
        cc.forEach(obj->System.out.println(obj));
        Iterator it=cc.iterator();         //Iterator用于遍历集合，不提供盛庄对象的能力
        while(it.hasNext()){
            String book=(String)it.next();
            System.out.println(book);
            if(book.equals("abrupt")){
                // cc.remove(book);         在Iterator的Collecttion迭代中删除Collection的元素会导致出错
               // cc.remove("abrupt");         //Exception in thread "main" java.util.ConcurrentModificationException
                it.remove();
            }
            System.out.println(cc);
        }
        cc.add("jjjjjjjjj");
        cc.add("kkkkk");
        cc.removeIf(ele->((String)ele).length()<6);
        System.out.println(cc);
        System.out.println(calAll(cc,ele->((String)ele).contains("jj")));
        System.out.println(calAll(cc,ele->((String)ele).length()>6));
}
public static int calAll(Collection books,Predicate p){
    int sum=0;
    for(Object obj:books){
        if(p.test(obj))
            sum++;
    }
    return sum;
}
}
