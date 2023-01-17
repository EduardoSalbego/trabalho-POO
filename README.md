# trabalho-POO

## **ENUNCIADO:**

Propõem-se o desenvolvimento de um sistema destinado ao gerenciamento de estoque de
minimercados, fruteiras e padarias. O software desenvolvido deverá estar de acordo com os
seguintes requisitos e especificações.

**1.** O software manipula produtos, onde cada produto deve apresentar, no mínimo, os seguintes
dados: código, nome, descrição, quantidade e preço. Existem duas grande categorias de
produtos: aqueles que são vendidos por unidade e aqueles vendidos por quilo. Nos
produtos vendidos por unidades, o atributo quantidade deve ser do tipo inteiro. Já nos
produtos vendidos por quilo, o atributo quantidade deve ser do tipo ponto flutuante.
Independente da categoria do produto, o atributo código deve ser único.

**2.** A coleção de todos os produtos em estoque, assim como os métodos que manipulam essa
coleção devem ser implementados por uma classe A de processamento que implementa a
interface IProdutos (download da interface no Moodle).

**3.** O software manipula também notas fiscais, onde cada nota fiscal deve apresentar, no
mínimo, os seguintes dados: código, data e relação de itens, onde cada item é composto
por um produto e a quantidade vendida.

**4.** A coleção de todas as notas fiscais, assim como os métodos que manipulam essa coleção
devem ser implementados por uma classe B de processamento que implementa a interface
INotasFiscais (download da interface no Moodle).

**5.** A interação com o usuário deve ocorrer através de interfaces gráficas. Importante: ela deve
permitir que os produtos sejam cadastrados, consultados, alterados ou excluídos e que as
notas fiscais sejam criadas, consultadas e alteradas, além de permitir saber o total vendido
em um determinado dia
