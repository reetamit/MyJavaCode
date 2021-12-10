class MutipleRunnableDemo implements Runnable
{

    public void run(){
        try{
            System.out.println("The current Thread ID is :"+Thread.currentThread().getId()+"is running.");
        } catch(Exception e){
            System.out.println("Exception is caught:"+e.getMessage());
        }
    }
}

public class MutiRunnable {

    public static void main(String[] args) {
        for(int i=0;i<10;i++)
        {
            Thread object = new Thread(new MutipleRunnableDemo());
            object.start();
        }       
    }
    
}
