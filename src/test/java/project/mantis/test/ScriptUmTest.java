package project.mantis.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import project.mantis.steps.ScriptUmStep;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("resources/script1.csv")
public class ScriptUmTest {

	protected String userInvalido, senhaInvalida, user, senha, projeto, categoria, summary, description, delete, jump;

	@Managed(driver = "chrome", uniqueSession = true)
	WebDriver driver;

	@Steps
	ScriptUmStep step;

	@Test
	public void CenarioUmValidacaoDeAcessoAoMantis() {
		step.abrirMantis();
		step.autenticandoAcessoUserInvalido(userInvalido, senha);
		step.autenticandoAcessoSenhaInvalido(user, senhaInvalida);
		step.autenticandoAcessoValido(user, senha);
		driver.close();
	}

	@Test
	public void CenarioDoisValidacaoCamposObrigatorioCadastroDeBug() {
		step.abrirMantis();
		step.autenticandoAcessoValido(user, senha);
		step.selecionandoProjeto(projeto);
		step.validarTodosOsCampos();
		step.ValidarCampo_a_campo(categoria, summary, description, delete);
		driver.close();
	}

	@Test
	public void CenarioTresValidarJumpPesquis() {
		step.abrirMantis();
		step.autenticandoAcessoValido(user, senha);
		step.selecionandoProjeto(projeto);
		step.validarPesquisaJump(jump);
		driver.close();

	}

	@Test
	public void CenarioQuatroValidarSearchFilter() {
		step.abrirMantis();
		step.autenticandoAcessoValido(user, senha);
		step.acionnandoViewIssues();
		step.pesquisarFilter();
		driver.close();
	}

	@Test
	public void CenarioCincoValidacaoAtualizacaoSenhaDaConta(){
		step.abrirMantis();
		step.autenticandoAcessoValido(user, senha);
		step.acessandoMinhaConta();
		step.trocandoSenha();
		driver.close();
	}
}
