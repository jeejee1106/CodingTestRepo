
public class �����ǹ����� {

	public static void main(String[] args) {
		
		//�α��� ù ��° ����.
//		String id = args[0];
//		String inputid = "minjee";
//		
//		String pass = args[1];
//		String inputpass = "1111";
//		
//		if(id.equals(inputid) && pass.equals(inputpass)) {
//			System.out.println("hi, master");
//		} else {
//			System.out.println("who are you?");
//		}
		
		
		
		//�α��� �� ��° ����.
//		String id = args[0];
//		String inputid = "minjee";
//		
//		String pass = args[1];
//		String inputpass = "1111";
//		
//		if(id.equals(inputid) && pass.equals(inputpass)) {
//			System.out.println("ȯ���մϴ�.");
//		}
//		else if(!id.equals(inputid)) {
//			System.out.println("���̵� Ȯ���ϼ���.");
//		}
//		else if(!pass.equals(inputpass)) {
//			System.out.println("��й�ȣ�� Ȯ���ϼ���.");
//		}
//		else {
//			System.out.println("��ġ�ϴ� ������ �����ϴ�.");
//		}
//			
		
		
		//�α��� �� ��° ����.
//		String id = args[0];
//		String inputid = "minjee";
//		
//		String pass = args[1];
//		String inputpass = "1111";
//		
//		if(!id.equals(inputid)) {
//			System.out.println("���̵� Ȯ���ϼ���.");
//			return;
//		}
//		if(!pass.equals(inputpass)) {
//			System.out.println("��й�ȣ�� Ȯ���ϼ���.");
//			return;
//		}
//		if(id.equals(inputid) && pass.equals(inputpass)) {
//			System.out.println("ȯ���մϴ�.");
//		}

		
		
		//�α��� �� ��° ����.
//		String id = args[0];
//		String inputid = "minjee";
//		
//		String pass = args[1];
//		String inputpass = "1111";
//		
//		if(!id.equals(inputid) || !pass.equals(inputpass)) {
//			System.out.println("���̵� Ȥ�� ��й�ȣ�� Ȯ���ϼ���.");
//			return;
//		}
//		if(id.equals(inputid) && pass.equals(inputpass)) {
//			System.out.println("ȯ���մϴ�.");
//		}
		
		
		// ���� ����
		String id = "minjee";
		int score = 4;
		char grade = 'F'; //������ �ƴ� F�� �θ� ������ else�� �����ص� �ȴ�.
		                  //else�� �����ϴ� ���� �� ȿ�����̶�� ��.
		
		System.out.println("�ȳ��ϼ���.");
		System.out.println(id+"��");
		if (90 <= score) {
			grade = 'A';
		} else if (80 <= score) {
			grade = 'B';
		} else if (70 <= score) {
			grade = 'C';
		} else if (60 <= score) {
			grade = 'D';
		}
//		else {
//			grade = 'F';
//		}
		System.out.println("����� ������ " + grade + " �Դϴ�.");
		
		
		//switch�� ����
		int month = 7;
		switch(month) {
			case 3:
			case 4:
			case 5: //�̷��� ������ ������ �ᵵ �ǰ�,
				System.out.println("���� ������ ���Դϴ�.");
				break;
			case 6: case 7: case 8: //�̷��� �� �ٷ� �ᵵ �ȴ�.
				System.out.println("���� ������ �����Դϴ�.");
				break;
			case 9 : case 10 : case 11 :
				System.out.println("���� ������ �����Դϴ�.");
				break;
			default:
				System.out.println("���� ������ �ܿ��Դϴ�.");
		
		} // break�� ���� ������ ���ǿ� �ش��ϴ� case�� ���� case������ ������ ������ �ȴ�.
		  // default�� if���ǹ����� else�� ���� ������ �Ѵ�.
		  // swich���� byte, short, int, enum, String, Character, Byte, Short, Intrger�� ��� �����ϴ�
		
		
		
		
		
	}

}
