package library;

import java.util.ArrayList;

/**
 * @author pateld2
 *
 */
public class Driver {

	public static void main(String[] args){
		Author na1 = new Author("Jim", "Kelly", 45, 1);
		Author na2 = new Author("Kim", "Allen", 55, 3);
		Author na3 = new Author("Frank", "Nelson", 32, 1);
		CatalogNumber ncn1 = new CatalogNumber("Horror", 45, "abc");
		ArrayList<Author> authors = new ArrayList<Author>();
		authors.add(na1);
		authors.add(na2);
		authors.add(na3);
		Book b1 = new Book(authors, "Mary had a lamb", 3, ncn1, 5.50);
		for(Author author : authors){
			System.out.println(author.getLastName());
		}
		Author na4 = b1.searchAuthor("Allen");
		
		
		
		
		
		
		
		
		
	}
}
