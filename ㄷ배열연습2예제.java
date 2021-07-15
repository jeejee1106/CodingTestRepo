import java.util.Arrays;

public class ㄷ배열연습2예제 {

	public static void main(String[] args) {
		
		
		//1~100사이의 랜덤한 수 10개를 저장하는 arr 배열 생성
			int[] arr = new int[10];
			for(int i = 0; i<arr.length; i++) {
				arr[i] = (int)(Math.random()*45)+1;
			}
			System.out.println(Arrays.toString(arr));
				
				
			//3490원에 각각 동전이 몇개씩 필요한지 추출해보자.
			int money = (int)(Math.random()*500)*10;
			int[] coin = {500, 100, 50, 10};
			System.out.println("거스름돈 : " + money + "원");
			for(int i = 0; i<coin.length; i++) {
				System.out.println(coin[i] + "원:" + money/coin[i] + "개");
				money = money % coin[i];
			}
			
			
			
			

	}

}
