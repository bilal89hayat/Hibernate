package com.social.blog.user.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;



@Entity
@Table(name = "user_address")
public class UserAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Size(max = 15)
	private String street;

	@Size(max = 15)
	private String city;

	@Size(max = 15)
	private String landMark;

	public UserAddress() {

	}

	public UserAddress(Long id, @Size(max = 15) String street, @Size(max = 15) String city,
			@Size(max = 15) String landMark) {
		this.id = id;
		this.street = street;
		this.city = city;
		this.landMark = landMark;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

}
