import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list
        scottishIslands.add("Coll");
//        2. Add "Tiree" to the start of the list
        scottishIslands.add(0,"Tiree");
        System.out.println(scottishIslands);
//        3. Add "Islay" after "Jura" and before "Mull"
        scottishIslands.add(2,"Islay");
//        4. Print out the index position of "Skye"
        System.out.println(scottishIslands.indexOf("Skye"));
//        5. Remove "Tresco" from the list by name
        System.out.println("-------REMOVAL OF TRESCO------:");
        scottishIslands.remove("Tresco" );
        System.out.println(scottishIslands);
//        6. Remove "Arran" from the list by index
        System.out.println("-------REMOVAL OF ARRAN-------");
        scottishIslands.remove(5 );
//        7. Print the number of islands in your arraylist
        System.out.println("-------Number of Islands in the arraylist-------:");
        int lengthOfArrayList = scottishIslands.size();
        System.out.println(lengthOfArrayList);


//        8. Sort the list alphabetically
        System.out.println("Alphabetical order");
            Collections.sort(scottishIslands);
        System.out.println(scottishIslands);


//        9. Print out all the islands using a for loop
        System.out.println("FOR LOOP");
            for (String scottishPlaces: scottishIslands) {
                System.out.println(scottishPlaces);
            }



        System.out.println(scottishIslands);

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers

        System.out.println("EVEN NUMBERS");
        for (Integer number : numbers){
            if (number%2==0){
                System.out.println(number);

            }
        }

//        2. Print the difference between the largest and smallest value
//        3. Print True if the list contains a 1 next to a 1 somewhere.
//        4. Print the sum of the numbers,
//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [2, 7, 13, 2] would have sum of 9.

    }

}
