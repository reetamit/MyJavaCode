class MutithreadDemo extends Thread {

    public void run(){
        try{
            System.out.println("The current Thread ID is :"+Thread.currentThread().getId()+"is running.");

        } catch(Exception e){
            System.out.println("Exception is caught:"+e.getMessage());
        }
    }
}


class Mutithread{
public static void main(String[] args) {

    for(int i=0;i<10;i++)
    {
        MutithreadDemo newThread = new MutithreadDemo();
        newThread.setDaemon(true);
        newThread.start();
    
    }
}
}