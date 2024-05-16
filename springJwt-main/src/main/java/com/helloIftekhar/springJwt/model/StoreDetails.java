package com.helloIftekhar.springJwt.model;




import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "store_details")
public class StoreDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "storeDetails")
//    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;


	private String storeName;

	private String street;

	private String city;

	private String country;

	private String state;

	private String zipCode;

	public StoreDetails() {

	}

	public StoreDetails( String storeName,String street, String city,
			String country, String state, String zipCode) {
		super();
		
		
		this.storeName = storeName;
		this.street = street;
		this.city = city;
		this.country = country;
		this.state = state;
		this.zipCode = zipCode;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "StoreDetails [id=" + id + ", user=" + user + ", storeName=" + storeName + ", street=" + street
				+ ", city=" + city + ", country=" + country + ", state=" + state + ", zipCode=" + zipCode + "]";
	}

}
