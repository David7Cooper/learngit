package newDay;
import java.util.*;
/**用Student存入学生信息*/
public class StudentInformation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		output(input());
	}
	
	public static Student[] input(){
		Student[] stu=new Student[3];
		Scanner input=new Scanner(System.in);
		for(int i=0;i<3;i++){
			System.out.println("请输入第"+(i+1)+"个学生的姓名#成绩");
			String str=input.nextLine();
			if(str.contains("#")){
				String[] strStudent=str.split("#");
				if(strStudent.length==2){
					Double num=Double.parseDouble(strStudent[1]);
					stu[i]=new Student(strStudent[0],num);
				}else{
					System.out.println("只能用一次#号");
					i--;
					continue;
				}
			}else{
				System.out.println("请用#号分割姓名与成绩");
				i--;
			}
		}
		return stu;
	} 
	
	public static void output(Student[] stu){
		System.out.println("---下面输出存入的学生信息---");
		for(int i=0;i<3;i++){
			stu[i].out();
		}
	}

}

/*在一个.java文件中只能有一个public修饰的类*/
class Student{
	private String name;
	private Double score;
	
	public Student(String name,Double score){
		this.name=name;
		this.score=score;
	}
	
	public void out(){
		System.out.println(this.name+"\t"+this.score);
	}
}


