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

public class UpdateUsuarioStepDefinitions {

    private WebDriver driver;

    @Before /*Abertura do navegador google Chrome*/
    public void createDriver() {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Dado("^que estou na pagina para editar um usuario$")
    public void que_estou_na_pagina_para_editar_um_usuario() {
        driver.manage().window().maximize();
        driver.get("https://https://tinnova-teste-qa.vercel.app/"); /*Acessa o link para editar um usuario*/
    }

    @E("^clico no botao editar para edição das informações do usuário$") /*É realizado o evento de click no botão editar*/
    public void clico_no_botao_editar_para_edicao_as_informações_do_usuário()  {
        driver.findElement(By.xpath ("//*[@id="root"]/div/div[2]/div[2]/div[4]/div[5]/div[2]/svg/path")).click();
    }

    @E("^altero o nome completo do usuario$") /*É alterado o nome do usuario*/
    public void altero_o_nome_completo_do_usuario() {
     driver.findElement(By.linktext("sc-crXcEl gyPNwc")).sendKeys(Keys.BACKSPACE);
     driver.findElement(By.className("sc-crXcEl gyPNwc")).sendKeys("Mario Roberto Dias"));
    }

    @E("^altero o email do usuario$") /*É alterado o email do usuario*/
    public void altero_o_email_do_usuario() {
     driver.findElement(By.className("sc-iqcoie jJJLOb")).sendKeys(Keys.BACKSPACE);
     driver.findElement(By.className("sc-iqcoie jJJLOb")).sendKeys("teste123@teste.com.br"));
    }

    @E("^altero o cpf do usuario$") /*É alterado o cpf do usuario*/
    public void altero_o_cpf_do_usuario() {
     driver.findElement(By.className("sc-iqcoie jJJLOb")).sendKeys(Keys.BACKSPACE);
     driver.findElement(By.className("sc-iqcoie jJJLOb")).sendKeys('38075994019'));
    }

    @E("^altero o telefone do usuario$") /*É alterado o telefone do usuario*/
    public void altero_o_telefone_do_usuario() {
     driver.findElement(By.className("sc-kDDrLX cwQPsr")).sendKeys(Keys.BACKSPACE);
     driver.findElement(By.className("sc-kDDrLX cwQPsr")).sendKeys('42999999889'));
    }
 
    @Entao("^eu clico no botao atualizar") /*Realiza o click no botão Atualizar*/
    public void eu_clico_no_botao_voltar() {
         driver.findElement(By.linkText("ATUALIZAR")).click();
    }

}
