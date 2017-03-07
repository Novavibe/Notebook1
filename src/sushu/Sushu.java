package sushu;
import java.util.Scanner;
/**
 * Created by Administrator on 2017/3/5.
 * 查找1-100之间的素数
 */
public class Sushu {
    public boolean judgeIs(int beichushu){                      //判断一个整数是否为素数
        for(int chushu=2;chushu<=(beichushu+1)/2;chushu++)
        {
            if(beichushu%chushu==0)
                return false;               //return语句有中断当前程序的效果 如果遇到return 会直接返回 不执行下面的代码了
        }
        return true;
    }
    public void printSushu(){                                         //用一个函数打印出素数，会调用到上面的函数
        int N;                                                         //当一个函数难以完成判断，并且输出的话，
                                                                      // 可以分解为两个函数来完成
       System.out.println("please input the max one :");
        Scanner sc=new Scanner(System.in);                           //用Scanner类来读取键盘输入
        N=sc.nextInt();
        for(int beichu=3;beichu<N;beichu++){
            if(judgeIs(beichu))
                System.out.print("   "+beichu);
        }
    }
    public static void main(String[] args) {
        Sushu ss=new Sushu();
        ss.printSushu();
    }
}

