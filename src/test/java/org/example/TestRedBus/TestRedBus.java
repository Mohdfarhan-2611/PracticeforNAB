package org.example.TestRedBus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class TestRedBus {

    @Test
    public static void calculateRedBus() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.redbus.in/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement calenderIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='labelCalendarContainer']")));
        calenderIcon.click();

        WebElement MonthText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@style='flex-grow: 2; font-size: 0.875rem;']")));
        String expectedMonth = "Jun 2025";


        while (true) {
            String currentMonthFullText = MonthText.getText().trim();
            System.out.println(currentMonthFullText);

            String[] currentMonthArray = currentMonthFullText.trim().split(" ");
            String[] expectedMonthArray = expectedMonth.trim().split(" ");

            if (currentMonthArray[0].equalsIgnoreCase(expectedMonthArray[0])
                    && currentMonthArray[1].contains(expectedMonthArray[1])) {
                break;
            }

            WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'][3]")));
            nextButton.click();

        }

        List<WebElement> saturday = driver.findElements(By.xpath("//div[@class='DayTilesWrapper__RowWrap-sc-19pz9i8-1 fGGTDM']/span/div[6]/span"));
        List<WebElement> sunday = driver.findElements(By.xpath("//div[@class='DayTilesWrapper__RowWrap-sc-19pz9i8-1 fGGTDM']/span/div[7]/span"));

        List<String> dates = new ArrayList<>();

        for(WebElement day : saturday){
            dates.add(day.getText());
        }

        for(WebElement day : sunday){
            dates.add(day.getText());
        }

        System.out.println(dates);

    }
}
