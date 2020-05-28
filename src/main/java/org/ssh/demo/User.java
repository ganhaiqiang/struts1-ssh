package org.ssh.demo;

/**
 * @Desc: TODO
 * @author: GanHaiqiang
 * @date: 2020-05-26 10:18
 */
public class User {
	private String id;
	private String name;
	private Integer age;

	/**
	 * 
	 */
	public User() {
		super();
	}

	/**
	 * @param id
	 * @param name
	 * @param age
	 */
	public User(String id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [id="
				+ id
				+ ", name="
				+ name
				+ ", age="
				+ age
				+ "]";
	}
}
