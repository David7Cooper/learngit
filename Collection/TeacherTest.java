package newDay;
import java.util.*;
/**集合案例*/
public class TeacherTest {
	private List<Teacher> list;
	
	public TeacherTest() {
		super();
		list=new ArrayList<>();
		list.add(new Teacher("Tom","CoreJava"));
		list.add(new Teacher("John","Oracle"));
		list.add(new Teacher("Jerry","JDBC"));
	}

	/**增*/
	public void addTeacher(String name,String course){
		list.add(new Teacher(name,course));
	}
	
	/**删*/
	public void deleteTeacher(String name){
		/*用迭代器实现*/
//		Iterator<Teacher> iterator=list.iterator();
//		while(iterator.hasNext()){
//			if(iterator.next().getName().equals(name)){
//				System.out.println("lsadjflskd");
//				list.remove(iterator.next());
//				break;
//			}
//		}
//	}
		/*用foreach实现*/
		for(Teacher teacher : list){
			if(teacher.getName().equals(name)){
				list.remove(teacher);
				break;/*必须要加break*/
			}
		}
	}
	
	/**改*/
	public void setTeacher(String name,String newName,String newCourse){
		for(Teacher teacher : list){
			if(teacher.getName().equals(name)){
				teacher.setName(newName);
				teacher.setCourse(newCourse);
			}
		}
	}
	
	/**查*/
	public void queryTeacher(){
		/*用迭代器实现*/
		Iterator<Teacher> iterator=list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
			}
		/*用foreach实现*/
//		for(Teacher teacher : list){
//			System.out.println(teacher.toString());
//		}
//		/*用list*/
//		list.toString();
	}
	
	/**主方法*/
	public static void main(String[] args) {
		TeacherTest test=new TeacherTest();
		test.deleteTeacher("Jerry");
		test.queryTeacher();
	}
}

class Teacher {
	private String name;
	private String course;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	public Teacher(String name, String course) {
		super();
		this.name = name;
		this.course = course;
	}
	public Teacher() {
		super();
	}
	
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", course=" + course + "]";
	}
}

