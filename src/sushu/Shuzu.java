package sushu;

/**
 * 求一个矩阵的上三角矩阵
 * Created by Administrator on 2017/3/6.
 */
public class Shuzu {
    public static void main(String[] args) {
    double[][]  a= new double[4][];         //可以在定义时直接初始化矩阵啊,比如int[]={2,3,4};
        int w=1;
                               //int[][] aa={{2,3},{3,3},{4,4},{3,4}};数组的赋值要么在定义的时候直接完成，否则只能遍历赋值
        for(int i=0;i<4;i++ ){
            for(int j=0;j<4;j++){
                a[i][j]=w;             //如果上面定义时是  int[][]  a= new int[4][];就会出现空指针异常,
                                           // 因为电脑不知道将值分配到哪里
                w++;
            }
        }
        double[] m=new double[4];
        for(int k=0;k<3;k++){
            for(int i=k+1;i<4;i++){
                if(a[k][k]==0)break;            //如果除数等于零，会报错，永远要相信电脑是不会乱给你报错的
                m[i]=a[i][k]/a[k][k];            //AruthmrticException/by zero.因为除数为零了，所以异常，说明
                                                   //这个矩阵不是满秩矩阵
                for(int j=k;j<3;j++)
                    a[i][j]=a[i][j]-a[k][j]*m[i];
            }}
        for(int i=0;i<4;i++ ){
            for(int j=0;j<4;j++){
                System.out.print ("    "+a[i][j]);
            }
            System.out.println();}
    }
}
