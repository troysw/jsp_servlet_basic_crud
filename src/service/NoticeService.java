package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entity.Notice;

public class NoticeService {
	
	public List<Notice> getNoticeList(){
		
		List<Notice> list = new ArrayList<>();
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		String sql = "SELECT * FROM NOTICE";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, "ORA_EXAM", "ORA_EXAM");
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			
		    while(rs.next()) {
		    	
		    	int id = rs.getInt("ID");
				String writerId = rs.getString("WRITER_ID");
				String email = rs.getString("EMAIL");
				String title = rs.getString("TITLE");
				String content = rs.getString("CONTENT");
				Date regDate = rs.getDate("REGDATE");
				int hit = rs.getInt("HIT");
				
				Notice notice = new Notice(
						id,
						writerId,
						email,
						title,
						content,
						regDate,
						hit
						);
				
				list.add(notice);
		    }

			rs.close();
			st.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
}
	
	
	public Notice getNotice(int id) {
		
		Notice notice = null;
		
		String sql = "SELECT * FROM NOTICE WHERE ID = ?";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, "ORA_EXAM", "ORA_EXAM");
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, id);
			
			ResultSet rs = st.executeQuery();
			
			
			
		    if(rs.next()) {
		    	
		    	int nid = rs.getInt("ID");
				String writerId = rs.getString("WRITER_ID");
				String email = rs.getString("EMAIL");
				String title = rs.getString("TITLE");
				String content = rs.getString("CONTENT");
				Date regDate = rs.getDate("REGDATE");
				int hit = rs.getInt("HIT");
				
				notice = new Notice(
						nid,
						writerId,
						email,
						title,
						content,
						regDate,
						hit
						);
				
		    }

			rs.close();
			st.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return notice;
		
	}

	public void insertNotice(Notice notice) {

		String sql = "INSERT INTO NOTICE (WRITER_ID, EMAIL, TITLE, CONTENT, hit) VALUES (?, ?, ?, ?, 3)";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			
			try {
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection(url, "ORA_EXAM", "ORA_EXAM");
				PreparedStatement st = con.prepareStatement(sql);
				st.setString(1, notice.getWriterId());
				st.setString(2, notice.getEmail());
				st.setString(3, notice.getTitle());
				st.setString(4, notice.getContent());
				
				st.executeUpdate();
				
				st.close();
				con.close();
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return ;
		}
	
	public Notice updateNotice(Notice notice) {

		
		String sql = "UPDATE NOTICE SET TITLE = ?, CONTENT = ? WHERE ID = ?";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, "ORA_EXAM", "ORA_EXAM");
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, notice.getTitle());
			st.setString(2, notice.getContent());
			st.setInt(3, notice.getId());
			
			st.executeUpdate();
			
			st.close();
			con.close();
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return notice;
	}
	
	public void NoticeDelete(int id) {

		
		String sql = "DELETE FROM NOTICE WHERE ID=?";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, "ORA_EXAM", "ORA_EXAM");
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, id);
			st.executeUpdate();
			
			st.close();
			con.close();
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ;
	}
		
	}
	
	
	
	
	
	