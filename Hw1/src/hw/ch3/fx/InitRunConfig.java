package hw.ch3.fx;

//���x���ͽӿ�
interface  IPrintfHelper<T>{
	
	public void Print(T t);
	 
}
//��һ�N���F����
 class PrintfHelper<T> implements IPrintfHelper<T>{

	@Override
	public void Print(T t) {
		// TODO Auto-generated method stub
		System.out.println("����1��"+t);
	}
	
}
 
 
//�ڶ��N���F����
 class PrintfHelper2 implements IPrintfHelper<String>{

	@Override
	public void Print(String t) {
		// TODO Auto-generated method stub
		System.out.println("����2��"+t);
	}
	 
 }
// ���ͷ���
class VarFun {
	
	public static <T> T fun(T t) {
		return t;
	}
	
}
 
 
 
 

public class InitRunConfig {
	public static void main(String[] args) {
		for(String item : args) {
			System.out.println(item);
		}
//		���ͽӿ��{������
		IPrintfHelper<String> prStr = new PrintfHelper<String>();
		prStr.Print("���F��");
		IPrintfHelper<String> pr2 = new PrintfHelper2();
		pr2.Print("���F��");
// 		
		
	}
}