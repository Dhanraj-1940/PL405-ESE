package testing;

import com.pl405.invoice.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

//import com.pl405.invoice.Customer;
//import com.pl405.invoice.Invoice;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testing {

	private Customer cust;
	private Invoice inv;
	@Given("there is a customer who have purchased something")
	public void there_is_a_customer_who_have_purchased_something() {
		cust = new Customer();
		cust.setId(1);
		cust.setName("Dhanraj");
		cust.setAddress("Goa");
		System.out.println("Customer "+cust.getName()+" has purchased products worth total 10000");
	}

	@When("I run the demo")
	public void i_run_the_demo() {
		inv = new Invoice();
		inv.setCust(cust);
		//inv.setId(cust.getId());
		inv.setCustomer_name(cust.getName());
		inv.setInvoiceId(101);
		inv.setTotalAmt(10000);
		System.out.println("invoice of 10000 created");
	}

	@Then("it should store name of customer and invoice total in myinvoice database")
	public void it_should_store_name_of_customer_and_invoice_total_in_myinvoice_database() {
		SessionFactory sessionfactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		
		session.save(inv);
		
		session.getTransaction().commit();
		session.close();
		sessionfactory.close();
		
		System.out.println("successfully added to the database");
	}
}
