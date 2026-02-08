package com.product.controller;

import java.util.List;

import com.product.entity.Products;
import com.product.services.ProductServices;

public class ProductController {

	ProductServices ps = new ProductServices();

	public int addProduct(Products pro) {
		int id = ps.addProduct(pro);
		if (id > 0) {
			System.out.println("Product Added to Inventory at Id --> " + id);
			return id;
		} else {
			System.out.println("Product Insertion field !!!");
			return 0;
		}

	}

	public int addMulProducts(List<Products> pros) {
		int count = ps.addMulProducts(pros);
		if (count > 0) {
			System.out.println(count + "Products Added to Inventory !!!");
			return count;
		} else {
			System.out.println("Products Insertion field !!!");
			return 0;
		}
	}

	public int updateProductById(int id, Products pro) {
		int row = ps.updateProductById(id, pro);
		if (row > 0) {
			System.out.println(id + " --> Id Product is updated...");
			return id;
		} else {
			System.out.println(id + " --> Id Product is Not updated...");
			return 0;
		}
	}

	public int deleteProductById(int id) {
		int row = ps.deleteProductById(id);
		if (row > 0) {
			System.out.println(id + " --> Product Deleted Successfully...");
			return id;
		} else {
			System.out.println(id + " --> Product Not Found...");
			return 0;

		}
	}

	public Products getProductById(int id) {
		Products pro = ps.getProductById(id);
		if (pro != null) {
			System.out.println(pro);
			return pro;
		} else {
			System.out.println("Product not found at id -->" + id);
			return null;
		}
	}

	public List<Products> getAllProducts() {
		for (Products pro : ps.getAllProducts()) {
			System.out.println(pro);
		}
		return ps.getAllProducts();
	}

	public List<Products> getProductsByCategory(String category) {
		List<Products> pros = ps.getProductsByCategory(category);
		if (pros != null && pros.size() > 0) {
			for (Products prods : pros) {
				System.out.println(prods);
			}
			return pros;
		} else {
			System.out.println("No Products Found for Category --> " + category);
			return null;
		}
	}

	public List<Products> getProductsByName(String name) {
		List<Products> pros = ps.getProductsByName(name);
		if (pros != null && pros.size() > 0) {
			for (Products prods : pros) {
				System.out.println(prods);
			}
			return pros;
		} else {
			System.out.println("No Products Found of Name--> " + name);
			return null;
		}
	}

	public List<Products> getProductsPriceGreaterThan(double price) {
		if (price >= 0 && ps.getProductsPriceGreaterThan(price) != null
				&& ps.getProductsPriceGreaterThan(price).size() > 0) {
			for (Products pro : ps.getProductsPriceGreaterThan(price)) {
				System.out.println(pro);
			}
			return ps.getProductsPriceGreaterThan(price);
		} else {
			System.out.println("Products not found for greater than this price !!!");
			return null;
		}
	}

	public List<Products> getProductsPriceLessThan(double price) {
		if (ps.getProductsPriceLessThan(price).size() > 0) {
			for (Products pro : ps.getProductsPriceLessThan(price)) {
				System.out.println(pro);
			}
			return ps.getProductsPriceLessThan(price);
		} else {
			System.out.println("Product not avaliable for below than that price !!!");
			return null;
		}
	}

	public List<Products> getProductsBetweenPrice(double min, double max) {
		if (ps.getProductsBetweenPrice(min, max).size() > 0 && ps.getProductsBetweenPrice(min, max) != null && min < max
				&& max > 0) {
			for (Products pro : ps.getProductsBetweenPrice(min, max)) {
				System.out.println(pro);
			}
			return ps.getProductsBetweenPrice(min, max);
		} else {
			System.out.println("Product not avaliable for this price range !!!");
			return null;
		}
	}

	public List<Products> getProductsOrderByPriceAsc() {
		for (Products pro : ps.getProductsOrderByPriceAsc()) {
			System.out.println(pro);
		}
		return ps.getProductsOrderByPriceAsc();
	}

	public List<Products> getProductsOrderByPriceDesc() {
		for (Products pro : ps.getProductsOrderByPriceDesc()) {
			System.out.println(pro);
		}
		return ps.getProductsOrderByPriceDesc();
	}

	public List<Products> getProductsWithWarrantyGreaterThan(int months) {
		if (ps.getProductsWithWarrantyGreaterThan(months).size() > 0) {
			for (Products pro : ps.getProductsWithWarrantyGreaterThan(months)) {
				System.out.println(pro);
			}
			return ps.getProductsWithWarrantyGreaterThan(months);
		} else {
			System.out.println("No Product avaliable for this much Warranty !!! ");
			return null;
		}
	}

