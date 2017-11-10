INSERT INTO user (id, nome, data_nasc, cpf, endereco, estado, cidade, cep, email, telefone, senha, tipo_cadastro) VALUES
  (1, 'lala', sysdate, '111.111.111-11', 'asd', 'asd', 'asd', 'asd', 'asd', 'asd', 'asd', 'cliente');

INSERT INTO matricula (id, forma_pagamento, observacao, servico_contratado) VALUES
  (1, 'asdasd', 'asdasd', 'adasasd');

insert into user_matricula (usuario_id, id) values (1, 1);


INSERT INTO user (id, nome, data_nasc, cpf, endereco, estado, cidade, cep, email, telefone, senha, tipo_cadastro) VALUES
  (2, 'adadsad', sysdate, '111.111.111-11', 'asd', 'asd', 'asd', 'asd', 'asd', 'asd', 'asd', 'funcionario');

INSERT INTO funcionario (id, valor_hora, funcao, grau_instrucao, oberservacao, carga_horario_mensal, salario) VALUES
  (1, 12, 'personalTrainer', 'superiorIncompleto', null, 144.0, 12.0);

insert into user_funcionario (usuario_id, id) values (2, 1);