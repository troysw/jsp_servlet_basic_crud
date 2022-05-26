package entity;

import java.util.Date;

public class Notice {
	private int id;
	private String writerId;
	private String email;
	private String title;
	private String content;
	private Date regDate;
	private int hit;
	
	public Notice() {
		// TODO Auto-generated constructor stub
	}
	
	public Notice(String writerId, String email, String title, String content) {
		this.writerId = writerId;
		this.email = email;
		this.title = title;
		this.content = content;
	}
	
	public Notice(int id, String writerId, String email, String title, String content, Date regDate, int hit) {
		this.id = id;
		this.writerId = writerId;
		this.email = email;
		this.title = title;
		this.content = content;
		this.regDate = regDate;
		this.hit = hit;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWriterId() {
		return writerId;
	}

	public void setWriterId(String writerId) {
		this.writerId = writerId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}
	
	
	
}
