package SLMB.pojo;

/**
 * 
 * ��Ʒ��
 */
public class commodity {
	private Integer id;
	/**
	 * ��Ʒ����
	 */
	private String name;
	/**
	 * �г���
	 */
	private Double baprice;
	/**
	 * �ۿۼ�
	 */
	private Double rbprice;
	/**
	 * ���
	 */
	private commStatus stock;
	/**
	 * ״̬
	 */
	private Integer status;
	/**
	 * ��Ʒ˵��
	 */
	private String dateil;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getBaprice() {
		return baprice;
	}
	public void setBaprice(Double baprice) {
		this.baprice = baprice;
	}
	public Double getRbprice() {
		return rbprice;
	}
	public void setRbprice(Double rbprice) {
		this.rbprice = rbprice;
	}
	public commStatus getStock() {
		return stock;
	}
	public void setStock(commStatus stock) {
		this.stock = stock;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getDateil() {
		return dateil;
	}
	public void setDateil(String dateil) {
		this.dateil = dateil;
	}


}
