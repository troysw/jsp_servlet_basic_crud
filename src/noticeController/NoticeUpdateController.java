package noticeController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Notice;
import service.NoticeService;

@WebServlet("/update")
public class NoticeUpdateController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		NoticeService service = new NoticeService(); 
		
		Notice notice = service.getNotice(id);
		
		request.setAttribute("n", notice);
		
		// forward
		request
		.getRequestDispatcher("/update.jsp")
		.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		NoticeService service = new NoticeService();

		Notice notice = new Notice();
		
		notice.setId(id);
		notice.setTitle(request.getParameter("title"));
		notice.setContent(request.getParameter("content"));
		service.updateNotice(notice);
		
		response.sendRedirect("index");
	}
}
