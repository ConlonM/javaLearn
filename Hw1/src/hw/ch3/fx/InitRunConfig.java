package hw.ch3.fx;

//定義泛型接口
interface  IPrintfHelper<T>{
	
	public void Print(T t);
	 
}
//第一種實現方法
 class PrintfHelper<T> implements IPrintfHelper<T>{

	@Override
	public void Print(T t) {
		// TODO Auto-generated method stub
		System.out.println("方法1："+t);
	}
	
}
 
 
//第二種實現方法
 class PrintfHelper2 implements IPrintfHelper<String>{

	@Override
	public void Print(String t) {
		// TODO Auto-generated method stub
		System.out.println("方法2："+t);
	}
	 
 }
// 泛型方法
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
//		泛型接口調用例子
		IPrintfHelper<String> prStr = new PrintfHelper<String>();
		prStr.Print("實現了");
		IPrintfHelper<String> pr2 = new PrintfHelper2();
		pr2.Print("實現了");
// 		
		
	}
}
