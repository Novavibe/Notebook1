package Note;
import java.util.HashMap;
import java.util.Scanner;
/**查找硬币对应的英文单词
 * Created by Administrator on 2017/3/3.
 */
public class Coin {
    private HashMap<Integer,String>coinnames=new HashMap<Integer,String>();
    public String getName(int amount){
        if(coinnames.containsKey(amount))
    return coinnames.get(amount);
        else
            return "not found";
    }
    public Coin(){
        coinnames.put(1,"penny");
        coinnames.put(5,"nickel");
        coinnames.put(10,"dine");
        coinnames.put(25,"quarter");
        coinnames.put(25,"jdjjj");
        System.out.print(coinnames.keySet().size());
        System.out.print(coinnames);
        for(Integer k:coinnames.keySet()){
            String s=coinnames.get(k);
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        System.out.println("please input the amount you want to look up");
      Scanner in=new Scanner(System.in);
        int amount=in.nextInt();
        Coin coin=new Coin();
        System.out.println(coin.getName(amount));
    }
}
