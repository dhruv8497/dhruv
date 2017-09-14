package library;
/**
 * 
 * @author pateld2
 *The CatalogNumber class creates a catalog number with a classification code, numeric code,
 * and a cutter number for the catalog number.
 */
public class CatalogNumber {
	private String classification;
	private int numericCode;
	private String cutterNumber;
	
	// Constructor
	/**
	 * Creates a catalog number 
	 * @param classification String the genre of book
	 * @param numericCode int the code of the book
	 * @param cutterNumber String the book's short code 
	 */
	public CatalogNumber(String classification, int numericCode,
			String cutterNumber) {
		this.classification = classification;
		this.numericCode = numericCode;
		this.cutterNumber = cutterNumber;
	}

	// Getters and Setters
	/**
	 * retrieves the classification code of a catalog number
	 * @return String the classification code of a catalog number
	 */
	public String getClassification() {
		return classification;
	}
	/**
	 * sets the classification number of the catalog number
	 * @param classification String the classification number of the catalog number
	 */
	public void setClassification(String classification) {
		this.classification = classification;
	}
	/**
	 * retrieves the numeric code
	 * @return int the numeric code of a catalog number
	 */
	public int getNumericCode() {
		return numericCode;
	}
	/**
	 * sets a numeric code
	 * @param numericCode int The numeric code
	 */
	public void setNumericCode(int numericCode) {
		this.numericCode = numericCode;
	}
	/**
	 * retrieves the cutter number
	 * @return String the cutter number
	 */
	public String getCutterNumber() {
		return cutterNumber;
	}
	/**
	 * sets a cutter number
	 * @param cutterNumber String a cutter number
	 */
	public void setCutterNumber(String cutterNumber) {
		this.cutterNumber = cutterNumber;
	}	
}