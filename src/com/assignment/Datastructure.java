package com.assignment;

public class Datastructure {

	public static void main(String[] args) {
		MouseCheeseProblem sum = new MouseCheeseProblem();
		int arr[] = new int[] { 5, 6, 10, 100, 10, 5, 59, 24, 100 };
		System.out.println(sum.findMaxWeight(arr, arr.length));
	}

}
