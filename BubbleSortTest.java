package com.zai.myJava.Array;
/*
 * 数组的冒泡排序的实现
 *
 */
public class BubbleSortTest {
	public static void main(String[] args) {
		int[] array = new int[]{63,-32,76,98,0,64,33,-21,32,-89,50,-8,33};
		//冒泡排序
		for(int i = 0 ;i< array.length-1;i++){
			for (int j = 0 ;j< array.length-1-i ; j++){
				if(array[j]>array[j+1]){
					int item = array[j+1];
					array[j+1] = array[j];
					array[j] = item;
				}
			}
		}
		for(int i = 0 ;i< array.length;i++){
			System.out.print(array[i] +" ");
		}
	}
}

/*
* 		for(int i = 0;i < array.length - 1;i++){

			for(int j = 0;j < arr.length - 1 - i;j++){

				if(arr[j] > arr[j + 1]){
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i] + "\t");
		}
* */