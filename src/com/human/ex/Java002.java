package com.human.ex;

public class Java002 {

		public static void main(String[] args) {
			random();		
		}	
		public static void random() {
			java.util.Scanner scanner=
					new java.util.Scanner(System.in);
			int randomNum=(int)(Math.random()*500)+1;
			int score=0;
			int chance=0;
			for(;;) {
			  if(chance==0) {
				  System.out.print("��Ʈ�� ����Ͻðڽ��ϱ�? 1.�� 2.�ƴϿ�:");
				  int yesOrNo=Integer.parseInt(scanner.nextLine());
				  if(yesOrNo==1) {
					  chance++;
					  for(int i=0; i<500; i+=100) {
						  if(randomNum>i&&randomNum<i+100) {
							  System.out.println("���ڴ� "+i+"�̶� "+(i+100)+"���̿� �ֽ��ϴ�.");
						  }
					  }
				  }
			 }
		  	 System.out.print("���� �Է�:");
			 int number=Integer.parseInt(scanner.nextLine());
			 if(number<randomNum) {
				 System.out.println("up");
				 score++;
			 }else if(number>randomNum) {
				 System.out.println("down");
				 score++;
			 }else if(number==randomNum) {
				 System.out.println("�¸�!");
				 break;
			 }
			 if(score>=10) {
				 System.out.println("�й�");
				 break;
			 }
			 			
			}
		}

	

}
