INSERT INTO user (id, nome, data_nasc, cpf, endereco, estado, cidade, cep, email, telefone, senha, tipo_cadastro) VALUES
  (1, 'Maria', '1990-12-01', '111.111.111-11', 'Rua das Laranjas', 'RS', 'Sao Leopoldo', '93044392', 'maria@gmail.com', '984559494', 'senha', 'cliente');

INSERT INTO matricula (id, forma_pagamento, observacao, servico_contratado) VALUES
  (1, 'debito automatico', 'desconto 10%', 'diário');

INSERT INTO user_matricula (usuario_id, id) VALUES 
  (1, 1);

INSERT INTO user (id, nome, data_nasc, cpf, endereco, estado, cidade, cep, email, telefone, senha, tipo_cadastro) VALUES
  (2, 'Madalena', '1980-10-10', '222.222.222-22', 'Rua das Bergamotas', 'RS', 'Porto Alegre', '98002378', 'madalena@gmail.com', '983300387', 'senha', 'funcionario');

INSERT INTO funcionario (id, valor_hora, funcao, grau_instrucao, oberservacao, carga_horario_mensal, salario) VALUES
  (1, 12, 'personalTrainer', 'superiorIncompleto', null, 144.0, 12.0);

INSERT INTO user_funcionario (usuario_id, id) VALUES 
  (2, 1);
  
INSERT INTO restricao (id, descricao) VALUES
  (1, 'asma');
  
INSERT INTO user_restricoes (user_id, restricoes_id) VALUES
  (1, 1);
  
INSERT INTO atividade (id, descricao, dia, periodo) VALUES
  (1, 'natacao', 1, 1);
  
INSERT INTO atividade (id, descricao, dia, periodo) VALUES
  (2, 'musculacao', 2, 1);

INSERT INTO atividade_restricoes (atividade_id, restricoes_id) VALUES
  (1, 1);
  
INSERT INTO ficha_treino (id) VALUES
  (1);

INSERT INTO ficha_atividades (ficha_treino_id, atividades_id) VALUES
  (1, 2);
  
INSERT INTO ficha_user (usuario_id, id) VALUES
  (1, 1);
  
INSERT INTO plano (id, descricao, forma_de_pagamento) VALUES 
  (1, 'Masters', 3);
  
INSERT INTO matricula_plano (plano_pagamento_id, id) VALUES
  (1, 1);
  
INSERT INTO user_atividades (atividade_id, clientes_id) VALUES
  (2, 1);
  

  
