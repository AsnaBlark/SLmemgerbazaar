package SLMB.pojo;
/**
 * 
 *用户角色表
 */
public class role {
	private Integer id;
	private String name;
	public role() {
		super();
	}
	public role(String name) {
		super();
		this.name = name;
	}
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
	
}
