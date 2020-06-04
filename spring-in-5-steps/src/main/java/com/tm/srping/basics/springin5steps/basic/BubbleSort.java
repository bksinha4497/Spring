package com.tm.srping.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("bubble")
public class BubbleSort implements SortAlgo {
	public int[] sort(int[] numbers) {

		return numbers;
	}
}
