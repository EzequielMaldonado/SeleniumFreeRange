package pages;

public class MercadoLibreSearchPage extends BasePage{

    private String searchBox = "//input[@id='cb1-edit']";
    private String searchButton = "//div[@aria-label='Buscar']";
    private String thirdResult = "//*[@id=\":R6l5e6:\"]/div[2]/div[1]/a";
    private String addToCartButton = "//span[normalize-space()='Agregar al carrito']";
    private String addedMessageText = "//h1[@class='text text--title']";
    private String secondPageButton = "/html[1]/body[1]/main[1]/div[1]/div[3]/section[1]/nav[1]/ul[1]/li[3]/button[1]";
    private String acceptCookiesButton = "/html/body/div[3]/div[1]/div/div[2]/button[1]";

    public MercadoLibreSearchPage(){
        super(driver);
    }

    public void navigateToMeli(){
        navigateTo("https://www.mercadolibre.com.ar/");
    }

    public void enterSearchCriteria(String criteria){
        write(searchBox,criteria);
    }

    public void clickSearch(){
        clickElement(searchButton);
    }

    public void clickAcceptCookiesButton(){
        clickElement(acceptCookiesButton);
    }
    
    public void goToPage(String pageNumber){
        goToPage(pageNumber);
    }

    public void navigateToSecondPage(){
        //executor.executeScript("arguments[0].click();", button);
        clickElement(secondPageButton);
    }

    public void pick3rdItem(){
        clickElement(thirdResult);
    }

    public void addToCart(){
        clickElement(addToCartButton);
    }

    public String addedToCartMessage(){
        return textFromElement(addedMessageText);
    }


}
