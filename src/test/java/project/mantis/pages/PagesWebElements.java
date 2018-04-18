package project.mantis.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class PagesWebElements extends PageObject {

	@FindBy(xpath="/html/body/div[3]/form/table/tbody/tr[2]/td[2]/input")
	protected WebElement campo_email;

	@FindBy(xpath="/html/body/div[3]/form/table/tbody/tr[3]/td[2]/input")
	protected WebElement campo_senha;

	@FindBy(xpath="/html/body/div[3]/form/table/tbody/tr[6]/td/input")
	protected WebElement btn_login;

	@FindBy(xpath="/html/body/table[2]/tbody/tr/td[1]/a[3]")
	protected WebElement btn_reportar_erro;

	@FindBy(xpath="/html/body/div[2]/form/table/tbody/tr[2]/td[2]/select")
	protected WebElement select_project;

	@FindBy(xpath="/html/body/div[2]/form/table/tbody/tr[4]/td/input")
	protected WebElement btn_submit_project;

	@FindBy(name="category_id")
	protected WebElement select_category;

	@FindBy(name="reproducibility")
	protected WebElement select_reproducibility;

	@FindBy(name="severity")
	protected WebElement select_severity;

	@FindBy(name="priority")
	protected WebElement select_priority;

	@FindBy(name="profile_id")
	protected WebElement select_profile;

	@FindBy(name="platform")
	protected WebElement campo_platform;

	@FindBy(name="os")
	protected WebElement campo_os;

	@FindBy(name="os_build")
	protected WebElement campo_osVersion;

	@FindBy(name="handler_id")
	protected WebElement select_assign_to;

	@FindBy(name="summary")
	protected WebElement campo_summary;

	@FindBy(name="description")
	protected WebElement campo_description;

	@FindBy(name="steps_to_reproduce")
	protected WebElement campo_Steps_to_reproduce;

	@FindBy(name="additional_info")
	protected WebElement campo_Additional_Information;

	@FindBy(xpath="//*[@id=\"ufile[]\"]")
	protected WebElement btn_file;

	@FindBy(css="body > div:nth-child(6) > form > table > tbody > tr:nth-child(16) > td.center > input")
	protected WebElement btn_submit_report;

	@FindBy(name="project_id")
	protected WebElement selecionarProjetoHome;

	@FindBy(css="#buglist > tbody > tr:nth-child(4) > td:nth-child(2) > a")
	protected WebElement editarBug;

	@FindBy(css="body > table:nth-child(3) > tbody > tr > td:nth-child(1) > a:nth-child(2)")
	protected WebElement acionarCampodeVerReportado;

	@FindBy(css="body > form > table > tbody > tr:nth-child(18) > td > input")
	protected WebElement btn_atualizarInfoBug;

	@FindBy(css="#buglist > tbody > tr:nth-child(4) > td:nth-child(4) > a")
	protected WebElement selecionarID;

	@FindBy(name="new_status")
	protected WebElement statusmudanca;

	@FindBy(name="bugnote_text")
	protected WebElement campoNote;

	@FindBy(css="body > table:nth-child(6) > tbody > tr:nth-child(19) > td > table > tbody > tr > td:nth-child(3) > form > input.button")
	protected WebElement btn_stats;

	@FindBy(css="body > div:nth-child(6) > form > table > tbody > tr:nth-child(5) > td > input")
	protected WebElement mudanca_Btn_stats;

	@FindBy(css="body > div:nth-child(6) > form > table > tbody > tr:nth-child(6) > td > input")
	protected WebElement mudanca_Btn_statsClosed;

	@FindBy(css="#buglist > tbody:nth-child(1) > tr:nth-child(4) > td:nth-child(1) > input:nth-child(1)")
	protected WebElement marcandoCheckBox;

	@FindBy(name="action")
	protected WebElement selectDelete;

	@FindBy(css=".button")
	protected WebElement btn_ok;

	@FindBy(css="body > table.width100 > tbody > tr > td:nth-child(1) > a:nth-child(3)")
	protected WebElement menu_report_issue;

	@FindBy(name="bug_id")
	protected WebElement campoJump;

	@FindBy(css="body > table:nth-child(3) > tbody > tr > td:nth-child(1) > a:nth-child(2)")
	protected WebElement menuViewIssues;

	@FindBy(name="search")
	protected WebElement campoFiltroPesquisa;

	@FindBy(css="body > table.width100 > tbody > tr > td:nth-child(1) > a:nth-child(8)")
	protected WebElement menuMyAccount;

	@FindBy(name="password")
	protected WebElement campoSenhaNew;

	@FindBy(name="password_confirm")
	protected WebElement campoSenhaNewRep;

	@FindBy(css="body > div:nth-child(5) > form > table > tbody > tr:nth-child(10) > td:nth-child(2) > input")
	protected WebElement btn_Update_User;
}
