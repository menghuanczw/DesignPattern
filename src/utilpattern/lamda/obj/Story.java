package utilpattern.lamda.obj;

import java.time.LocalDateTime;

public class Story {
	private String tittle;
	private LocalDateTime time;
	private String content;
	
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "Story [tittle=" + tittle + ", time=" + time + ", content=" + content + "]";
	}
}
