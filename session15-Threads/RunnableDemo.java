class TestRunnableDemo implements Runnable {
   private Thread t;
   private String threadName;
   
   TestRunnableDemo( String name) {
      threadName = name;
      System.out.println("Creating " +  threadName );
   }
   
   public void run() {
      System.out.println("Running " +  threadName );
      try {
         for(int i = 1000; i > 0; i--) {
            System.out.println("Thread: " + threadName + ", " + i);
            // Let the thread sleep for a while.
            //Thread.sleep(50);
         }
      } catch (Exception e) {
         System.out.println("Thread " +  threadName + " interrupted.");
      }
      System.out.println("Thread " +  threadName + " exiting.");
   }
   
   public void start () {
      System.out.println("Starting " +  threadName );
      if (t == null) {
         t = new Thread (this, threadName);
         t.start ();
      }
   }
}

public class RunnableDemo {

   public static void main(String args[]) {
      TestRunnableDemo R1 = new TestRunnableDemo( "Thread-1");
      R1.start();
      
      TestRunnableDemo R2 = new TestRunnableDemo( "Thread-2");
      R2.start();
   }   
}