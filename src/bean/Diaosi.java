package bean;

import java.util.Arrays;

import com.google.gson.annotations.SerializedName;

public class Diaosi {

	@SerializedName("NAME")
	private String name;

	/*
	 * ���� Javadoc��
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Diaosi [name=" + name + ", school=" + school + ", has_girlfirend=" + has_girlfirend + ", age=" + age
				+ ", car=" + car + ", house=" + house + ", major=" + Arrays.toString(major) + ", comment=" + comment
				+ ", birthday=" + birthday + "]";
	}

	private String school;
	private boolean has_girlfirend;
	private double age;
	private Object car;
	private Object house;
	private String[] major;
	private String comment;
	private String birthday;

	// ��Ѹ����Բ�Ҫ����jsonԪ��
	private transient String ignore;

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            Ҫ���õ� name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return school
	 */
	public String getSchool() {
		return school;
	}

	/**
	 * @param school
	 *            Ҫ���õ� school
	 */
	public void setSchool(String school) {
		this.school = school;
	}

	/**
	 * @return has_girlfirend
	 */
	public boolean isHas_girlfirend() {
		return has_girlfirend;
	}

	/**
	 * @param has_girlfirend
	 *            Ҫ���õ� has_girlfirend
	 */
	public void setHas_girlfirend(boolean has_girlfirend) {
		this.has_girlfirend = has_girlfirend;
	}

	/**
	 * @return age
	 */
	public double getAge() {
		return age;
	}

	/**
	 * @param age
	 *            Ҫ���õ� age
	 */
	public void setAge(double age) {
		this.age = age;
	}

	/**
	 * @return car
	 */
	public Object getCar() {
		return car;
	}

	/**
	 * @param car
	 *            Ҫ���õ� car
	 */
	public void setCar(Object car) {
		this.car = car;
	}

	/**
	 * @return house
	 */
	public Object getHouse() {
		return house;
	}

	/**
	 * @param house
	 *            Ҫ���õ� house
	 */
	public void setHouse(Object house) {
		this.house = house;
	}

	/**
	 * @return major
	 */
	public String[] getMajor() {
		return major;
	}

	/**
	 * @param major
	 *            Ҫ���õ� major
	 */
	public void setMajor(String[] major) {
		this.major = major;
	}

	/**
	 * @return comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment
	 *            Ҫ���õ� comment
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * @return birthday
	 */
	public String getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday
	 *            Ҫ���õ� birthday
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	/**
	 * @return ignore
	 */
	public String getIgnore() {
		return ignore;
	}

	/**
	 * @param ignore
	 *            Ҫ���õ� ignore
	 */
	public void setIgnore(String ignore) {
		this.ignore = ignore;
	}

}
