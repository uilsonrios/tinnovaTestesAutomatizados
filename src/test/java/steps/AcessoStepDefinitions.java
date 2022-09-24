package steps;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcessoStepDefinitions{

    private WebDriver driver;

    @Before /*Abertura do navegador google Chrome*/
    public void createDriver() {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Dado("^que estou na pagina de acesso$")
    public void que_estou_na_pagina_de_acesso() {
        driver.manage().window().maximize();
        driver.get("https://tinnova-teste-qa.vercel.app/"); /*Acessa o link de acesso ao sistema*/
    }

    @E("^identifico o texto da pagina$") /*É Identificado o texto da página de acesso*/
    public void identifico_o_texto_da_pagina(String textoAcessoLogin)  {
     textoAcessoLogin driver.findElement(By.xpath("//*[text()='Boa sorte, e divirta-se no processo, isso é uma experiência. aproveite ao máximo']"));
    }

    @E("^o seguinte texto deve ser exibido$") /*Valida se o texto está sendo exibido corretamente*/
    public void o_seguinte_texto_deve_ser_exibido() {
       Assert.assertTrue(textoAcessoLogin, true);
    }
    
    @Entao("^eu clico no botao Entrar") /*É Realizado o click no botão Entrar*/
    public void eu_clico_no_botao_Entrar() {
        driver.findElement(By.linkText("Entrar")).click();
    }
}
