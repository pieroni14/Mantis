package project.mantis.steps;

import net.thucydides.core.annotations.Step;
import project.mantis.pages.ScriptPageUm;
import project.mantis.pages.PagesWebElements;


public class ScriptUmStep {
	PagesWebElements webElements;
	ScriptPageUm scriptPageUm;

	@Step("Abrir o mantis")
	public void abrirMantis() {
		webElements.open();

	}
	@Step("Autenticação do usuário no mantis")
	public void autenticandoAcesso(String username, String senha) {
		scriptPageUm.preenchendoDadosAutenticacao(username,senha);
	}

	@Step("Validando acesso com usuario invalido")
	public void autenticandoAcessoUserInvalido(String userInvalido, String senha) {
		scriptPageUm.validandoUserInvalido(userInvalido,senha);

	}
	@Step("Validando acesso com senha invalido")
	public void autenticandoAcessoSenhaInvalido(String username, String senhaInvalida) {
		scriptPageUm.validandoSenhaInvalido(username, senhaInvalida);

	}
	@Step("Validando com os acessos correto")
	public void autenticandoAcessoValido(String username, String senha) {
		scriptPageUm.preenchendoDadosAutenticacao(username,senha);

	}
	@Step("Selecionando o projeto")
	public void selecionandoProjeto(String projeto) {
		scriptPageUm.selecionarProjeto(projeto);
	}
	@Step("Validando os todos os campos do cadastro do projeto")
	public void validarTodosOsCampos() {
		scriptPageUm.validandoTodosOsCampos();

	}
	@Step("Validando todos os campos obrigatorio na hora do cadastros do bug")
	public void ValidarCampo_a_campo(String categoria, String summary, String description, String delete) {
		scriptPageUm.validaUmCampo(categoria);
		scriptPageUm.validandoDoisCampos(categoria,summary);
		scriptPageUm.validandoTresCampos(categoria,summary,description,delete);

	}
	@Step("Validando Pesquisa Jump")
	public void validarPesquisaJump(String jump) {
		scriptPageUm.passandoValorCampoJump(jump);

	}
	@Step("Acionando o menu View Issues")
	public void acionnandoViewIssues() {
		scriptPageUm.acionarViewIssues();

	}
	@Step("Validacao Pesquisar no filtro")
	public void pesquisarFilter() {
		scriptPageUm.preenchendoCampoFilter();

	}
	public void acessandoMinhaConta() {
		scriptPageUm.acessandoMenuMinhaConta();

	}
	public void trocandoSenha() {
		scriptPageUm.trocandoSenha();

	}


}
