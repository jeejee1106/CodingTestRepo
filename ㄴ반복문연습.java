
public class ���ݺ������� {

	public static void main(String[] args) {
		
		//while �ݺ���
//		System.out.println("while �ݺ���");
//		int i = 0;	
//		while(i < 6) {
//			System.out.println("i�� 6���� ������ ��� �ݺ���." + i);
//			i++;
//		}
//		
//
//		//for �ݺ���
//		System.out.println("for �ݺ���");
//		for (int j = 0; j<6; j++) {
//			System.out.println("j�� 6���� ������ ��� �ݺ���." + j);
//		}
		
		//���� �� while�ݺ����� for�ݺ����� ���� �ǹ��̴�. �׷��� �ڵ��� ������� ȿ���� ���� �ٸ���.
		//for�� �� ���������� ��� ��Ȳ���� for�� �� ȿ�����ΰ� �ƴϴ�.
		//�� ��Ȳ�� �°� while�� for�� �����ϰ� ����� �� �˾ƾ� �Ѵ�.
		
		//���� for�� 1 - ������!!!!
//		for(int i=2; i<=9; i++) {
//			for(int j=1; j<=9; j++) {
//				System.out.println(i+"*"+j+"="+(i*j));
//			}
//			System.out.println();
//		}
		
		//���� for�� 2 - ���� ���ٿ� 10���� 5�� �����
//		for(int i = 1; i<=5; i++) {
//			for(int j = 1; j<=10; j++) {
//				System.out.print("*");
//			}
//			System.out.println(i);
//		}
//		
		
		//�ݺ����� ���� - break
//		System.out.println("�ݺ��� ���� - break");
//		for(int a = 0; a<6; a++) {
//			if(a==3) {
//				break;
//			}
//			System.out.println("a�� 6���� ������ ��� �ݺ���." + a);
//		}
//		
//		int b = 0;
//		while(b<10) {
//			System.out.println("b�� 10���� ������ ��� �ݺ���"+b);
//			b++;
//			if(b==3)
//			break; //break�� ��ġ�� ���� ���� ����� �޶���.
//		}
//		
//		int c = 0;
//		while(c<10) {
//			System.out.println("c�� 10���� ������ ��� �ݺ���"+c);
//			if(c==3)
//			break;
//			c++; //break�� ��ġ�� ���� ���� ����� �޶���.
//		}
		
		//�ݺ����� ���� - continue
//		System.out.println("�ݺ��� ���� - continue");
//		for(int b = 0; b<6; b++) {
//			if(b==2) {
//				continue;
//			}
//			System.out.println("b�� 6���� ������ ��� �ݺ���." + b);
//		}
		
		//�ݺ����� ���� - �̸����� �ݺ���
		Loop1 : for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(j==5)
					break;
//					break Loop1;
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println();
		} //�׳� break�� �̸��� ���� Loop break�� ������ �ٸ���. �򰥸��� �ּ��� �ٸ��� �డ�鼭 �ٽ� �����ϸ� �ȴ�.
		  //�̸��� ���� �극��ũ�� ���� �ݺ��� ��ü�� ���������� ���ش�. �׳� �극��ũ�� �ݺ��� �ϳ��� ��������!
	
		
		
		
		
		
		
		
		
	}

}
