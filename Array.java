// Stroing marks of 5 subjects.....

public class Array{
    public static void main(String[] args) {
       /*int [] marks = new int[5];
        marks[0] = 90;
        marks[1] = 80;
        marks[2] = 72;
        marks[3] = 96;
        marks[4] = 65;
        System.out.println(marks[2]);
        */
        
        // Displaying an Array...
        int i;
        int [] marks ={95,90,85,72,65};
        // Array Traversal.
        for(i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        // Print Array elements in reverse order.
        System.out.println("Print element in reverse order.....");
        for(int j = marks.length-1; j>=0; j--){
            System.out.println(marks[j]);
        }

        // Using for-each loop....
        System.out.println("Print element using for-each loop...");
        for(int element:marks){
            System.out.println(element);
        }
    }
}