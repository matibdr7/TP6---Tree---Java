/*
 Considerando la clase BinaryTree<T> comentada en teoría, construir un árbol binario correspondiente a la
siguiente figura.

[Figura en docs/TP6-ED2024-2C.pdf (Punto1)]

A partir del árbol obtenido:
a. Calcular la cantidad de nodos del árbol.
b. Calcular la cantidad de hojas del árbol.
c. Calcular la cantidad de nodos internos del árbol.
d. Determinar el máximo nivel del árbol.
e. Determinar la altura del árbol.
f. Recorrer el árbol en orden descendente.
g. Imprimir en pantalla la representación parentizada del árbol.
 */
package Punto1;

public class App {
    public static void main(String[] args){
        BinaryTree<Integer> nodo939 = new BinaryTree<>(939,new BinaryTree<Integer>(925),null);
        BinaryTree<Integer> nodo893 = new BinaryTree<>(893,null,nodo939);
        BinaryTree<Integer> nodo744 = new BinaryTree<>(744, new BinaryTree<Integer>(565), null);
        BinaryTree<Integer> nodo473 = new BinaryTree<>(473, null, nodo744);
        BinaryTree<Integer> nodo812 = new BinaryTree<>(812, nodo473, nodo893);
        BinaryTree<Integer> nodo10 = new BinaryTree<>(10, null, new BinaryTree<Integer>(186));
        BinaryTree<Integer> nodo459 = new BinaryTree<>(459, nodo10, nodo812); //Nodo raiz

        cantidadNodos(nodo459);
        cantidadHojas(nodo459);
        cantidadNodosInternos(nodo459);
        maximoNivel(nodo459);
        alturaArbol(nodo459);
        recorrerOrdenDescendente(nodo459);
        representaciónParentizada(nodo459);

    }   

    public static void cantidadNodos(BinaryTree<Integer> arbol){
        System.out.println("Cantidad de nodos del arbol: "+arbol.NodeCount());
    }

    public static void cantidadHojas(BinaryTree<Integer> arbol){
        System.out.println("Cantidad de hojas del arbol; "+arbol.LeafCount());
    }

    public static void cantidadNodosInternos(BinaryTree<Integer> arbol){
        System.out.println("Cantidad de nodos internos del arbol: "+arbol.InternalCount());
    }

    public static void maximoNivel(BinaryTree<Integer> arbol){
        System.out.println("El maximo nivel del arbol es: "+arbol.MaxLevel());
    }

    public static void alturaArbol(BinaryTree<Integer> arbol){
        System.out.println("La altura del arbol es: "+arbol.Height());
    }
    
    public static void recorrerOrdenDescendente(BinaryTree<Integer> arbol){
        arbol.DescendingOrder();
        System.out.println("\n");
    }

    public static void representaciónParentizada(BinaryTree<Integer> arbol){
        System.out.println(arbol.toString());
    }

}
