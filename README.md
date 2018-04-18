# Mantis
#Resumo
#Projeto automação  aplicado emcima do sistema Mantis
#*Link:http://mantis-prova.base2.com.br

#Utilizando as seguinte ferramentas,
#*Selenium
#*Serenity
#*Maven
#*Junit
#*ChromeDriver 2.37 [Supports Chrome v64-66]


#Modo de instalação
#1º Baixe o repositorio no projeto no GitHub
#2º Utilize a IDE Eclipse com o JDK 7 ou superior;
#3º No Eclipse vai no 
#  3.1 Menu "File"
#  3.2 Opção "Import"
#  3.3 Pesquise no campo "Maven"
#  3.4 Acione  "Existing Maven Projects"
#  3.5 [Next]
#  3.6 No Root Directory informa o local onde se encontra o "Mantis"
#  3.7 Depois reconhece o pom.xml 
#  3.8 Finish
#4º Finalizando a importação do projeto
#	4.1 Menu "Run"
#	4.2 Opção "Run Configurations"
#	4.3 Encontre opção "Maven Build" / Botão direito e click "New"
#	4.4 Base directoy: "informa o repositorio do projeto"
#	4.5 Goals informa: "clean install"
#	4.6 Aciona Apply e depois Run 
#	4.7 Ira baixar todas as dependencias que esta configurando no pom.xml para poder executar os testes

#5º Para executar a bateria de teste  fazer a configuração do Mavin utilizando o seguinte paramentro no goals
goals: clean integration-test serenity:aggregate

E executara os 10 cenários


OBS: Para executar com headless
Entre no Serenity.properties linha 12
Se estiver comentado a linha ira executar sem o  Headless
Se não estiver estara executando com Headless

Como padrão deixe para executar como Headless;

Obs2: Para executar no Linux, precisa baixar o *ChromeDriver 2.37 [Supports Chrome v64-66] especifico para o sistema operacional.
Obrigado

Obs:3: Dentro do Serenity.properties configurar o caminho correto do ChromeDrive.

Obs:4: O relatorio é gerado apos a execução do passo 5º, Apos da execução o relatorio se encontra : "C:\Mantis\target\site\serenity"

Marcelo Pieroni
pieroni14@hotmail.com
