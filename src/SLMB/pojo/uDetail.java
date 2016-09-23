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


}
