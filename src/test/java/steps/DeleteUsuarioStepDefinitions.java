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

public class DeleteUsuarioStepDefinitions {

    private WebDriver driver;

    @Before /*Abertura do navegador google Chrome*/
    public void createDriver() {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Dado("^que estou na pagina para pesquisar um usuario$")
    public void que_estou_na_pagina_para_pesquisar_um_usuario() {
        driver.manage().window().maximize();
        driver.get("https://https://tinnova-teste-qa.vercel.app/"); /*Acessa o link para pesquisar um usuario*/
    }

    @E("^clico no botao deletar para realizar a exclusao do usuario") /*É realizado o evento de click no botão excluir*/
    public void clico_no_botao_deletar_para_realizar_a_exclusao_do_usuario()  {
        driver.findElement(By.xpath ("//*[@id="root"]/div/div[2]/div[2]/div[4]/div[5]/div[3]/svg/path")).click();
    }

    @E("valido a mensagem que apresenta pra exclusão do usuario") /*É realizado a validação da mensagem de exclusão*/
    public void valido_a_mensagem_que_apresenta_pra_exclusao_do_usuario()  {
       Webelement messageDelete  driver.findElement(By.className("swal-title"));
      String messageDeleteText = messageDelete.getText();
      AssertEquals(expect: "Deseja mesmo remover?",messageDeleteText );
    }
 
    @Entao("^clico no botão sim para excluir o usuário") /*Realiza o click no botão sim para exclusão*/
    public void clico_no_botao_sim_para_excluir_o_usuario() {
         driver.findElement(By.linkText("Sim")).click();
    }
       @After /*Fecha o Navegador*/
    public void fechaNavegador(){
        driver.quit();
    }

}

}
