package com.human.ex;

public class �������α׷�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����� ���� id pw �ܾ�
		//���α׷� ���� �ҷ��� id:exit �Է�
		java.util.Scanner scanner
		= new java.util.Scanner(System.in);
	    	for(;;) {
	    		String information0[]= {"ȫ�浿","1234",""};
	    		String information1[]= {"ȫ�泲","1234",""};
	    	    String information2[]= {"ȫ���","1234",""};
	    		int money=0;
	    		System.out.println("���̵�� pw�� �Է����ּ���");
		    	System.out.print("id>>");
		    	String id=(scanner.nextLine());
		    	System.out.print("pw>>");
		    	String pw=(scanner.nextLine());
		    	if(id.equals("ȫ�浿")&&pw.equals("1234")) {
		    		System.out.println(id+"���� �α��� �ϼ̽��ϴ�.");
		    		for(;;) {
		    			System.out.println("1.�Ա� 2.��� 3.��ȸ 4.����");
			    		int menu=Integer.parseInt(scanner.nextLine());
			    		if(menu==1) {
			    			System.out.print("�Ա��Ͻ� �ݾ��� �����ּ���:");
			    			int money2=Integer.parseInt(scanner.nextLine());
			    			money+=money2;
			    		}else if(menu==2) {
			    			System.out.print("����Ͻ� �ݾ��� �����ּ���:");
			    			int money2=Integer.parseInt(scanner.nextLine());
			    			if(money>0&&money>money2) {
			    				money-=money2;
			    			}else {
			    				System.out.println("�ܾ� ����");
			    			}
			    		}else if(menu==3) {
			    			System.out.println("������ ���� �ܰ��"+money+"�� �Դϴ�");
			    		}else if(menu==4) {
			    			information0[2]+=money;
			    			break;
			    		}
		    		}
		    	}else if(id.equals("ȫ�泲")&&pw.equals("1234")) {
		    		System.out.println(id+"���� �α��� �ϼ̽��ϴ�.");
		    		for(;;) {
		    			System.out.println("1.�Ա� 2.��� 3.��ȸ 4.����");
			    		int menu=Integer.parseInt(scanner.nextLine());
			    		if(menu==1) {
			    			System.out.print("�Ա��Ͻ� �ݾ��� �����ּ���:");
			    			int money2=Integer.parseInt(scanner.nextLine());
			    			money+=money2;
			    		}else if(menu==2) {
			    			System.out.print("����Ͻ� �ݾ��� �����ּ���:");
			    			int money2=Integer.parseInt(scanner.nextLine());
			    			if(money>0&&money>money2) {
			    				money-=money2;
			    			}else {
			    				System.out.println("�ܾ� ����");
			    			}
			    		}else if(menu==3) {
			    			System.out.println("������ ���� �ܰ��"+money+"�� �Դϴ�");
			    		}else if(menu==4) {
			    			information1[2]+=money;
			    			break;
			    		}
		    		}
		    	}else if(id.equals("ȫ���")&&pw.equals("1234")) {
		    		System.out.println(id+"���� �α��� �ϼ̽��ϴ�.");
		    		for(;;) {
		    			System.out.println("1.�Ա� 2.��� 3.��ȸ 4.����");
			    		int menu=Integer.parseInt(scanner.nextLine());
			    		if(menu==1) {
			    			System.out.print("�Ա��Ͻ� �ݾ��� �����ּ���:");
			    			int money2=Integer.parseInt(scanner.nextLine());
			    			money+=money2;
			    		}else if(menu==2) {
			    			System.out.print("����Ͻ� �ݾ��� �����ּ���:");
			    			int money2=Integer.parseInt(scanner.nextLine());
			    			if(money>0&&money>money2) {
			    				money-=money2;
			    			}else {
			    				System.out.println("�ܾ� ����");
			    			}
			    		}else if(menu==3) {
			    			System.out.println("������ ���� �ܰ��"+money+"�� �Դϴ�");
			    		}else if(menu==4) {
			    			information2[2]+=money;
			    			break;
			    		}
		    		}
		    	}else if(id.equals("admin")&&pw.equals("1111")) {
		    		for(;;) {
		    			System.out.println("1.�����߰� 2.�������� 3.��� ����� ����Ȯ�� 4.id�� Ư�� ����� ����Ȯ�� 5.����");
			    		int menu=Integer.parseInt(scanner.nextLine());
			    		if(menu==1) {
			    			System.out.print("�Ա��Ͻ� �ݾ��� �����ּ���:");
			    			int money2=Integer.parseInt(scanner.nextLine());
			    			money+=money2;
			    		}else if(menu==2) {
			    			System.out.print("����Ͻ� �ݾ��� �����ּ���:");
			    			int money2=Integer.parseInt(scanner.nextLine());
			    			if(money>0&&money>money2) {
			    				money-=money2;
			    			}else {
			    				System.out.println("�ܾ� ����");
			    			}
			    		}else if(menu==3) {
			    			System.out.println("������ ���� �ܰ��"+money+"�� �Դϴ�");
			    		}else if(menu==4) {
			    			information2[2]+=money;
			    			break;
			    		}
		    		}
		    	}else {	    	
		    		System.out.println("id�� pw�� Ȯ�����ּ���");
		    	}
		    	if(id.equals("exit")) {
		    		
		    	}
	    	}	    	
	    	
	    	
	    
	}

}
