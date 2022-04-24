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
@WebServlet("/boardModify")
public class BoardModify extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		 String bNo = request.getParameter("bNo");
		 BoardDAO dao = new BoardDAO();
		 BoardDTO dto =  dao.boardSelectOne(bNo);
		 request.setAttribute("dto", dto);
		 RequestDispatcher rd = request.getRequestDispatcher("board/boardModify.jsp");
		 rd.forward(request, response);

	  
	  
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		 String bNo = request.getParameter("bNo");
		 String bTitle = request.getParameter("bTitle");
		 String bContent = request.getParameter("bContent");
		 
		  System.err.println(bNo +  "  " + bTitle +"      " + bContent );
		  
		  
		  BoardDAO dao = new BoardDAO();
		        dao.boardModify(bNo,bTitle,bContent);
		        
		        response.sendRedirect("boardContent?bNo=" + bNo);
	
	}

}
