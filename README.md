# Barajas Java
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
> Objeto Carta
```java
public class Carta {

	//Variables
	int numero;
	String palo;
	estetica ds = new estetica();

	public Carta(int n, String p){
		numero = n;
		palo = p;
	}
	
	public void mostrar(){
		ds.limpiarlnSM("#",25);
		System.out.println("Numero: " + numero);
		System.out.println("Palo: " + palo);
		ds.limpiarlnSM("#",25);
	}
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

# Licencia
Copyright 2017 Barajas Java

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
