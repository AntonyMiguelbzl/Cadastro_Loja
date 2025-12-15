//Atividade

a) Por que o uso de herança foi importante neste projeto?

A herança permitiu reaproveitar atributos e comportamentos comuns
a todos os tipos de camisas, como cor, tamanho, preço e métodos
básicos. Isso evita duplicação de código e facilita a manutenção
e a expansão do sistema para novos tipos de camisetas no futuro.

b) Como o polimorfismo foi aplicado e como isso torna o sistema mais flexível?

O polimorfismo foi aplicado por meio da sobrescrita do método
calcularDesconto() e exibirDetalhes() na classe CamisaEstampada.
Assim, um mesmo método pode ter comportamentos diferentes dependendo
do tipo do objeto. Isso torna o sistema flexível, pois novos tipos
de camisetas podem ser adicionados sem alterar o código existente,
seguindo o princípio do aberto/fechado.
*/
