import java.util.Arrays;

public class ���迭����2���� {

	public static void main(String[] args) {
		
		
		//1~100������ ������ �� 10���� �����ϴ� arr �迭 ����
			int[] arr = new int[10];
			for(int i = 0; i<arr.length; i++) {
				arr[i] = (int)(Math.random()*45)+1;
			}
			System.out.println(Arrays.toString(arr));
				
				
			//3490���� ���� ������ ��� �ʿ����� �����غ���.
			int money = (int)(Math.random()*500)*10;
			int[] coin = {500, 100, 50, 10};
			System.out.println("�Ž����� : " + money + "��");
			for(int i = 0; i<coin.length; i++) {
				System.out.println(coin[i] + "��:" + money/coin[i] + "��");
				money = money % coin[i];
			}
			
			
			
			

	}

}
