package com.myapp.Shopping_Simplified;
import java.util.Scanner;
public class ProductComparisonApp {

	    public static void main(String[] args) {
	        DatabaseHelper dbHelper = new DatabaseHelper();
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter product name:");
	        String productName = scanner.nextLine();

	        String flipkartPrice = getFlipkartPrice(productName);  // Placeholder for scraping function
	        String amazonPrice = getAmazonPrice(productName);  // Placeholder for scraping function

	        if (!flipkartPrice.equals("0")) {
	            dbHelper.insertProduct(productName + " (Flipkart)", flipkartPrice);
	        }
	        if (!amazonPrice.equals("0")) {
	            dbHelper.insertProduct(productName + " (Amazon)", amazonPrice);
	        }
	    }

	    // Placeholder function for Flipkart scraping (you can implement this with a library like Jsoup)
	    private static String getFlipkartPrice(String productName) {
	        // Implement actual scraping logic here
	        return "₹50,000";
	    }

	    // Placeholder function for Amazon scraping (you can implement this with a library like Jsoup)
	    private static String getAmazonPrice(String productName) {
	        // Implement actual scraping logic here
	        return "₹48,000";
	    }
	}


