# Conceitos Java 

### Variáveis, tipos de dados e criação 
#### O que é uma variável:
Um espaço na memória do computador, onde se pode guardar valores.

Tipos de valores:
 - Instancia: Objeto;
 - Classe: classe;
 - Local: dentro de métodos;
 - Parâmetro: na assinatura do método.

Padrão de definição:
<?visibilidade?> <?modificador?> tipo nome <?valor inicial?>;

O que está em <??> é opcional, ou seja, o padrão de definição obrigatório é:
tipo nome da variável;

Visibilidade: “public”, “protected” e “private”.

Modificador: “static” e “final”.
O final que dizer que a variável é constante, ele não muda em momento algum no futuro.


Regras (Java e gerais):
 - Não pode começar com números;
 - Evitar $ e _, apesar de não ser algo obrigatório de não usar;
 - Case-sensitive -> Gato e gato são variáveis completamentes diferentes e são interpretadas de formas diferentes;
 - Não pode ter espaço;
 - Não pode ser uma palavra reservada do próprio java;
 - @, %, (), <>, caracteres especiais são proibidos em variáveis.


Boas práticas:
 - Sempre começar com letras minúsculas;
 - Nomes expressivos -> nomes intuitivos;
 - Notação camelo -> variáveis com mais de uma palavra a segunda palavra começa com letra maiúscula;
 - Quando constante (final) todas as letras devem ser maiúsculas e as palavras devem ser separadas por “_”.

