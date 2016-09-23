package SLMB.pojo;

/**
 * 
 * 商品表
 */
public class commodity {
	private Integer id;
	/**
	 * 商品名称
	 */
	private String name;
	/**
	 * 市场价
	 */
	private Double baprice;
	/**
	 * 折扣价
	 */
	private Double rbprice;
	/**
	 * 库存
	 */
	private commStatus stock;
	/**
	 * 状态
	 */
	private Integer status;
	/**
	 * 商品说明
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
