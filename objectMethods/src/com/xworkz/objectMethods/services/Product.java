package com.xworkz.objectMethods.services;

public class Product {
	public String productName;
	public int noOfProducts;
	public boolean isgood;
	public String productSize;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isgood ? 1231 : 1237);
		result = prime * result + noOfProducts;
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + ((productSize == null) ? 0 : productSize.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (isgood != other.isgood)
			return false;
		if (noOfProducts != other.noOfProducts)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (productSize == null) {
			if (other.productSize != null)
				return false;
		} else if (!productSize.equals(other.productSize))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", noOfProducts=" + noOfProducts + ", isgood=" + isgood
				+ ", productSize=" + productSize + "]";
	}
	

}
