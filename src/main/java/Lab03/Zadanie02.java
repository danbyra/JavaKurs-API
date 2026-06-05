package Lab03;

public class Zadanie02 {
    public static void klasycznaImplementacjaRunnable()
    {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Klasyczna implementacja interfejsu Runnable: ");
                System.out.println("Hello World");
            }
        });
        t1.start();
    }
    public static void implementacjaFunkcyjnaRunnable(){
        Thread t2=new Thread(()->{
            System.out.println("Implementacja funkcyjna runnable");
            System.out.println("Hello World");
        });
        t2.start();
    }
    public static void main(String[] args) {

        klasycznaImplementacjaRunnable();
        implementacjaFunkcyjnaRunnable();
        Thread t3=new Thread(()->System.out.println("Hello World"));
        t3.start();

    }
}
