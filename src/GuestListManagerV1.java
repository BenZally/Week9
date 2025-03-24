import java.util.ArrayList;

public class GuestListManagerV1 {
    public static void main(String[] args) {

        /*
        Create an array list to manage guests
        I would like to be a ble to dynamically add and remove guests
        I would like to loop through the ArrayList and print out the details

         */
        //TODO Create an arrayList of strings called guestList
        //TODO add sme names to the guest list such as Alice,Bob,Charlie,Jose

        ArrayList<String> guestList = new ArrayList<>();

        guestList.add("Alice");
        guestList.add("Bob");
        guestList.add("Charlie");
        guestList.add("Jose");
        guestList.add("Bob");

        System.out.println("Current Guest list:");
        for(String guest : guestList){
            System.out.println(guest);
        }//ends for loop


        //we need to remove bob from the guest list

        System.out.println("Removing bob from the guest list...");
        guestList.remove("Bob");

        System.out.println("Current Guest list:");
        for(String guest : guestList){
            System.out.println(guest);
        }//ends for loop







    }//ends main driver
}//ends .java class
