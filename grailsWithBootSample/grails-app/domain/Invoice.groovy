package grailsWithBootSample
class Invoice {

	// Validation constraints on an instance of Invoice
	static constraints = {
	}
	String reference
	String description
	int numberOfArticles
	int unitPrice
}