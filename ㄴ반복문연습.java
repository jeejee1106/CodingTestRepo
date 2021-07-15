
public class ㄴ반복문연습 {

	public static void main(String[] args) {
		
		//while 반복문
//		System.out.println("while 반복문");
//		int i = 0;	
//		while(i < 6) {
//			System.out.println("i가 6보다 작으면 계속 반복해." + i);
//			i++;
//		}
//		
//
//		//for 반복문
//		System.out.println("for 반복문");
//		for (int j = 0; j<6; j++) {
//			System.out.println("j가 6보다 작으면 계속 반복해." + j);
//		}
		
		//위에 쓴 while반복문과 for반복문은 같은 의미이다. 그러나 코드의 생김새나 효율이 완전 다르다.
		//for이 더 간결하지만 모든 상황에서 for이 더 효율적인건 아니다.
		//각 상황에 맞게 while과 for를 적절하게 사용할 줄 알아야 한다.
		
		//이중 for문 1 - 구구단!!!!
//		for(int i=2; i<=9; i++) {
//			for(int j=1; j<=9; j++) {
//				System.out.println(i+"*"+j+"="+(i*j));
//			}
//			System.out.println();
//		}
		
		//이중 for문 2 - 별을 한줄에 10개씩 5줄 만들기
//		for(int i = 1; i<=5; i++) {
//			for(int j = 1; j<=10; j++) {
//				System.out.print("*");
//			}
//			System.out.println(i);
//		}
//		
		
		//반복문의 제어 - break
//		System.out.println("반복문 제어 - break");
//		for(int a = 0; a<6; a++) {
//			if(a==3) {
//				break;
//			}
//			System.out.println("a가 6보다 작으면 계속 반복해." + a);
//		}
//		
//		int b = 0;
//		while(b<10) {
//			System.out.println("b가 10보다 작으면 계속 반복해"+b);
//			b++;
//			if(b==3)
//			break; //break의 위치에 따라 실행 결과가 달라짐.
//		}
//		
//		int c = 0;
//		while(c<10) {
//			System.out.println("c가 10보다 작으면 계속 반복해"+c);
//			if(c==3)
//			break;
//			c++; //break의 위치에 따라 실행 결과가 달라짐.
//		}
		
		//반복문의 제어 - continue
//		System.out.println("반복문 제어 - continue");
//		for(int b = 0; b<6; b++) {
//			if(b==2) {
//				continue;
//			}
//			System.out.println("b가 6보다 작으면 계속 반복해." + b);
//		}
		
		//반복문의 제어 - 이름붙은 반복문
		Loop1 : for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(j==5)
					break;
//					break Loop1;
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println();
		} //그냥 break와 이름을 붙인 Loop break는 쓰임이 다르다. 헷갈리면 주석을 다르게 줘가면서 다시 이해하면 된다.
		  //이름을 붙힌 브레이크는 이중 반복문 전체를 빠져나가게 해준다. 그냥 브레이크는 반복문 하나만 빠져나감!
	
		
		
		
		
		
		
		
		
	}

}
