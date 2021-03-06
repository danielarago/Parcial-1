# Parcial
Repositorio con parcial primer corte.
## Conceptos
* ¿Qué es encapsulamiento? ¿Qué ventajas ofrece?
    * El encapsulamiento es un mecanismo que une tanto los datos como el estado de un objeto, es decir sus atributos y sus métodos, en una sola unidad lógica. Sus ventajas son que hace que los datos de un objeto solo tengan que ser comprendidos por ese objeto, y la integridad de los datos es responsabilidad solamente de ese objeto. Cualquier cambio en los datos solo va a a afectar al objeto en cuestión entonces si hay errores más adelante es fácil identificarlos y solucionarlos. El encapsulamiento trata cada objeto como una fortaleza, protegiendo sus datos y haciendo que la única manera de utilizarlos en áreas del código cliente sea pidiéndolos. Por lo tanto, un dato que tenga que cambiar solo se debe cambiar en su origen, en su objeto, y va a estar actualizado para el resto del código, ahorrando tiempo y recursos. 
* ¿Qué es ocultación de información? ¿Por qué aplicarla? ¿Cómo se implementa en Java?
    * Al igual que el encapsulamiento es una práctica del paradigma de programación orientada a objetos que protege integridad de datos. Hace que se pueda modificar el acceso del código de una clase por fuera de ella, para que algunas cosas sean privadas y solo sean asequibles dentro de la clase misma y otras públicas. Generalmente, los métodos son de acceso libre y los atributos de acceso privado, aunque hay unas pocas excepciones. Esto se debe a varias razones, en primer lugar no es necesario que el código cliente vea los atributos de un objeto o sus datos, sino que vea sus servicios. En segundo lugar, al restringir el acceso a los datos se puede enforzar una lógica de negocio para ellos. Si fueran de libre acceso otras clases podrían llegar a introducir datos en ciertos atributos que no tengan sentido en el contexto. Pero si el atributo es privado y solo se puede modificar con un método set entonces le objeto tiene control y puede mantener lógica. En Java se implementan con los modificadores de acceso public y private que se declaran al principio de los métodos y los atributos.
## Diagrama de memoria
![Diagrama de memoria](https://github.com/danielarago/Parcial-1/blob/master/Diagrama%20de%20memoria.png)
El diagrama de memoria también se encuentra en los archivos.
## Código
Diagrama de clases actualizado, también se encuentra en los archivos.
![Diagrama de clases](https://github.com/danielarago/Parcial-1/blob/master/Diagrama%20de%20clases%20modificado.png)
## Diseño
Diagrama de secuencia del diseño
![Diagrama de secuencia diseño](https://github.com/danielarago/Parcial-1/blob/master/Dise%C3%B1o%20Parcial.png)
Corrección del diseño según lo visto en clase. Se vuelve más fácil el proceso, buscando tanto al estudiante como al grupo dentro de SabanaResearch y después entrando a registrar al estudiante. 
![Diagrama de secuencia corregido](https://github.com/danielarago/Parcial-1/blob/master/Dise%C3%B1o%20Parcial%20corregido.png)