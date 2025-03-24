import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lets learn about array lists");

        //I need to store student quiz scores,
        // IDK how many students scores i need to store
        //I Need to dynamically resize -- meaning add to the list

        //create an ArrayList to store the scores
        ArrayList<Integer> scores = new ArrayList<>();


        //add student1 quiz score to the array list
        scores.add(84);
        scores.add(67);
        scores.add(100);
        scores.add(90);

        scores.remove(1);

        //demo using an advanced for loop for the highest quiz score


        //setup a variable to hold our highest score

        int maxScore = 0;

        for (int score: scores){
            if (score > maxScore){
                maxScore = score;

            }//ends our score>max score

        }//ends for loop

        System.out.println("Here is our highest quiz score: " + maxScore);








    }//ends main method/driver


}//ends main.java class
