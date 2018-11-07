package ww.entity;

public class News {
	public String title;
	public String time;
	public String comeform;
	public String neirong;
	
	
	
	public News(String title, String time, String comeform, String neirong) {
		super();
		this.title = title;
		this.time = time;
		this.comeform = comeform;
		this.neirong = neirong;
	}
	public News(String title) {
		super();
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getComeform() {
		return comeform;
	}
	public void setComeform(String comeform) {
		this.comeform = comeform;
	}
	public String getNeirong() {
		return neirong;
	}
	public void setNeirong(String neirong) {
		this.neirong = neirong;
	}
	
}
