# Questão 3 *(3 pontos)*

Observe o código a seguir:

```java
public interface Geometria {
    double perimetro();
    double area();
}

public interface Redimensionavel {
    void redimensionar(int percentual);
}
```

a. Implemente uma classe `Quadrado`, que possui um atributo `protected` chamado `lado`, de tipo `double`. 
Implemente um construtor que preenche o atributo `lado`, ou seja, o construtor deve 
receber por parâmetro um `lado` e atribuí-lo à sua propriedade `lado`. Implemente um método
`getLado` que retorne o valor de `lado`.
Faça com que essa classe **implemente** a interface `Geometria`. *(1,5 ponto)*

b. Implemente uma classe `QuadradoRedimensionavel`, que é *subclasse* de `Quadrado` e 
**implementa** a interface `Redimensionavel`. Essa classe deve implementar um 
construtor que recebe o valor de `lado` e o transmite para o construtor da superclasse.
Para implementar o método `redimensionar`, você deve receber uma *porcentagem* e fazer com que
`lado += lado * percentual / 100`  *(1,5 ponto)*