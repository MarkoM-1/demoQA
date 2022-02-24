package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Sve kartice sa home stranice stavlja u listu
     * kako bi kasnije mogli da pozovemo element koji nam treba
     */
    public List<WebElement> getAllCards() {
        return driver.findElements(By.className("card-body"));
    }

    /**
     * Vraca element koji se nalazi u centralnom delu izabrane kartice
     * (svaka kartica ima ovaj element izuzev "Book Store Applicaton" kartice).
     */
    public WebElement getPageHeader() {
        return driver.findElement(By.className("main-header"));
    }

    /**
     * Vraca tekst koji se nalazi u centralnom delu izabrane kartice.
     */
    public String getCardMiddleBoxText() {
        return driver.findElement(By.cssSelector(".col-12.mt-4.col-md-6")).getText();
    }

    public void goToElementsPage() {
        int brPonavljanja = getAllCards().size();
        for (int i = 0; i < brPonavljanja; i++) {
            if (getAllCards().get(i).getText().equals("Elements")) {
                getAllCards().get(i).click();
                break;
            }
        }
    }

    public void goToFormsPage() {
        int brPonavljanja = getAllCards().size();
        for (int i = 0; i < brPonavljanja; i++) {
            if (getAllCards().get(i).getText().equals("Forms")) {
                getAllCards().get(i).click();
                break;

            }
        }
    }

    public void goToAlertsFrameWindowPage() {
        int brPonavljanja = getAllCards().size();
        for (int i = 0; i < brPonavljanja; i++) {
            if (getAllCards().get(i).getText().equals("Alerts, Frame & Windows")) {
                getAllCards().get(i).click();
                break;
            }
        }
    }

    public void goToWidgetsPage() {
        int brPonavljanja = getAllCards().size();
        for (int i = 0; i < brPonavljanja; i++) {
            if (getAllCards().get(i).getText().equals("Widgets")) {
                getAllCards().get(i).click();
                break;
            }
        }
    }

    public void goToInteractionsPage() {
        int brPonavljanja = getAllCards().size();
        for (int i = 0; i < brPonavljanja; i++) {
            if (getAllCards().get(i).getText().equals("Interactions")) {
                getAllCards().get(i).click();
                break;
            }
        }
    }

    public void goToBookStoreApplication() {
        int brPonavljanja = getAllCards().size();
        for (int i = 0; i < brPonavljanja; i++) {
            if (getAllCards().get(i).getText().equals("Book Store Application")) {
                getAllCards().get(i).click();
                break;
            }
        }
    }
}
