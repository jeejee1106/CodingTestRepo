class print{
	public String deli;
	public void a() {		//a�޼��尡 ���� t1�ν��Ͻ��� �Ҽ��̱� ������ static�� ����� �Ѵ�.
		System.out.println(this.deli);
		System.out.println("a");
		System.out.println("a");
	}
	public void b() {		//b�޼��尡 ���� t2�ν��Ͻ��� �Ҽ��̱� ������ static�� ����� �Ѵ�.
		System.out.println(this.deli);
		System.out.println("b");
		System.out.println("b");
	}
}
public class a������2 {
	
	public static void main(String[] args) {
		
//		print.a("-");
//		print.b("-");
		
		//print��� Ŭ������ �ν��Ͻ��� t1
		print t1 = new print(); //t1�� print��� Ŭ������ �н��̶�� ���� ��
		t1.deli = "^^^";
		t1.a();
		t1.b();
		
//		print.a("*");
//		print.b("*");
		
		print t2 = new print();
		t2.deli = "*";
		t2.a();
		t2.b();
		
		
		
		
		
		
	}
	
}
