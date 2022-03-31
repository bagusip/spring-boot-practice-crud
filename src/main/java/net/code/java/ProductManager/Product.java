package net.code.java.ProductManager;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Product {
	private Long id;
	
    @NotNull(message = "Name can not be null!!")
    @NotEmpty(message = "Name can not be empty!!")
	private String name;
	
    @NotNull(message = "Brand can not be null!!")
    @NotEmpty(message = "Brand can not be empty!!")
	private String brand;
	
    @NotNull(message = "Made in can not be null!!")
    @NotEmpty(message = "Made in can not be empty!!")
	private String madein;
	
    @NotNull(message = "Price in can not be null!!")
    @NotEmpty(message = "Price in can not be empty!!")
	private float price;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getMadein() {
		return madein;
	}

	public void setMadein(String madein) {
		this.madein = madein;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
}
