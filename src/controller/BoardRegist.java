package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.jdbc.ha.ReplicationMySQLConnection;

import service.BoardDAO;

/**
 * Servlet implementation class BoardRegist
 */
@WebServlet("/boardRegist")
public class BoardRegist extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		String bTitle = request.getParameter("bTitle");
		String bContent = request.getParameter("bContent");
		String bWriter = request.getParameter("bWriter");
		
	
	  System.out.println("bTitle 값: " + bTitle);
	  System.out.println("bContent 값 :" + bContent);
	  System.out.println("bWriter 값 :" + bWriter);
	  
	  
	  BoardDAO dao = new BoardDAO();
	  dao.boardInsert(bTitle,bContent,bWriter);
	  
	  
	    response.sendRedirect("/MVC2Ex/index.jsp");
	
	}

}
