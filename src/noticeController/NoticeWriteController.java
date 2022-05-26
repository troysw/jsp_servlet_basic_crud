package noticeController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Notice;
import service.NoticeService;

@WebServlet("/write")
public class NoticeWriteController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request
		.getRequestDispatcher("/write.jsp")
		.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		NoticeService service = new NoticeService();

		
		Notice notice = new Notice();
		
		notice.setWriterId(request.getParameter("writerId"));
		notice.setEmail(request.getParameter("email"));
		notice.setTitle(request.getParameter("title"));
		notice.setContent(request.getParameter("content"));
		
		service.insertNotice(notice);
		
		response.sendRedirect("index");
	
	}
}
