package com.wang.arithmetic.sorting;

/**
 * 插入排序</br> 注：本插入排序是将无序的整型数组中的元素按从小到大排序。
 * 
 * @author wang
 * 
 */
public class InsertionSort {

	public static void insertionSort(int[] array) {

		int j;
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			for (j = i; j > 0 && temp < array[j - 1]; j--) {
				array[j] = array[j - 1];
			}
			array[j] = temp;
		}
	}
}
