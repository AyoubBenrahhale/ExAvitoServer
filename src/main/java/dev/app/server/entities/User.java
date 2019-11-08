package dev.app.server.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
public class User {
	@GeneratedValue
	@Id
	private Long id;

	@NotEmpty
	private String Name;
	
	@NotEmpty
	@Email
	private String Mail;
	
	@NotEmpty
	private String Avatar;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(@NotEmpty String name, @NotEmpty @Email String mail, @NotEmpty String avatar) {
		super();
		Name = name;
		Mail = mail;
		Avatar = avatar;
	}

	public User(Long id, @NotEmpty String name, @NotEmpty String mail, @NotEmpty String avatar) {
		super();
		this.id = id;
		Name = name;
		Mail = mail;
		Avatar = avatar;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getMail() {
		return Mail;
	}

	public void setMail(String mail) {
		Mail = mail;
	}

	public String getAvatar() {
		return Avatar;
	}

	public void setAvatar(String avatar) {
		Avatar = avatar;
	}

	
}
