package com.oaec.test;
import java.io.*;
import java.util.*;
/**用面向对象实现DVD系统*/
public class DvdTest {
	private List<Dvd> list;
	private File file;
	private Scanner input;
	private static DvdTest test;

	public DvdTest() {
		super();
		input=new Scanner(System.in);
		file=new File("F://Data.java");
		list=new ArrayList<>();
		list.add(new Dvd(1,"军师联盟之大军师司马懿",5,"可借",10));
		list.add(new Dvd(2,"鬼吹灯之黄皮子坟",7,"可借",15));
		queryDvd();
	}
	
	/**初始化影片库*/
	public void queryDvd(){
		try {
			BufferedWriter writer=new BufferedWriter(new FileWriter(file));
			for(Dvd dvd : list){
				writer.write(dvd.toString());
			}
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**选择界面*/
	public void select(){
		System.out.println("请输入你的操作");
		System.out.println("1增加影片");
		System.out.println("2删除影片");
		System.out.println("3修改影片");
		System.out.println("4查看影片");
		switch(input.next()){
		case "1" : test.addDvd();break;
		case "2" : test.removeDvd();break;
		case "3" : test.setDvd();;break;
		case "4" : test.queryDvd1();;break;
		}
	}
	
	/**增加影片*/
	public void addDvd(){
		System.out.println("请输入你要新增的影片信息并用逗号分开");
		String[] str=input.next().split(",");
		list.add(new Dvd(Integer.parseInt(str[0]),str[1],Integer.parseInt(str[2]),str[3],Integer.parseInt(str[4])));
		System.out.println("影片增加成功!!!");
	}
	
	/**删除影片*/
	public void removeDvd(){
		System.out.println("请选择你要删除影片的编号");
		int n=input.nextInt()-1;
		list.remove(n);
		for(Dvd dvd : list){
			if(dvd.getId()!=1){
				dvd.setId(dvd.getId()-1);
			}
		}
		System.out.println("影片删除成功!!!");
	}
	
	/**修改影片*/
	public void setDvd(){
		System.out.println("请选择你要修改影片的编号");
		int n=input.nextInt()-1;
		System.out.println(list.get(n).toString());
		String[] str=input.next().split(",");
		list.set(n,new Dvd(Integer.parseInt(str[0]),str[1],Integer.parseInt(str[2]),str[3],Integer.parseInt(str[4])));
		System.out.println("影片修改成功!!!");
	}
	
	/**查看影片*/
	public void queryDvd1(){
		for(Dvd dvd : list){
			System.out.println(dvd.toString());
		}
	}
	
	/**主函数*/
	public static void main(String[] args) {
		test=new DvdTest();
		while(true){
			test.select();
			test.queryDvd();
		}
	}
}

class Dvd {
	private int id;
	private String name;
	private int rentNumber;
	private String isRent;
	private int rentMoney;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRentNumber() {
		return rentNumber;
	}
	public void setRentNumber(int rentNumber) {
		this.rentNumber = rentNumber;
	}
	public String isRent() {
		return isRent;
	}
	public void setRent(String isRent) {
		this.isRent = isRent;
	}
	public int getRentMoney() {
		return rentMoney;
	}
	public void setRentMoney(int rentMoney) {
		this.rentMoney = rentMoney;
	}
	
	public Dvd(int id, String name, int rentNumber, String isRent,
			int rentMoney) {
		super();
		this.id = id;
		this.name = name;
		this.rentNumber = rentNumber;
		this.isRent = isRent;
		this.rentMoney = rentMoney;
	}
	
	@Override
	public String toString() {
		return "Dvd [id=" + id + ", name=" + name + ", rentNumber="
				+ rentNumber + ", isRent=" + isRent + ", rentMoney="
				+ rentMoney + "]"+"\n";
	}
}

