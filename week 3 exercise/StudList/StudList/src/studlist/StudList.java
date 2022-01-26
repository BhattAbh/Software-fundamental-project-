/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package studlist;

import java.util.Scanner;

/**
 *
 * @author Abhishek Bhattarai
 */
public class StudList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student[] sList=new Student[3];//declaration of arrays of objects
        Scanner input=new Scanner(System.in);
        
        for(int i=0;i<=sList.length-1;i++)
        {
            sList[i]=new Student();//initialize the object
            System.out.println("Enter student name: ");
            sList[i].setName(input.nextLine());//store value into the array of objects
                    
        }
        
        for(int i=0;i<=sList.length-1;i++)
        {
            System.out.println("Student name: "+sList[i].getName());
        }
    }

}
