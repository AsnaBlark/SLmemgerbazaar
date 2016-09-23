package SLMB.pojo;
/**
 * 
 *会员类型表
 */
public class memberType {
	private Integer id;
	private String name;
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
	public memberType() {
		super();
	}
	public memberType(String name) {
		super();
		this.name = name;
	}
	
}
