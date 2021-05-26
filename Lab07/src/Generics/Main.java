package Generics;
public class Main {

	 public static < E > void printArray( E[] inputArray ) {
		 for(E element : inputArray) {
			 System.out.printf("%s ", element);
			 }System.out.println();
	 for(int i=inputArray.length-1;i>=0;--i) {
	 System.out.print(" "+inputArray[i]);
	 }
	 System.out.println(" ");
}

public static void main(String args[]) {
Integer[] intArray = { 1, 2, 3, 4, 5 };
Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
Float[] floatArray = { 22.1F ,33.2F,44.3F,55.4F,66.5F };

System.out.println("Array integerArray contains:");
printArray(intArray); // pass an Integer array

System.out.println("\nArray doubleArray contains:");
printArray(doubleArray); // pass a Double array

System.out.println("\nArray characterArray contains:");
printArray(charArray); // pass a Character array

System.out.println("\n\nArray floatArray contains:");
printArray(floatArray);
}
}


