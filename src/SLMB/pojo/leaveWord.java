package SLMB.pojo;

import java.util.Date;

/**
 * 
 * 留言表
 */
public class leaveWord {
	private Integer id;
	/**
	 * 留言的用户
	 */
	private users usid;
	/**
	 * 留言类容
	 */
	private String content;
	/**
	 * 管理员回复留言
	 */
	private String reply;
	/**
	 * 留言时间
	 */
	private Date lTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public users getUsid() {
		return usid;
	}
	public void setUsid(users usid) {
		this.usid = usid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getReply() {
		return reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
	}
	public Date getlTime() {
		return lTime;
	}
	public void setlTime(Date lTime) {
		this.lTime = lTime;
	}
}
