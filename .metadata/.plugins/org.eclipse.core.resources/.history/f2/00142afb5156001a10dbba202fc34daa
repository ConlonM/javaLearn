package hw.ch4.enumCase;

//常规枚举用法
enum colorType {
	Red,Green,blue
}
//枚举类的其他特性
enum colorType2 {
	Red("紅色"),Green("綠色"),blue("藍色");//枚举对象必须写在第一行

	private String title;//枚举属性值
	
	private colorType2(String title) {
		this.title = title;		
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return this.title;
	}
	

	
}

enum clorType2{
	
	
}

public class enumCase {
	
	public static void main(String[] args) {

		System.out.println(colorType.blue.name()+"="+colorType.blue.ordinal());
		for(colorType item : colorType.values()) {
			System.out.println(item.name()+"="+item.ordinal());
		}
		for(colorType2 item : colorType2.values()) {
			System.out.println(item.name()+"="+item.ordinal()+"="+item);
		}
	}
}

//請解釋enum和	Enum的區別
//enum 是一個關鍵字，使用enum关键字定义的类本质上就相当于一个类继承了Enum这个抽象类

