package Note;
import java.util.ArrayList;
/**
 * Created by Administrator on 2017/3/3.
 */
public class Database {
    private ArrayList<CD>listCD=new ArrayList<CD>();
    public void add(CD cd){
        listCD.add(cd);}
    public void list(){
        for(CD cd:listCD){
            cd.print();
        }
    }
    public static void main(String[] args) {
        Database db=new Database();
        db.add(new CD("abs","fff",5,9,"hhh"));
        db.add(new CD("aaa","fff",5,9,"hhh"));
        db.add(new DVD("ana","jjf",5,9,"hhh"));
        db.list();
    }
}
