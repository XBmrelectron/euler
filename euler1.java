package eulerchallenge;

import java.util.Arrays;

public class euler1 {

	public static void main(String[] args) {
		
		int x = 0;
		int y = 0;
		
		//multiples of 3 array
		int counta = 0;
		
		//int sum = 0;
		
		while(x < (1000 - 3)){
			x += 3;
			counta++;
			//sum += x;
		}
		//System.out.println(sum);
		//System.out.println(counta);
		x = 0;
		
		int threemults[] = new int[counta];
		
		//multiples of 5 array
		int countb = 0;
		
		while(y < (1000 - 5)){
			y += 5;
			countb++;
		}
		//System.out.println(countb);
		y = 0;
		
		int fivemults[] = new int[countb];
		
		//filling arrays
		for(int i = 0; i < (counta); i++){
			x += 3;
			threemults[i] = x;
		}
		
		for(int j = 0; j < (countb); j++){
			y += 5;
			fivemults[j] = y;
		}
		
		//System.out.println(fivemults[0]);
		
		System.out.println(Arrays.stream(threemults).sum() + Arrays.stream(fivemults).sum());
		
		//https://stackoverflow.com/questions/4550662/how-do-you-find-the-sum-of-all-the-numbers-in-an-array-in-java
		
	}

}
