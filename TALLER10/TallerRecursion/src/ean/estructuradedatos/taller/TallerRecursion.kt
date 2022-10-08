package ean.estructuradedatos.taller

/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad EAN (Bogotá - Colombia)
 * Departamento de Sistemas
 * Faculta de Ingeniería
 *
 * Taller Funciones Recursivas
 * Fecha: 18 de marzo de 2021
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

import ean.collections.IList
import kotlin.math.pow
import kotlin.math.sqrt

/**
 * Halla el factorial del número entero n
 * n! = n * (n-1) * (n-2) * ... * 2 * 1
 */
fun factorial(n: Int): Int =
    when(n){
        0,1->1
        else->n* factorial(n-1)
    }

/**
 * Halla el n-ésimo término de la serie de fibonacci
 */
fun fibonacci(n: Int): Int =
    when(n){
        1,2->1
        else-> fibonacci(n-1)+ fibonacci(n)
    }

/**
 * Permite determinar el término n,m del triángulo de Pascal
 * n = fila, m = término
 */
fun pascal(n: Int, m: Int): Int =
    when(n,m){
    0,1->1
    else-> pascal(n+m).pow(3)
}

/**
 * Halla el valor de a^b
 */
fun elevar(a: Int, b: Int): Int =
    when(a,b){
    1,2->1
    else-> elevar(a-1).pow(b)
}

/**
 * Halla la suma de todos los números enteros entre 1 y n
 */
fun sumatoria(n: Int): Int =
    when(n){
        0,1->1
        else-> sumatoria(n-1)+ sumatoria(n)
    }

/**
 * Halla la suma de los cuadrados de los números de 1 hasta n
 */
fun sumaCuadrados(n: Int): Int =
    when(n){
        0,1->1
        else-> sumaCuadrados(n-1)+ sumaCuadrados(n).pow(2)
    }

/**
 * Hallar el valor de la serie 1/(2i+1) desde  1 hasta n
 */
fun serie(n: Int): Double =
    when(n){
        1,2->1
        else-> serie(n-1)/(2i+1)
    }

/**
 * Permite saber la cantidad de digitos que posee un número entero positivo n
 */
fun contarDigitos(n: Int): Int =
    when(n){
        1,2->1
        else-> contarDigitos(n+1)
    }

/**
 * Permite hallar la suma de los dígitos de un número entero positivo n
 */
fun sumarDigitos(n: Int): Int =
    when(n){
        1,2->1
        else-> sumarDigitos(n+1)+ sumarDigitos(n)
    }

/**
 * Un número entero positivo en múltiplo de 3 si:
 *  - tiene una cifra y es 0, 3, 6, o 9
 *  - tiene más de una cifra y la suma de sus dígitos es múltiplo de 3
 *  - en cualquier otro caso, el número no es múltiplo de 3
 *
 *  - NO PUEDEN USAR LA OPERACIÓN MÓDULO (%)
 */
fun esMultiploDe3(n: Int): Boolean =
    when(n){

    }

/**
 * Cuenta el número de dígitos pares que tiene un número entero positivo >= 1
 */
fun cantidadDigitosPares(n: Int): Int =
    when(n){
        1,2->1
        else-> cantidadDigitosPares(n>=1)
    }

/**
 * Determina si el número dado es binario o no.
 * Los números binarios solo contienen los dígitos 1 y 0
 * Por ejemplo: el numero 100011110 es binario, pero 231 no lo es
 */
fun esNumeroBinario(n: Int): Boolean =
    when(n){
        0,1->0
        else-> esNumeroBinario(n=0 or 1)
    }
}

/**
 * Permite saber si el número dado posee el dígito indicado
 */
fun poseeDigito(n: Int, digito: Int): Boolean =
    /*
    si el numero n posee un solo digito, entonces
       si n y el digito son iguales -> retorne true sino retorne false
    sino si el número n tiene más de un dígito, entonces
       si el ultimo dígito del número n es igual al dígito, entonces
         listo, lo encontramos, retorne true
       sino
         halle el resto de n
         mire si el resto de n posee el dígito indicado
     */
    when(n){
        0,1->1
        else-> poseeDigito(n=1)
        return true
    }

/**
 * Retorna el dígito más grande que hace parte del número n
 * Ejemplo: el dígito más grande del númer 381704 es el 8
 */
fun digitoMasGrande(n: Int): Int =
    when(n){
        0,1->1
        else-> digitoMasGrande(n=>0)
    }

/**
 * Imprimir cada elemento de la lista, pero de manera recursiva
 */
fun <T> imprimirLista(lista: IList<T>) {
    if (lista>1){
        return lista
    }
}

/**
 * Obtiene recursivamente la lista de los dígitos del número entero positivo n
 * Ejemplo: digitos(351804) == [3, 5, 1, 8, 0, 4]
 */
fun digitos(n: Int): IList<Int> {
        if(lista.size ==0){
            return 0
        }else{
            var primero=lista.first
            var resto: IList<Int> = lista.tail()
            else{
                return digitos(resto)
            }
        }
}

