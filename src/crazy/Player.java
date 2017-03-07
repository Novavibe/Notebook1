package crazy;
import java.util.ArrayList;

/**
 * Created by Administrator on 2017/3/4.
 */
public class Player {
    private String name;
    private String location;
    private String state;
    ArrayList<String>card=new ArrayList<String>();
    public  Player(String name,String location,String state){
        this.name=name;
        this.location=location;
        this.state=state;
        this.card=card;
        this.toString();
    }

    public String getName() {
        return name;
    }
public Player(){}
    public String getLocation(){return location;}
    public ArrayList<String> getCard() {return card;}
    public String getState() {return state;}
    public boolean giveout(int i){card.remove(i); return false;}
    public void getin(String ss){
        card.add(ss);
        System.out.println(this.name+"get a card is"+ss);
    }
}
