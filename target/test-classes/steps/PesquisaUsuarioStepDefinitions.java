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

    @Dado("^que estou na pagina para pesquisar um usuario$")
    public void que_estou_na_pagina_para_pesquisar_um_usuario() {
        driver.manage().window().maximize();
        driver.get("https://https://tinnova-teste-qa.vercel.app/"); /*Acessa o link para pesquisa um usuario*/
    }

    @E("^clico no botao adicionar para validar as informações do usuário$") /*É realizado o evento de click no botão Adicionar*/
    public void clico_no_botao_adicionar_para_validar_as_informações_do_usuário()  {
        driver.findElement(By.class("sc-dkzDqf brwGGb")).click();
    }

    @E("^valido o nome completo do usuario$") /*É validado o nome do usuario*/
    public void valido_o_nome_completo_do_usuario() {
      Webelement nomeText  driver.findElement(By.className("sc-iqcoie lypQMt"));
      String textoDoNome = nomeText.getText();
      AssertEquals(expect: "Mario Roberto",textoDoNome );
    }

      @E("^valido o email do usuario$") /*É validado o email do usuario*/
    public void valido_o_email_do_usuario() {
      Webelement emailText  driver.findElement(By.className("sc-kDDrLX cwQPsr"));
      String textoDoEmail = emailText.getText();
      AssertEquals(expect: "teste@teste.com.br",textoDoEmail );
    }
    
      @E("^valido o cpf do usuario$") /*É validado o cpf do usuario*/
    public void valido_o_cpf_do_usuario() {
      Webelement cpfUsuario  driver.findElement(By.className("sc-kDDrLX cwQPsr"));
      String cpfUsuarioText = cpfUsuario.getText();
      AssertEquals(expect: "240.099.110-34",cpfUsuarioText );
    }
    
      @E("^valido o telefone do usuario$") /*É validado o telefone do usuario*/
    public void valido_o_telefone_do_usuario() {
      Webelement telefoneUsuario  driver.findElement(By.className("sc-crXcEl gyPNwc"));
      String telefoneUsuarioText = telefoneUsuario.getText();
      AssertEquals(expect: "(42) 99999-9999",telefoneUsuarioText );
    }

    @Entao("^eu clico no botao voltar") /*Realiza o click no botão VOLTAR*/
    public void eu_clico_no_botao_voltar() {
         driver.findElement(By.linkText("VOLTAR")).click();
    }

}
