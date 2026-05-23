//Primitive Type Keyword (bardziej bym to nazwał jako typ wartościowy albo bazowy)
//Type    Size in bytes   Range                               DefaultValue
//byte      1byte          -128 to 127                               0
//
//short	    2 bytes	      -32,768 to 32,767                          0
//
//int       4 bytes	      -2,147,483,648
//                         to 2,147,483,647	                         0
//
//long	    8 bytes	      -9,223,372,036,854,775,808
//                     to 9,223,372,036,854,775,807	                 0
//
//float	    4 bytes	       approximately ±3.40282347E+38F           0.0f
//                     (6-7 significant decimal digits)
//                     Java implements IEEE 754 standard
//
//double	8 bytes	   approximately ±1.79769313486231570E+308      0.0d
//                     (15 significant decimal digits)
//char	    2 bytes	        0 to 65,536 (unsigned)	              '\u0000'
//boolean	Not precisely       true or false	                    false
//          defined*

package Lab01;
public class ZF4
{
    public static void main(String[] args)
    {
//        int intVariable=10;
//        System.out.println("Jasiu ma lat: "+ intVariable);
//        System.out.println("Joasia ma lat: "+ intVariable);
//        intVariable=12;
//        System.out.println("Jasiu ma lat: "+ intVariable);
//        System.out.println("Joasia ma lat: "+ intVariable);
        byte byteVar=1;
        short shortVar=2;
        int intVar=3;
        long longVar=400000000L;
        float floatVar=5.12F;
        double doubleVar=5.12D;

        char charVar=69; //automatycznie parsuje na znak ASCII
        boolean booleanVar=true;
        var varVar=123;//typ automatyczny, nie można zmienić typu zmiennej dalej w kodzie (JAVA to kontroluje)
        System.out.println("byteVar="+byteVar);
        System.out.println("shortVar="+shortVar);
        System.out.println("intVar="+intVar);
        System.out.println("longVar="+longVar);
        System.out.println("floatVar="+floatVar);
        System.out.println("doubleVar="+doubleVar);
        System.out.println("charVar="+charVar);
        System.out.println("booleanVar="+booleanVar);
        System.out.println("varVar="+varVar);
    }
}