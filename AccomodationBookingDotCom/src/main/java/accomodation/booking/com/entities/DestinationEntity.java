package accomodation.booking.com.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name ="destination")
public class DestinationEntity {
	
   @Id 
   @GeneratedValue(generator="system-uuid")
   @GenericGenerator(name="system-uuid", strategy = "uuid")
   private String id;

 //Columns
   @Column(name="province")
   private String province;

   @Column(name="city")
   private String city;

   @Column(name="street_address")
   private String street_address;

   @Column(name="check_in_date")
   private Date check_in_date;

   @Column(name="check_out_date")
   private Date check_out_date;

   @Column(name = "rooms")
   private int rooms;

   @Column(name = "adults")
   private int adults;

   @Column(name = "children")
   private int children;

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getProvince() {
	return province;
}

public void setProvine(String province) {
	this.province = province;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getStreet_address() {
	return street_address;
}

public void setStreet_address(String street_address) {
	this.street_address = street_address;
}

public Date getCheck_in_date() {
	return check_in_date;
}

public void setCheck_in_date(Date check_in_date) {
	this.check_in_date = check_in_date;
}

public Date getCheck_out_date() {
	return check_out_date;
}

public void setCheck_out_date(Date check_out_date) {
	this.check_out_date = check_out_date;
}

public int getRooms() {
	return rooms;
}

public void setRooms(int rooms) {
	this.rooms = rooms;
}

public int getAdults() {
	return adults;
}

public void setAdults(int adults) {
	this.adults = adults;
}

public int getChildren() {
	return children;
}

public void setChildren(int children) {
	this.children = children;
}

public DestinationEntity() {
}




public DestinationEntity(String province, String city, String street_address, Date check_in_date, Date check_out_date,
		int rooms, int adults, int children) {
	super();
	this.province = province;
	this.city = city;
	this.street_address = street_address;
	this.check_in_date = check_in_date;
	this.check_out_date = check_out_date;
	this.rooms = rooms;
	this.adults = adults;
	this.children = children;
}

@Override
public String toString() {
	return "DestinationEntity [id=" + id + ", province=" + province + ", city=" + city + ", street_address="
			+ street_address + ", check_in_date=" + check_in_date + ", check_out_date=" + check_out_date + ", rooms="
			+ rooms + ", adults=" + adults + ", children=" + children + "]";
}




  
   
}



   


