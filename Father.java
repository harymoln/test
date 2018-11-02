package com.itheima;
/*
 * final关键字是最终的意思，可以修饰类，成员变量，成员方法。
–	修饰类，类不能被继承
–	修饰变量，变量就变成了常量，只能被赋值一次
–	修饰方法，方法不能被重写

 */
public class Father {
	public final void method() {
		System.out.println("method father");
	}
}


