package day0813;
//Thread�� ��ӹ޾Ƽ� Ex01Thread_extends Ŭ������ �ϳ��� �����尡 �Ǿ���!!
public class Ex01Thread_extends extends Thread {
	String name;
	int num;
	
	public Ex01Thread_extends(String name, int num) {
		this.name=name;
		this.num=num;
	}
	
	@Override
	public void run() {
		super.run();
		
		for(int i = 1; i<300; i++) {
			System.out.println(name + "������ ���� =>" + i);
		}
	}
	
	public static void main(String[] args) {
		
		Ex01Thread_extends t1 = new Ex01Thread_extends("1��", 300);		
		Ex01Thread_extends t2 = new Ex01Thread_extends("2��", 300);		
		Ex01Thread_extends t3 = new Ex01Thread_extends("3��", 300);  //������ �� 3�� ��������
 
		t1.start();
		t2.start();
		t3.start();
		
		//��Ƽ ������� ȣ������� ���� ��µ��� �ʴ´�. OS�����ٷ��� ���� ��½ð��� ������ �����ȴ�.
		
	}

}
