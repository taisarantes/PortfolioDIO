# Introdução ao Git e GitHub

### Comandos Básicos
Windows/Unix (Linux e Aplle)
 - _dir_/_ls_: lista todas os diretório de uma pasta;
 - _cd_: navega pelos diretórios (igual no windows e unix);
 - _cls_: limpar o terminal (windows) / _clear_ ou ctrl + L (Unix);
 - _mkdir nome diretório_: cria um diretório/pasta (igual no windows e unix);
 - _echo nome > nome.txt_: cria arquivo (igual no windows e unix);

 ### Iniciando o Git e Criando Repositórios
 Passos:
  1. Criar uma pasta;
  2. Ir na pasta e dar o comando _git init_ (!);
  3. Colocar o conteúdo do diretório e da pasta;
  4. Dar o comando _git status_ para ver as mudanças não commitadas;
  5. Dar o comando _git add *_ para adiconar todas as mudanças para o modo 'staged' (!!);
  6. Dar o comando _git commit -m "mensagem"_ para commitar as mudanças no repositório local;
  7. Criar um repositório remoto (no GitHub);
  8. Pegar o HTTPS do repositório e usar ele junto do comando _git remote add origin HTTPS_;
  9. Dar o comando _git push origin master_ para os commits serem "empurrados" para o repositório remoto;
  10. Fim :) 

  ### Observações
  (!) - com o _git innit_ uma pasta chamada .git será criada e é importante ressaltar que ela não aparece pois ela sempre é criada nos itens ocultos. Com o comando _ls -a_ é possível listar esses itens pelo terminal.

  (!!) - o modo 'staged' faz parte de um dos ciclos de vida do Git. Ele é o modo em que os arquivos estão no modo espera para serem commitados.
  
