package collection;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/6.
 */
public class Seet {
    private HashSet hs=new HashSet();
    public void setHs(){
        System.out.println("please input your array");
        Scanner sc=new Scanner(System.in);
        hs.add(sc.nextLine());
    }
public void show(){
    System.out.println(hs);
}
    public static void main(String[] args) {
        Seet st=new Seet();
        st.setHs();
       st.show();
    }
}
