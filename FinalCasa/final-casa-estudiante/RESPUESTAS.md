## Modelo Original
 
1.- Primero y mas importante, los atributos de la clase "obj.Casa" y 
de la clase "Componente Electrico"
son publicos, lo que viola el **ENCAPSULAMIENTO**, uno de los pilares de la programacion
orientada a objetos por lo tanto es a mi juicio el error mas grave, incluso
se accede a ellos en la implementacion de los test cosa que estas muy mal conceptualmente,
ademas deberian ser inicializados en el constructor de la clase para
mejor legibilidad del codigo.

2.- Hay problemas con la abstraccion, la unica condicion que 
diferencia a los componentes electricos es el nombre con que se crea cada instancia, 
el mismo tambien es determinante a la hora del calculo de su consumo, esto esta mal 
conceptualmente por que se estan usando a los componentes electricos como un conjunto
en una misma clase en vez de trabajar con ellos como abstracciones de cada uno de los 
componentes invididuales, pero englobando su comportamiento en una interfaz por ejemplo.

3.- En cuanto al test, el mismo accede a atributos de la clase, y ademas tiene un nombre
poco descriptivo.

4.- Se viola el principio **OPEN-CLOSE** debido a la abstraccion de los
componentes electricos, si por ejemplo quisiera agregar un nuevo
componente electrico tendria que entrar a la clase "Componente Electrico"
y modificar todos los ifs que se encuentran alli, ademas si quisiera agregar
el consumo de las estufas(salamandras) tendria que entrar a "obj.Casa"  
y crear un nuevo atributo del tipo lista de salamandra y hacer que las 
tome en cuenta para el presupuesto.
 
5.- Se viola el principio **DEPENDENCY INVERSION** debido a que la "obj.Casa" 
depende de una implemementacion concreta de "obj.ce" y no de
una abstraccion del mismo.

## Modelo Alumno

1.- Cabe destacar que tuve poco conocimiento acerca del modelo de dominio por lo que tome a la salamandra
como otro componente electrico y a los consumos de calorias y kw como propios de los
componentes, de primera los unicos inconvenientes de de diseño seria que violo el
pincipio **OPEN-CLOSE** por que si tengo que cambiar alguno de los consumos de los
componentes habria que cambiar las variables finales en las clases, pero en un
refactor se podria mejorar, pido disculpas por que me faltaron los diagramas de secuencias
debido al tiempo.



