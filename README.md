1- Criei projeto com Spring Boot com Web Dependencies no Eclipse 

2- Criei a classe Jogador e sua comunicação com banco de dados Postgre utilizado para teste. Para isso criei o JogadorRepository utilizando somente a extensão JpaRepository e em application.properties configuro a url, e o acesso ao banco de dados.

3- Ultilizei o nome como Id do objeto Jogador e criei os atributos pontuaçaõ e pos (Posicao).

4-Optei por fazer a organizaçaõ lógica dos dados, não fisicamente. Sendo assim os objetos não teriam de ser realocados no banco de dados quando um novo objeto for cadastrado.

4.1 - No POST percorro a lista no banco de dados e verifico em qual posicao o novo objeto a ser cadastrado deve ficar e todos os objetos com pontuacao maiores sobem uma posicao.

4.2 - No GET crio uma lista secundária organizada para ser impressa em ordem.

Obs.
-Segui esses vídeos para realizar o passo 1 e 2: https://www.youtube.com/watch?v=KyEByWhvRVQ&list=PLa2F6AVAMbyabo50dQaQYpkWchIt64h5e&index=2

-Para testes ultlizei os programas:
	-Posgres 13 - para criar o banco de dados e fazer checagem nele: https://www.enterprisedb.com/downloads/postgres-postgresql-downloads
	-Postman - para fazer requisições http - https://www.postman.com/
	
	https://www.youtube.com/watch?v=NDKS8gMrseU&list=PLa2F6AVAMbyabo50dQaQYpkWchIt64h5e&index=8