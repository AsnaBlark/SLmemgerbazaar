package SLMB.pojo;

/**
 * 
 * �������ͱ�
 */
public class notice {
	private Integer id;
	/**
	 * �������
	 */
	private String title;
	/**
	 * ��������
	 */
	private ntType nid;
	/**
	 * �ϴ��ļ�
	 */
	private Byte[] uploadfiles;
	/**
	 * ����
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
