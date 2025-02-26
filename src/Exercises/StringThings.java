package Exercises;

public class StringThings {
    public static void main(String[] args) {
        exercise1(); //Olga
        exercise2();
        exercise3();
        exercise4("Deniz"); //Silke
        exercise5();
        exercise6();
        exercise7("Deniz", "Deniz");
        exercise8(3, 3);
        exercise9();

    }
    public static void exercise1() {
        System.out.println("Roman alphabet: ");
        for(char c = 'A'; c <= 'Z'; c++){
            System.out.println(c);
        }
        System.out.println();
    }
    public static void exercise2() {
        System.out.println("greek alphabet: ");
        for(int i = 913; i <= 937; i++){
            System.out.println((char)i);
        }
        System.out.println();
    }
    public static void exercise3() {
        String text = "Computer Science is fun!";
        text = text.replace("Computer Science", "CS");
        System.out.println(text);
    }
    public static String exercise4(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            r = r + s.charAt(i);
            System.out.println(r);
        }
        return r;
    }
    public static void exercise5(){
        String fruit = "Banana";
        fruit.substring(0, 3);
        fruit.substring(2, 5);
        fruit.substring(6, 6);
        System.out.println(fruit);
    }
    public static void exercise6(){
        String fruit1 = "Banana";
        int index = fruit1.indexOf('a');
        System.out.println(index);
    }
    public static void exercise7 (String name1, String name2) {
        int diff = name1.compareTo(name2);
        if(diff == 0) {
            System.out.println("The names are the same");
        } else if (diff < 0) {
            System.out.println("name1 comes before name2");
        }else if (diff > 0 ) {
            System.out.println("name2 comes before name1");
        }
    }
    public static String exercise8(int hour, int minute) {
        String ampm;
        if(hour <12){
            ampm = "AM";
            if(hour == 0) {
                hour = 12;

            }

        } else {
            ampm = "PM";
            hour = hour - 12;
        }
        return String.format("%02d:02d %s", hour, minute, ampm);
    }
    public static void exercise9() {
        String str = "12345";
        int num = Integer.parseInt(str);
        int num1 = 12345;
        String str1 = Integer.toString(num1);
        System.out.println( num + "" + str1 );
    }

}
