package collection;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by Administrator on 2017/3/5.
 */
public class HashTest {
    public static void main(String[] args) {
        HashSet hs=new HashSet();
        hs.add(new A(1));
        hs.add(new A(0));
        hs.add(1);
        System.out.println(hs.size());
        System.out.println(hs);
        Iterator it=hs.iterator();
        A first=(A)it.next();
        first.count=1;
        System.out.println(hs);
        hs.remove(new A(1));
        System.out.println(hs);
    }
}
class A{
    int count;
    A(int count){
        this.count=count;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj)
            return true;
        if(obj!=null&&obj.getClass()==this.getClass()){
              A a=(A)obj;
            return a.count==this.count;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.count;
    }
}