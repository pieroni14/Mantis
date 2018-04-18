package project.mantis.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import project.mantis.steps.ScriptDoisStep;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("resources/script2.csv")
public class ScriptDoisTest {
	protected String username,senha,projeto,categoria,reproducibility, severity,priority,selectProfile,assignTo, platform, os, osVersion, summary,description, stepsToReproduce,additionalInformation;
	protected String summaryEdit , statusMudanca, notes,statusMudancaClosed,notesClosed,delete;

	@Managed(driver = "chrome", uniqueSession = true)
	WebDriver driver;

	@Steps
	ScriptDoisStep step;

	@Test
	public void CenarioUmCadastroDeUmBug() {
		step.abrirMantis();
		step.autenticandoAcesso(username, senha);
		step.acessoReportarErro();
		step.selecionandoProjeto(projeto);
		step.preencherDadosDoErro(driver,categoria,reproducibility,severity,priority,selectProfile,assignTo,platform, os, osVersion, summary,description,stepsToReproduce,additionalInformation);
		step.submitErro();
		driver.close();
	}

	@Test
	public void CenarioDoisEdicaoDeInformacaoDeUmBug() {
		step.abrirMantis();
		step.autenticandoAcesso(username, senha);
		step.visualizarBugs(projeto);
		step.acionarEdicaoDoBug(summaryEdit);
		driver.close();
	}

	@Test
	public void CenarioTresStatusConfirmed() {
		step.abrirMantis();
		step.autenticandoAcesso(username, senha);
		step.visualizarBugs(projeto);
		step.abriSolicitacaoParaMudanca(assignTo,statusMudanca,notes);
		driver.close();
	}

	@Test
	public void CenarioQuatroStatusClosed() {
		step.abrirMantis();
		step.autenticandoAcesso(username, senha);
		step.visualizarBugs(projeto);
		step.abrirSolicitacaoParaMudancaClosed(assignTo,statusMudancaClosed,notesClosed);
		driver.close();
	}

	@Test
	public void CenarioCincoDeletarUmReportBug() {
		CenarioUmCadastroDeUmBug();
		step.abrirMantis();
		step.autenticandoAcesso(username, senha);
		step.visualizarBugs(projeto);
		step.acionarCheckbox();
		step.deletarReportBug(delete);
		driver.close();

	}
}
