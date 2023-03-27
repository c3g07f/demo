package src.test.java.mission1;

public class MultiTable {
    public static void main(String[] args){
        int i = 0,j = 0;
        for (i = 1;i <= 9;i++){

            for(j = 1;j <= i;j++){      //二层以1开头
                System.out.print(j+"*"+ i +"="+ i*j + "\t\t"); //println 自带换行

            }
            System.out.println();
        }
    }
}
