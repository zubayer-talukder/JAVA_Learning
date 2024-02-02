public class StringApplication {
    public static void main(String[] args){
        String word="joy Bangla";
        System.out.println(word);
        String message ="Joy Bongobondhu!!";
        System.out.println(message);
        System.out.println(word +" "+message);
        // ei vabe merge kora jay string ta  
         System.out.println(message.length());
         // length check kore message er
        System.out.println(message.startsWith("Joy"));
        System.out.println(message.endsWith("hasina"));
        System.out.println(word.indexOf("y"));
        // string theke y er index ber kore dibe
         System.out.println(message.indexOf("bonghu"));
         //if index dont find any thing it will print "-1"
         System.out.println(message.indexOf("bondhu"));
         // akta string kisu word o khuje ber kora jay
         

    }
}
