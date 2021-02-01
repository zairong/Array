package com.zai.myJava.Array;
/*
 * 二維陣列的使用：
 *     規定：二維陣列分為外層陣列的元素，內層陣列的元素
 *        int[][] arr = new int[4][3];
 *        外層元素：arr[0],arr[1]等
 *        內層元素：arr[0][0],arr[1][2]等
 *
 *   ⑤ 陣列元素的預設初始化值
 *   針對於初始化方式一：比如：int[][] arr = new int[4][3];
 *      外層元素的初始化值為：地址值
 *      內層元素的初始化值為：與一維陣列初始化情況相同
 *
 *   針對於初始化方式二：比如：int[][] arr = new int[4][];
 *     外層元素的初始化值為：null
 *      內層元素的初始化值為：不能調用，否則報錯。
 *
 *   ⑥ 陣列的記憶體解析
 *
 */
public class ArrayTest3 {
	public static void main(String[] args) {

		int[][] arr = new int[4][3];
		System.out.println(arr[0]);//[I@15db9742
		System.out.println(arr[0][0]);//0
		System.out.println(arr);//[[I@6d06d69c

		System.out.println("*****************");
		float[][] arr1 = new float[4][3];
		System.out.println(arr1[0]);//地址值
		System.out.println(arr1[0][0]);//0.0

		System.out.println("*****************");

		String[][] arr2 = new String[4][2];
		System.out.println(arr2[1]);//地址值
		System.out.println(arr2[1][1]);//null

		System.out.println("*****************");
		double[][] arr3 = new double[4][];
		System.out.println(arr3[1]);//null
//    System.out.println(arr3[1][0]);//報錯

	}
}

