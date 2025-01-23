package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionsRunner {
	public static void main(String[] args) {
		AddressDto address = new AddressDto(2, 32, "btm", "banglore", "karnataka", 560041);
		AddressDto address2 = new AddressDto(5, 32, "btm", "banglore", "karnataka", 560041);
		AddressDto address3 = new AddressDto(1, 31, "btm", "banglore", "karnataka", 560044);
		AddressDto address1 = new AddressDto(1, 12, "MG Road", "Bangalore", "Karnataka", 560001);
		AddressDto address8 = new AddressDto(2, 24, "Koramangala", "Bangalore", "Karnataka", 560034);
		AddressDto address9 = new AddressDto(3, 31, "BTM", "Bangalore", "Karnataka", 560044);
		AddressDto address4 = new AddressDto(4, 56, "HSR Layout", "Bangalore", "Karnataka", 560102);
		AddressDto address5 = new AddressDto(5, 18, "Jayanagar", "Bangalore", "Karnataka", 560041);
		AddressDto address6 = new AddressDto(6, 9, "Indiranagar", "Bangalore", "Karnataka", 560038);
		AddressDto address7 = new AddressDto(7, 45, "Whitefield", "Bangalore", "Karnataka", 560066);

		BrandDto brand = new BrandDto(1, 2345, "puma", address);
		BrandDto brand1 = new BrandDto(1, 2345, "Bata", address1);
		BrandDto brand2 = new BrandDto(2, 4567, "Liberty", address2);
		BrandDto brand3 = new BrandDto(3, 7890, "Relaxo", address3);
		BrandDto brand4 = new BrandDto(4, 1122, "Allen Soley", address4);
		BrandDto brand5 = new BrandDto(5, 3344, "Action", address5);
		BrandDto brand6 = new BrandDto(6, 5566, "Hush Puppies", address6);
		BrandDto brand7 = new BrandDto(7, 7788, "Khadi", address7);
		BrandDto brand8 = new BrandDto(8, 9900, "Woodland", address8);
		BrandDto brand9 = new BrandDto(9, 1234, "Jeans India", address2);
		BrandDto brand10 = new BrandDto(10, 5678, "Monte Carlo", address9);

		ProductDto product = new ProductDto(2, "Sneakers", brand10, ProductTypeEnum.FOOTWEAR, 2);
		ProductDto product1 = new ProductDto(1, "Running Shoes", brand1, ProductTypeEnum.FOOTWEAR, 50);
		ProductDto product2 = new ProductDto(3, "Casual Shoes", brand2, ProductTypeEnum.FOOTWEAR, 30);
		ProductDto product3 = new ProductDto(4, "Sports T-shirt", brand3, ProductTypeEnum.CLOTHS, 100);
		ProductDto product4 = new ProductDto(5, "Track Pants", brand4, ProductTypeEnum.CLOTHS, 70);
		ProductDto product5 = new ProductDto(6, "Winter Jacket", brand5, ProductTypeEnum.CLOTHS, 20);
		ProductDto product6 = new ProductDto(7, "Boots", brand6, ProductTypeEnum.FOOTWEAR, 15);
		ProductDto product7 = new ProductDto(8, "Sweatshirt", brand7, ProductTypeEnum.CLOTHS, 60);
		ProductDto product8 = new ProductDto(9, "Flip Flops", brand8, ProductTypeEnum.FOOTWEAR, 120);
		ProductDto product9 = new ProductDto(10, "Raincoat", brand9, ProductTypeEnum.CLOTHS, 40);

		List<ProductDto> products = new ArrayList<>();
		products.add(product);
		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product4);
		products.add(product5);
		products.add(product6);
		products.add(product7);
		products.add(product8);
		products.add(product9);

		List<ProductDto> pincode = products.stream().filter(p -> p.getBrand().getAddress().getPincode() == 560041)
				.collect(Collectors.toList());
		System.out.println(pincode);
		Optional<AddressDto> productName = products.stream().filter(p -> p.getProductName().equalsIgnoreCase("boots"))
				.map(p -> p.getBrand().getAddress()).findFirst();
		System.out.println(productName);
		Optional<BrandDto> brandDto = products.stream().filter(p -> p.getId() == 1).map(ProductDto::getBrand)
				.findFirst();
		System.out.println(brandDto);
		Optional<AddressDto> addressDto = products.stream().filter(p -> p.getBrand().getId() == 2)
				.map(p -> p.getBrand().getAddress()).findFirst();
		System.out.println(addressDto);
		int maxPrice = products.stream().mapToInt(p -> p.getBrand().getPrice()).max().orElse(0);
		List<ProductDto> maxPricedProducts = products.stream().filter(p -> p.getBrand().getPrice() == maxPrice)
				.collect(Collectors.toList());
		System.out.println(maxPricedProducts);
	}

}
