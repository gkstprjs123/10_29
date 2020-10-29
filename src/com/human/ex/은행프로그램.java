package com.human.ex;

public class 은행프로그램 {

	public static void main(String[] args) {
		java.util.Scanner scanner=
				new java.util.Scanner(System.in);
		String people[]= {"홍길동","홍길남","홍길숙"};
		for(int i=0; i<people.length; i++) {
			for(;;) {
				if(people[i].equals("홍길동")) {
					System.out.println("●홍 길 동님●");
					System.out.print("아이디를 입력해주세요:");
					String id=(scanner.nextLine());
					System.out.print("패스워드를 입력해주세요:");
					String pw=(scanner.nextLine());
					if(id.equals("홍길동1")&&pw.equals("홍길동123")) {
						System.out.println("로그인 성공!\n");
						break;
					}else {
						System.out.println("※id와 패스워드를 다시 확인해주세요※\n");
					}
				}else if(people[i].equals("홍길남")) {
					System.out.println("●홍 길 남님●");
					System.out.print("아이디를 입력해주세요:");
					String id=(scanner.nextLine());
					System.out.print("패스워드를 입력해주세요:");
					String pw=(scanner.nextLine());
					if(id.equals("홍길남1")&&pw.equals("홍길남123")) {
						System.out.println("로그인 성공!\n");
						break;
					}else {
						System.out.println("※id와 패스워드를 다시 확인해주세요※\n");
					}
				}else if(people[i].equals("홍길숙")) {
					System.out.println("●홍 길 숙님●");
					System.out.print("아이디를 입력해주세요:");
					String id=(scanner.nextLine());
					System.out.print("패스워드를 입력해주세요:");
					String pw=(scanner.nextLine());
					if(id.equals("홍길숙1")&&pw.equals("홍길숙123")) {
						System.out.println("로그인 성공!\n");
						break;
					}else {
						System.out.println("※id와 패스워드를 다시 확인해주세요※\n");
					}
				}
			}
			int money=0;
			System.out.println(people[i]+"님 반갑습니다");
				for(;;) {
					   System.out.println("\n=====무엇을 이용하시겠습니까?======");
					   System.out.print("1.입금 2.출금 3.계좌이체 4.잔액조회 5.종료:");
					   int bankService=Integer.parseInt(scanner.nextLine());
					   if(bankService==1) {
						   System.out.print("얼마를 입금하시겠습니까?:");
						   int cash=Integer.parseInt(scanner.nextLine());		   
						   money+=cash;
					   }else if(bankService==2) {
						   System.out.print("얼마를 출금하시겠습니까?:");
						   int cash=Integer.parseInt(scanner.nextLine());		   
						   if(money>0&&money>=cash) {
							   money-=cash;
						   }else {
							   System.out.println("잔액부족");
						   }
					   }else if(bankService==3) {
						   System.out.print("이체하실 은행을 말씀해주세요:");
						   String bank2=(scanner.nextLine());
						   System.out.print("계좌번호를 말씀해주세요(-빼고 입력):");
						   String toss=(scanner.nextLine());
						   System.out.print("얼마를 출금하시겠습니까?:");
						   int cash=Integer.parseInt(scanner.nextLine());
						   System.out.println("한세건님에게 "+cash+" 원 이체하시는게 맞습니까?:");
						   System.out.print("1.예 2.아니오:");
						   int yesOrNo=Integer.parseInt(scanner.nextLine());
						   if(money>0&&yesOrNo==1&&money>=cash) {
							   money-=cash;
							   System.out.println("홍길동님에게 "+cash+"원 이체성공");
						   }else if(yesOrNo==1) {
							   if(money<=0||money<cash){
								   System.out.println("잔액부족");
							   }   
						   }else if(yesOrNo==2) {
							   System.out.println("승인거부");
						   }
					   }else if(bankService==4) {
						   System.out.println("고객님의 현재 잔고는 총"+money+"원 입니다");
					   }else if(bankService==5) {
						   System.out.println("\n이용해주셔서 감사합니다.\n");
					       break;
					   }else {
						   System.out.println("메뉴에 있는 버튼을 눌러주세요");
					   }
				}
			
		}

	}

}