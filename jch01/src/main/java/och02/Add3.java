package och02;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Add3
 */
public class Add3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Add3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet Start..."); 
		//이게 콘솔화면에 뿌려지는 글자.
		int num = Integer.parseInt(request.getParameter("num"));//num에 누적분을 리턴해주는 것이 현재 이 친구의 목표임.
		String han = request.getParameter("han");
		int sum = 0;
		for(int i =1; i<=num; i++) {
			sum += i;
		}
		//request.setCharacterEncoding("utf-8"); 여기도 이걸 안적어줘도 한글이 그대로 잘 나온다.
		//현재 버전에서는 request는 안걸어줘도 되지만 reponse만큼은 한글 세팅을 꼭 해주어야 한다.
		
		//browser에 display하기 위한 방법-->화면에 보여주기 위한 것은 response객체를 이용한다.
		//여기는 브라우저에 뿌려지는 글자.
		response.setContentType("text/html;charset=utf-8");//browser에 상세내용을 보여줌
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.printf("<h1>han Test : %s</h1>",han);
		out.printf("<h1>1부터 %d까지 합계</h1>",num);
		out.println(sum);
		out.println("</body></html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		System.out.println("doGet Post..."); 
	}

}
