package newDay;
/**
* 懒汉模式
*	1、私有化构造方法
*	2、创建静态get方法
*	相比饿汉模式只是给sin加了一个判断，但是比饿汉模式更省内存，
*	懒模式不止确保了在别的类当中不可以创建本类对象，还确保了对象的为一性
**/
public class SingletonTestDrive {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}

/*懒汉模式*/
class Singleton{
	private static Singleton sin=null;
	
	public static Singleton getSingleton(){
		if(sin==null){
			sin=new Singleton();
		}
		return sin;
	}
	
	private Singleton(){
		
	}
}

/*饿汉模式*/
class Singleton1{
private static Singleton1 sin;
	
	public static Singleton1 getSingleton1(){
		return sin=new Singleton1();
	}
	
	private Singleton1(){
		
	}
}
