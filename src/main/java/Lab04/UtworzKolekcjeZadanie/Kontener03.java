package Lab04.UtworzKolekcjeZadanie;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Kontener03 implements Iterable<Object> {
    private Object[]tablica;
    public Kontener03(int rozmiar) {
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
        return "Kontener03: "+ Arrays.toString(tablica);
    }
    @Override
    public int hashCode() {
        return Arrays.hashCode(tablica);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kontener03 other = (Kontener03) o;
        return Arrays.equals(tablica, other.tablica);
    }
    //Implementacja interfejsu Iterable
    @Override
    public Iterator<Object>iterator(){
        return new Iterator<Object>() {
            int position=0;
            @Override
            public boolean hasNext() {
                return position<tablica.length;
            }
            @Override
            public Object next() {
                if(!hasNext()) throw new NoSuchElementException("Brak elementów w kolekcji");
                return tablica[position++];
            }
        };
    }

}
