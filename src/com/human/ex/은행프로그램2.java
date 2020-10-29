package com.human.ex;

public class 은행프로그램2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//사용자 정보 id pw 잔액
		//프로그램 종료 할려면 id:exit 입력
		java.util.Scanner scanner
		= new java.util.Scanner(System.in);
	    	for(;;) {
	    		String information0[]= {"홍길동","1234",""};
	    		String information1[]= {"홍길남","1234",""};
	    	    String information2[]= {"홍길숙","1234",""};
	    		int money=0;
	    		System.out.println("아이디와 pw를 입력해주세요");
		    	System.out.print("id>>");
		    	String id=(scanner.nextLine());
		    	System.out.print("pw>>");
		    	String pw=(scanner.nextLine());
		    	if(id.equals("홍길동")&&pw.equals("1234")) {
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
			    			information0[2]+=money;
			    			break;
			    		}
		    		}
		    	}else if(id.equals("홍길남")&&pw.equals("1234")) {
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
			    			information1[2]+=money;
			    			break;
			    		}
		    		}
		    	}else if(id.equals("홍길숙")&&pw.equals("1234")) {
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
			    			information2[2]+=money;
			    			break;
			    		}
		    		}
		    	}else if(id.equals("admin")&&pw.equals("1111")) {
		    		for(;;) {
		    			System.out.println("1.계정추가 2.계정삭제 3.모든 사용자 정보확인 4.id로 특정 사용자 정보확인 5.종료");
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
			    			information2[2]+=money;
			    			break;
			    		}
		    		}
		    	}else {	    	
		    		System.out.println("id와 pw를 확인해주세요");
		    	}
		    	if(id.equals("exit")) {
		    		
		    	}
	    	}	    	
	    	
	    	
	    
	}

}
