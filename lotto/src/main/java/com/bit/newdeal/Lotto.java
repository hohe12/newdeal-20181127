package com.bit.newdeal;

public class Lotto {
	int a,b;
	int [] num = new int[6];
	
	public int [] number() {
		for (int i = 0; i < 6; i++ ) {
			a = (int) (Math.random() * 45) + 1;
			if(i >= 1) {
				checknum(num);
			}
			num[i] = a;		
		}
		
		return num;
	}
	
	public void checknum(int[] num) {
		for(int i=0; i<num.length;i++) {
			if(num[i]==a) {
				a = (int) (Math.random() * 45) + 1;
			};
		}
	}
	
	public int[] sort(int[] num) {
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					b = num[i];
					num[i] =num[j];
					num[j]= b;
				}
			}
		}
		return num;
		
	}
	public void writenumber(int[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + "  ");
		}
	}
}
