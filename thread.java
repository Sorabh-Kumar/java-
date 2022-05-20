class thread1 extends thread {
    public void run()
    {
        try {
            for (int i = 1; i <= 15; i++) {
                System.out.println("rachit....." + i);
                sleep(1000);
            }
            }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
class thread2 extends thread
{
    public void run(){
        try
        {
            for(int j=60;j<100;j+2 )
            {
                System.out.println(j+"....sourabbh");
                sleep(500);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class thread
{
    public static void main(String[] args) {
        thread th1= new thread();
        thread2 th2= new thread2();
        th1.start();
        th2.start();
    }
}