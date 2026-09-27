import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       float principal_amount = sc.nextFloat();
       float ROI = sc.nextFloat();
       float time = sc.nextFloat();
       float Simple_Interest = (principal_amount * ROI * time)/ 100;
       System.out.println("Simple Interest is: " + Simple_Interest);
    }
}
