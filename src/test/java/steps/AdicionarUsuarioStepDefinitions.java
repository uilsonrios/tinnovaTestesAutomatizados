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

public class AdicionarUsuarioStepDefinitions {

    private WebDriver driver;

    @Before /*Abertura do navegador google Chrome*/
    public void createDriver() {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Dado("^que estou na pagina para adicionar um usuario$")
    public void que_estou_na_pagina_para_adicionar_um_usuario() {
        driver.manage().window().maximize();
        driver.get("https://https://tinnova-teste-qa.vercel.app/"); /*Acessa o link para adicionar um novo usuario*/
    }

    @E("^clico no botao adicionar para adicionar usuarios$") /*� realizado o evento de click no bot�o Adicionar*/
    public void clico_no_botao_adicionar_para_adicionar_usuarios()  {
        driver.findElement(By.class("Adicionar")).click();
    }

    @E("^informo o nome completo do usuario$") /*� Informado o nome do usuario*/
    public void informo_o_nome_completo_do_usuario() {
        driver.findElement(By.linkText("Digite seu nome")).sendKeys("Mario Roberto"));
    }

     @E("^informo o email do usuario$") /*� Informado o email do usuario*/
    public void informo_o_email_do_usuario() {
        driver.findElement(By.linkText("Digite seu e-mail")).sendKeys("teste@teste.com.br"));
    }
    
    @E("^informo o cpf do usuario$") /*� Informado o CPF do usuario*/
    public void informo_o_cpf_do_usuario() {
        driver.findElement(By.linkText("Digite seu CPF")).sendKeys('24009911034'));
    }
    
    @E("^informo o telefone do usuario$") /*� Informado o Telefone do usuario*/
    public void informo_o_telefone_do_usuario() {
        driver.findElement(By.linkText("Digite seu telefone")).sendKeys('42999999999'));
    }

    @Entao("^eu clico no botao guardar$") /*Realiza o click no bot�o guardar*/
    public void eu_clico_no_botao_guardar() {
         driver.findElement(By.linkText("GUARDAR")).click();
    }

}
