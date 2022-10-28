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

  (!!) - o modo *'staged'* faz parte de um dos ciclos de vida do Git. Ele é o modo em que os arquivos estão no modo espera para serem commitados.

  ### Ciclo de vida dos arquivos no Git
 Primeiros estágios dos arquivos:
  - O arquivo é criado e em seguida o usuário dá o comando _git innit_;
 Quando um arquivo é criado, ele está no *estado untracked* (estágio do git init), ou seja, o git não reconhece esse arquivo e não sabe para que usá-lo. Quando o comando _git add_ é utilizado, o arquivo passa direto para o estado *staged*, onde ele está esperando para ser commitado.

 Segundos estágios:
  - Quando o arquivo é criado, dado o comando git innit e ele ainda não foi modificado;
 Um arquivo no estado *unmodified* significa que é um arquivo que o git reconhece, mas ele não foi modificado ainda. Quando o arquivo é aberto e modificado, ele muda diretamente para modified.

 Obs: Quando um arquivo unmodified é removido, o Git para de reconhecer ele e ele volta pra untracked.

 Terceiro estágio:
  - Logo depois que o arquivo é modificado;
 Depois, no estado *modified* ele passa direto para o *staged*, onde ele vai ficar no modo espera para ser modificado ou commitado.

 Últimos estágio:
  - O arquivo foi modificado e o commit foi dado o commit;
 No *staged* o arquivo está esperando para se tornar um commit e quando o commit é criado, todas as alterações dos estágios acima são envelopadas e ele volta para o *unmodified*, esperando novas modificações para reiniciar o ciclo.


  
