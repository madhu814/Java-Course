package Strings;


import java.util.Scanner;

public class NoDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of string for which you want to remove duplicates: ");
        String S1 = scan.next();
        String S2 ="";
        for(int i=0;i<S1.length();i++)
        {
            boolean isDuplicate = false;
            for(int j=i+1;j<S1.length();j++)
            {
                if(S1.charAt(i)==S1.charAt(j))
                {
                    System.out.println("Duplicate character found: " + S1.charAt(i));
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate)
            {
                S2+=S1.charAt(i);
            }
        }
        System.out.println("String without duplicates: " + S2);
    }
}


