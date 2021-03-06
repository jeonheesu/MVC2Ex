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
@WebServlet("/boardList")
public class BoardList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		 BoardDAO dao = new BoardDAO();
	  List<BoardDTO> list = dao.boardList();
	  request.setAttribute("list", list);
	  
	  RequestDispatcher rd = request.getRequestDispatcher("board/boardList.jsp");
	  rd.forward(request, response);
	  
	  
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	
	}

}
