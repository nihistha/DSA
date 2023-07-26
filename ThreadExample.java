public class ThreadExample {
        static class yourThread extends Thread{
        printer pref;
        yourThread(printer pref){
            this.pref = pref;
        }
        @Override
        public void run(){
            // for(int i=0;i<10;i++){
            //     System.out.println("task complete no."+i);
            // }
            pref.print("science");
            System.out.println(Thread.currentThread().getName());
        }
    }
    static class myThread extends Thread{
        printer pref;
        myThread(printer pref){
            this.pref = pref;
        }
        @Override
        public void run(){
            // for(int i=0;i<10;i++){
            //     System.out.println("task complete no."+i);
            // }
            pref.print("math");
            System.out.println(Thread.currentThread().getName());
        }
    }
    public static class printer{
        synchronized void print(String name){ // this also synchorinizes the threads
            for(int i = 0;i<10;i++){
                System.out.println("printing "+name+i+".docx");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println("application started");
        
        for(int i =0; i<10; i++){
            System.out.println("printing docs"+i+".docx");
        }
        //task executed
        printer pref = new printer();
        myThread t = new myThread(pref);
        yourThread yt = new yourThread(pref);
        t.start();
        // try{
        //     t.join(); // links this thread to the main thread and hence this thread becomes the priority
        // }catch()
        yt.start();
        System.out.println("application ended");
        //
    }
}