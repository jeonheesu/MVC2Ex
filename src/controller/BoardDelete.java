package controller;

import java.io.IOException;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.jdbc.ha.ReplicationMySQLConnection;

import model.BoardDTO;
import service.BoardDAO;

/**
 * Servlet implementation class BoardRegist
 */
@WebServlet("/boardDelete")
public class BoardDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		 String bNo = request.getParameter("bNo");
		 BoardDAO dao = new BoardDAO();
	     dao.boarddelet(bNo);
	     
	     response.sendRedirect("boardList");
	  
	  
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	
	}

}
