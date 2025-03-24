public class Guest {

    private String name;
    private int age;

    //create a constructor to easily create new guest objects

    public Guest(String gName, int gAge){
        //now i need to get this instance of the objects instance variables

        name = gName;
        age = gAge;


    }//ends our Guest constructor
    //setup setters and getters
    //setter for name
    public void setName(String gName){
        name = gName;
    }//ends setname method
    public String getName(){
        return name;
    }//ends getter



    public void setAge(int gAge){
        age = gAge;
    }//ends set age
    public int getAge(){
        return age;
    }//ends get age
    //I am going to create another method to print out the guest details
    //java has a built in toString Method for objects and i am going to override

    @Override
    public String toString(){
        return "Name: " + name + "Age: " + age;
    }

}//ends guest.java class
