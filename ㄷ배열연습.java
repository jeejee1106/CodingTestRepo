import java.util.Arrays;

public class ���迭���� {

	public static void main(String[] args) {
		
		//�迭�� Ȱ��(1) - ����, ��� ���ϱ�.
//		int sum = 0;
//		float average = 0f;
//		
//		int[] score = {65, 100, 95, 80, 75, 100};
//		
//		for(int i=0; i<score.length; i++) {
//			sum += score[i];
//		} average = (float)sum/score.length; //�� �÷��� Ÿ������ ���������ֱ�.(����� �Ҽ����� ���;� �ϴϱ�)
//		
//		System.out.println(sum);
//		System.out.println(average);
		
		
		//�迭�� Ȱ��(2) - �ִ�, �ּڰ� ���ϱ�.
//		int[] score1 = {80, 55, 71, 20, 96, 100};
//		int max = score1[0];
//		int min = score1[0];
//		
//		for(int i = 1; i<score1.length; i++) {
//			if(score1[i]>max) {
//				max = score1[i];
//			} else if(score1[i]<min) {
//				min = score1[i];
//			}
//		} 
//		System.out.println("max : "+max);
//		System.out.println("min : "+min);
		
		
		//�迭�� Ȱ��(3) - �ζǹ�ȣ ���ϱ�
		int[] ball = new int[45];
		for(int i = 0; i<ball.length; i++)
			ball[i] = i+1;
//		System.out.println(Arrays.toString(ball));
		
		int tmp = 0;
		int j = 0;
		for(int i = 0; i<6; i++) {
			j = (int)(Math.random()*45);
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
			System.out.println(Arrays.toString(ball));
		}
		
		for(int i=0; i<6; i++) {
			System.out.printf("ball[%d]=%d%n",i,ball[i]);
		}
		
		
		//�迭�� Ȱ��(4) - ���� ���� �� ���� �����(String�迭)
//		String[] str = {"����", "����", "��"};
//		for(int i = 0; i<10; i++) {
//			int tem = (int)(Math.random()*3);
//			System.out.println(str[tem]);
//		}

		
		//2���� �迭
//		int[][] score2 = {
//				{100, 90, 80},
//				{70, 60, 50},
//				{40, 30, 20},
//				{10, 5, 0}
//		};
//		int sum2 = 0;
//		
//		for(int i = 0; i<score2.length; i++) {
//			for(int j = 0; j<score2[i].length; j++) {
//				System.out.printf("score2[%d][%d]=%d%n", i, j, score2[i][j]);
//				
//				sum2 += score2[i][j];
//			} //2���� �迭�� �̷������� 2�� for���� ������ �� �� �ۿ� ����. �� ���� �׳� �ܿ� ��.
//		} System.out.println("sum2="+sum2);
		
		
		//2���� �迭 ����!!!!!!! �ϼ� ����.
//		int[][] score = {
//				 {100, 100, 100}
//				,{80, 80, 80}
//				,{65, 65, 65}
//				,{40, 40, 40}
//				,{25, 25, 25}
//		};
//		
//		int korTotal = 0, engTotal = 0, mathTotal = 0; // ���� ����
//		
//		System.out.println("��ȣ     ����     ����     ����     ����     ���");
//		System.out.println("============================");
//		
//		for(int i = 0; i<score.length; i++) {
//			int sum = 0;  // ���κ� ����
//			float average = 0.0f; // ���κ� ���
//			
//			korTotal += score[i][0];
//			engTotal += score[i][1];
//			mathTotal += score[i][2];
//			System.out.printf("%3d",i+1);
//			
//			for(int j = 0; j<score[i].length; j++) {
//				sum += score[i][j];
//				System.out.printf("%5d", score[i][j]);
//			} System.out.println();
//			
////			average = (float)sum/score[i].length;
//			
//		}
		
		
		
		
		

	}

}
