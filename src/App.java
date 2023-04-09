import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class App {
    public static void main(String[] args) throws InterruptedException {

        // Set up WebDriver for Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\uSEr\\Desktop\\javaSelenium\\seleniumTest\\src\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Navigate to the form page
        driver.get("https://www.extremenetworks.com/support/product-registration/");

        WebElement nameInput = driver.findElement(By.id("input_2_2_3"));
        WebElement LnameInput = driver.findElement(By.id("input_2_2_6"));
        WebElement emailInput = driver.findElement(By.id("input_2_3"));
        WebElement companyInput = driver.findElement(By.id("input_2_1"));
        WebElement phoneNumberInput = driver.findElement(By.id("input_2_5"));
        WebElement ModularSwitchesInput = driver.findElement(By.name("input_7[]"));
        WebElement StandaloneSwitches = driver.findElement(By.name("input_9[]"));
        WebElement Wireless = driver.findElement(By.name("input_10[]"));
        WebElement SecurityAppliances = driver.findElement(By.name("input_11[]"));
        WebElement ManagementSoftwareTools = driver.findElement(By.name("input_12[]"));
        WebElement OperatingSystem = driver.findElement(By.name("input_13[]"));
        WebElement Accessories = driver.findElement(By.name("input_14[]"));
        WebElement Purchase = driver.findElement(By.id("input_2_15"));
        WebElement WhichCompany = driver.findElement(By.id("input_2_17"));

        String filledFields = ""; // String to store field names with input

        // Input incomplete information
        nameInput.sendKeys("John");
        filledFields += "Name: " + nameInput.getAttribute("value") + ", ";
        LnameInput.sendKeys("Oma");
        filledFields += "Last Name: " + LnameInput.getAttribute("value") + ", ";
        emailInput.sendKeys("john@example.com");
        filledFields += "Email: " + emailInput.getAttribute("value") + ", ";
        companyInput.sendKeys("gyat");
        filledFields += "Company: " + companyInput.getAttribute("value") + ", ";
        phoneNumberInput.sendKeys("08888888");
        filledFields += "Phone Number: " + phoneNumberInput.getAttribute("value") + ", ";
        ModularSwitchesInput.sendKeys("sss");
        filledFields += "Modular Switches: " + ModularSwitchesInput.getAttribute("value") + ", ";
        StandaloneSwitches.sendKeys("aaa");
        filledFields += "Standalone Switches: " + StandaloneSwitches.getAttribute("value") + ", ";
        Wireless.sendKeys("asda");
        filledFields += "Wireless: " + Wireless.getAttribute("value") + ", ";
        SecurityAppliances.sendKeys("asasdsad");
        filledFields += "Security Appliances: " + SecurityAppliances.getAttribute("value") + ", ";
        ManagementSoftwareTools.sendKeys("vs");
        filledFields += "Management Software Tools: " + ManagementSoftwareTools.getAttribute("value") + ", ";
        OperatingSystem.sendKeys("ooo");
        filledFields += "Operating System: " + OperatingSystem.getAttribute("value") + ", ";
        Accessories.sendKeys("]]]");
        filledFields += "Accessories: " + Accessories.getAttribute("value") + ", ";
        String purchaseDate = "05/05/2023";
        Purchase.sendKeys(purchaseDate);
        filledFields += "Purchase Date: " + Purchase.getAttribute("value") + ", ";
        Actions actions = new Actions(driver);
        actions.moveByOffset(0, 0).click().perform();
        WhichCompany.sendKeys("pppp");
        filledFields += "Which Company: " + WhichCompany.getAttribute("value");

        // Perform validation checks
        if (filledFields.isEmpty()) {
            System.out.println("Test failed: No information entered");
        } else {
            System.out.println("Test passed: Fields filled with input: " + filledFields);
        }

        Thread.sleep(3000);

        
        // Close the browser window
        driver.quit();
    }
}
