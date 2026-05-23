package Lab01;

public class Zad1
{
    public static void main(String[] args)
    {
        System.out.println("Kody liczbowe oraz odpowiadające im znaki:");
        for (int i = 48; i <= 124; i++)
        {
            char znak=(char)i;
            System.out.print("kod:" + i+ "znak; "+ znak + "\n");
        }
        System.out.println("Jakiś napis z kodów");
        System.out.print((char)74);
        System.out.print((char)68);
        System.out.print((char)69);
    }
}
