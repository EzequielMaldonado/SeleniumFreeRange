package pages;

public class PaginaCursosFRT extends BasePage {

    // private String fundamentosTestingLink = "//a[normalize-space()='Fundamentos del Testing' and @href]";
    private String fundamentosTestingLink = "//h3[normalize-space()='Fundamentos del Testing']";

    public PaginaCursosFRT() {
        super(driver);
    }

    public void clickFundamentosTestingLinkV2() {
        clickElement(fundamentosTestingLink);
    }

}
