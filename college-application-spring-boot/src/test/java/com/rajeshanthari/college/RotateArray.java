package com.rajeshanthari.college;

import java.util.Arrays;

public class RotateArray {

	static {
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		int n = arr.length;
		reverseArray(arr, n - k, n - 1);
		System.out.println(Arrays.toString(arr));
		reverseArray(arr, 0, n - k - 1);
		System.out.println(Arrays.toString(arr));
		reverseArray(arr, 0, n - 1);
		System.out.println(Arrays.toString(arr));
	}

	public static void reverseArray(int[] arr, int start, int end) {

		for (int i = start, j = end; i < j; i++, j--) {
			swap(arr, i, j);
		}
	}

	public static void swap(int[] arr, int from, int to) {
		int temp = arr[from];
		arr[from] = arr[to];
		arr[to] = temp;
	}

}

class overload {
	int x;
	double y;

	void add(int a, int b) {
		x = a + b;
	}

	void add(double c, double d) {
		y = c + d;
	}

	overload() {
		this.x = 0;
		this.y = 0;
	}
}

class newthread extends Thread {
	Thread t1, t2;

	newthread() {
		t1 = new Thread(this, "Thread_1");
		t2 = new Thread(this, "Thread_2");
		t1.start();
		t2.start();
	}

	public void run() {
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.print(t1.equals(t2));
	}
}