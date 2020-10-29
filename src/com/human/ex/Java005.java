package com.human.ex;

import java.util.Arrays;
import com.human.dto.Human;

public class Java005 {

	public static void main(String[] args) {
		java.util.Scanner scanner=
				new java.util.Scanner(System.in);
		//10월 28 선생님 문제풀이
		//문제 4번
		/*
		int a[]= {12,1,5,3,6,8,5,3};
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		//for(하나의 데이터:[배열이나 컬렉션]) 배열의 값들을 순회한다.
		sum=0;
		for(int i:a) {
			sum=sum+i;
		}
		System.out.println(sum);
		
		//읽기모드
		for(int i:a) {
			i=0;
		}
		System.out.println(Arrays.toString(a));
		//객체의 경우?
		Human aH[]= {
				new Human("홍",1,1),
				new Human("홍2",12,12),
				new Human("홍3",13,13)
		};
		for(Human h:aH) {
			h.age=100;  //실제 데이터가 변경됨
			h=new Human("홍",99,99); //실제데이터가 변경되지않음
		}
		System.out.println(Arrays.toString(aH));
		*/
		//문제 5번 배뎡ㄹ 1,2,3,4,5,6,7,8,9에서 이동 방향,이동칸수,채울수자를 입력받아 배열의 내용을 출력해보자.
		int a[]= {1,2,3,4,5,6,7,8,9};
		String direction="";
		int moveCount=4;
		int changeNum=5;
		//이동 작업
		moveFunc(a,direction,moveCount,changeNum);
		System.out.println(Arrays.toString(a));
		

	}

	private static void moveFunc(int[] a, String direction, int moveCount, int changeNum) {
		//1. a배열의 내용을 오른쪽으로 1칸 Shift하는 작업
		//2. moveCount만큼 1칸 shift작업을 반복한다.
		//3. changeNum를 설정해보자 0보다 작으면 원래 배열의 수
		//, 아니면 해당수로 변경
		
//		int temp=a[a.length-1];
//		for(int i=a.length-2; i>=0; i--) {
//			a[i+1]=a[i];
//		}
//		a[0]=temp;
		
		for(int j=0; j<moveCount; j++) {
			int temp=a[a.length-1];
			for(int i=a.length-2; i>=0; i--) {
				a[i+1]=a[i];
			}
			a[0]=temp;
		}

		
//		for(int j=0; j<moveCount; j++) {
//			int temp=a[a.length-1];
//			if(changeNum>=0) {
//				temp=changeNum;
//			}
//			for(int i=a.length-2; i>=0; i--) {
//				a[i+1]=a[i];
//			}
//			a[0]=temp;
//		}
		
	}

}
