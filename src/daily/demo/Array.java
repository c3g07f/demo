package src.daily.demo;

public class Array {
    public static void main(String[] args) {

        /*数组遍历,求max*/
        int[] array = {1,2,3,4,5,6,7,8,9};
        int max = array[0];
        int count = 0;
        for (int i = 1;i < array.length;i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println(max);
    /*数组整除*/
        for (int i = 0;i < array.length;i++){
            if (array[i] % 3 == 0){
                count++;    //计数器
            }
        }
        System.out.println(count);
    }
}
