package datalab4;

/**
 * Data Structures 2/7/19
 * Lab 4
 * 
 * @author Nate Heppard 900-93-8628
 */

import java.util.*;

public class Main{
    
    public static void main(String[] args){
        String testStr=" this    SENTENCE   sHOULD  be reTuRned in  LOWER"
                + "   CaMeL   Case ";
        System.out.println("input: "+testStr);
        System.out.println("output: "+toCamelCase(testStr));
        
        Random rn=new Random();
        int howManyCaves=rn.nextInt(9)+1;
        int howManyFlashLights=rn.nextInt(3)+1;
        int[] caves=new int[howManyCaves];
        int[] flashLights=new int[howManyFlashLights];
        
        for(int i=0;i<caves.length;i++)
            caves[i]=rn.nextInt(8)+1;
        for(int i=0;i<flashLights.length;i++)
            flashLights[i]=rn.nextInt(999999)+1;
        
        System.out.println("\n\nCaves: "+Arrays.toString(caves));
        System.out.println("FlashLights: "+Arrays.toString(flashLights));
        
        System.out.println("\nI have "+howManyCaves+" caves to search and "
                +howManyFlashLights+" flashlight(s) to do it with.");
        System.out.println("I've found "+treasureHunt(caves,flashLights)+
                " treasure chests!");
    }  
    
    public static String toCamelCase(String toCamel){
        toCamel=toCamel.trim().toLowerCase().replaceAll(" +"," ");
        int space=toCamel.indexOf(' ');
        if(space==-1)
            return toCamel;
        else{
            String output=toCamel.substring(0,1).toUpperCase()+toCamel.substring(1,space);
            return output+toCamelCase(toCamel.substring(space));
        } 
    }
    
    public static int treasureHunt(int[] caves,int[] flashLights){
        int sum[]=new int[flashLights.length];
        int found=0;
        
        for(int i=0;i<flashLights.length;i++){
            int temp=flashLights[i];
            sum[i]=0;
            while(temp>0){
                sum[i]+=temp%10;
                temp=temp/10;
            }
        }
        
        for(int i=0;i<caves.length;i++){
            for(int j=0;j<sum.length;j++){
                if(searchCave(caves[i],sum[i])){
                    found++;
                    caves[i]=-1;
                }
            }
        }
        return found;
    }
    
    public static boolean searchCave(int cave,int flashLight){
        return (cave==flashLight);
    }
}
