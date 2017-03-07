package crazy;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/3/4.
 */
public class Game {
   Player[] players=new Player[8];
 private int temp=0;
    public void add(int i,Player pp){
       players[i]=new Player();  //initialize the players[i],so you can give a value to it
        players[i]=pp;
    }
   public void who(){
    for(int i=0;i<2;i++){
       if(temp<players[i].getCard().size())
           temp=i;}
           System.out.print("let"+players[temp].getName()+"first");
   }
    public static void main(String[] args) {
        Player p1=new Player("aaa","bbb","ccc");
       p1.card.add("wwwwww");
       p1.card.add("ee");
        Player p2=new Player("aaa","bbb","ccc");
        p2.card.add("jj");
        Game game=new Game();
     // game.add(0);
        //game.players[0]=p1;
        //game.players[1]=p2;
        game.add(0,p1);
        game.add(1,p2);
       game.who();
        System.out.println("now there are"+game.players.length+"  players;");
        System.out.println(game.players[1].getName());
    }
}
