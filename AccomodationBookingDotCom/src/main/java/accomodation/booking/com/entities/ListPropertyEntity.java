package accomodation.booking.com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "listing_table")

public class ListPropertyEntity {

	 @Id
	 @Column(name="property_id")
	 @GeneratedValue(generator="system-uuid")
	 @GenericGenerator(name="system-uuid", strategy= "uuid")
	 private String id;
	 
	 @Column(name="user_id")
	 private String user_id;
	 
	 @Column(name="property_name")
	 private String property_name;
	 
	 @Column(name = "property_manager_name")
	 private String property_manager_name;
	 
	 @Column(name="property_manager_contact_details")
	 private String property_manager_contact_details;
	 
	 @Column(name="property_street_address")
	 private String property_street_address;
	 
	 @Column(name="property_city_name")
	 private String property_city_name;
	 
	 @Column(name = "propety_country_name")
	 private String property_country_name;
	 
	 @Column(name="zip_code")
	 private int zip_code;
	 
	 @Column(name="apartment_type")
	 private String apartment_type;
	 
	 @Column(name = "number_of_bedrooms")
	 private int number_of_bedrooms;
	 
	 @Column(name="number_of_living_rooms")
	 private int number_of_living_rooms;
	 
	 @Column(name="number_of_bathrooms")
	 private int number_of_bathrooms;
	 
	 @Column(name="price_per_night")
	 private int price_per_night;
	 
	 @Column(name="internet_available")
	 private String internet_available;
	 
	 @Column(name="free_internet")
	 private String free_internet;
	 
	 @Column(name="parking_available")
	 private String parking_available;
	 
	 @Column(name="language_spoken")
	 private String language_spoken;
	 
	 @Column(name="smoking_allowed")
	 private String smoking_allowed;
	 
	 @Column(name="children_accommodated")
	 private String children_accommodated;
	 
	 @Column(name="pets_allowed")
	 private String pets_allowed;
	 
	 @Column(name="minimum_stay")
	 private int minimum_stay;
	 
	 @Column(name="payment_method")
	 private String payment_method;
	 
	 @Column(name="cleaning_fees")
	 private String cleaning_fees;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getProperty_name() {
		return property_name;
	}

	public void setProperty_name(String property_name) {
		this.property_name = property_name;
	}

	public String getProperty_manager_name() {
		return property_manager_name;
	}

	public void setProperty_manager_name(String property_manager_name) {
		this.property_manager_name = property_manager_name;
	}

	public String getProperty_manager_contact_details() {
		return property_manager_contact_details;
	}

	public void setProperty_manager_contact_details(String property_manager_contact_details) {
		this.property_manager_contact_details = property_manager_contact_details;
	}

	public String getProperty_street_address() {
		return property_street_address;
	}

	public void setProperty_street_address(String property_street_address) {
		this.property_street_address = property_street_address;
	}

	public String getProperty_city_name() {
		return property_city_name;
	}

	public void setProperty_city_name(String property_city_name) {
		this.property_city_name = property_city_name;
	}

	public String getProperty_country_name() {
		return property_country_name;
	}

	public void setProperty_country_name(String property_country_name) {
		this.property_country_name = property_country_name;
	}

	public int getZip_code() {
		return zip_code;
	}

	public void setZip_code(int zip_code) {
		this.zip_code = zip_code;
	}

	public String getApartment_type() {
		return apartment_type;
	}

	public void setApartment_type(String apartment_type) {
		this.apartment_type = apartment_type;
	}

	public int getNumber_of_bedrooms() {
		return number_of_bedrooms;
	}

	public void setNumber_of_bedrooms(int number_of_bedrooms) {
		this.number_of_bedrooms = number_of_bedrooms;
	}

	public int getNumber_of_living_rooms() {
		return number_of_living_rooms;
	}

	public void setNumber_of_living_rooms(int number_of_living_rooms) {
		this.number_of_living_rooms = number_of_living_rooms;
	}

	public int getNumber_of_bathrooms() {
		return number_of_bathrooms;
	}

	public void setNumber_of_bathrooms(int number_of_bathrooms) {
		this.number_of_bathrooms = number_of_bathrooms;
	}

	public int getPrice_per_night() {
		return price_per_night;
	}

	public void setPrice_per_night(int price_per_night) {
		this.price_per_night = price_per_night;
	}

	public String getInternet_available() {
		return internet_available;
	}