	public List<Products> getAvailableProducts() {
		if (ps.getAvailableProducts().size() > 0) {
			for (Products pro : ps.getAvailableProducts()) {
				System.out.println(pro);
			}

		}
		return ps.getAvailableProducts();
	}

	public List<Products> getOutOfStockProducts() {
		if (ps.getOutOfStockProducts().size() > 0) {
			for (Products pro : ps.getOutOfStockProducts()) {
				System.out.println(pro);
			}
			return ps.getOutOfStockProducts();
		} else {
			System.out.println("All Products Are avaliable in Stock");
			return null;
		}

	}

	public List<Products> getProductsManufacturedAfter(String mfgDate) {

		List<Products> products = ps.getProductsManufacturedAfter(mfgDate);

		if (products.isEmpty()) {
			System.out.println("No products available after this manufacturing date");
		} else {
			for (Products pro : products) {
				System.out.println(pro);
			}
		}

		return products;
	}

	public List<Products> getProductsExpiringBefore(String expDate) {

		List<Products> products = ps.getProductsExpiringBefore(expDate);

		if (products.isEmpty()) {
			System.out.println("No products available before this Expiring date");
		} else {
			for (Products pro : products) {
				System.out.println(pro);
			}
		}

		return products;
	}

	public List<Products> getProductsByCategoryAndPrice(String category, double price) {

		List<Products> products = ps.getProductsByCategoryAndPrice(category, price);

		if (products.isEmpty()) {
			System.out.println("No products available after this manufacturing date");
		} else {
			for (Products pro : products) {
				System.out.println(pro);
			}
		}

		return products;
	}

	public List<Products> searchProductsByName(String keyword) {

		List<Products> products = ps.searchProductsByName(keyword);

		if (products.isEmpty()) {
			System.out.println("No products available for this name");
		} else {
			for (Products pro : products) {
				System.out.println(pro);
			}
		}

		return products;
	}

	public Long countTotalProducts() {
		Long count = ps.countTotalProducts();
		System.out.println("Total Products in Inventory: " + count);
		return count;
	}

	public List<Products> getMaxPricedProducts() {
		List<Products> products = ps.getMaxPricedProducts();
		for (Products p : products) {
			System.out.println(p);
		}
		return products;
	}

	public List<Products> getMinPricedProducts() {
		List<Products> products = ps.getMinPricedProducts();
		for (Products p : products) {
			System.out.println(p);
		}
		return products;
	}

	public Double getAverageProductPrice() {
		Double avg = ps.getAverageProductPrice();
		System.out.println("Average Product Price: " + avg);
		return avg;
	}

	public Long getTotalStockCount() {
		Long stock = ps.getTotalStockCount();
		System.out.println("Total Stock Quantity: " + stock);
		return stock;
	}

	public List<String> getDistinctCategories() {
		List<String> categories = ps.getDistinctCategories();
		for (String c : categories) {
			System.out.println(c);
		}
		return categories;
	}

	public List<Object[]> getProductCountByCategory() {
		List<Object[]> data = ps.getProductCountByCategory();
		for (Object[] row : data) {
			System.out.println("Category: " + row[0] + ", Count: " + row[1]);
		}
		return data;
	}

	public List<Object[]> getCategoryWiseAveragePrice() {
		List<Object[]> data = ps.getCategoryWiseAveragePrice();
		for (Object[] row : data) {
			System.out.println("Category: " + row[0] + ", Avg Price: " + row[1]);
		}
		return data;
	}

	public List<Object[]> getWarrantyWiseProductCount() {
		List<Object[]> data = ps.getWarrantyWiseProductCount();
		for (Object[] row : data) {
			System.out.println("Warranty: " + row[0] + " months, Count: " + row[1]);
		}
		return data;
	}

	public Double getTotalInventoryValue() {
		Double value = ps.getTotalInventoryValue();
		System.out.println("Total Inventory Value: " + value);
		return value;
	}

	public List<Products> getHighestStockProducts() {
		List<Products> products = ps.getHighestStockProducts();
		for (Products p : products) {
			System.out.println(p);
		}
		return products;
	}

	public List<Products> getLowestStockProducts() {
		List<Products> products = ps.getLowestStockProducts();
		for (Products p : products) {
			System.out.println(p);
		}
		return products;
	}

	public List<Products> getProductsAboveAveragePrice() {
		List<Products> products = ps.getProductsAboveAveragePrice();
		for (Products p : products) {
			System.out.println(p);
		}
		return products;
	}

	public List<Products> getProductsBelowAveragePrice() {
		List<Products> products = ps.getProductsBelowAveragePrice();
		for (Products p : products) {
			System.out.println(p);
		}
		return products;
	}

	public List<Products> getProductsWithZeroWarranty() {
		List<Products> products = ps.getProductsWithZeroWarranty();
		for (Products p : products) {
			System.out.println(p);
		}
		return products;
	}

}
