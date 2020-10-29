package com.human.ex;

import java.util.Arrays;

public class 자바연습001 {

	public static void main(String[] args) {
		//배열 a[]={1,2,3,4,5,6,7,8,9}를 홀수만 입력하고 나머지 부분은 2로 출력되게 해보자.
		
//		int arr[]= {1,2,3,4,5,6,7,8,9};
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]%2==0) {
//				arr[i]=2;
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
		//위에꺼 반대로
//		int arr[]= {1,2,3,4,5,6,7,8,9};
//		for (int i=0; i<arr.length; i++) {
//			if(i%2==0) {
//				arr[i]=1;
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
		//8.컴퓨터에서 주사위던지는 프로그램을 구현했을때 던져서 나온수의 빈도를 구하는 프로그램을 작성해보자.
//		int dice[]= {0,0,0,0,0,0};
//		for(int i=0; i<2000; i++) {
//			int numR=(int)(Math.random()*6);
//			dice[numR]++;
//		}
//		System.out.println(Arrays.toString(dice));
		
		//문제 7) 배열을 100개 선언하여 0~99까지 넣은 다음 i=2부터 50까지
		
//		int arr[]=new int[100];
//		for(int i=0; i<arr.length; i++) {
//			arr[i]=i;
//		}
//		for(int i=2; i<50; i++) {
//			for(int j=i+i; j<99; j+=i) {
//				arr[j]=0;
//			}
//		}
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]!=0) {
//				System.out.println(arr[i]);
//			}
//		}
		
		//문제 5번 배뎡ㄹ 1,2,3,4,5,6,7,8,9에서 이동 방향,이동칸수,채울수자를 입력받아 배열의 내용을 출력해보자.
		//오른쪽으로 두 칸이동해보고 나머지에 3을 채워보자.
//		int arr[]= {1,2,3,4,5,6,7,8,9};
//		int temp=3;
//		for(int i=0; i<3; i++) {
//			if(temp>=0) {
//				temp=3;
//			}
//			for(int j=arr.length-2; j>=0; j--) {
//				arr[j+1]=arr[j];
//			}
//			arr[0]=temp;
//		}
//		System.out.println(Arrays.toString(arr));
		//왼쪽으로 두칸 이동해보고 나머지에 3을 채워보자
		int arr[]= {1,2,3,4,5,6,7,8,9};
		for(int i=0; i<5; i++) {
			int temp=arr[0];
			for(int j=0; j<arr.length; j++) {
				if(j<8) {
					arr[j]=arr[j+1];
				}
			}
			arr[8]=temp;
		}
		System.out.println(Arrays.toString(arr));

	}

}
