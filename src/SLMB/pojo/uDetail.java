package SLMB.pojo;

import java.util.Date;

/**
 * 
 * 用户详情表
 */
public class uDetail {
	private Integer id;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 性别
	 */
	private String sex;
	/**
	 * 年龄
	 */
	private Integer age;
	/**
	 * 证件类型
	 */
	private cfttype cid;
	/**
	 * 证件号码
	 */
	private String cftnumber;
	/**
	 * 会员类型
	 */
	private memberType mid;
	/**
	 * 角色类型
	 */
	private role rid;
	/**
	 * 电话
	 */
	private Long phone;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 邮政编码
	 */
	private Long zipcode;
	/**
	 * 收获地址
	 */
	private String address;
	/**
	 * 开户人
	 */
	private String openperson;
	/**
	 * 开户证件号
	 */
	private String opennumber;
	/**
	 * 身份证图片
	 */
	private Byte[] idtprint;
	/**
	 * 银行卡图片
	 */
	private Byte[] bankprint;
	/**
	 * 最后一次修改时间
	 */
	private Date endtime;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public cfttype getCid() {
		return cid;
	}
	public void setCid(cfttype cid) {
		this.cid = cid;
	}
	public String getCftnumber() {
		return cftnumber;
	}
	public void setCftnumber(String cftnumber) {
		this.cftnumber = cftnumber;
	}
	public memberType getMid() {
		return mid;
	}
	public void setMid(memberType mid) {
		this.mid = mid;
	}
	public role getRid() {
		return rid;
	}
	public void setRid(role rid) {
		this.rid = rid;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getZipcode() {
		return zipcode;
	}
	public void setZipcode(Long zipcode) {
		this.zipcode = zipcode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getOpenperson() {
		return openperson;
	}
	public void setOpenperson(String openperson) {
		this.openperson = openperson;
	}
	public String getOpennumber() {
		return opennumber;
	}
	public void setOpennumber(String opennumber) {
		this.opennumber = opennumber;
	}
	public Byte[] getIdtprint() {
		return idtprint;
	}
	public void setIdtprint(Byte[] idtprint) {
		this.idtprint = idtprint;
	}
	public Byte[] getBankprint() {
		return bankprint;
	}
	public void setBankprint(Byte[] bankprint) {
		this.bankprint = bankprint;
	}
	public Date getEndtime() {
		return endtime;
	}
	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}


}
