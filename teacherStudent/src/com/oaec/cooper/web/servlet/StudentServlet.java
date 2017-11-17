package com.oaec.cooper.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oaec.cooper.model.bean.Student;
import com.oaec.cooper.model.bean.Teacher;
import com.oaec.cooper.model.service.IStudentService;
import com.oaec.cooper.model.service.ITeacherService;
import com.oaec.cooper.model.service.imple.StudentServiceImpl;
import com.oaec.cooper.model.service.imple.TeacherServiceImpl;

/**
 * Servlet implementation class AddServlet
 */
//@WebServlet("/AddServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IStudentService iss = new StudentServiceImpl();
	private ITeacherService its = new TeacherServiceImpl();
	private List<Student> list;
	private Teacher teacher;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		list = null;
		/**
		 * request.setCharacterEncoding("UTF-8");
		 * 保证了从浏览器传过来的值不会乱码
		 */
		request.setCharacterEncoding("UTF-8");
		if(request.getParameter("po").equals("first")) {
			list = iss.queryAllStudent();
//			response.setContentType("text/html;charset=UTF-8");
			request.setAttribute("Student", list);
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/student.jsp");
			rd.forward(request, response);
		}else if(request.getParameter("po").equals("add")) {
			this.addStudent(request, response);
			
		}else if(request.getParameter("po").equals("add2")){
			this.add2Student(request, response);
			
		}else if(request.getParameter("po").equals("remove")){
			this.removeStudent(request, response);
			
		}else if(request.getParameter("po").equals("update")) {
			
		}else {
			this.commit(request, response);
			
		}
		
		
			
			
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	/**
	 * 增（从查询页面调到增加页面）
	 */
	public void addStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		list = iss.queryAllStudent();		
//		response.setContentType("text/html;charset=UTF-8");
		request.setAttribute("Student", list);
		request.setAttribute("nextId", list.get(list.size()-1).getId()+1);
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/addStudent.jsp");
		rd.forward(request, response);
	}
	public void add2Student(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		int age = Integer.valueOf(request.getParameter("age"));
		String sex = request.getParameter("sex");
		/**
		 * 从浏览器中获取的值是乱码，所以teacher的值是null
		 * String teacherName1 = new String(teacherName.getBytes("ISO8859-1"),"UTF-8");
		 */
		String teacherName = request.getParameter("teacherName");
//		String teacherName1 = new String(teacherName.getBytes("ISO8859-1"),"UTF-8");
		System.out.println(teacherName+"***********");
		teacher = its.queryByTeacherName(teacherName);
//		System.out.println(teacher.getId()+teacher.getName());
		iss.AddStudent(new Student(
						name,
						age,
						sex,
						teacher.getId()
				));
		this.addStudent(request, response);
	}
	/**
	 * 删
	 */
	public void removeStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/**
		 * request.getParameter()方法返回的是String类型
		 * 从JSP获取值用request.getParameter()方法
		 */
//		System.out.println(request.getParameter("po"));
//		System.out.println(request.getParameter("id"));
		int id = Integer.valueOf(request.getParameter("id"));
		iss.removeStudent(id);
		this.addStudent(request, response);	
	}
	/**
	 * 提交，返回上层界面
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void commit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	/**
	 * End
	 */
}
