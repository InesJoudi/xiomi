package Page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomeMistore {

	@FindBy(xpath="/html/body/div[1]/header/div[1]/div/section/div/div[2]/div/div/div/div/nav/ul/li/a")
	
	List <WebElement>menu;
	
	@FindBy(xpath="/html/body/div[1]/header/div[1]/div/section/div/div[2]/div/div/div/div/nav/ul/li[3]/div/div/div/div/section/div/div/div/div/div/a/div/div[1]/div/svg")
	List <WebElement>sousMenu;
	
	@FindBy(xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/header/h1")
	
	WebElement verifTitle;
	
	public HomeMistore() {
		
		PageFactory.initElements(Config.driver, this);
		
	}
	
	public void mouseHoverOnMenu(String menutitle, String submenutitle) {
		
		try {
			
			for(WebElement menus:menu){
				 Config.attents(10);
				if(menus.getText().contains(menutitle)) {
					
			Config.actions= new Actions (Config.driver);
			Config.actions.moveToElement(menus).perform();
			
			for (WebElement sousMenus:sousMenu) {
				 Config.attents(10);
				if (sousMenus.getText().contains(submenutitle)){
				sousMenus.click();
				
				
			   }
			}
		}
	}
	
}catch (Exception e){
}

	}

	
	
	public void verifTitles (String submenutile) {
		 Config.attents(10);
		String verifTitlesTex=verifTitle.getText();
		
		Assert.assertEquals(submenutile, verifTitlesTex);
	}
}