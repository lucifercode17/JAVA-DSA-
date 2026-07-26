package String;


// Sting is a  class of java 
// evey varivale we create is a object of String 
// declartion of String is done by many methods 


public class basicString {
  public static void main(String[] args) {

    // the valuse is store in seprate a heap memoery which is called a string pool 
    // fact : if we create to multiple  refrance  variable  point to same  value which is stored in the string pool 
    // imp :  unlike array if we change value with the one refernce varible  then there will not change vvisible in other  refernce var because  String is a immutable data type it doesnot change  
    // string is immutable is fore security resaon 
    // we can reassign the value the same referce varible because it create a different  and the object which have no refrence var then it is collect by the garbage collector 


    // ______________________________________________________________
    // comparisions 

    // == equalty 
    // it  give false when the two referanve var point to to different obj 
    // it will give true  when the two ref var is pointing to the same object in string pool 

    //---------------------------------------------------------------------------------------
    // we have a method to create a different obj in string pool by igoring the java optimaztion 

    // by new keyword  
    String name1 = new String("dheeraj");
    


    String name = new String();
    name = "dheeraj";
    System.out.println( name);
    System.out.println(name == name1);

    // to check only valuse we can use equals ()
    System.out.println(name.equals(name1));


    
    
  }
}
