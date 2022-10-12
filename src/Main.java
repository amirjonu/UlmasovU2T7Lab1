import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str= s.nextLine();
        System.out.println("The length of your string is: "+ str.length());
        System.out.println("The first half of the word is: "+ str.substring(0, (str.length()/2))+ ". The other half is: "+ str.substring((str.length()/2)));
        System.out.println("Enter a Second String: ");
        String str2= s.nextLine();
        if (str.length()> str2.length()){
            System.out.println(str+ " is longer than "+ str2);
        } else if (str.length()< str2.length()) {
            System.out.println(str2+ " is longer than "+ str);
        }
        else{
            System.out.println("They are equal in Length");
        }
        if (str.equals(str2)){
            System.out.println("Your strings are equal");
        }
        else {
            if (str.compareTo(str2)>0){
                System.out.println("They are not equal but "+ str2+ " comes first alphabetically");
            }
            else{
                System.out.println("They are not equal but "+ str+ " comes first alphabetically");
            }

        }
        if (str.indexOf(str2)>-1){
            System.out.println(str2+" can be found at in "+ str+ " at index: "+str.indexOf(str2));
        }
        else{
            System.out.println(str2+ " is Not Found in "+ str);
        }
    }
}
