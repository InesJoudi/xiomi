package TestSuite;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Page.MCSelectionPAge;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MCSelectionTestSuite {

	
	@Given("acceder a la page de la maison connecte")
	public void acceder_a_la_page_de_la_maison_connecte() {
        Config.driver=new ChromeDriver();
		
		Config.ConfChrome();
		
		Config.maximize();
		
		String url="https://mistore.com.tn/product-category/maison-connectee/";
		
		 Config.driver.get(url);
	}

	@When("utilisateur selectionne le tri {string} et clique pour choisir un element {string}")
	public void utilisateur_selectionne_le_tri_et_clique_pour_choisir_un_element(String sortTri, String name) throws Exception {
	    
		MCSelectionPAge page=new MCSelectionPAge();
		page.clickOnMenu(sortTri, name);
		
	}

	@Then("utilisateur est dirigee vers la page {string}")
	public void utilisateur_est_dirigee_vers_la_page(String x) {
		MCSelectionPAge page=new MCSelectionPAge();
		page.verifyTitles(x);
	}



	
	
	
	
	
	
	
	
}
