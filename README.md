# Baraja Java
Programa en Java para barajar cartas y ver cual es la carta de arriba.
<br>Los objetos `Carta` se alamcenan en un `Stack` facilitando la tarea de añadir cartas al final y ir quitando una a una

## Funciones
1. Barajar cartas (Añade una cantidad de cartas aleatorias al mazo)
2. Levanta la ultima carta (La muestra y la descarta del mazo)

## Metodos
> Metodo para generar una nueva carta aleatoria que la añade al mazo `baraja`
```java

  public static void nuevaCarta(){
    //Obtenemos numeros aleatorios
    int numC = random(1,10);
    int paloI = random(1,4);
    String paloC = null;
		
    //Convertimos palo en String
    switch (paloI){
    case 1:
      paloC = "Oro";
      break;
    case 2:
      paloC = "Copa";
      break;
    case 3:
      paloC = "Espada";
      break;
    case 4:
      paloC = "Basto";
      break;
    }
		
    //Generamos la nueva carta en la baraja
    baraja.push(new Carta(numC,paloC));
  }

```

## Ejemplo
```
-------------------------
-----Baraja Española-----
-------------------------
Que quieres hacer?
1. Barajar las cartas
2. Dar la vuelta a la ultima carta
3. Salir
```
> 1
```
De cuantas cartas quieres barajar
```
> 5
```
Se han barajeado 5 cartas
-------------------------
Que quieres hacer?
1. Barajar las cartas
2. Dar la vuelta a la ultima carta
3. Salir
```
> 2
```
-------------------------
#########################
Numero: 7
Palo: Copa
#########################
Te quedan 4 cartas en la baraja
-------------------------
Que quieres hacer?
1. Barajar las cartas
2. Dar la vuelta a la ultima carta
3. Salir
```