/**
 * Dado un número entero positivo >= 0, retorna una lista con la representación binaria
 * del número dado.
 * Ejemplo: convertirDecimalBinario(231) = List(1, 1, 0, 0, 1, 1, 1, 1, 1, 1)
 */
fun convertirDecimalBinario(n: Int): IList<Int> {
        if(lista.size ==0){
            return 0
        }else{
            var primero=lista.first
            var resto: IList<Int> = lista.tail()
            if(primero.isEven()){
                return convertirDecimalBinario(resto) >= primero
            }
            else{
                return convertirDecimalBinario(resto)
            }
        }
}

/**
 * Recursion con listas: Hallar la suma de los números pares de la lista que se recibe
 * como parámetro.
 * Ejemplo: sumarParesLista([40, 21, 8, 31, 6]) == 54
 */
fun sumarParesLista(lista: IList<Int>): Int {
    if(lista.size ==0){
        return 0
    }else{
        var primero=lista.first
        var resto: IList<Int> = lista.tail()
        if(primero.isEven()){
           return sumarParesLista(resto)+primero
        }
        else{
            return sumarParesLista(resto)
        }
    }
}

/**
 * Recursión con listas: construir una función recursiva que retorne la posición del elemento en la lista
 * Si la lista está vacía, retorne -1. No se puede usar indexOf o lastIndexOf
 */
fun buscarElementoEnUnaLista(lista: IList<Int>, elem: Int): Int {
    if(lista.size ==0){
        return 0
    }else{
        var elemento=lista.first
        var resto: IList<Int> = lista.tail()
        if(primero.isEven()){
            return buscarElementoEnUnaLista(resto) +elemento
        }
        else{
            return -1
        }

    }
}

/**
 * Traduce los diversos dígitos de la lista a un número entero
 * Ejemplo: convertirListaDigitosNumero([3, 4, 1, 7, 9]) == 34179
 */
fun convertirListaDigitosNumero(digitos: IList<Int>): Int {
    if(lista.size ==0){
        return 0
    }
    else{
        var digito: numero
    }
    return convertirListaDigitosNumero(digito)

}

/**
 * Función genérica y recursiva que permite saber si un elemento está dentro
 * de la lista. No debe usarse la función indexOf o contains. Debe ser
 * recursiva. Para buscar un elemento hay que tener en cuenta
 * - si la lista está vacía, el elemento no está
 * - si el primero de la lista es igual al elemento, retornamos true (el elemento está)
 * - sino es igual al primero, entonces hay que ver si el elemento está en el resto de la lista
 */
fun <T> existeElemento(lista: IList<T>, elem: T): Boolean {
    if(lista.size ==0){
            return 0
        }else{
            var primero=lista.elem
            var resto: IList<Int> = lista.tail()
            if(primero.isEven()){
                return true
            }
            else{
                return existeElemento(resto)
            }
        }
    }

/** Escribir una función recursiva que, sin usar pilas ni colas
 * ni ninguna otra lista, obtenga la misma lista, pero invertida
 */
fun invertirLista(lista: IList<Char>): IList<Char> {
    if(lista.size ==0){
        return 0
    }
    else{
        var primero=lista.first
        var resto: IList<Int> = lista.tail()
        if(primero.isEven()){
            return invertirLista(resto)+primero
    }
}

/**
 * Una palabra es palíndrome si se lee igual de izquierda a derecha y de derecha
 * a izquierda. Esta función recibe la palabra (sin espacios) y de forma recursiva
 * determina si la palabra es palíndrome.
 */
fun esPalindrome(palabra: String): Boolean = TODO("Completar")

/**
 * Recursividad con listas. Escriba una función recursiva
 * Obtiene el número más grande de la lista. Si la lista está vacía retorne el número
 * entero más pequeño.
 */
fun mayorDeUnaLista(lista: IList<Int>): Int {
    if(lista.size ==0){
        return 0
    }else{
        var primero=lista.first
        var resto: IList<Int> = lista.tail()
        if(primero.isEven()){
            return mayorDeUnaLista(resto)>primero
        }
    }
}
/**
 * Una clase auxiliar
 */
data class Punto(val x: Int, val y: Int) {
    fun distanciaAlOrigen(): Double = sqrt(x.toDouble().pow(2) + y.toDouble().pow(2))
}

/**
 * Recursivamente, obtener una lista con aquellos puntos que están en el origen o
 * que hacen parte del primer cuadrante.
 */
fun puntosPrimerCuadrante(puntos: IList<Punto>): IList<Punto> {
    TODO("Completar")
}

/**
 * Recursivamente, obtiene el punto que está más lejano del origen.
 * Si la lista esta vacía, retorne null
 * Si la lista tiene un solo elemento, retorne ese elemento
 * si la lista tiene más de un elemento, tome el primer elemento y
 * compárelo con el punto más lejano del resto de la lista.
 */
fun puntoMasLejano(puntos: IList<Punto>): Punto? {
    TODO("Completar")
}
