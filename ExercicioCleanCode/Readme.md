# POC Clean code

## Exercicio

   Uma classe Java chamada GeradorObservacao. Essa classe é uma classe legada. A classe atual recebe uma lista de inteiros, e devolve uma String com esses inteiros separados por vírgula concatenados a um texto inicial. Ajustando o texto para singular ou plural de acordo com a quantidade de itens da lista.

Exemplo:
Dado de entrada: Arrays.asList(1, 2, 3, 4, 5)
Retorno esperado: "Fatura das notas fiscais de simples remessa: 1, 2, 3, 4 e 5."

Um cliente desse sistema ficticio que utiliza essa funcionalidade nos trouxe a necessidade de querer ver
essas informações junto com o valor, no seguinte formato:
"Fatura das notas fiscais de simples remessa: 1 cujo valor é R$ 10,00, 2 cujo valor é R$ 35,00, 3 cujo valor é
R$ 5,00, 4 cujo valor é R$ 1.500,00 e 5 cujo valor é R$ 0,30. Total = 1.550,30."

## Aplicação:
A aplicação possui duas classes para gerar as observações:

### Gerador Legado:
A classe Gerador Legado é a responsável por retornar uma fatura simples apenas contendo o código dos produtos e alterando para singular ou plural de acordo com a quantidade de itens da lista: 
Retorno esperado: "Fatura das notas fiscais de simples remessa: 1, 2, 3, 4 e 5."

Foram removidos alguns comentários por questão de clean code e a ideia é que a classe seja simples e autoexplicativa, refatorados nomes de variáveis pois variáveis como "s" e "c" não são boas práticas e além de dificultar o entendimento podem dificultar uma possível busca para alteração. Inclui a frase no plural em uma variável afim de padronizar já que a no singular também estava. No mais a aplicação continua com o retorno esperado da aplicação legado.

### Gerador Observação:
A classe geradorObservacao implementa uma nova funcionalidade ao legado retornando o valor de cada item assim como o total:
"Fatura das notas fiscais de simples remessa: 1 cujo valor é R$ 10,00, 2 cujo valor é R$ 35,00, 3 cujo valor é
R$ 5,00, 4 cujo valor é R$ 1.500,00 e 5 cujo valor é R$ 0,30. Total = 1.550,30."

Para isso criei um novo método para consultar o valor de cada item e adicionei o resultado ao método ja existente que gera a observação,
utilizei o switch case pois como são apenas 5 produtos acredito que seja uma solução simples e que atende bem o problema.