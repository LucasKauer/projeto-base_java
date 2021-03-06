# Hackaton

## Manuel de Uso
  1. Criar base de dados:
	```sql
	CREATE DATABASE teste_db;
	```

  2. Criar tabela de usuário:
	```sql
	CREATE TABLE teste_db.User (Name VARCHAR(200) NOT NULL, PRIMARY KEY (Name));
	```

  3. Alterar suas credenciais de acesso da conexão do server MySql na `src/main/Hackaton/IniciativaProgramadores/infrastructure/database/configuration/DataBaseConstants.java`.

```java
	public final class DataBaseConstants {
		public static final String DRIVER = "com.mysql.jdbc.Driver";
		public static final String URL = "jdbc:mysql://localhost:3306/teste_db";
		public static final String USER = "root";
		public static final String PASSWORD = "root";
	}
```
  4. Para atualizar as dependências do pom.xml abra o eclipse, selecione o projeto, aperte <kbd>Alt</kbd> + <kbd>F5</kbd> e depois <kbd>ENTER</kbd>.

  5. Execute o projeto e acesse
    a. `localhost:8082/user/save?name=lucs`
    b. `localhost:8082/user/update?newName=lucas&oldName=lucs`
    c. `localhost:8082/user/delete?name=lucas`

### Setup na IDE IntelliJ IDEA

   1. Siga os passos 1, 2, 3 anteriores.
    
   2. Faça fork do projeto em: https://github.com/LucasKauer/projeto-base_java
   
   3. Se tiver algum projeto aberto, feche-o. Após isso, vá em "Check out from Version Control" e selecione GitHub.
   
   4. Depois, insira seu login e senha do GitHub.
   
   5. Escolha o Repositório que realizou fork previamente.
   
   6. Clique em "Import project from external model" e escolha Eclipse. Clique Next até Finish.
   
   7. Botão Direito no Projeto, clique em "Add Framework Support".
   
   8. Agora basta selecionar o Maven e permiti-lo adicionar as bibliotecas necessárias.

## Leituras Interessantes

  1. [Convenção de Commits](https://github.com/CWISoftware/crescer-2016-2/wiki/Convenção-de-commits)
  2. [Convenção de nomenclatura Java](https://github.com/CWISoftware/crescer-2015-1/blob/master/CONVENCOES.md)
  3. [Atalhos do Eclipse](https://github.com/CWISoftware/crescer-2015-1/blob/master/ECLIPSE.md)

## Contribua
1. Dê Fork!
2. Crie um branch com a sua feature: `git checkout -b my-new-feature`
3. Versione suas alterações: `git commit -am 'Add some feature'`
4. Envie para o seu branch: `git push origin my-new-feature`
5. Faça um pull request =D
