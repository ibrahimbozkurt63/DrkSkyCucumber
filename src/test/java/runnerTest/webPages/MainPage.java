package runnerTest.webPages;

import org.openqa.selenium.By;

public class MainPage extends ElementUtil{
     By mainpageElement= By.xpath("//*[@id=\"title\"]/span[1]/span[2]/span[2]/span[1]/span[1]");

     By zoomIn=By.xpath("/button[@class='ol-zoom-in']");
     By lowTemp=By.xpath("//*[@id=\"title\"]/span[1]/span[2]/span[2]/span[2]/span[1]");

     By highTemp=By.xpath("//*[@id=\"title\"]/span[1]/span[2]/span[2]/span[3]/span[1]") ;

     By header =By.xpath("//*[@id=\"currentDetails\"]/div[1]/span[1]");

     public String getLowestTemp(){

         return getTextFromElement(lowTemp);
     }
    public String getHighestTemp(){

         return getTextFromElement(highTemp);
    }

    public String getMainPageElement(){

         return getTextFromElement(mainpageElement);
    }
    public void zoomInMap(){

         clickOn(zoomIn);
}

    public String getPageHeader(){
        return getTextFromElement(header);
    }

}
