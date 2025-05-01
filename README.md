# Geometric Shapes
object orientation programming study

Herança e poliporfismo. Estes são dois dos principais conceitos explorados neste projeto de estudo desenvolvido na IDE-Eclipse. O conteúdo envolve figuras geométricas 
2D (Triângulo, Retângulo, círculo) e 3D (Cubo, Círculo e Tetraedro), abordando suas respectivas características e fórmulas para cálculo do perímetro, área e volume.

### Herança
Observa-se a operação de herança através da palavra-chave "extends" que estende a classe base à classe pai para herdar seus métodos e atributos, como por exemplo, 
o retângulo que se estende até a classe Geom2D para adquirir os atributos perimetro e area, e dessa forma, implementar seus métodos calcPerimetro() e calcArea().

Mediante ao método main imbutido na classe ExemploHeranca, nota-se o correto funcionamento desta operação de herança ao instanciarmos um objeto do tipo da variável de referência
passando os argumentos que são base para o cálculo da resolução esperada, seja perimetro, área ou volume.

### Polimorfismo
Quanto ao polimorfismo, observamos a possibilidade de o tipo da variável de referência ser diferente do tipo do objeto (exemplo: Geom2D objRetangulo = new Retangulo()).
Também nota-se que é possívl a conversão do tipo de um objeto mais genérico (como Geom2D) para o tipo de um objeto mais específico (como Retangulo ou Triangulo) usando
para demonstração um método desenvolvido chamado maiorPerimetro.

#### Método equals()
Também aproveito para explorarmos o método equals() que vai comparar se uma figura geométrica possui as mesmas proporções de outra. 
No exemplo explicitado através do método main da classe ExemploEquals conferimos a instanciação de dois retângulos que serão comparados segundo os parâmetros passados (base e altura).
