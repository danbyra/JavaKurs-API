package Lab04.UtworzKolekcjeZadanie;

public class Kontener01 {
    private int[]tablica;
    public Kontener01(int rozmiar) {
        tablica = new int[rozmiar];
    }
    public int get(int index) {
        if(index <0 || index>tablica.length) throw new IndexOutOfBoundsException();
        return tablica[index];
    }
    public  void setTablica(int index,int value) {
        if(index<0)throw new  IndexOutOfBoundsException();
        if(index>tablica.length)resize(index+1);
        tablica[index] = value;
    }
    private void resize(int rozmiar) {
        int[]nowaTablica=new int[rozmiar];
        for (int i = 0; i < tablica.length; i++) {
            nowaTablica[i]=tablica[i];
        }
        this.tablica=nowaTablica;
    }
}
