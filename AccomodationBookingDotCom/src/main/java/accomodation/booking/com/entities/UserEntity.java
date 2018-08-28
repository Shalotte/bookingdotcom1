package accomodation.booking.com.entities;


import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "users_table")

public class UserEntity {

//Details
		@Id 
		@Column(name="user_id")
		@GeneratedValue
		
		private Long id;
		
		@OneToMany
		@Cascade( value = org.hibernate.annotations.CascadeType.ALL)
		private Set<PaymentEntity> paymentEntity;
		
		@OneToMany
		@Cascade( value = org.hibernate.annotations.CascadeType.ALL)
		private Set<BookingEntity> booking_entity;
		
		
		

		@Column(name="email")
	    private String email;
	    
	    @Column(name="password")
	    private String password;
	    
	    @Column(name="phone")
	    private String phone;
	    
	    @Column(name="type")
	    private String type;
	    
	    @Column(name="user_name")
	    private String user_name;
	    
	    @Column(name="first_name")
	    private String first_name;
	    
	    @Column(name="last_name")
	    private String last_name;
	    
//getters and setters

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getUser_name() {
			return user_name;
		}

		public void setUser_name(String user_name) {
			this.user_name = user_name;
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

		@Override
		public String toString() {
			return "UserEntity [id=" + id + ", email=" + email + ", password=" + password + ", phone=" + phone
					+ ", type=" + type + ", user_name=" + user_name + ", first_name=" + first_name + ", last_name="
					+ last_name + "]";
		}

		public UserEntity() {
		}

		public UserEntity(String email, String password, String phone, String type, String user_name, String first_name,
				String last_name) {
			this.email = email;
			this.password = password;
			this.phone = phone;
			this.type = type;
			this.user_name = user_name;
			this.first_name = first_name;
			this.last_name = last_name;
		}
	    

		
		
	    }
	  
	

