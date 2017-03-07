package collection;
import com.sun.deploy.util.ArrayUtil;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/6.
 */
public class Suoha {
    private final int PLAY_NUM=5;
    private String[] types={"方块","红桃","黑桃","梅花"};
    private String[] values={"2","3","4","5","6","7","8"};
    private List<String>[] playersCards=new List[PLAY_NUM];
    private List<String> cards=new LinkedList<String>();
    private String[] players=new String[PLAY_NUM];
    public void initCards(){
        for(int i=0;i<types.length;i++){
            for(int j=0;j<values.length;j++){
                cards.add(types[i]+values[j]);
            }
        }
        Collections.shuffle(cards);}
        public void initPlayers(String...names){
        if(names.length>PLAY_NUM||names.length<2){
            System.out.println("玩家数量不对");
        return;}
        else
        {
            for(int i=0;i<names.length;i++){
                players[i]=names[i];
            }
        }
    }
    public void initPlayerCards(){
    for(int i=0;i<players.length;i++){
        if(players[i]!=null&&!players[i].equals(""))
            playersCards[i]=new LinkedList<String>();
    }
}
         public void showAllCards(){
             for(String card:cards)
                 System.out.println(card);
         }
         public void deliverCard(String first){
            int firstPos=0;
                     for(int i=firstPos;i<PLAY_NUM;i++){
                   if(players[i]!=null) {
                       playersCards[i].add(cards.get(0));
                       cards.remove(0);
                   }

                     }
                     for(int i=0;i<firstPos;i++){
                         if(players[i]!=null) {
                         playersCards[i].add(cards.get(0));
                         cards.remove(0);}
                     }}
                     public void showPlayerCards(){
        for(int i=0;i<PLAY_NUM;i++){
            System.out.println(players[i]+"PLAYER"+i+": ");
            for(String cardd:playersCards[i])
                System.out.println(cardd+"\t");
        }
                         System.out.println("\n");
    }

    public static void main(String[] args) {
        Suoha sh=new Suoha();
        sh.initCards();
        sh.initPlayers("一号：","二号","三号");
        sh.initPlayerCards();
        sh.showAllCards();
        System.out.println(" --------------->");
        sh.deliverCard("二号");
        sh.showPlayerCards();
        sh.deliverCard("二号");
        sh.showPlayerCards();
    }
         }


