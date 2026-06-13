package Lab04.UtworzKolekcjeZadanie;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Kontener02 {

    private Object[]tablica;
    public Kontener02(int rozmiar) {
        if(rozmiar <0) throw  new IllegalArgumentException();
        this.tablica = new Object[rozmiar];
    }

    public Object get(int index) {
        if(index <0 || index>tablica.length) throw new IndexOutOfBoundsException();
        return tablica[index];
    }
    public  void set(int index,Object value) {
        if(index<0) throw new IndexOutOfBoundsException();
        if(index>=tablica.length)
            resize(index+1);

        tablica[index] = value;
    }
    public  int size() {
        return this.tablica.length;
    }
    private void resize(int rozmiar) {
        Object[]nowaTablica=new Object[rozmiar];
        for (int i = 0; i < tablica.length; i++) {
            nowaTablica[i]=tablica[i];
        }
        this.tablica=nowaTablica;
    }
    //Musiałem nadpisać te metody, bo każdy Object musi mieć je zdefiniowane, inaczej nie zadziała
    @Override
    public String toString() {
        return "Kontener02: "+ Arrays.toString(tablica);
    }
    @Override
    public int hashCode() {
        return Arrays.hashCode(tablica);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kontener02 other = (Kontener02) o;
        return Arrays.equals(tablica, other.tablica);
    }
}
