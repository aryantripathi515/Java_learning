//String handling

//A string in java is actually an object.

/*
1.   .length()
2.    .toUpperCase()
3.  .toLowerCase()
4.  .indexOf("char")
5.  .charAt(number)
6.  equals(taxt2)
*/

//Example code:

class handling{
    public static void main(String ar[]){
    String text1 = "My name is Aryan Tripathi";
    String text2 = "Aryan Tripathi";
    System.out.println(text1.length());
    System.out.println(text1.toUpperCase());
    System.out.println(text1.toLowerCase());
    System.out.println(text1.indexOf("is"));
    System.out.println(text1.charAt(3));
    System.out.println(text1.equals(text2));

    }

}
