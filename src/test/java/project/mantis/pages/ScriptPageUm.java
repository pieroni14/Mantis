package project.mantis.pages;

import static org.junit.Assert.assertTrue;

public class ScriptPageUm extends PagesWebElements {

	public void preenchendoDadosAutenticacao(String username, String senha) {
		this.campo_email.sendKeys(username);
		this.campo_senha.sendKeys(senha);
		this.btn_login.click();

	}

	public void validandoUserInvalido(String userInvalido, String senha) {
		this.campo_email.sendKeys(userInvalido);
		this.campo_senha.sendKeys(senha);
		this.btn_login.click();
		assertTrue("Your account may be disabled or blocked or the username/password you entered is incorrect.", true);
		this.campo_email.clear();
		this.campo_senha.clear();

	}

	public void validandoSenhaInvalido(String username, String senhaInvalida) {
		this.campo_email.sendKeys(username);
		this.campo_senha.sendKeys(senhaInvalida);
		this.btn_login.click();
		assertTrue("Your account may be disabled or blocked or the username/password you entered is incorrect.", true);
		this.campo_email.clear();
		this.campo_senha.clear();

	}

	public void selecionarProjeto(String projeto) {
		this.selecionarProjetoHome.sendKeys(projeto);
		this.menu_report_issue.click();

	}

	public void validandoTodosOsCampos() {
		this.btn_submit_report.click();
		assertTrue("A necessary field 'Summary' was empty. Please recheck your inputs.", true);
	}

	public void validaUmCampo(String categoria) {
		this.menu_report_issue.click();
		this.select_category.sendKeys(categoria);
		this.btn_submit_report.click();
		assertTrue("A necessary field 'Summary' was empty. Please recheck your inputs.", true);

	}

	public void validandoDoisCampos(String categoria, String summary) {
		this.menu_report_issue.click();
		this.select_category.sendKeys(categoria);
		this.campo_summary.sendKeys(summary);
		this.btn_submit_report.click();
		assertTrue("A necessary field 'Description' was empty. Please recheck your inputs.", true);

	}

	public void validandoTresCampos(String categoria, String summary, String description, String delete) {
		this.menu_report_issue.click();
		this.select_category.sendKeys(categoria);
		this.campo_summary.sendKeys(summary);
		this.campo_description.sendKeys(description);
		this.btn_submit_report.click();
		this.marcandoCheckBox.click();
		this.selectDelete.sendKeys(delete);
		this.btn_ok.click();
		this.btn_ok.click();

	}

	public void passandoValorCampoJump(String jump) {
		this.campoJump.sendKeys(jump);
		this.campoJump.submit();

	}

	public void acionarViewIssues() {
		this.menuViewIssues.click();

	}

	public void preenchendoCampoFilter() {
		this.campoFiltroPesquisa.sendKeys("edit");
	}

	public void acessandoMenuMinhaConta() {
		this.menuMyAccount.click();

	}

	public void trocandoSenha() {
		this.campoSenhaNew.sendKeys("teste2018");
		this.btn_Update_User.click();
		assertTrue("Password does not match verification.", true);
		this.menuMyAccount.click();
		this.campoSenhaNew.sendKeys("teste2018");
		this.campoSenhaNewRep.sendKeys("teste2018");
		this.btn_Update_User.click();

	}

}
