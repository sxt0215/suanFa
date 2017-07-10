package com.example.sxt.suanfa;

/**
 * Created by Administrator on 2017/6/17.
 */

public class Sort_Bubble {
    public static void main(String[] args){
        Sort_Bubble sort = new Sort_Bubble();
        sort.bubble();
    }

    /**
     * 冒泡排序(从小到大排序)
     * */
    public void bubble(){
        int arry[] = {22,11,2,7,4,89,52,76};
        for(int i = 0;i<arry.length - 1;i++){//外层循环控制排序趟数
            for(int j = 0; j < arry.length - 1 - i;j++){//内层循环控制每一趟排序多少次
                if(arry[j] > arry[j+1]){
                    int temp;
                    temp = arry[j];
                    arry[j] = arry[j+1];
                    arry[j+1] = temp;
                }
            }
        }

        for(int i = 0;i< arry.length;i++){
            System.out.print(arry[i]+", ");
        }
    }

}
