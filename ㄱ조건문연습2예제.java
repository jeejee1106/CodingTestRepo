
public class �����ǹ�����2���� {

	public static void main(String[] args) {
		
		//(1) int�� ���� a�� 10���� ũ�� 20���� ���� �� true�� ���ǽ�
		int a = 15;
		
		if(10<a && a<20) {
			System.out.println("true");
		}
		
		//(2) char�� ���� b�� �����̰� ���� �ƴ� �� true�� ���ǽ�
		char b = '��';
		if ((b==' ') && (b!='\t')) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
//		(3) char�� ���� c�� 'x' �Ǵ� 'X'�� �� true�� ���ǽ�
		char c = 'x';
		if (c=='x' || c=='X') {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
//		(4) char�� ���� d�� ����('0' ~ '9')�� �� true�� ���ǽ�
		char d = '5';
		if('0'<=d && d<='9') {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
//		(5) char�� ���� e�� ������(�빮�� �Ǵ� �ҹ���)�� ��, true�� ���ǽ� 
		char e = 'a';
		if(('a'<= e && e<='z') || ('A'<=e && e<='Z')) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
//		(6) �ڹ��ʵ��б����� 1�г���� 4�г���� �߰���� ������ ���Ҵ�. 4�г��� 70�� �̻��̸� �հ�, �� �̿��� �г��� 60�� �̻��̸� �հ��̴�. 
//		�̸� �Ǵ��ϴ� ���α׷��� �ۼ��غ���. ������ 0�̸� 100�ʰ��̸� ����� ���!
		//ù ��° �ڵ�.
//		int grade = 3;
//		int score = 100;
//		if((grade == 4 && 70<=score && score<=100) || (grade<4 && 60<=score && score<=100)) {
//			System.out.println("�հ�");
//		} else if(grade<=4 && (score<0 || score>100)) {
//			System.out.println("�����");
//		} else if(grade>4) {
//			System.out.println("1~4�г� �߿� ������ �ּ���");
//		} else {
//			System.out.println("���հ�");
//		}
		
		//�ڵ帮�� �� �ڵ�.
		int grade = 5;
		int score = 60;
		if((0>score || score>100) || (grade<1 || grade>4)) {
			System.out.println("�����");
		} else if((grade==4 && score>=70) || ((grade<4) && score>=60)) {
			System.out.println("�հ�");
		} else {
			System.out.println("���հ�");
		}
		
		
//		(7)����ڷκ��� Ű�� �Է¹޴´�. �Է¹��� Ű�� 150 �̻��̸� ���̱ⱸ �̿� ����, 150 �̸��̸� �θ�� �Բ� �Դ��� �� �� �� ���´�. 
//		 �Բ� �Դٸ� 1���� �Է¹ް�, ȥ�� �Դٸ� 0�� �Է¹޴´�. [1�� �Է�: ���� �ð� ������~] [0�� �Է�: � ��ð� �ٽ� ����~]
		int h = 150;
		int f = 1; //�θ�԰� �Բ� �� ���1, ȥ�� ȥ ���0
		
		if(h<150) {
			System.out.println("�θ�԰� �Բ� �Գ���?");
			if(f==1) {
				System.out.println("���� �ð� ������~");
			} else {
				System.out.println("� ��ð� �ٽ� ����~");
			}
		} else {
			System.out.println("���̱ⱸ �̿� ����");
		}
		//����...�̰� �´°ǰ�...? �� �̻�...
		
		
		
		
		
		
		
		
		
	}

}
