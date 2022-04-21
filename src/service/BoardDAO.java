package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import model.BoardDTO;

public class BoardDAO {
	private DataSource dataFactory;
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	
	 public BoardDAO() {
		 
		 try {
				Context ctx = new InitialContext();
				dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/mvc");
				conn = dataFactory.getConnection();
			} catch (NamingException | SQLException e) {
				e.printStackTrace();
			}
			
		}
		public void dbClose() {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		public void boardInsert(String bTitle, String bContent, String bWriter) {
               
		 String sql = "INSERT INTO boardTBL (bTitle, bContent, bWriter) VALUES(?, ?, ?)";	
		  try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bTitle);
			pstmt.setString(2, bContent);
			pstmt.setString(3, bWriter);
			pstmt.executeUpdate();
			dbClose();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		
		}
		
		public List<BoardDTO> selectAll(){
			List<BoardDTO> list = new  ArrayList<BoardDTO>();
			String sql = "SELECT * FROM boardTBL";
			
			try {
				pstmt = conn.prepareStatement(sql);
			rs= pstmt.executeQuery();
			 
		while(rs.next()) {
			BoardDTO dto = new BoardDTO();
			dto.setbNo(rs.getInt("bNo"));
			dto.setbTitle(rs.getNString("bTitle"));
			dto.setbContent(rs.getString("bContent"));
			dto.setbWriter(rs.getString("bWriter"));
			dto.setbRegDate(rs.getTimestamp("bRegDate"));
			
		    list.add(dto);
			
			
		}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			dbClose();
			return null;
			
			
		}
	 }

