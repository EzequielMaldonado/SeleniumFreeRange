package pages;

public class PaginaPrincipal extends BasePage {

    private String sectionLink = "//a[normalize-space()='Cursos' and @href]";
    private String elegirUnPlanButton = "//a[normalize-space()='Elegir Plan' and @href]";

    public PaginaPrincipal() {
        super(driver);
    }

    // Método para navegar a www.freerangetesters.com
    public void navigateToFreeRangeTesters() {
        navigateTo("https://www.freerangetesters.com");
    }

    public void clickOnSectionNavigationBar(String section) {
        // Reemplazar el marcador de posicion '%s' en sectionLink con el nombre
        String xpathSection = String.format(sectionLink, section);
        clickElement(xpathSection);
    }

    public void clickOnCursosOption(String section){
        clickElement(sectionLink);
    }

    public void clickOnElegirUnPlanButton(){
        clickElement(elegirUnPlanButton);
    }

}
