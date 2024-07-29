package och02;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Person
 */
public class Person extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Person() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//현장  work1
		//     개인정보
		//		이름 : 대조영
		//		아이디 : aa
		//		암호 : 123
		//		성별 : 남자
		//		수신메일 : 공지 배송
		//		직업 : 장군
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String [] notice = request.getParameterValues("notice");
		String job = request.getParameter("job");
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>개인정보</h1><p>");
		out.println("<p>이름 : "+ name);
		out.println("<p>아이디 : "+ id);
		out.println("<p>암호 : "+ password);
		out.println("<p>성별 : "+ gender);
		
		out.println("<p>메일수신 : ");
		if(notice != null) {
			for(int i=0; i<notice.length; i++) {
				out.println(notice[i]+"");
			}
		}
		else out.println("없음");
		
		out.println("<p>직업 : "+ job);
		out.println("</body></ html>");
		out.close();		 
		
	}

}
