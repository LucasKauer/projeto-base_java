# Hackaton

## Manuel de Uso
  1. Criar base de dados:
  <snippet>
	CREATE DATABASE teste_db;
  </snippet>

  2. Criar tabela de usuário:
  <snippet>
	CREATE TABLE `teste_db`.`User` (
	  `Name` VARCHAR(200) NOT NULL,
	  PRIMARY KEY (`Name`));
  </snippet>

  3. Alterar suas credenciais de acesso SGBD na src/main/Hackaton/IniciativaProgramadores/infrastructure/database/configuration/DataBaseConstants.java. Exemplo: 
  <snippet>
	public final class DataBaseConstants {
	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/teste_db";
	public static final String USER = "root";
	public static final String PASSWORD = "";
}
  </snippet>

  4. Para atualizar as dependências do pom.xml abra o eclipse, selecione o projeto, aperte Alt+F5 e depois ENTER.

  5. Execute o projeto e acesse
    -> localhost:8082/user/save?name=lucs
    -> localhost:8082/user/update?newName=lucas&oldName=lucs
    -> localhost:8082/user/delete?name=lucas

## Contribua
1. Dê Fork!
2. Crie um branch com a sua feature: `git checkout -b my-new-feature`
3. Versione suas alterações: `git commit -am 'Add some feature'`
4. Envie para o seu branch: `git push origin my-new-feature`
5. Faça um pull request =D
