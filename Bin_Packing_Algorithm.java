/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin_packing_algorithm;

/**
 *
 * @author tasmeen
 */
import java.util.Scanner;
 
public class Bin_Packing_Algorithm 
{
    public static void first_Fit(int []a, int size, int n, int b)
    {
    
        int rem[] = {size,size,size,size};
        int bincount = 0;
        int free =0;
        for(int i=0; i<n; i++)    
        {
            for(int j=0; j<b;j++){
                if(rem[j]>=a[i]){
                    rem[j]=rem[j]-a[i];
                    break;
                }
               
            }
    }
        for(int j=0;j<b;j++){
            if(rem[j]!=0){
                bincount++;
                free=free+rem[j];
            }
            
        }
        System.out.println("****First Fit****");
        System.out.println("Fragmentation: "+bincount+"\n"+"Free :"+free);
        
    }
    
    public static void sort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] > arr[index]){  
                    index = j;  
                }  
            }  
            int temp = arr[index];   
            arr[index] = arr[i];  
            arr[i] = temp;  
        }  
    }  
    
     public static void first_Fit_Desc(int []a, int size, int n, int b)
    {
    
        int rem[] = {size,size,size,size};
        int bincount = 0;
        int free =0;
        for(int i=0; i<n; i++)    
        {
            for(int j=0; j<b;j++){
                if(rem[j]>=a[i]){
                    rem[j]=rem[j]-a[i];
                    break;
                }
                 
            }
    }
        for(int j=0;j<b;j++){
            if(rem[j]!=0){
                bincount++;
                free=free+rem[j];
            }
            
        }
        System.out.println("****First Fit (Decreasing)****");
        System.out.println("Fragmentation: "+bincount+"\n"+"Free :"+free);
        
    }
    public static void main(String args[])
    {
        System.out.println("****Bin Packing Algorithm****");
        System.out.println("Enter the number of elements in Set: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter "+n+" elements:");
        int []a = new int[n];
        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();
        System.out.println("Enter the bin size: ");
        int size = sc.nextInt();
        System.out.println("Enter the number of bins: ");
        int b = sc.nextInt();
        first_Fit(a, size, n,b);
        System.out.println("-----------------------------------------------------");
        System.out.println();
        sort(a);
        first_Fit_Desc(a, size, n,b);
       
    }
}

