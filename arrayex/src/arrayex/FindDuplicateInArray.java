package arrayex;

import java.util.Scanner;

public class FindDuplicateInArray {
	{
}


public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    //System.out.println("Please enter the length of Array: ");
    int[] array = new int[6];
    for(int i =0; i<array.length;i++) {
        System.out.println("Enter value for index "+i+":");
        array[i] = sc.nextInt();
        }

    FindDuplicateInArray obj = new FindDuplicateInArray();

    obj.findDupicateInArray(array);
}

public void findDupicateInArray(int[] a) {
    //int pointer = a[0];
    int count=0;
    for(int j=0;j<a.length;j++) {
        for(int k =j+1;k<a.length;k++) {
            if(a[j]==a[k] && j!=k && j<k && count<=1) {
                count++;
                if(count==1)
                System.out.println("\n the duplicate value is"+a[j]);

            }

        }


    }

}
}