
public class ���ݺ�������2���� {

	public static void main(String[] args) {
		
		//(1) 1���� 100���� ���� ���� ���ض�.
//		int sum = 0;
//		for(int i = 1; i<=100; i++) {
//			sum += i;		//sum += i��       sum = sum + i �� ���� ǥ���̶�� �����Ͻø� �˴ϴ�.
//		}
//		System.out.println(sum); //5050
		
		
		//(2) 1���� 100���� �� ���� ����� ���ض�.
//		for(int i = 1; i<=100; i++) {
//			System.out.print(i+"�� �����");
//			for(int j = 1; j<=i; j++) {
//				if(i % j == 0) {
//					System.out.print(j+",");
//				}
//			} System.out.println();
//		}
		
		
		//(3) 1���� 100������ ���� �� �Ҽ��� ���ض�.
//		for(int i = 2; i<=100; i++) {
//			for(int j = 2; j<=i; j++) {
//				if(i!=j && i%j==0)break;
//				if(i==j) {
//					System.out.println(i);
//				} 
//			}
//		}
		
		
		//(4) 1���� 100������ ���� �� 3�� ����� ���ض�.
//		for(int i = 3; i<=100; i++) {
//			if(i%3==0)
//				System.out.println(i);
//		}
		
		
		//(5) 1���� 100������ ���� �� Ȧ���� ���� ���ض�.
//		int sum = 0;
//		for(int i = 1; i<=100; i++) {
//			if(i%2 != 0) {
//				sum += i;
//			} 
//		} System.out.println(sum); //2500
		
		
		//(6) 1���� 100������ ���� �� ¦���� ���� ���ض�. //�� ������ ���� �����ε� �ڵ带 �ٸ��� ¥��
//		int sum = 0;
//		for(int i = 2; i<=100; i+=2) {
//			sum += i;
//		} System.out.println(sum); //2550
		
		
		//(7) 1~100�� 3�� ����̸鼭 5�� ����� ���� ���ϰ� �׵��� ���� ���ض�.
		int sum = 0;
		System.out.println("3�� ����̸鼭 5�� ����� ����");
		for(int i=1; i<=100; i++) {
				if((i%3==0) && (i%5==0)) {
					sum += i;
					System.out.print(i+",");
				}
		} System.out.println("");
		System.out.println("3�� ����̸鼭 5�� ����� ������ ����"+sum);
		
		
		// �����1 - 10���� 10��
		for(int j = 1; j<=10; j++) {
			for(int i=1; i<=10; i++)
				System.out.print("��");
				System.out.println();
		}
		
		// �����2 - �ϳ��� �þ��(��������)
		for(int i=1; i<=10; i++) {
			for(int j =1; j<=i; j++)
			System.out.print("��");
			System.out.println();
		}
		
		// �����3 - �ϳ��� �پ���(��������)
		for(int i=1; i<=10; i++) {
			for(int j=10; j>=i; j--) {
				System.out.print("��");
			} System.out.println();
		}
			
		// �����4 - �ϳ��� �þ��(������ ����)
		for(int i = 1; i<=10; i++) {
			for(int j = 10; j>=1; j--) {
				if(i>=j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}System.out.println();
		}
		
		//�����5 - �ϳ��� �پ���(������ ����)
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
		
		// �����6 - �Ƕ�̵�
		for(int i = 0; i<=10; i++) {
			for(int j = 1; j<=(10-i); j++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=(2*i)+1; j++) {
				System.out.print("*");
			} System.out.println();
		} 
		
		// �����7 - ���Ƕ�̵�
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
