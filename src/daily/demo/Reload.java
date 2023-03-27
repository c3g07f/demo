package src.daily.demo;

public class Reload {
    public static void main(String[] args) {
//        System.out.println(getSum(3.4,4.5));
        int[] arr = {1,2,3,4,5,6,7,8};
        printArr(arr);
    }


    public static int getSum(int num1,int num2){
        return num1 + num2;
    }
    public static int getSum(int num1,int num2,int num3){
        return num1 + num2 + num3;
    }
    public static double getSum(double num1,double num2){
        return num1 + num2;
    }
    /*实现输出[1,2,3,4,5,6,7,8]，对最后面的进行处理*/
    public static void printArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length -1)
            System.out.print(arr[i] + ",");
            else System.out.print(arr[arr.length - 1]);
        }
        System.out.print("]");
    }
}
