package commonClass;

/**
 * Created by Administrator on 2017/3/4.
 */
public class Simp {
    public static void main(String[] args) {
        String aa="abcdefg";
        String bbb=aa.substring(1,3);
        char[] bb=new char[5];
       aa.getChars(2, 4,bb,0);
        System.out.println((bbb));
        StringBuffer ab=new StringBuffer();
        ab.append("abcdefghijk");
        String cd=ab.substring(2,4);
        System.out.println(cd);
        ab.delete(2,4);
        System.out.println(ab);
        ab.deleteCharAt(1);
        System.out.println(ab);
        ab.insert(2,"hahahh");
        System.out.println(ab);
    }
}
