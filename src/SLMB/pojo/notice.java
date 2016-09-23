package SLMB.pojo;

/**
 * 
 * 公告类型表
 */
public class notice {
	private Integer id;
	/**
	 * 公告标题
	 */
	private String title;
	/**
	 * 公告类型
	 */
	private ntType nid;
	/**
	 * 上传文件
	 */
	private Byte[] uploadfiles;
	/**
	 * 内容
	 */
	private String content;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ntType getNid() {
		return nid;
	}

	public void setNid(ntType nid) {
		this.nid = nid;
	}

	public Byte[] getUploadfiles() {
		return uploadfiles;
	}

	public void setUploadfiles(Byte[] uploadfiles) {
		this.uploadfiles = uploadfiles;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