	public void setInternet_available(String internet_available) {
		this.internet_available = internet_available;
	}

	public String getFree_internet() {
		return free_internet;
	}

	public void setFree_internet(String free_internet) {
		this.free_internet = free_internet;
	}

	public String getParking_available() {
		return parking_available;
	}

	public void setParking_available(String parking_available) {
		this.parking_available = parking_available;
	}

	public String getLanguage_spoken() {
		return language_spoken;
	}

	public void setLanguage_spoken(String language_spoken) {
		this.language_spoken = language_spoken;
	}

	public String getSmoking_allowed() {
		return smoking_allowed;
	}

	public void setSmoking_allowed(String smoking_allowed) {
		this.smoking_allowed = smoking_allowed;
	}

	public String getChildren_accommodated() {
		return children_accommodated;
	}

	public void setChildren_accommodated(String children_accommodated) {
		this.children_accommodated = children_accommodated;
	}

	public String getPets_allowed() {
		return pets_allowed;
	}

	public void setPets_allowed(String pets_allowed) {
		this.pets_allowed = pets_allowed;
	}

	public int getMinimum_stay() {
		return minimum_stay;
	}

	public void setMinimum_stay(int minimum_stay) {
		this.minimum_stay = minimum_stay;
	}

	public String getPayment_method() {
		return payment_method;
	}

	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}

	public String getCleaning_fees() {
		return cleaning_fees;
	}

	public void setCleaning_fees(String cleaning_fees) {
		this.cleaning_fees = cleaning_fees;
	}

	public ListPropertyEntity() {
	}

	public ListPropertyEntity(String user_id, String property_name, String property_manager_name,
			String property_manager_contact_details, String property_street_address, String property_city_name,
			String property_country_name, int zip_code, String apartment_type, int number_of_bedrooms,
			int number_of_living_rooms, int number_of_bathrooms, int price_per_night, String internet_available,
			String free_internet, String parking_available, String language_spoken, String smoking_allowed,
			String children_accommodated, String pets_allowed, int minimum_stay, String payment_method,
			String cleaning_fees) {
		super();
		this.user_id = user_id;
		this.property_name = property_name;
		this.property_manager_name = property_manager_name;
		this.property_manager_contact_details = property_manager_contact_details;
		this.property_street_address = property_street_address;
		this.property_city_name = property_city_name;
		this.property_country_name = property_country_name;
		this.zip_code = zip_code;
		this.apartment_type = apartment_type;
		this.number_of_bedrooms = number_of_bedrooms;
		this.number_of_living_rooms = number_of_living_rooms;
		this.number_of_bathrooms = number_of_bathrooms;
		this.price_per_night = price_per_night;
		this.internet_available = internet_available;
		this.free_internet = free_internet;
		this.parking_available = parking_available;
		this.language_spoken = language_spoken;
		this.smoking_allowed = smoking_allowed;
		this.children_accommodated = children_accommodated;
		this.pets_allowed = pets_allowed;
		this.minimum_stay = minimum_stay;
		this.payment_method = payment_method;
		this.cleaning_fees = cleaning_fees;
	}

	@Override
	public String toString() {
		return "ListPropertyEntity [id=" + id + ", user_id=" + user_id + ", property_name=" + property_name
				+ ", property_manager_name=" + property_manager_name + ", property_manager_contact_details="
				+ property_manager_contact_details + ", property_street_address=" + property_street_address
				+ ", property_city_name=" + property_city_name + ", property_country_name=" + property_country_name
				+ ", zip_code=" + zip_code + ", apartment_type=" + apartment_type + ", number_of_bedrooms="
				+ number_of_bedrooms + ", number_of_living_rooms=" + number_of_living_rooms + ", number_of_bathrooms="
				+ number_of_bathrooms + ", price_per_night=" + price_per_night + ", internet_available="
				+ internet_available + ", free_internet=" + free_internet + ", parking_available=" + parking_available
				+ ", language_spoken=" + language_spoken + ", smoking_allowed=" + smoking_allowed
				+ ", children_accommodated=" + children_accommodated + ", pets_allowed=" + pets_allowed
				+ ", minimum_stay=" + minimum_stay + ", payment_method=" + payment_method + ", cleaning_fees="
				+ cleaning_fees + "]";
	}
	 
	
	
	 
	 
	 
	 
	 
	 
	 
	 
	
	
	

}
