package com.human.ex;

public class �������α׷� {

	public static void main(String[] args) {
		java.util.Scanner scanner=
				new java.util.Scanner(System.in);
		String people[]= {"ȫ�浿","ȫ�泲","ȫ���"};
		for(int i=0; i<people.length; i++) {
			for(;;) {
				if(people[i].equals("ȫ�浿")) {
					System.out.println("��ȫ �� ���ԡ�");
					System.out.print("���̵� �Է����ּ���:");
					String id=(scanner.nextLine());
					System.out.print("�н����带 �Է����ּ���:");
					String pw=(scanner.nextLine());
					if(id.equals("ȫ�浿1")&&pw.equals("ȫ�浿123")) {
						System.out.println("�α��� ����!\n");
						break;
					}else {
						System.out.println("��id�� �н����带 �ٽ� Ȯ�����ּ����\n");
					}
				}else if(people[i].equals("ȫ�泲")) {
					System.out.println("��ȫ �� ���ԡ�");
					System.out.print("���̵� �Է����ּ���:");
					String id=(scanner.nextLine());
					System.out.print("�н����带 �Է����ּ���:");
					String pw=(scanner.nextLine());
					if(id.equals("ȫ�泲1")&&pw.equals("ȫ�泲123")) {
						System.out.println("�α��� ����!\n");
						break;
					}else {
						System.out.println("��id�� �н����带 �ٽ� Ȯ�����ּ����\n");
					}
				}else if(people[i].equals("ȫ���")) {
					System.out.println("��ȫ �� ���ԡ�");
					System.out.print("���̵� �Է����ּ���:");
					String id=(scanner.nextLine());
					System.out.print("�н����带 �Է����ּ���:");
					String pw=(scanner.nextLine());
					if(id.equals("ȫ���1")&&pw.equals("ȫ���123")) {
						System.out.println("�α��� ����!\n");
						break;
					}else {
						System.out.println("��id�� �н����带 �ٽ� Ȯ�����ּ����\n");
					}
				}
			}
			int money=0;
			System.out.println(people[i]+"�� �ݰ����ϴ�");
				for(;;) {
					   System.out.println("\n=====������ �̿��Ͻðڽ��ϱ�?======");
					   System.out.print("1.�Ա� 2.��� 3.������ü 4.�ܾ���ȸ 5.����:");
					   int bankService=Integer.parseInt(scanner.nextLine());
					   if(bankService==1) {
						   System.out.print("�󸶸� �Ա��Ͻðڽ��ϱ�?:");
						   int cash=Integer.parseInt(scanner.nextLine());		   
						   money+=cash;
					   }else if(bankService==2) {
						   System.out.print("�󸶸� ����Ͻðڽ��ϱ�?:");
						   int cash=Integer.parseInt(scanner.nextLine());		   
						   if(money>0&&money>=cash) {
							   money-=cash;
						   }else {
							   System.out.println("�ܾ׺���");
						   }
					   }else if(bankService==3) {
						   System.out.print("��ü�Ͻ� ������ �������ּ���:");
						   String bank2=(scanner.nextLine());
						   System.out.print("���¹�ȣ�� �������ּ���(-���� �Է�):");
						   String toss=(scanner.nextLine());
						   System.out.print("�󸶸� ����Ͻðڽ��ϱ�?:");
						   int cash=Integer.parseInt(scanner.nextLine());
						   System.out.println("�Ѽ��ǴԿ��� "+cash+" �� ��ü�Ͻô°� �½��ϱ�?:");
						   System.out.print("1.�� 2.�ƴϿ�:");
						   int yesOrNo=Integer.parseInt(scanner.nextLine());
						   if(money>0&&yesOrNo==1&&money>=cash) {
							   money-=cash;
							   System.out.println("ȫ�浿�Կ��� "+cash+"�� ��ü����");
						   }else if(yesOrNo==1) {
							   if(money<=0||money<cash){
								   System.out.println("�ܾ׺���");
							   }   
						   }else if(yesOrNo==2) {
							   System.out.println("���ΰź�");
						   }
					   }else if(bankService==4) {
						   System.out.println("������ ���� �ܰ�� ��"+money+"�� �Դϴ�");
					   }else if(bankService==5) {
						   System.out.println("\n�̿����ּż� �����մϴ�.\n");
					       break;
					   }else {
						   System.out.println("�޴��� �ִ� ��ư�� �����ּ���");
					   }
				}
			
		}

	}

}