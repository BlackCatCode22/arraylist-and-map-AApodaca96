import java.util.ArrayList;

public class ArrayList_and_Map {
    public static void main(String[] args) {

        System.out.printf("\nArray List Practice!\n");


        ArrayList<String> myArrayList = new ArrayList<>();
        // Add Five Friends
        myArrayList.add("John");
        myArrayList.add("Chris");
        myArrayList.add("Eric");
        myArrayList.add("Luke");
        myArrayList.add("Mitch");

        System.out.println("\n my first friend is: " + myArrayList.get(0));
        System.out.println("\n the size (number of elements): " + myArrayList.size());

        // Set change the data in an element
        myArrayList.set(0, "Angelo");
        System.out.println("\n my first friend is now: " + myArrayList.get(0));

        // Remove the third element
        System.out.println(myArrayList);

        myArrayList.remove(2);
        System.out.println(myArrayList);

        int myFriendNumber = 1;

        // Output list with a for loop
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(" friend " + myFriendNumber + " is " + myArrayList.get(i));
            myFriendNumber++;
        }

        // Add list elements with a for loop
        for (int i = 0; i < 10; i++ ) {
            // use .add
            myArrayList.add(i + 4, "new friend");
            System.out.println(myArrayList);
        }
        


    }
}