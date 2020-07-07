// package main.java.com.revature.eval.java.core;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random; 

public class Test{
   
        public int getScrabbleScore(String string) {
            // TODO Write an implementation for this method declaration
    //		ArrayList<HashSet<String>> list= new ArrayList<HashSet<String>>();
            List<List<String>> list= new ArrayList<>();
        
            String[] arr1= {"A", "E", "I", "O", "U", "L", "N", "R", "S", "T" };
            List<String> set1=new ArrayList<>();for(String s:arr1)set1.add(s); 
            set1.add("1");
            list.add(set1);
            
            String[] arr2= {"D","G" };
            List<String> set2=new ArrayList<>();for(String s:arr2)set2.add(s); 
            set2.add("2");
            list.add(set2);
            
            String[] arr3= {"B", "C", "M", "P" };
            List<String> set3=new ArrayList<>();for(String s:arr3)set3.add(s); 
            set3.add("3");
            list.add(set3);
            
            String[] arr4= {"F", "H", "V", "W", "Y" };
            List<String> set4=new ArrayList<>();for(String s:arr4)set4.add(s); 
            set4.add("4");
            list.add(set4);
            
            String[] arr5= {"K" };
            List<String> set5=new ArrayList<>();for(String s:arr5)set5.add(s); 
            set5.add("5");
            list.add(set5);
            
            String[] arr6= {"J", "X"};
            List<String> set6=new ArrayList<>();for(String s:arr6)set6.add(s); 
            set6.add("8");
            list.add(set6);
            
            String[] arr7= {"Q","Z"};
            List<String> set7=new ArrayList<>();for(String s:arr7)set7.add(s); 
            set7.add("10");
            list.add(set7);
        
            int sum=0;
            for(int i=0;i<string.length();i++) {
                for (int j=0;j<list.size();j++) {

                    if(list.get(j).stream().anyMatch(String.valueOf(string.charAt(i))::equalsIgnoreCase))
                    {
                        sum+= Integer.valueOf(list.get(j).get(list.get(j).size()-1));
                        break;
                    }
                }
            }
            
            return sum;
        }
    
 

    public static void main(String[] args){

     Test test=new Test();
     System.out.println(test.getScrabbleScore("OxyphenButazone"));

}
}