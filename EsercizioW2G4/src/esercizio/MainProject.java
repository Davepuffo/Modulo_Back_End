package esercizio;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;

public class MainProject {
	
	public static void main(String[] args) {
	
		Product p1 = new Product(1L, "caricatore", "informatic", 30.2);
		Product p2 = new Product(2L, "oliver twist", "book", 24.2);
		Product p3 = new Product(3L, "acqua", null, 82.3);
		Product p4 = new Product(4L, "bicchiere", null, 2.1);
		Product p5 = new Product(5L, "monitor", "informatic", 400.5);
		
		Customer c1 = new Customer(1L, "Franco", 1);
		Customer c2 = new Customer(2L, "Roberto", 2);
		Customer c3 = new Customer(3L, "Gianni", 1);
		
		Order o1 = new Order();
		Order o2 = new Order();
		Order o3 = new Order();
		
		
		
		List <Product> listaProdotti = new ArrayList<Product>();
		
		
		List <Order> listaOrdini = new ArrayList<Order>();
		
	}
	
	public static List<Product> prodottiBooks (List <Product> l, String book){
		return l.stream()
				.filter(e -> e.getCategory().equals(book))
				.filter(e -> e.getPrice() > 100)
				.collect(Collectors.toList());
	}
	
	public static List<Order> ordiniBaby (List <Order> list, String baby){
		return list.stream()
				.filter(e -> ((Product) e.getProducts().stream()).getCategory().equals(baby))
				.collect(Collectors.toList());
	}

	public static List<Product> aggiungiSconto (List <Product> l, String boys){
				l.stream()
				.filter(e -> e.getCategory().equals(boys))
				.map(a -> {
					Product p1 = a
					p1.setPrice((p1.getPrice() * 90) / 100))
					return p1;
				}
				.collect(Collectors.toList());		
			return l;
	}
	
	public static List<Product> prodottiOrdinati (List <Order> o){
		List <Product> listaProdotti = new ArrayList<Product>();
		o.stream()
		.filter(e -> e.getOrderDate().;		
		return listaProdotti;
	}
	
	
}
