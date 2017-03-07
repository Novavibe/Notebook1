package commonClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;

/**
 * Created by Administrator on 2017/3/4.
 */
public class GetNum {
    public static void main(String[] args) {
        String s = "阿里145山1的61歌17哦13我7呢819如果";
        Pattern p = Pattern.compile("[0-9]");
        Matcher m = p.matcher(s);
        int[] a=new int[20];
        int i=0;
        while (m.find()) {
            a[i]=parseInt(m.group());
            System.out.println(m.group());
        }
        System.out.println(a.toString());
    }
}
