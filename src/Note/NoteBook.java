package Note;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Administrator on 2017/3/3.
 */
public class NoteBook {
    private ArrayList<String> note=new ArrayList<String>();
    public void add(String aa) {
        note.add(aa);
    }
    public int getSize(){
        return note.size();
    }
    public void remove(int index){
         note.remove(index);
    }
    public String  getNote(int index){
            return note.get(index);
    }
    public String[] list(){
        String[] a=new String[note.size()];
      //  for(int i=0;i<note.size();i++)
      //  a[i]=note.get(i);
        note.toArray(a);
        return a;
    }


    public static void main(String[] args) {
        int[] a=new int[10];
        String[] aa=new String[10];
      for(String l:aa){
          System.out.println("output...");
      }
        NoteBook nb=new NoteBook();
        nb.add("aaaa");
        nb.add("bbbb");
        System.out.println(nb.note);
        HashSet<String> s=new HashSet<String>();
        s.add("first");
        s.add("second");
        s.add("first");
        s.toString();
        System.out.println(s);
        System.out.println( s.toString());

    }
}
