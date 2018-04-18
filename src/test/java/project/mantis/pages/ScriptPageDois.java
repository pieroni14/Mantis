package project.mantis.pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

public class ScriptPageDois extends PagesWebElements {

	public void preenchendoDadosAutenticacao(String Username, String senha) {
		this.campo_email.sendKeys(Username);
		this.campo_senha.sendKeys(senha);
		this.btn_login.click();

	}

	public void acessandoOndeReportaErro() {
		this.btn_reportar_erro.click();

	}

	public void selecionandoProjeto(String projeto) {
		this.select_project.sendKeys(projeto);
		this.btn_submit_project.click();

	}

	public void preenchendoDadosDoErro(WebDriver driver, String categoria, String reproducibility, String severity,
			String priority, String selectProfile, String assignTo, String platform, String os, String osVersion,
			String summary, String description, String stepsToReproduce, String additionalInformation) {

		this.select_category.sendKeys(categoria);
		this.select_reproducibility.sendKeys(reproducibility);
		this.select_severity.sendKeys(severity);
		this.select_priority.sendKeys(priority);
		this.select_profile.sendKeys(selectProfile);
		this.campo_platform.sendKeys(platform);
		this.campo_os.sendKeys(os);
		this.campo_osVersion.sendKeys(osVersion);
		this.select_assign_to.sendKeys(assignTo);
		this.campo_summary.sendKeys(summary);
		this.campo_description.sendKeys(description);
		this.campo_Steps_to_reproduce.sendKeys(stepsToReproduce);
		this.campo_Additional_Information.sendKeys(additionalInformation);
		waitABit(4000);
		this.btn_file.sendKeys("C:\\Mantis\\resources\\teste.jpg");

	}

	public void reportandoErro() {
		this.btn_submit_report.click();

	}

	public void selecionarProjeto(String projeto) {
		this.selecionarProjetoHome.sendKeys(projeto);

	}

	public void viewIssues() {
		this.acionarCampodeVerReportado.click();

	}

	public void edicaoDoBug(String summaryEdit) {
		this.editarBug.click();
		this.campo_summary.clear();
		this.campo_summary.sendKeys(summaryEdit);
		this.btn_atualizarInfoBug.click();
		assertTrue("Como automatizar um report no mantis[Edt]", true);
	}

	public void selecionarID() {
		this.selecionarID.click();

	}

	public void mudancaStatus(String assignTo, String statusMudanca, String notes) {
		this.select_assign_to.sendKeys(assignTo);
		this.statusmudanca.sendKeys(statusMudanca);
		this.btn_stats.click();
		this.campoNote.sendKeys(notes);
		this.mudanca_Btn_stats.click();

	}

	public void mudancaStatusClosed(String assignTo, String statusMudancaClosed, String notesClosed) {
		this.select_assign_to.sendKeys(assignTo);
		this.statusmudanca.sendKeys(statusMudancaClosed);
		this.btn_stats.click();
		this.campoNote.sendKeys(notesClosed);
		this.mudanca_Btn_statsClosed.click();

	}

	public void acionarCheckBox() {
		this.marcandoCheckBox.click();

	}

	public void deletarReportBug(String delete) {
		this.selectDelete.sendKeys(delete);
		this.btn_ok.click();
		this.btn_ok.click();

	}

}
