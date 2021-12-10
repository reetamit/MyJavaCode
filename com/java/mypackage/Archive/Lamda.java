import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

interface LamdaExpression {
    int add(int a, int b);
}

class Lamda {
public static  void main(String[] args) {
    LamdaExpression l1=(a,b)-> (a+b);
    System.out.println(l1.add(1, 2));

    Runnable r1=new Runnable(){
        public void run(){
            System.out.println("Thread 1 is running.");
        }
    };

    Thread t1=new Thread(r1);
    t1.start();


    //Product list

    List<Product> p1 = new ArrayList<Product>();

    p1.add(new Product(1,"iPhone",800));
    p1.add(new Product(2, "TV", 450));
    p1.add(new Product(3, "Abc", 60));

    Collections.sort(p1,(a1,a2)->{
        return a1.name.compareTo(a2.name);
    });

    for (Product product : p1) {
       System.out.println(product.name); 
    }

    Stream<Product> filter_date = p1.stream().filter(p->(p.price>60));
    filter_date.forEach(
        product-> System.out.println(product.id+product.name+product.price)
    );
}
}

class Product{
    int id;
    String name;
    float price;

    public Product(int id,String name,float price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
}