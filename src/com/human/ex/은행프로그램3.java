package com.human.ex;

import java.util.Arrays;

public class �������α׷�3 {

	public static void main(String[] args) {
		java.util.Scanner scanner
		= new java.util.Scanner(System.in);
		String user[]= {"-","-","-","-","-","-","-","-","-","-"};
		String userpw[]= {"-","-","-","-","-","-","-","-","-","-"};
		int userM[]={0,0,0,0,0,0,0,0,0,0};
	    	for(;;) {
	    		boolean flag=false;
	    		System.out.println("���̵�� pw�� �Է����ּ���");
		    	System.out.print("id>>");
		    	String id=(scanner.nextLine());
		    	if(id.equals("exit")) {
		    		break;
		    	}
		    	System.out.print("pw>>");
		    	String pw=(scanner.nextLine());
		    	for(int i=0; i<user.length; i++) {
	    			if(id.equals(user[i])&&pw.equals(userpw[i])) {
	    				flag=true;
	    			}
	    		}
		    	if(flag) {
		    		int value=bank(id,0);
		    		for(int i=0; i<user.length; i++) {
		    			if(id.equals(user[i])) {
		    				userM[i]+=value;
		    			}
		    		}
		    		
		    	}
		    	else if(id.equals("admin")&&pw.equals("1111")) {
		    		System.out.println("�����ڴ��� �α����ϼ̽��ϴ�.");
		    		for(;;) {
		    			System.out.println("1.�����߰� 2.�������� 3.��� ����� ����Ȯ�� 4.id�� Ư�� ����� ����Ȯ�� 5.����");
		    			int menu=Integer.parseInt(scanner.nextLine());
		    			if(menu==1) {
		    				System.out.print("�߰��Ͻ� ���̵� �������ּ���:");
		    				String user1=(scanner.nextLine());
		    				String a=user1;
		    				for(int i=0; i<user.length; i++) {
				    			if("-".equals(user[i])) {
				    				user[i]=a;
				    				break;
				    			}
				    		}
		    				System.out.print("�߰��Ͻ� ��й�ȣ�� �������ּ���:");
		    				user1=(scanner.nextLine());
		    				a=user1;
		    				for(int i=0; i<user.length; i++) {
				    			if("-".equals(userpw[i])) {
				    				userpw[i]=a;
				    				break;
				    			}
				    		}
		        		}else if(menu==2) {
		        			System.out.print("�����Ͻ� ���̵� �������ּ���:");
		    				String user1=(scanner.nextLine());
		    				String a=user1;
		    				for(int i=0; i<user.length; i++) {
				    			if(a.equals(user[i])) {
				    				user[i]="-";
				    				userpw[i]="-";
				    				userM[i]=0;
				    			}
				    		}
		        		}else if(menu==3) {
		        			System.out.println("====����� ����====");
		        			for(int i=0; i<user.length; i++) {
		        					System.out.println("id:"+user[i]+"\tpw:"+userpw[i]+"\t�ܾ�:"+userM[i]+"��");	        				
		        			}
		        		}else if(menu==4) {
		        			boolean flag3=true;
		        			System.out.print("ã���� id�� �������ּ���:");
		        			String name=(scanner.nextLine());
		        			for(int i=0; i<user.length; i++) {
		        				if(name.equals(user[i])) {
		        					System.out.println("ã���� ������ ����");
			        				System.out.println("id:"+user[i]+"\tpw:"+userpw[i]+"\t�ܾ�:"+userM[i]+"��");
			        				flag3=false;
		        				}else {
		        				}
		        			}
		        			if(flag3) {
		        				System.out.println("�ش� ������ ������ ã������ �����ϴ�.");
		        			}
		        		}else if(menu==5) {
		        			break;
		        		}
		    		}
		    	}else {
		    		boolean flag3=true;
		    		for(int i=0; i<user.length; i++) {
        				if(id.equals(user[i])) {
        					flag3=false;
        				}else {
        				}
        			}
		    		if(flag3) {
		    			System.out.println("ȸ������ ������ �����ϴ�");
		    		}else {
		    			System.out.println("pw�� �߸��Է��Ͽ����ϴ�.");
		    		}
		    	}
	    	}

	}
	public static int bank(String id,int a) {
		int money=0;
		java.util.Scanner scanner
		= new java.util.Scanner(System.in);
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
    			a=money;
    			return a;
    		}
		}
	}
	
	

}
