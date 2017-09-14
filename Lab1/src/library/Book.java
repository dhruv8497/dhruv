package library;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * 
 * @author pateld2
 * The Book class creates a book with many attributes. This class can add authors to book as well as sets price, 
 * title, and type of the book
 */
public class Book {

	private ArrayList<Author> authors      //a collection of authors
		= new ArrayList<Author>(5);
	private String title;                 //the book's title
	private int type;  // each int represents a type, 1 = Bio
	private CatalogNumber catalogNumber;  //the book's catalog number
	private boolean checkedOut;           //checks to see if the book is checked out
	private double price;                 //price of book
	
	/**
	 * Sets the book title
	 * @param title String the title of the book
	 */
	public Book(String title) {
		this.title = title;
	}
	/**
	 * Sets the author(s) of the book, the title, type of book, the catalog number, and price of the book
	 * 
	 * @param authors The author(s) of the book
	 * @param title String the title of the book
	 * @param type int the type of book
	 * @param catalogNumber the catalog number of the book
	 * @param price double the price of the book
	 */
	public Book(ArrayList<Author> authors, String title, int type,
			CatalogNumber catalogNumber, double price) {
		this.authors = authors;  // "this" refers to instance variable
		this.title = title;
		this.type = type;
		this.catalogNumber = catalogNumber;
		this.price = price;
		this.checkedOut = false;
	}
	/**
	 * Sets book title, type, price and checks to see if it is checked out
	 * @param title String the title of the book
	 * @param type int the type of book
	 * @param checkedOut boolean checks if the book has been checked out
	 * @param price double the price of the book
	 */
	public Book(String title, int type, boolean checkedOut, double price) {
		this.title = title;
		this.type = type;
		this.checkedOut = checkedOut;
		this.price = price;
	}

	// Methods
	/**
	 * reads the book from a certain page to another certain page
	 * @param startPage int starting page
	 * @param endPage int ending page
	 */
	public void read(int startPage, int endPage) {
		int pageCounter = startPage;
		
		while (pageCounter <= endPage) {
			System.out.println(this.title + " page " + pageCounter++);
		}
	}
	/**
	 * Adds an author 
	 * @param a Author the author that will be added
	 */
	public void addAuthor(Author a) {
		// There could be a problem here if the ArrayList authors
		// is null.   Trying to call a method (like add) on a
		// null object will give a null pointer exception.
		
		// While the code below is not needed, because we 
		// initialized the ArrayList to an empty ArrayList when
		// we declared the instance variable, this is a good 
		// example of how to test for null objects.
	
		if (this.authors == null) {
			this.authors = new ArrayList<Author>();
		}
		this.authors.add(a);
	}
	/**
	 * shows all author(s) in a book
	 */
	public void displayAuthors() {
		// This time, we will not use a for each loop
		// but rather a while loop with an iterator
		Iterator<Author> iterator = this.authors.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	/**
	 * removes a author by their last name
	 * @param lastNameToRemove String the last name of the author that will be removed
	 * @return boolean if the author was removed or not
	 */
	public boolean removeAuthor(String lastNameToRemove) {
		// We NEED an iterator to do removal.
		Iterator<Author> iterator = this.authors.iterator();
		while (iterator.hasNext()) {
			if (lastNameToRemove.equals(iterator.next().getLastName())) {
				iterator.remove();
				return true;
			}
		}
		return false;
	}
	/**
	 * searches for a author
	 * @param searchTerm The author you are looking for
	 * @return the author or nothing if the author is not found
	 */
	public Author searchAuthor(String searchTerm) {
		// Will return only the first match
		for (Author myAuthor : this.authors) {
			if (searchTerm.equals(myAuthor.getLastName())) {
				System.out.println("Found it!");
				return myAuthor;
			}
		}
		return null;
	}
	
	
	// Getters and Setters
	/**
	 * retrieves the title
	 * @return the title
	 */
	public String getTitle() {
		return this.title;
	}
	/**
	 * sets the title of a book
	 * @param title String the title of the book
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * retrieves the author(s) to a book
	 * @return Author the author(s) of a book
	 */
	public ArrayList<Author> getAuthors() {
		return authors;
	}
	/**
	 * sets an author
	 * @param authors Author the author
	 */
	public void setAuthors(ArrayList<Author> authors) {
		this.authors = authors;
	}
	/**
	 * retrieves the type of the book
	 * @return int The type of the book
	 */
	public int getType() {
		return type;
	}
	/**
	 * sets the type of the book
	 * @param type int The type of the book
	 */
	public void setType(int type) {
		this.type = type;
	}
	/**
	 * retrieves the catalog number of a book
	 * @return CatalogNumber the catalog number of the book
	 */
	public CatalogNumber getCatalogNumber() {
		return catalogNumber;
	}
	/**
	 * sets the catalog number of a book
	 * @param catalogNumber CatalogNumber the catalog number of the book
	 */
	public void setCatalogNumber(CatalogNumber catalogNumber) {
		this.catalogNumber = catalogNumber;
	}
	/**
	 * checks to see if the book is checked out
	 * @return boolean If the book is checked in or out
	 */
	public boolean isCheckedOut() {
		return checkedOut;
	}
	/**
	 * sets a book checked out as false
	 * @param checkedOut boolean if the book is checeked in or out
	 */
	public void setCheckedOut(boolean checkedOut) {
		this.checkedOut = checkedOut;
	}
	/**
	 * retrieves the price of the book
	 * @return double the price of the book
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * sets the price of a book
	 * @param price double the price of a book
	 */
	public void setPrice(double price) {
		this.price = price;
	}	
}