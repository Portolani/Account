package entities;

public class Products {

	private String name;
	private Double value;
	private Integer unit;
	
	public Products() {
		
	}

	public Products(String name, Double value, Integer unit) {
		this.name = name;
		this.value = value;
		this.unit = unit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Integer getUnit() {
		return unit;
	}

	public void setUnit(Integer unit) {
		this.unit = unit;
	}
	
	public Double totalValue() {
		 return value * unit;
	}
	
	@Override
	public String toString() {
		return name +
				", " +
				String.format("%.2f", value) +
				", " +
				unit;
	}
	
}
