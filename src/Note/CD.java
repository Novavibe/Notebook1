package Note;

/**
 * Created by Administrator on 2017/3/3.
 */
public class CD {
    private String title;
    private String artist;
    private int num;
    private int play;
    private String comment;
    private boolean gotit=false;

    public CD(String title,String artist,int num,int play,String comment) {
        this.title = title;
        this.artist=artist;
        this.num=num;
        this.play=play;
        this.comment=comment;
    }
public void print(){
    System.out.println(",,,"+artist);
}
    public static void main(String[] args) {
    }
}
class DVD extends CD{
    public DVD(String title,String artist,int num,int play,String comment){
        super(title,artist,num,play,comment);
    }
}