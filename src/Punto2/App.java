/*
    Considerando la clase BinaryTree<T> comentada en teoría, construir los árboles binarios correspondientes a
    las figuras A y B presentadas más abajo. Imprimir en pantalla la representación parentizada de los árboles.
    Además, indicar las salidas correspondientes a los recorridos in order, pre order, post order y descending
    order de los árboles:

    [Figura en docs/TP6-ED2024-2C.pdf (Punto2)]
*/

package Punto2;

public class App {
    public static void main(String[] args){
        BinaryTree<Integer> nodo30 = new BinaryTree<>(30, new BinaryTree<Integer>(20), new BinaryTree<Integer>(35));
        BinaryTree<Integer> nodo45 = new BinaryTree<>(45, null, new BinaryTree<Integer>(48));
        BinaryTree<Integer> nodo40 = new BinaryTree<>(40, nodo30, nodo45);
        BinaryTree<Integer> nodo80 = new BinaryTree<>(80, new BinaryTree<Integer>(70), new BinaryTree<Integer>(90));
        BinaryTree<Integer> arbolA = new BinaryTree<>(50, nodo40, nodo80);

        BinaryTree<Integer> nodo206 = new BinaryTree<>(206, new BinaryTree<>(198), null);
        BinaryTree<Integer> nodo86 = new BinaryTree<>(86, new BinaryTree<>(72), nodo206);
        BinaryTree<Integer> nodo357 = new BinaryTree<>(357, null, new BinaryTree<>(490));
        BinaryTree<Integer> nodo513 = new BinaryTree<>(513, nodo357, null);
        BinaryTree<Integer> nodo546 = new BinaryTree<>(546, nodo513, new BinaryTree<>(864));
        BinaryTree<Integer> arbolB = new BinaryTree<>(310, nodo86, nodo546);

        parentizada(arbolA, arbolB);
        enOrden(arbolA, arbolB);
        preOrden(arbolA, arbolB);
        postOrder(arbolA, arbolB);
        descendingOrder(arbolA, arbolB);

    }

    public static void parentizada(BinaryTree<Integer>arbolA, BinaryTree<Integer>arbolB){
        System.out.println("\nRepresentacion parentizada: ");
        System.out.println("Arbol A: "+arbolA+"\nArbol B: "+arbolB.toString());
        arbolA.toString();
        arbolB.toString();
    }

    public static void enOrden(BinaryTree<Integer> arbolA, BinaryTree<Integer> arbolB){
        System.out.println("\nRecorrido en Orden: ");
        System.out.print("Arbol A: ");
        arbolA.InOrder();
        System.out.print("\nArbol B: ");
        arbolB.InOrder();
        System.out.println("\n");
    }

    public static void preOrden(BinaryTree<Integer> arbolA, BinaryTree<Integer> arbolB){
        System.out.println("\nRecorrido en pre orden: ");
        System.out.print("Arbol A: ");
        arbolA.PreOrder();
        System.out.print("\nArbol B: ");
        arbolB.PreOrder();
        System.out.println("\n");
    }

    public static void postOrder(BinaryTree<Integer> arbolA, BinaryTree<Integer> arbolB){
        System.out.println("\nRecorrido en post orden: ");
        System.out.print("Arbol A: ");
        arbolA.PostOrder();
        System.out.print("\nArbol B: ");
        arbolB.PostOrder();
        System.out.println("\n");
    }

    public static void descendingOrder(BinaryTree<Integer> arbolA, BinaryTree<Integer> arbolB){
        System.out.println("\nRecorrido en orden descendiente: ");
        System.out.print("Arbol A: ");
        arbolA.DescendingOrder();
        System.out.print("\nArbol B: ");
        arbolB.DescendingOrder();
        System.out.println("\n");
    }

}
