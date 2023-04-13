package ProjectFactory;

public class Product {

	private String ProductName;
	private String Type;
	private Integer Quantity;
	private Integer Size;
	private Double Price;
	private Double TotalPrice;

	public Product(String productName, String type, Integer quantity, Integer size, Double price, Double totalPrice) {
		super();
		ProductName = productName;
		Type = type;
		Quantity = quantity;
		Size = size;
		Price = price;
		TotalPrice = totalPrice;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public Integer getQuantity() {
		return Quantity;
	}

	public void setQuantity(Integer quantity) {
		Quantity = quantity;
	}

	public Integer getSize() {
		return Size;
	}

	public void setSize(Integer size) {
		Size = size;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}

	public Double getTotalPrice() {
		return TotalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		TotalPrice = totalPrice;
	}

	public Product() {
		super();
	}

	public void displayFormat() {
		System.out.format(
				"---------------------------------------------------------------------------------------------------\n");
		System.out.format("|  ProductName \t Type\t Quantity \t Size\t\t Price\t\t TotalPrice |\n");
		System.out.format(
				"---------------------------------------------------------------------------------------------------\n");
	}
	
	

public static void main(String[] args) {
	
	new Product().displayFormat();
}

}
