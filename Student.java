package com.oaec.test;
/**选择排序的案例*/
import java.util.Arrays;

public class Student {
	private String name;
	private int score;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", score=" + score +"]";
	}
	
	/*排序方法*/
	public static Student[] teacher(Student[] student){
		System.out.println("排序前:"+Arrays.toString(student));
		for(int i=0;i<student.length-1;i++){
			int index=i;
			for(int j=i+1;j<student.length;j++){
				if(student[index].score>student[j].score){
					index=j;
				}
			}
			if(index!=i){
				Student stu=student[index];
				student[index]=student[i];
				student[i]=stu;
			}
		}
		return student;
	}
	
	public static void main(String[] args) {
		Student student=new Student("李威",55);
		Student student1=new Student("陈龙",66);
		Student student2=new Student("田仁毅",44);
		Student student3=new Student("陈国鹏",11);
		Student student4=new Student("蒋湘宁",99);
		Student[] stu={student,student1,student2,student3,student4};
		System.out.println(Arrays.toString(teacher(stu)));
	}
}
