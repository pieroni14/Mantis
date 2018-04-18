package project.mantis.steps;

import org.openqa.selenium.WebDriver;

import net.thucydides.core.annotations.Step;
import project.mantis.pages.ScriptPageDois;
import project.mantis.pages.PagesWebElements;

public class ScriptDoisStep {
	PagesWebElements webElements;
	ScriptPageDois scriptPageDois;

	@Step("Abrir o mantis")
	public void abrirMantis() {
		webElements.open();

	}

	@Step("Autenticação do usuário no mantis")
	public void autenticandoAcesso(String username, String senha) {
		scriptPageDois.preenchendoDadosAutenticacao(username, senha);
	}

	@Step("Acessando a area de reportar o erro")
	public void acessoReportarErro() {
		scriptPageDois.acessandoOndeReportaErro();
	}

	@Step("Selecionando o projeto")
	public void selecionandoProjeto(String projeto) {
		scriptPageDois.selecionandoProjeto(projeto);

	}

	@Step("Preenchendo as informações do erro")
	public void preencherDadosDoErro(WebDriver driver, String categoria, String reproducibility, String severity,
			String priority, String selectProfile, String assignTo, String platform, String os, String osVersion,
			String summary, String description, String stepsToReproduce, String additionalInformation) {
		scriptPageDois.preenchendoDadosDoErro(driver, categoria, reproducibility, severity, priority, selectProfile,
				assignTo, platform, os, osVersion, summary, description, stepsToReproduce, additionalInformation);

	}

	@Step("Finalizando o report do bug")
	public void submitErro() {
		scriptPageDois.reportandoErro();

	}
	@Step("Abri a tela de visualizar bug reportado")
	public void visualizarBugs(String projeto) {
		scriptPageDois.selecionarProjeto(projeto);
		scriptPageDois.viewIssues();
		
	}
	@Step("Ja aplica mudanca nas informações do bug.")
	public void acionarEdicaoDoBug(String summaryEdit) {
		scriptPageDois.edicaoDoBug(summaryEdit);
		
	}
	@Step("Atualizar o status do bug para confirmado ")
	public void abriSolicitacaoParaMudanca(String assignTo, String statusMudanca, String notes) {
		scriptPageDois.selecionarID();
		scriptPageDois.mudancaStatus(assignTo,statusMudanca,notes);
		
	}

	public void abrirSolicitacaoParaMudancaClosed(String assignTo, String statusMudancaClosed, String notesClosed) {
		scriptPageDois.selecionarID();
		scriptPageDois.mudancaStatusClosed(assignTo, statusMudancaClosed, notesClosed);
		
	}

	public void acionarCheckbox() {
		scriptPageDois.acionarCheckBox();
		
	}

	public void deletarReportBug(String delete) {
		scriptPageDois.deletarReportBug(delete);
		
	}

}
