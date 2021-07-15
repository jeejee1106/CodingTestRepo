//import java.util.Arrays;

public class a낙서장 {

	public static void main(String[] args) {
		

		//1~10까지 랜덤으로 숫자 구하기.(20번)
//		for(int i = 1; i<=20; i++) {
//			System.out.println(Math.random()); // 0.0 <= i < 1.0
//			System.out.println(Math.random()*10); // 0.0 <= i <10.0
//			System.out.println((int)(Math.random()*10)); // 0 <= i <10 
//			System.out.println((int)(Math.random()*10+1)); // 1 <= i <11
//		}
		
		//-5~5까지 랜덤으로 숫자 구하기.(20번)
//		for(int x = 1; x<=20; x++) {
//			System.out.println((int)(Math.random()*11)-5);
//		}
		
		
		//1부터 10까지의 합
//		int sum = 0;
//		for(int i = 1; i<=10; i++) {
//			sum += i;
//		} System.out.println(sum);
//		
//		
		
		//1부터 100까지 6의 배수 구하기(가능하면 합도)
//		int sum = 0;
//		for(int i=6; i<=100; i+=6) {
//			sum += i;
//		} System.out.println(sum);
		
//		int sum = 0;
//		for(int i=1; i<=100; i++) {
//			if(i%6==0) {
//				sum += i;
//			}
//		} System.out.println(sum);
		
	
		
//		int[] score = {100, 20, 71, 60, 96, 100};
//		int max = score[0];
//		int min = score[0];
//		
//		for(int i = 1; i<score.length; i++) {
//			if(score[i]>max) {
//				max = score[i];
//			} else if(score[i]<min) {
//				min = score[i];
//			}
//		} 
//		System.out.println("max : "+max);
//		System.out.println("min : "+min);
		
//		int[] num = {0,1,2,3,4,5,6,7,8,9};
//		for(int i=0; i<num.length; i++) {
//			int n = (int)(Math.random()*10);
//			int tem = num[i];
//			num[i] = num[n];
//			num[n] = tem;
//			System.out.println(Arrays.toString(num));
//		} 
		
//		int[] ball = new int[45];
//		for(int i = 0; i<ball.length; i++)
//			ball[i] = i+1;
//		System.out.println(Arrays.toString(ball));
		
//		String str = "012345";
//		String tmp = str.substring(1,4);
//		System.out.println(tmp);
		
		
		
//		거스름돈에 동전의 단위마다 몇개의 동전이 필요한지 출력해주세요.
//		ex) 거스름돈 : 2860원 / 500원 : 5개 / 100원 : 3개 / 50원 : 1개 / 10원 : 1개
		
		
//		int money = 2860; 
//		int[] coin = {500, 100, 50, 10};
//			System.out.println("거스름돈 : " + money + "원");
//
//		for(int i = 0; i < coin.length; i++){
//			System.out.println(coin[i] + "원 : " + money/coin[i] + "개");
//			    money = money % coin[i];
//		}
		
		
//		상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다.
//		설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
//		상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다.
//		예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만, 
//		5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.
//		상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
		
		int n = (int)(Math.random()*100);
//		System.out.println(n);
		int[] nkg = {3, 5};
		System.out.println("배달할 설탕 : " + n + "kg");
		for(int i = 0; i<nkg.length; i++) {
			System.out.println(nkg[i] + "kg" + n/nkg[i] + "개");
			n = n % nkg[i];
		}
		
		
		
		
		
//		for(int i = 0; i<10; i++) {
//			for(int j=0; j<10; j++) {
//				System.out.print("★");
//			}System.out.println();
//			
//		}
	
		
//		
//		// 별찍기5 - 피라미드
//		for(int i = 0; i<=10; i++) {
//			for(int j = 1; j<=(10-i); j++) {
//				System.out.print(" ");
//			}
//			for(int j = 1; j<=(2*i)+1; j++) {
//				System.out.print("*");
//			} System.out.println();
//		} 
//		
//		// 별찍기6 - 역피라미드
//		for(int i = 1; i<=11; i++) {
//			for(int j = 1; j<i; j++) {
//				System.out.print(" ");
//			}
//			for(int j = 23; j>=(i*2+1); j--) {
//				System.out.print("*");
//			} System.out.println();
//		}
		
		
		
//		//1~100사이의 랜덤한 수 10개를 저장하는 arr 배열 생성
//		int[] arr = new int[10];
//		for(int i = 0; i<arr.length; i++) {
//			arr[i] = (int)(Math.random()*45)+1;
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		
//		//3490원에 각각 동전이 몇개씩 필요한지 추출해보자.
//		int money = (int)(Math.random()*500)*10;
//		int[] coin = {500, 100, 50, 10};
//		System.out.println("거스름돈 : " + money + "원");
//		for(int i = 0; i<coin.length; i++) {
//			System.out.println(coin[i] + "원:" + money/coin[i] + "개");
//			money = money % coin[i];
//		}
		
		
		
		
//		int j = 3;
//		System.out.println(j++); //3
//		System.out.println(j++); //4
//		System.out.println(j); //5
//		
//		int i = 3;
//		System.out.println(++i); //4
//		System.out.println(++i); //5
//		System.out.println(i); //5
		
		//i++과 ++i의 차이점
		//i++은 숫자 먼저, 더하기는 나중이기 때문에 첫 줄은 변수 3이 그대로 출력이 되고, 다음 코드에서 +1이 된 4가 출력이 된다.
		
//		String[] hitter = {"원준", "선빈", "형우", "창진"};
//		for(int i = 0; i<hitter.length; i++) {
//			System.out.println(hitter[i] + "선수의 차례입니다.");
//		}
//		System.out.println("경기가 종료되었습니다.");
		
//		String[] hitter = {"원준", "선빈", "형우", "창진"};
//		for(String e : hitter) {
//			System.out.println(e + "선수의 차례입니다.");
//		} System.out.println("경기종료");
		
	}

}
