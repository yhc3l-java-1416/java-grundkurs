/*
    Adapted from http://www.ntu.edu.sg/home/ehchua/programming/java/J2a_BasicsExercises.html
    
    Change the code below so that if the mark is greater
    than or equal to 50 "pass" is printed in terminal otherwise print "fail"

    Change th value of variable mark to test the differnet scenarios
 */
class Exercise1 { // saved as "CheckPassFail.java"
    public static void main(String[] args) {
          int mark = 49;         // set the value of mark here!
          System.out.println("The mark is " + mark);
          if (mark >= 50) {
             System.out.println("pass");
         } else {
             System.out.println("fail");
         }
    }
}