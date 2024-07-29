        package och02;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Servlet implementation class board
 */
public class board extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public board() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		request.setCharacterEncoding("utf-8");
		//이건 한글을 받아들이는 것. 이걸 막으면 실행창에서 한글을 보내면 문제없이 한글을 문제 없이 보여줄수 있다.
		//굳이 엔코딩해서 바꾸지 않아도 한글을 입력했으니 한글이 나오는 것..
		
		
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		response.setContentType("text/html;charset=utf-8"); 
		//브라우저에 한글이 깨지지 말라고 적어주는 것
		
		PrintWriter out = response.getWriter();
		Date date = new Date();
		out.println("<html><body><h1>게시판</h1>");
		out.println("제목 : " + title +"<p>");
		out.println("작성자 : "+ writer +"<p>");
		out.println("작성일 : "+ date +"<p>");
		out.println("내용 <br><pre>"+content+"</pre>");
		//out.println("</body></html>"); -->이거 안적어줘도 자동으로 보정해서 닫아준것처럼 실행이 된다.
		out.close();
	}

}
