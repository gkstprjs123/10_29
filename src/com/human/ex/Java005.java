package com.human.ex;

import java.util.Arrays;
import com.human.dto.Human;

public class Java005 {

	public static void main(String[] args) {
		java.util.Scanner scanner=
				new java.util.Scanner(System.in);
		//10�� 28 ������ ����Ǯ��
		//���� 4��
		/*
		int a[]= {12,1,5,3,6,8,5,3};
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		//for(�ϳ��� ������:[�迭�̳� �÷���]) �迭�� ������ ��ȸ�Ѵ�.
		sum=0;
		for(int i:a) {
			sum=sum+i;
		}
		System.out.println(sum);
		
		//�б���
		for(int i:a) {
			i=0;
		}
		System.out.println(Arrays.toString(a));
		//��ü�� ���?
		Human aH[]= {
				new Human("ȫ",1,1),
				new Human("ȫ2",12,12),
				new Human("ȫ3",13,13)
		};
		for(Human h:aH) {
			h.age=100;  //���� �����Ͱ� �����
			h=new Human("ȫ",99,99); //���������Ͱ� �����������
		}
		System.out.println(Arrays.toString(aH));
		*/
		//���� 5�� �赲�� 1,2,3,4,5,6,7,8,9���� �̵� ����,�̵�ĭ��,ä����ڸ� �Է¹޾� �迭�� ������ ����غ���.
		int a[]= {1,2,3,4,5,6,7,8,9};
		String direction="";
		int moveCount=4;
		int changeNum=5;
		//�̵� �۾�
		moveFunc(a,direction,moveCount,changeNum);
		System.out.println(Arrays.toString(a));
		

	}

	private static void moveFunc(int[] a, String direction, int moveCount, int changeNum) {
		//1. a�迭�� ������ ���������� 1ĭ Shift�ϴ� �۾�
		//2. moveCount��ŭ 1ĭ shift�۾��� �ݺ��Ѵ�.
		//3. changeNum�� �����غ��� 0���� ������ ���� �迭�� ��
		//, �ƴϸ� �ش���� ����
		
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
