### Descrição
Você está desenvolvendo um sistema básico de gerenciamento de inventário para uma loja. No sistema, os produtos e 
suas quantidades são armazenados em um HashMap. Você precisa criar uma função que, dado o nome de um produto 
digitado pelo usuário, verifique a quantidade disponível em estoque e retorne uma mensagem apropriada.

A função deve:

* Receber o nome de um produto do usuário.

* Consultar um HashMap de produtos com suas quantidades.

* Se o produto estiver no estoque e a quantidade for maior que zero, retornar "Produto disponivel: X em estoque.", 
onde, X é a quantidade em estoque.

* Se o produto estiver no estoque, mas a quantidade for zero, retornar "Produto indisponivel.".

* Se o produto não estiver no estoque, retornar "Produto nao encontrado.".

#### Entrada
String: Nome do produto.

#### Saída
String: "Produto disponivel: X em estoque.", "Produto indisponivel." ou "Produto nao encontrado".