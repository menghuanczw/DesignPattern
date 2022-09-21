package utilpattern.lamda.obj;
/**
 * 内部类
 */
public class InnerClass {
	public static void innerMethod(MyInterface myInterface) {
		myInterface.myInterface();
	}
	
	public static void innerMethod2(MyInterface2 myInterface) {
		int result = myInterface.myInterface(1,2);
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		innerMethod(new MyInterface() {
			@Override
			public void myInterface() {
				System.out.println("hello,接口实现方法。");
			}});
		//改善 匿名内部类,单行不用{ }和;
		innerMethod(() -> System.out.println("hello,lamda方法实现写法"));
		
		innerMethod2(new MyInterface2() {
			@Override
			public int myInterface(int a, int b) {
				return a * b;
			}
		});
		
		//带参数和返回值的lamda
		innerMethod2((x,y) -> x * y);
	}
}

/**
 * 接口
 */
 interface MyInterface{
	void myInterface();
}
 
 interface MyInterface2{
	 int myInterface(int a,int b);
 }
