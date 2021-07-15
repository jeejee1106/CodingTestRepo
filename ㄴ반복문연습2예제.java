
public class ㄴ반복문연습2예제 {

	public static void main(String[] args) {
		
		//(1) 1부터 100까지 더한 값을 구해라.
//		int sum = 0;
//		for(int i = 1; i<=100; i++) {
//			sum += i;		//sum += i는       sum = sum + i 의 줄임 표현이라고 생각하시면 됩니다.
//		}
//		System.out.println(sum); //5050
		
		
		//(2) 1부터 100까지 각 수의 약수를 구해라.
//		for(int i = 1; i<=100; i++) {
//			System.out.print(i+"의 약수는");
//			for(int j = 1; j<=i; j++) {
//				if(i % j == 0) {
//					System.out.print(j+",");
//				}
//			} System.out.println();
//		}
		
		
		//(3) 1부터 100까지의 숫자 중 소수를 구해라.
//		for(int i = 2; i<=100; i++) {
//			for(int j = 2; j<=i; j++) {
//				if(i!=j && i%j==0)break;
//				if(i==j) {
//					System.out.println(i);
//				} 
//			}
//		}
		
		
		//(4) 1부터 100까지의 숫자 중 3의 배수를 구해라.
//		for(int i = 3; i<=100; i++) {
//			if(i%3==0)
//				System.out.println(i);
//		}
		
		
		//(5) 1부터 100까지의 숫자 중 홀수의 합을 구해라.
//		int sum = 0;
//		for(int i = 1; i<=100; i++) {
//			if(i%2 != 0) {
//				sum += i;
//			} 
//		} System.out.println(sum); //2500
		
		
		//(6) 1부터 100까지의 숫자 중 짝수의 합을 구해라. //위 예제랑 같은 문제인데 코드를 다르게 짜봄
//		int sum = 0;
//		for(int i = 2; i<=100; i+=2) {
//			sum += i;
//		} System.out.println(sum); //2550
		
		
		//(7) 1~100중 3의 배수이면서 5의 배수인 수를 구하고 그들의 합을 구해라.
		int sum = 0;
		System.out.println("3의 배수이면서 5의 배수인 수는");
		for(int i=1; i<=100; i++) {
				if((i%3==0) && (i%5==0)) {
					sum += i;
					System.out.print(i+",");
				}
		} System.out.println("");
		System.out.println("3의 배수이면서 5의 배수인 수들의 합은"+sum);
		
		
		// 별찍기1 - 10개씩 10줄
		for(int j = 1; j<=10; j++) {
			for(int i=1; i<=10; i++)
				System.out.print("☆");
				System.out.println();
		}
		
		// 별찍기2 - 하나씩 늘어나게(왼쪽정렬)
		for(int i=1; i<=10; i++) {
			for(int j =1; j<=i; j++)
			System.out.print("★");
			System.out.println();
		}
		
		// 별찍기3 - 하나씩 줄어들게(왼쪽정렬)
		for(int i=1; i<=10; i++) {
			for(int j=10; j>=i; j--) {
				System.out.print("☆");
			} System.out.println();
		}
			
		// 별찍기4 - 하나식 늘어나게(오른쪽 정렬)
		for(int i = 1; i<=10; i++) {
			for(int j = 10; j>=1; j--) {
				if(i>=j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}System.out.println();
		}
		
		//별찍기5 - 하나씩 줄어들게(오른쪽 정렬)
		for(int i = 1; i<=10; i++) {
			for(int j = 1; j<=10; j++) {
				if(i<=j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}System.out.println();
		}
		System.out.println();
		
		// 별찍기6 - 피라미드
		for(int i = 0; i<=10; i++) {
			for(int j = 1; j<=(10-i); j++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=(2*i)+1; j++) {
				System.out.print("*");
			} System.out.println();
		} 
		
		// 별찍기7 - 역피라미드
		for(int i = 1; i<=11; i++) {
			for(int j = 1; j<i; j++) {
				System.out.print(" ");
			}
			for(int j = 23; j>=(i*2+1); j--) {
				System.out.print("*");
			} System.out.println();
		}
		
		
		
		
		
		
	}

}
