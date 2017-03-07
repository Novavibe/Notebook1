package commonClass;
import java.util.Scanner;

/**@author 下雨天不打伞才怪
 * Created by Administrator on 2017/3/4.
 *@title 简单的背单词闯关程序
 */
public class Recite {
    private String[] word1={"1","2","3"};
    private String[] word11={"one","two","three"};
    private String[] word2={"10","20","30"};
    private String[] word22={"ten","twenty","thirty"};
    public void pass(){
        for(int i=0;i<word1.length;i++){
            String answer;
            do{
                System.out.println("please type the relative english word of "+word1[i]);
            Scanner sc=new Scanner(System.in);
                answer=sc.nextLine();
            } while(answer.equals(word11[i])==false);
            System.out.println("you are right with the word "+word1[i]);
        }
        System.out.println("congratulations! the second round");
        for(int i=0;i<word2.length;i++){
            String answer;
            do{
                System.out.println("please type the relative english word of "+word2[i]);
                Scanner sc=new Scanner(System.in);
                answer=sc.nextLine();
            } while(answer.equals(word22[i])==false);
            System.out.println("you are right with the word "+word2[i]);
        }
        System.out.println("bravo ya,you succeed");
    }
    public static void main(String[] args) {
        Recite rc=new Recite();
        rc.pass();
    }
}
