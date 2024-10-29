package TestSuite;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Page.HomeMistore;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MiStoreTestSuite {

	
	@Given("acceder a la page dacceuil")
	public void acceder_a_la_page_dacceuil() {
		Config.driver=new ChromeDriver();
		
		Config.ConfChrome();
		
		Config.maximize();
		
		String url="https://mistore.com.tn/";
		
		 Config.driver.get(url);
	}

	@When("utilisateur survol sur le menu {string} et clique sous le sous menu {string}")
	public void utilisateur_survol_sur_le_menu_et_clique_sous_le_sous_menu(String menus, String sousMenus) {
	HomeMistore page=new HomeMistore();
	page.mouseHoverOnMenu(menus, sousMenus);
	
	}

	@Then("utilisateur se dirige vers le maison connectee et verifie le message {string}")
	public void utilisateur_se_dirige_vers_le_maison_connectee_et_verifie_le_message(String sousMenus) {
		HomeMistore page=new HomeMistore();
	  page.verifTitles(sousMenus);
	}


	
	
	
	
	
	
}
