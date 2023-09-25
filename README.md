# arvore-binaria
ÁrvoreBinaria - Resolução de Problemas Estruturados em Computação
O código apresentado é uma implementação de uma Árvore Binária de Busca em Java, organizada em quatro classes distintas, entre elas temos:
TreeNode: Esta classe representa um nó em uma Árvore Binária de Busca. Cada nó contém um valor (key) e referências para os seus filhos esquerdo (left) e direito (right). 
O construtor TreeNode(int item) inicializa um nó como
valor especificado.

![image](https://github.com/EdMussi/arvore-binaria/assets/107810558/633cc8b0-e382-4547-affc-231790d6fe5b)

Insertion:
Esta classe possui um método estático chamado insert(TreeNode root, int key) para inserir um valor na Árvore Binária de Busca.
O método verifica se o nó atual é nulo. Se for, cria um novo nó com o valor e o retorna.
Caso contrário, compara o valor a ser inserido com o valor do nó atual e chama recursivamente a inserção no filho correspondente.

![image](https://github.com/EdMussi/arvore-binaria/assets/107810558/5e26d5ae-0a68-48bd-9f0e-3ff8cfb4e94d)

Deletion:
Esta classe possui um método estático chamado delete(TreeNode root, int key) para remover um valor da Árvore Binária de Busca.
O método segue as regras de remoção para diferentes casos (nó sem filhos, nó com um filho, nó com dois filhos) e retorna a nova raiz da árvore.
![image](https://github.com/EdMussi/arvore-binaria/assets/107810558/6b7f6762-4814-4793-9ba5-8298735f76fc)

Search:
Esta classe contém um método estático chamado search(TreeNode root, int key) para buscar um valor na Árvore Binária de Busca.
O método percorre a árvore comparando o valor de busca com o valor dos nós até encontrar ou chegar a um nó nulo.
![image](https://github.com/EdMussi/arvore-binaria/assets/107810558/e242e17a-5b43-4542-9ed7-bc6f1f1bc21f)

Main:
Esta é a classe principal onde a interação com o usuário acontece.
Ela instância um objeto Scanner para receber a entrada do usuário.
Permite ao usuário inserir valores na árvore, imprimir a árvore, buscar por um valor e remover um valor.
A impressão da árvore é realizada através do método printTreeRecursive.
![image](https://github.com/EdMussi/arvore-binaria/assets/107810558/64d3bc1d-c6a1-444e-ba11-4b9b2ef66796)

![image](https://github.com/EdMussi/arvore-binaria/assets/107810558/e0314ac6-94b1-429c-8ab3-6fb7a1ad0bc3)

