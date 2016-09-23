package SLMB.pojo;

import java.util.Date;

/**
 * 
 *	用户购物信息表
 */
public class shop {
	private Integer id;
	private users usid;
	private commodity cid;
	private Integer count;
	private Date shoptime;
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
	public commodity getCid() {
		return cid;
	}
	public void setCid(commodity cid) {
		this.cid = cid;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Date getShoptime() {
		return shoptime;
	}
	public void setShoptime(Date shoptime) {
		this.shoptime = shoptime;
	}
}
