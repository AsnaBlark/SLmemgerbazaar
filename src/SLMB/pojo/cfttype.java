package SLMB.pojo;
/**
 * 
 *证件类型表
 */
public class cfttype {
	private Integer id;
	private String name;
	public cfttype(String name) {
		super();
		this.name = name;
	}
	public cfttype() {
		super();
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
