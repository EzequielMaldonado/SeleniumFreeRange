package pages;

public class MercadoLibreSearchPage extends BasePage{

    private String searchBox = "//input[@id='cb1-edit']";
    private String searchButton = "//div[@aria-label='Buscar']";
    private String thirdResult = "/html[1]/body[1]/main[1]/div[1]/div[3]/section[1]/ol[1]/li[6]/div[1]/div[1]/div[2]/div[1]/div[2]/a[1]";
    private String addToCartButton = "//span[normalize-space()='Agregar al carrito']";
    private String addedMessageText = "//h1[@class='text text--title']";
    private String secondPageButton = "//button[@aria-label='Ir a la página 2']";

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
    
    public void goToPage(String pageNumber){
        goToPage(pageNumber);
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
