package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Homepages {
    WebDriver driver = Driver.getDriver();
    public void clickingOnVehicle() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@class='title title-level-1'][contains(text(),'Fleet')]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("(//*[contains(text(),'Vehicles')])[3]")).click();

    }
}
