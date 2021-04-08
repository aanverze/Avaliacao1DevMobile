# Questão 4 *(3 pontos)*

Observe o diagrama abaixo, que modela classes para um jogo de truco:

Diagrama

Você receberá um código que já contém essas duas classes implementadas! De forma que
só precisará implementar o que se pede a seguir!

a. Implemente uma classe Jogador que contenha os atributos `mao`, do tipo `Carta[]` (um vetor
de cartas) e `indiceMao`, do tipo `int`. A `mao` deve ter tamanho `3`. O `indiceMao` servirá para
indicar qual carta da mão foi selecionada. Essa classe deve ter um construtor padrão (sem
receber nenhum parâmetro) que inicializa a mão (inicializa o vetor - ou seja, usa `new`) 
e inicializa o valor do `indiceMao` com `0`. O jogador também deve ter um método `recebeCarta(Carta c)`, que
insere uma carta ao vetor `mao`, na posição `indiceMao` (`mao[indiceMao] = c`). 
Você deve incrementar o valor de `indiceMao` após receber a carta. *(1,5 ponto)*

b. Implemente uma classe `Truco` que contém como atributo dois `Jogador`es, um `Baralho`, 
uma `cartaVirada`, do tipo `Carta`. Sua classe deve ter um construtor padrão que inicializa
cada um desses atributos (faz `new` nesses atributos). Deve ter um método privado `embaralhaCartas()` que
chama o método `embaralha()` do `Baralho`, um método privado `distribuiMaos()`, que deve
distribuir três cartas do baralho para cada `jogador` (lembre-se do método `receberCarta`
dos jogadores. Você também deve implementar um método `inicializaManilha()`, que
põe uma carta na mesa (*distribui* uma carta do baralho e *atribui* a `cartaVirada`. Esses
métodos que você implementar vão complementar a classe `Truco`. *(1,5 ponto)*

Para sua referência, segue o método `jogar()`, que implementa a lógica básica do início do jogo:

```java
public void jogar() {
    embaralhaCartas();
    distribuiMaos();
    inicializaManilha();
    imprimeMesa();
}
```