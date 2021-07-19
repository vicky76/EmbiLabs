package com.assignment;

public class MouseCheeseProblem {

	public int findMaxWeight(int arr[], int n) {
		int incl = arr[0];
		int excl = 0;
		int exclNew = 0;

		for (int i = 1; i < n; i++) {
			if(arr[i] < 0) {
				return -1;
			}else {
				/* current max excluding the current element */
				if(incl > excl) {
					exclNew = incl;
				}else {
					exclNew = excl;
				}

				/* current max including the current element */
				incl = excl + arr[i];
				excl = exclNew;
			}
		}

		return incl;
	}

}
