class Thread1 implements Runnable{

    public void run(){
        System.out.print("Thread is running....");
    }

}

class Main{
    public static void main(String []args){

        Thread1 n = new Thread1();
        Thread t= new Thread(n);


        t.start();
      
    }
}