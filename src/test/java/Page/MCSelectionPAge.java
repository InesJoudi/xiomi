package Page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Helper.Config;

public class MCSelectionPAge {

@FindBy(xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/div[2]/div[4]/form/div/select")

WebElement Tri;

@FindBy(xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/div[3]/div/div/div/div[2]/div[2]/h3/a")

List <WebElement> menu;

@FindBy(xpath="/html/body/div[1]/div[4]/div/div/div/div/div[3]/div[1]/div/div[1]/div/div[1]/h1")

WebElement Verify;

public MCSelectionPAge() {
	
	PageFactory.initElements(Config.driver, this);
}

public void clickOnMenu (String sortTri, String menuTitle) throws Exception {
	Thread.sleep(4000);
	Select select = new Select(Tri);
	select.selectByVisibleText(sortTri);
	
	try {
		
		for (WebElement menus:menu){
			
			if (menus.getText().contains(menuTitle)) {
				
				menus.click();
				break;
			}
			
			
		}
	

}catch (Exception e){
}	
}
public void verifyTitles (String submenutile) {
	 Config.attents(10);

	String verifyTitlesTex= Verify.getText();
	
	Assert.assertEquals(submenutile, verifyTitlesTex);
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	

