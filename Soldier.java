package com.oaec.test1;
/**多态的使用案例**/
public abstract class Soldier {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Soldier(String name) {
		super();
		this.name = name;
	}

	public abstract void doAttack();
	
	public void doAction(){
		doStart();
		doAttack();
	}

	private void doStart() {
		// TODO Auto-generated method stub
		System.out.println("我军还有20秒到达战场");
	}
	
	public static void main(String[] args) {
		Army army=new Army("李威");
		Navy navy=new Navy("陈龙");
		Officer officer=new Officer("田仁毅",army,navy);
		officer.doAttack();
		System.out.println("*****************************************");
		officer.doAction();
		System.out.println("*****************************************");
		officer.doCommand();
		System.out.println("*****************************************");
		officer.doCommand(army);
	}
}

class Army extends Soldier{
	public Army(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doAttack() {
		// TODO Auto-generated method stub
		System.out.println(this.getName()+",我是陆军,我开坦克来");
	}
}

class Navy extends Soldier{
	public Navy(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doAttack() {
		// TODO Auto-generated method stub
		System.out.println(this.getName()+",我是海军,我开潜艇来");
	}
	
	/*测试方法不会出现*/
	public void menthod(){
		System.out.println("测试");
	}
}

class Officer extends Soldier{
	private Army army;
	private Navy navy;

	public Officer(String name,Army army,Navy navy) {
		super(name);
		this.army=army;
		this.navy=navy;
	}

	@Override
	public void doAttack() {
		// TODO Auto-generated method stub
		System.out.println(this.getName()+",我是军官,我就动动嘴咯");
	}
	
	public void doCommand(){
		army.doAction();
		navy.doAction();
		this.doAction();
	}
	
	/*使用多态传参,参数为Army,Navy类型,传入之后就是Soldier类型*/
	public void doCommand(Soldier soldier){
		soldier.doAction();
	}
}

