package org.horizoncolumbus.hs;

public class Main {

    public static void main(String[] args) {
	int[] arr = {5, 33, 7, 1, 0, -4, 44, 12, 98};

	int sum = 0;

	for(int i = 0; i < arr.length; i++){
	    sum = sum + arr[i];
    }
        System.out.println("The sum is: " + sum);

	int average = sum / arr.length;

        System.out.println("The average is: " + average);
    }
}
