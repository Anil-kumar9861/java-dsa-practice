class main{
    public synchronized void print(){

      for(int i=1;i<=5;i++){
        System.out.println(i+":"+Thread.currentThread().getName());

      }  
    }
}

class Exam extends Thread{
    
    main m;

    Exam(main m){
        this.m=m;
    }

    public void run(){
        
        m.print();
    }
}


class Syn{
    public static void main(String []args){

        main m = new main();

        Exam t1 = new Exam(m);
        Exam t2 = new Exam(m);

        t1.start();
        t2.start();



    }
}