package arraypassing;

public class PassArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        
        System.out.print("The values of the original array are: ");
        for(int value: array){
            System.out.print(value+" ");
        }
        
        modifyArray(array); // pass array reference
        System.out.print("\n\nThe values of the modified array are:");
        for(int value: array){
            System.out.printf(" %d", value);
        }
        System.out.printf("\nEffects of passing array element value:\narray[3] before modifyElement: %d\n", array[3]);
        
        modifyElement(array[3]);
        System.out.printf("array[3] after modifyElement: %d\n", array[3]);
    }
    
    public static void modifyArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            arr[i] *= 2;
        }
    }
    
    public static void modifyElement(int element){
        element *= 2;
        System.out.printf("Value of element in modifyElement: %d\n", element);
    }
}
