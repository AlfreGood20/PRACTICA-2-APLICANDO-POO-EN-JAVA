## 😬Enunciado
### Crearemos una clase llamada Serie con las siguientes características:
  - Sus atributos son titulo, numero de temporadas, entregado, genero y creador.
  - Por defecto, el numero de temporadas es de 3 temporadas y entregado false. El resto de atributos serán valores por defecto según el tipo del atributo.
### 🛠️Los constructores que se implementaran serán:
   - Un constructor por defecto.
   - Un constructor con el titulo y creador. El resto por defecto.
   - Un constructor con todos los atributos, excepto de entregado.
 ### ⌨️Los métodos que se implementara serán:
   - Métodos get de todos los atributos, excepto de entregado.
   - Métodos set de todos los atributos, excepto de entregado.
   - Sobrescribe los métodos toString.
    
### 👨‍💻Crearemos una clase Videojuego con las siguientes características:
  - Sus atributos son titulo, horas estimadas, entregado, genero y compañia.
  - Por defecto, las horas estimadas serán de 10 horas y entregado false. El resto de atributos serán valores por defecto según el tipo del atributo.
### 🛠️Los constructores que se implementaran serán:
   - Un constructor por defecto.
   - Un constructor con el titulo y horas estimadas. El resto por defecto.
   - Un constructor con todos los atributos, excepto de entregado.
 ### Los métodos que se implementara serán:
   - Métodos get de todos los atributos, excepto de entregado.
   - Métodos set de todos los atributos, excepto de entregado.
   - Sobrescribe los métodos toString.
    
## Como vemos, en principio, las clases anteriores no son padre-hija, pero si tienen en común, por eso vamos a hacer una interfaz llamada Entregable con los siguientes métodos:
  - entregar(): cambia el atributo prestado a true.
  - devolver(): cambia el atributo prestado a false.
  - isEntregado(): devuelve el estado del atributo prestado.
  
## 👨‍💻Lo que se hara en el main:
  - Crea dos arrays, uno de Series y otro de Videojuegos, de 5 posiciones cada uno.
  - Crea un objeto en cada posición del array, con los valores que desees, puedes usar distintos constructores.
  - Entrega algunos Videojuegos y Series con el método entregar().
  - Cuenta cuantos Series y Videojuegos hay entregados.
  - Indica el Videojuego tiene más horas estimadas y la serie con mas temporadas. Muestralos en pantalla con toda su información (usa el método toString()).
  - Y por ultimo devuelve todas las series y videojuegos, muestra por pantalla el cuenta cuantos Series y Videojuegos hay entregados.
