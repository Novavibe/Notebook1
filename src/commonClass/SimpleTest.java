package commonClass;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.omg.SendingContext.RunTime;

import java.time.Clock;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

import static java.util.Calendar.DATE;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;

/**
 * Created by Administrator on 2017/3/4.
 */
public class SimpleTest {public static void main(String[] args){
   int[] a=new int[10];
    double ave=0;
    System.out.println("please input 10 integers:");
    for(int i=0;i<10;i++){
        Scanner sc=new Scanner(System.in);
        a[i]=sc.nextInt();
    }
    int max=a[0];
    int min=a[0];
    for(int j=0;j<10;j++){
        ave+=a[j];
        if(max<a[j])
            max=a[j];
        if(min>a[j])
            min=a[j];
    }
    ave=ave/10;
    System.out.println("ave="+ave+"     max="+max+"    min="+min);
}
}
