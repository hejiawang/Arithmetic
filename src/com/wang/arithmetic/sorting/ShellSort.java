package com.wang.arithmetic.sorting;

/**
 * 希尔排序
 * 
 * @author wang
 * 
 */
public class ShellSort {

	public static void shellSort(int[] array) {
		int j;
		for (int gap = array.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < array.length; i++) {
				int tmp = array[i];
				for (j = i; j >= gap && tmp < array[j - gap]; j -= gap) {
					array[j] = array[j - gap];
				}
				array[j] = tmp;
			}
		}
	}
}
