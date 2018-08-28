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
@Table(name="payment_table")

public class PaymentEntity {
	
    @Id 
    @Column(name="payment_id")
    @GeneratedValue
     private Long id;
    
    @ManyToOne
    @Cascade( value = org.hibernate.annotations.CascadeType.ALL)
    private UserEntity user_entity;
      
    
    @Column(name="card_holder_name")
    private String card_holder_name;
    
    @Column(name="card_type")
    private String card_type;
    
    @Column(name="card_number")
    private String card_number;
    
    @Column(name="expiry_date")
    private String expiry_date;
    
    @Column(name="cvc")
    private String cvc;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getCard_holder_name() {
		return card_holder_name;
	}

	public void setCard_holder_name(String card_holder_name) {
		this.card_holder_name = card_holder_name;
	}

	public String getCard_type() {
		return card_type;
	}

	public void setCard_type(String card_type) {
		this.card_type = card_type;
	}

	public String getCard_number() {
		return card_number;
	}

	public void setCard_number(String card_number) {
		this.card_number = card_number;
	}

	public String getExpiry_date() {
		return expiry_date;
	}

	public void setExpiry_date(String expiry_date) {
		this.expiry_date = expiry_date;
	}

	public String getCvc() {
		return cvc;
	}

	public void setCvc(String cvc) {
		this.cvc = cvc;
	}

	public PaymentEntity() {
		
	}

	public PaymentEntity( String card_holder_name, String card_type, String card_number,
			String expiry_date, String cvc) {
		
		this.card_holder_name = card_holder_name;
		this.card_type = card_type;
		this.card_number = card_number;
		this.expiry_date = expiry_date;
		this.cvc = cvc;
	}

	@Override
	public String toString() {
		return "PaymentEntity [id=" + id + ", card_holder_name=" + card_holder_name
				+ ", card_type=" + card_type + ", card_number=" + card_number + ", expiry_date=" + expiry_date
				+ ", cvc=" + cvc + "]";
	}

	public UserEntity getUser_entity() {
		return user_entity;
	}

	public void setUser_entity(UserEntity user_entity) {
		this.user_entity = user_entity;
	}
    
}
