package hw.ch1;

class Person{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

interface IMessage{
	public void fun();
}

class MessageImpl implements IMessage {

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		
	}
	
}

public class caseClassMain {
	public static void main(String[] args) {
		System.out.print("HelloWord");
		System.out.println("���Կ�ݼ�");
		System.out.println("���Կ�ݼ��������");
	}
}
  