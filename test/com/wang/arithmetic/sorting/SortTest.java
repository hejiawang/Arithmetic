package com.wang.arithmetic.sorting;

import org.junit.Test;

public class SortTest {

	@Test
	public void testInsertionSort() {

		int array[] = { 34, 8, 64, 51, 32, 21 };
		InsertionSort.insertionSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
	}
	
	@Test
	public void testShellSort() {
		int array[] = { 81, 94, 11, 96, 12, 35, 17, 95, 28, 58, 41, 75, 15 };
		ShellSort.shellSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
	}

}
