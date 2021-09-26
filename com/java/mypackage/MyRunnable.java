package com.java.mypackage;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.java.mypackage.MyInheritance.Earth;
import com.java.mypackage.MyInheritance.Mars;
import com.java.mypackage.MyInheritance.SolarSystem;
import com.java.mypackage.MyInheritance.Moon;

class MyRunnableProject {
    public static void main(String[] args) throws IOException {

       /* var obj = new NewClass(12);
        String[] random_array = {"1234","ABCD","Hati","Bang","ChatarMata"};
        for (String r_array : random_array) {
            System.out.println(r_array);
        }
        for(int i=0;i<random_array.length;i++)
        {
                System.out.println(random_array[i]);
        }*/

    //Java style printing
    //System.out.println(obj.getId());
    //C++ style printing
    /*  System.out.printf("Obj ID is : %d",obj.getId()).println();
        FileReader file = new FileReader("E:\\WorkSpace\\Dummy_letter.txt");
        BufferedReader fileInput = new BufferedReader(file);
          
        // Print first 3 lines of file "C:\test\a.txt"
        for (int counter = 0; counter < 3; counter++) 
            System.out.println(fileInput.readLine());
          
        fileInput.close();*/

       //String s1 = "Test B";
      // String s2 = "Test A";

      // int out = s1.compareTo(s2);
       //System.out.println(s2.hashCode());

      /* int arr[][] = { {2,7,9},{3,6,1},{7,4,2} };
  
       // printing 2D array
       for (int i=0; i< 3 ; i++)
       {
           for (int j=0; j < 3 ; j++)
               System.out.print(arr[i][j] + " ");
 
           System.out.println();
       }*/

       /*MySingleton a = MySingleton.getInstance();
       MySingleton b = MySingleton.getInstance();
       a.x = a.x + 10;
       System.out.println("Value of a.x = " + a.x);
       System.out.println("Value of b.x = " + b.x);*/

       //SolarSystem s = new SolarSystem();
        //Earth e = new Earth();
        //Mars m = new Mars();
       // Moon mn = new Moon();

      //var fc = new MyFinalClass();
       //System.out.println(fc.getId());
       
       /*ArrayList<String> random_array = new ArrayList<String>();
       random_array.add("1234");
       random_array.add("ABCD");
       random_array.add("Hati");
       
       random_array.forEach(n -> { if(n.matches("-?\\d+(\\.\\d+)?")) System.out.println(n);});
       random_array.forEach(n -> { if(n.chars().allMatch(Character :: isDigit)) System.out.println(n);});*/

       /*int num  = -10;
       Predicate<Integer> preI = i -> i > 0;
       boolean result = preI.test(num);
       System.out.println(result);

       Function<String, Integer> length = str->str.length();
       System.out.println("Len:"+length.apply("Reetam"));*/

       /*List<Employee> emp = new ArrayList<>();
       emp.add(new Employee("aaa",25));
       emp.add(new Employee("bbb",30));
       emp.add(new Employee("ccc",40));
       emp.add(new Employee("ddd",45));
       emp.add(new Employee("eee",50));
       emp.add(new Employee("fff",55));
       emp.add(new Employee("ggg",60));

       emp.stream()
       .filter(e-> e.getAge()>40)
       //.map(Employee::getName)
       .forEach(e->System.out.println(e.getName()));*/
       

       /*List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);
       System.out.println("The sorted stream is : ");
       int i = list.stream()
       //.sorted()
       //.skip(2)
       //.limit(1)
       .reduce(0,Integer::sum);
      // .forEach(System.out::println);

      System.out.println(i);*/

      /*Map<Integer, String> myHashMap= new HashMap<Integer,String>();
       myHashMap.put(1, "Java");
       myHashMap.put(2, "Cobol");
       myHashMap.put(1, "Core C");
       myHashMap.put(3, "Java");

       System.out.println(myHashMap);
       for(Map.Entry mapElement : myHashMap.entrySet()) {
           int key = (int)mapElement.getKey();
            String value = (String) mapElement.getValue();
            System.out.println("Key is:"+key+"Value is:"+value);*/

            /*List<String> list = Arrays.asList("abc","","ghi","","def");

            list.stream()
            .filter(p->p!="")
            .sorted()
            .forEach(System.out::println);*/
            
       
    }
}