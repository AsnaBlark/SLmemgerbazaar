package SLMB.pojo;

import java.util.Date;

/**
 * 
 * �û������
 */
public class uDetail {
	private Integer id;
	/**
	 * ����
	 */
	private String name;
	/**
	 * �Ա�
	 */
	private String sex;
	/**
	 * ����
	 */
	private Integer age;
	/**
	 * ֤������
	 */
	private cfttype cid;
	/**
	 * ֤������
	 */
	private String cftnumber;
	/**
	 * ��Ա����
	 */
	private memberType mid;
	/**
	 * ��ɫ����
	 */
	private role rid;
	/**
	 * �绰
	 */
	private Long phone;
	/**
	 * ����
	 */
	private String email;
	/**
	 * ��������
	 */
	private Long zipcode;
	/**
	 * �ջ��ַ
	 */
	private String address;
	/**
	 * ������
	 */
	private String openperson;
	/**
	 * ����֤����
	 */
	private String opennumber;
	/**
	 * ���֤ͼƬ
	 */
	private Byte[] idtprint;
	/**
	 * ���п�ͼƬ
	 */
	private Byte[] bankprint;
	/**
	 * ���һ���޸�ʱ��
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
