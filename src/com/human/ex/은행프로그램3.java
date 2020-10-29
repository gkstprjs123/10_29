package com.human.ex;

import java.util.Arrays;

public class 은행프로그램3 {

	public static void main(String[] args) {
		java.util.Scanner scanner
		= new java.util.Scanner(System.in);
		String user[]= {"-","-","-","-","-","-","-","-","-","-"};
		String userpw[]= {"-","-","-","-","-","-","-","-","-","-"};
		int userM[]={0,0,0,0,0,0,0,0,0,0};
	    	for(;;) {
	    		boolean flag=false;
	    		System.out.println("아이디와 pw를 입력해주세요");
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
		    		System.out.println("관리자님이 로그인하셨습니다.");
		    		for(;;) {
		    			System.out.println("1.계정추가 2.계정삭제 3.모든 사용자 정보확인 4.id로 특정 사용자 정보확인 5.종료");
		    			int menu=Integer.parseInt(scanner.nextLine());
		    			if(menu==1) {
		    				System.out.print("추가하실 아이디를 말씀해주세요:");
		    				String user1=(scanner.nextLine());
		    				String a=user1;
		    				for(int i=0; i<user.length; i++) {
				    			if("-".equals(user[i])) {
				    				user[i]=a;
				    				break;
				    			}
				    		}
		    				System.out.print("추가하실 비밀번호를 말씀해주세요:");
		    				user1=(scanner.nextLine());
		    				a=user1;
		    				for(int i=0; i<user.length; i++) {
				    			if("-".equals(userpw[i])) {
				    				userpw[i]=a;
				    				break;
				    			}
				    		}
		        		}else if(menu==2) {
		        			System.out.print("삭제하실 아이디를 말씀해주세요:");
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
		        			System.out.println("====사용자 정보====");
		        			for(int i=0; i<user.length; i++) {
		        					System.out.println("id:"+user[i]+"\tpw:"+userpw[i]+"\t잔액:"+userM[i]+"원");	        				
		        			}
		        		}else if(menu==4) {
		        			boolean flag3=true;
		        			System.out.print("찾으실 id를 말씀해주세요:");
		        			String name=(scanner.nextLine());
		        			for(int i=0; i<user.length; i++) {
		        				if(name.equals(user[i])) {
		        					System.out.println("찾으신 고객님의 정보");
			        				System.out.println("id:"+user[i]+"\tpw:"+userpw[i]+"\t잔액:"+userM[i]+"원");
			        				flag3=false;
		        				}else {
		        				}
		        			}
		        			if(flag3) {
		        				System.out.println("해당 고객님의 정보를 찾을수가 없습니다.");
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
		    			System.out.println("회원님의 정보가 없습니다");
		    		}else {
		    			System.out.println("pw를 잘못입력하였습니다.");
		    		}
		    	}
	    	}

	}
	public static int bank(String id,int a) {
		int money=0;
		java.util.Scanner scanner
		= new java.util.Scanner(System.in);
		System.out.println(id+"님이 로그인 하셨습니다.");
		for(;;) {
			System.out.println("1.입금 2.출금 3.조회 4.종료");
    		int menu=Integer.parseInt(scanner.nextLine());
    		if(menu==1) {
    			System.out.print("입금하실 금액을 적어주세요:");
    			int money2=Integer.parseInt(scanner.nextLine());
    			money+=money2;
    		}else if(menu==2) {
    			System.out.print("출금하실 금액을 적어주세요:");
    			int money2=Integer.parseInt(scanner.nextLine());
    			if(money>0&&money>money2) {
    				money-=money2;
    			}else {
    				System.out.println("잔액 부족");
    			}
    		}else if(menu==3) {
    			System.out.println("고객님이 통장 잔고는"+money+"원 입니다");
    			
    		}else if(menu==4) {
    			a=money;
    			return a;
    		}
		}
	}
	
	

}
