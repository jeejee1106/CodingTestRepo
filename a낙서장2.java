class print{
	public String deli;
	public void a() {		//a메서드가 지금 t1인스턴스의 소속이기 때문에 static을 빼줘야 한다.
		System.out.println(this.deli);
		System.out.println("a");
		System.out.println("a");
	}
	public void b() {		//b메서드가 지금 t2인스턴스의 소속이기 때문에 static을 빼줘야 한다.
		System.out.println(this.deli);
		System.out.println("b");
		System.out.println("b");
	}
}
public class a낙서장2 {
	
	public static void main(String[] args) {
		
//		print.a("-");
//		print.b("-");
		
		//print라는 클래스의 인스턴스인 t1
		print t1 = new print(); //t1은 print라는 클래스의 분신이라고 보면 됨
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
