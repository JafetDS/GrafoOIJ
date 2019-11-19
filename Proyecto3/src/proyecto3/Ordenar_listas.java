/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3;

/**
 *
 * @author Jafet
*/
public class Ordenar_listas {

static Integer partition(Lista<Integer> array, Integer begin, Integer end) {
    Integer pivot = end;

    Integer counter = begin;
    for (Integer i = begin; i < end; i++) {
        if (array.getInfo(i)< array.getInfo(pivot)) {
            array.swap(counter, i);
            counter++;
        } 
    }
    array.swap(counter, pivot);
    return counter;
}

public static void quickSort_aux(Lista<Integer> array, Integer begin, Integer end) {
    if (end <= begin){ return;}
    Integer pivot = partition(array, begin, end);
    quickSort_aux(array, begin, pivot-1);
    quickSort_aux(array, pivot+1, end);
}

public static void quickSort(Lista<Integer> array){
    quickSort_aux(array,0,array.len()-1);
}
    
}
