package accomodation.booking.com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="booking")
public class BookingEntity {
	
	 @Id
	 @Column(name="booking_id")
	 @GeneratedValue(generator="system-uuid")
	 @GenericGenerator(name="system-uuid", strategy= "uuid")
	 private String id;
	 
	 @ManyToOne
	 @Cascade( value = org.hibernate.annotations.CascadeType.ALL)
	 private UserEntity user_entity;
	 
	
	 
	 @Column(name="payment_id")
	 private String payment_id;
	 
	 @Column(name="title")
	 private String title;
	 
	 @Column(name="first_name")
	 private String first_name;
	 
	 @Column(name="last_name")
	 private String last_name;
	 
	 
	 @Column(name="email_address")
	 private String email_address;
	 
	 @Column(name="street_address")
	 private String street_address;
	 
	 @Column(name="city")
	 private String city;
	 
	 @Column(name="zip_code")
	 private String zip_code;
	 
	 @Column(name="country")
	 private String country;
	 
	 @Column(name="telephone")
	 private String telephone;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	

	public String getPayment_id() {
		return payment_id;
	}

	public void setPayment_id(String payment_id) {
		this.payment_id = payment_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail_address() {
		return email_address;
	}

	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}

	public String getStreet_address() {
		return street_address;
	}

	public void setStreet_address(String street_address) {
		this.street_address = street_address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip_code() {
		return zip_code;
	}

	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public BookingEntity() {
	}

	public BookingEntity(String payment_id, String title, String first_name, String last_name,
			String email_address, String street_address, String city, String zip_code, String country,
			String telephone) {
	
		this.payment_id = payment_id;
		this.title = title;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email_address = email_address;
		this.street_address = street_address;
		this.city = city;
		this.zip_code = zip_code;
		this.country = country;
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "BookingEntity [id=" + id + ", payment_id=" + payment_id + ", title=" + title
				+ ", first_name=" + first_name + ", last_name=" + last_name + ", email_address=" + email_address
				+ ", street_address=" + street_address + ", city=" + city + ", zip_code=" + zip_code + ", country="
				+ country + ", telephone=" + telephone + "]";
	}
	 	

}
