package SLMB.pojo;

import java.util.Date;

/**
 * 
 * ���Ա�
 */
public class leaveWord {
	private Integer id;
	/**
	 * ���Ե��û�
	 */
	private users usid;
	/**
	 * ��������
	 */
	private String content;
	/**
	 * ����Ա�ظ�����
	 */
	private String reply;
	/**
	 * ����ʱ��
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
