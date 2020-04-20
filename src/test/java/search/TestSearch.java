package search;

import homeDepotSearch.HomeDepotHome;
import homeDepotSearch.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.List;

public class TestSearch extends HomeDepotHome {


    @Test
    public void testTypingOnSearchBox()throws InterruptedException{
        //connect to db, read it for me
        List<String> list = TestData.searchListData();
        for(int i=0; i<list.size(); i++){
            driver.findElement(By.id("headerSearch")).clear();
            driver.findElement(By.id("headerSearch")).sendKeys(list.get(i), Keys.ENTER);
            Thread.sleep(2000);

        }

    }
}
