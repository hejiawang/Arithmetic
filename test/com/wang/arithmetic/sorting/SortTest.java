package com.wang.arithmetic.sorting;

import org.junit.Test;

public class SortTest {

	@Test
	public void testInsertionSort() {
		
		int array[] = {34,8,64,51,32,21};
		InsertionSort.insertionSort(array);
		for( int i=0; i<array.length; i++ ){
			System.out.print(array[i] + "  ");
		}
	}

}
