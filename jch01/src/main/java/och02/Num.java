package och02;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Num
 */
public class Num extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Num() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Homework : 숫자 두개를 받아서 사칙연산을 하는 프로그램, 아래처럼 출력되어야함.
//		연산결과
//		덧셈 : 100 + 5 = 105
//		뺄셈 : 100 - 5 = 95
//		곱셈 : 100 * 5 = 500
//		나눗셈 : 100 / 5 = 20
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>연산결과</h1>");
		out.printf("덧셈 : %d+%d = %d<br>",num1,num2,(num1+num2));
		out.printf("뺄셈 : %d-%d = %d<br>",num1,num2,(num1-num2));
		out.printf("곱셈 : %d*%d = %d<br>",num1,num2,(num1*num2));
		out.printf("나눗셈 : %d/%d = %d<br>",num1,num2,(num1/num2));
		out.println("</body></html>");
		out.close();		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
