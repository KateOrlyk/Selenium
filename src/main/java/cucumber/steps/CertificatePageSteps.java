package cucumber.steps;

import Pages.CertificatePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static cucumber.BaseCucumber.driver;

public class CertificatePageSteps {

    private static final String mainURL = "https://certificate.ithillel.ua/";
    static CertificatePage certificatePage;

    @When("^I open site \"([^\"]*)\"$")
    public void iOpenSite(String siteURL) throws Throwable {
        driver.get(siteURL);
        switch (siteURL) {
            case mainURL:
                certificatePage = new CertificatePage(driver);
                break;
        }
    }

    @And("^Enter certificate number \"([^\"]*)\"$")
    public void enterCertificateNumber(String cer) {
        certificatePage.getResultCertificate(cer);
    }

    @Then("^Check result$")
    public void checkResult() throws InterruptedException {
        Assert.assertNotEquals(certificatePage.getMessage(), "Сертифікат не знайдено");
    }
}
