package com.human.ex;

import java.util.Arrays;

public class �ڹٿ���001 {

	public static void main(String[] args) {
		//�迭 a[]={1,2,3,4,5,6,7,8,9}�� Ȧ���� �Է��ϰ� ������ �κ��� 2�� ��µǰ� �غ���.
		
//		int arr[]= {1,2,3,4,5,6,7,8,9};
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]%2==0) {
//				arr[i]=2;
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
		//������ �ݴ��
//		int arr[]= {1,2,3,4,5,6,7,8,9};
//		for (int i=0; i<arr.length; i++) {
//			if(i%2==0) {
//				arr[i]=1;
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
		//8.��ǻ�Ϳ��� �ֻ��������� ���α׷��� ���������� ������ ���¼��� �󵵸� ���ϴ� ���α׷��� �ۼ��غ���.
//		int dice[]= {0,0,0,0,0,0};
//		for(int i=0; i<2000; i++) {
//			int numR=(int)(Math.random()*6);
//			dice[numR]++;
//		}
//		System.out.println(Arrays.toString(dice));
		
		//���� 7) �迭�� 100�� �����Ͽ� 0~99���� ���� ���� i=2���� 50����
		
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
		
		//���� 5�� �赲�� 1,2,3,4,5,6,7,8,9���� �̵� ����,�̵�ĭ��,ä����ڸ� �Է¹޾� �迭�� ������ ����غ���.
		//���������� �� ĭ�̵��غ��� �������� 3�� ä������.
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
		//�������� ��ĭ �̵��غ��� �������� 3�� ä������
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
