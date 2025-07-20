import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class student {
    HashMap<Integer, String> registration = new HashMap<Integer, String>();
    HashMap<Integer, String> registration2 = new HashMap<Integer, String>();
    HashMap<Integer, Integer> registration3 = new HashMap<Integer, Integer>();
    static int rollnumber = 0;
    static int[][] A = new int[10][30];
    static int[][] B = new int[10][30];
    static int[][] C = new int[10][30];
    static int sec_seatA = 0;
    static int sec_seatB = 0;
    static int sec_seatC = 0;
    public void setRegistration(String name) {
        rollnumber = rollnumber + 1;
        registration.put(rollnumber, name);
    }

    public void setCLASS(int class_reg) {
registration3.put(rollnumber , class_reg);
        //alloting section
        if (sec_seatA <= 29) {
            int allocated_seat = A[class_reg][sec_seatA];
            String sec = "A";

            registration2.put(rollnumber, sec);
            sec_seatA = sec_seatA + 1;

        } else if (sec_seatB <= 29) {
            String sec = "B";
            int allocated_seat = B[class_reg][sec_seatB];
            registration2.put(rollnumber, sec);
            sec_seatB = sec_seatB + 1;
        } else if (sec_seatC <= 29) {
            String sec = "C";
            int allocated_seat = C[class_reg][sec_seatB];
            registration2.put(rollnumber, sec);
            sec_seatB = sec_seatB + 1;
        } else {
            System.out.println("sorry admission closedd!!!");
        }
    }

    public void showall(){
        System.out.println(registration);
        System.out.println(registration2);

        Integer[] keys = registration.keySet().toArray(new Integer[0]); // convert keySet to array
        for (int i = 0; i < keys.length; i++) {
            int roll = keys[i];
            System.out.println("Roll No: " + roll +
                    ", Name: " + registration.get(roll) +
                    ", Section: " + registration2.get(roll) +
                     ", class: " + registration3.get(roll));
        }

    }
//        Integer[] keys = registration.keySet().toArray(new Integer[0]); // convert keySet to array
//        for (int i = 0; i < keys.length; i++) {
//            int roll = keys[i];
//            System.out.println("Roll No: " + roll +
//                    ", Name: " + registration.get(roll) +
//                    ", Section: " + registration2.get(roll));
//        }
//    }
}
class student_DATA{
    Scanner sc = new Scanner(System.in);
        student student;
student_DATA(student student){
    this.student = student;
}
        public void admission(){
            System.out.println("xdvsd[kc");
            System.out.println("DFdverfveryfverifg");
            System.out.println("dfvdfvbehiailerair");
            System.out.println("enter student name");
            String name = sc.nextLine();
            student.setRegistration(name);
            System.out.println("enter the class");
            int class_reg = sc.nextInt();
            student.setCLASS(class_reg);
        }

    }



public class Main {
    public static void main(String[] args)
    {

        student ss1 = new student();
student_DATA s1 = new student_DATA(ss1);
        student_DATA s2 = new student_DATA(ss1);
   //     student_DATA s3 = new student_DATA(ss1);
s1.admission();
s2.admission();

ss1.showall();

    }
}