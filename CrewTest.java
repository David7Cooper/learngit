package newDay;
import java.util.*;
/**集合案例*/
public class CrewTest {
	private List<Crew> list;
	private List<Crew> list1;
	private List<Crew> list2;
	private Map<Crew,List<Crew>> map;
	private Scanner input;
	
	public CrewTest() {
		super();
		list=new ArrayList<>();
		list.add(new Crew("李威",21));
		list.add(new Crew("田仁毅",28));
		list.add(new Crew("陈国鹏",24));
		list1=new ArrayList<>();
		list1.add(new Crew("李欢",23));
		list1.add(new Crew("陈龙",26));
		list1.add(new Crew("孟令鑫",26));
		map=new HashMap<>();
		map.put(new Crew("张三",27), list);
		map.put(new Crew("李四",30), list1);
	}

	/**增*/
	public void addCrew(){
		list2=new ArrayList<>();
		input=new Scanner(System.in);
		System.out.println("请输入你要增加的小组成员信息并且用,号分割:");
		System.out.println("组长信息:\t姓名\t年龄");
		String[] str=input.next().split(",");
		map.put(new Crew(str[0],Integer.parseInt(str[1])), list2);
		int i=0;
		while(i<1){
			System.out.println("组员信息:\t姓名\t年龄");
			String[] str1=input.next().split(",");
			list2.add(new Crew(str1[0],Integer.parseInt(str1[1])));
			System.out.println("你想要结束录入么?\tY or N");
			if(input.next().equals("Y")){
				i++;
			}
		}
	}
	
	/**删*/
	/**改*/
	/**查*/
	public void queryCrew(){
		/*用迭代器实现*/
		Iterator<Map.Entry<Crew, List<Crew>>> iterator=map.entrySet().iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		/*运行结果
		 * Crew [name=张三, age=27]=[Crew [name=李威, age=21], Crew [name=田仁毅, age=28], Crew [name=陈国鹏, age=24]]
		 * Crew [name=李四, age=30]=[Crew [name=李欢, age=23], Crew [name=陈龙, age=26], Crew [name=孟令鑫, age=26]]
		 */
		/*foreach,keySet()方法实现*/
//		for(Crew crew : map.keySet()){
//			System.out.println("组长:"+crew.getName()+",年龄:"+crew.getAge());
//			List<Crew> value=(List<Crew>)map.get(crew);
//			for(Crew crew1 : value){
//			System.out.println("组员:"+crew1.getName()+",年龄:"+crew1.getAge());
//			}
//			System.out.println("+++++++++++++++++++");
//		}
		/*运行结果
		 * 组长:张三,年龄:27
		 * 组员:李威,年龄:21
		 * 组员:田仁毅,年龄:28
		 * 组员:陈国鹏,年龄:24
		 * +++++++++++++++++++
		 * 组长:李四,年龄:30
		 * 组员:李欢,年龄:23
		 * 组员:陈龙,年龄:26
		 * 组员:孟令鑫,年龄:26
		 * +++++++++++++++++++
		 */
		/*foreach,entrySet()方法实现*/
//		for(Map.Entry<Crew,List<Crew>> entry: map.entrySet()){
//			System.out.println("组长:"+entry.getKey());
//			System.out.println("组员:"+entry.getValue());
//			System.out.println("++++++++++++++++++++++++++");
//		}
		/*运行结果
		 * 组长:Crew [name=张三, age=27]
         * 组员:[Crew [name=李威, age=21], Crew [name=田仁毅, age=28], Crew [name=陈国鹏, age=24]]
         * ++++++++++++++++++++++++++
         * 组长:Crew [name=李四, age=30]
		 * 组员:[Crew [name=李欢, age=23], Crew [name=陈龙, age=26], Crew [name=孟令鑫, age=26]]
         * ++++++++++++++++++++++++++
		 */
	}
	
	/**主函数*/
	public static void main(String[] args) {
		CrewTest test=new CrewTest();
		test.addCrew();
		test.queryCrew();
	}
}

class Crew {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Crew(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Crew [name=" + name + ", age=" + age + "]";
	}
}

