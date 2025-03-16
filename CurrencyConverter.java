package student.com.ka.collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {
	 private static final Map<String, Double> Convert_Currency = new HashMap<>();

	    static {
	    	Convert_Currency.put("USD", 1.0); // US Dollar
	    	Convert_Currency.put("EUR", 0.88); // Euro
	    	Convert_Currency.put("GBP", 0.76); // British Pound
	    	Convert_Currency.put("INR", 74.83); // Indian Rupee
	    	Convert_Currency.put("AUD", 1.48); // Australian Dollar
	    	Convert_Currency.put("CAD", 1.31); // Canadian Dollar
	    	Convert_Currency.put("SGD", 1.35); // Singapore Dollar
	    	Convert_Currency.put("CHF", 0.93); // Swiss Franc
	    	Convert_Currency.put("JPY", 109.97); // Japanese Yen
	    }
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Currency Converter");
			System.out.println("---------------------");

			while (true) {
			    System.out.print("Enter amount: ");
			    double amount = sc.nextDouble();

			    System.out.print("Enter from currency (USD, EUR, GBP, INR, AUD, CAD, SGD, CHF, JPY): ");
			    String fromCurrency = sc.next().toUpperCase();

			    System.out.print("Enter to currency (USD, EUR, GBP, INR, AUD, CAD, SGD, CHF, JPY): ");
			    String toCurrency = sc.next().toUpperCase();

			    if (!Convert_Currency.containsKey(fromCurrency) || !Convert_Currency.containsKey(toCurrency)) {
			        System.out.println("Invalid currency. Please try again.");
			        continue;
			    }

			    double convertcurrency = Convert_Currency.get(toCurrency) / Convert_Currency.get(fromCurrency);
			    double convertedAmount = amount * convertcurrency;

			    System.out.printf("%.2f %s = %.2f %s%n", amount, fromCurrency, convertedAmount, toCurrency);
			}
		}
    }


	}
