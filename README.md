# Hackaton

## Manuel de Uso
  1. Criar base de dados:
	`CREATE DATABASE teste_db;`

  2. Criar tabela de usuário:
	`CREATE TABLE teste_db.User (Name VARCHAR(200) NOT NULL, PRIMARY KEY (Name));`

  3. Alterar suas credenciais de acesso SGBD na `src/main/Hackaton/IniciativaProgramadores/infrastructure/database/configuration/DataBaseConstants.java`.

  4. Para atualizar as dependências do pom.xml abra o eclipse, selecione o projeto, aperte `Alt+F5` e depois `ENTER`.

  5. Execute o projeto e acesse
    a. `localhost:8082/user/save?name=lucs`
    b. `localhost:8082/user/update?newName=lucas&oldName=lucs`
    c. `localhost:8082/user/delete?name=lucas`

## Contribua
1. Dê Fork!
2. Crie um branch com a sua feature: `git checkout -b my-new-feature`
3. Versione suas alterações: `git commit -am 'Add some feature'`
4. Envie para o seu branch: `git push origin my-new-feature`
5. Faça um pull request =D
