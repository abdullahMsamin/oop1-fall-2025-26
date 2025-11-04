import java.nio.channels.Pipe.SourceChannel;

public class Task_2 {
    public static void main(String[] args) {
        //Formated full name
        String firstNmae = "Abdullah" ;
        String lastNmae = "Samin"  ;
        String fullNmae = firstNmae+" "+lastNmae ;
        System.out.println("Foramted full name : "+fullNmae);
        System.out.println(" ");

        //product code
        String pName = "Asus" ;
        String pID = "123"  ;
        String fullproduct = pName+" "+pID;
        System.out.println("Product code : "+fullproduct);
        System.out.println(" ");

        //extracted username 
         String userNmae = "abdullahMsamin@gmail.com"  ;
        String  abdullah  = userNmae.substring(0,14) ;
        System.out.println("Extracted username : "+ abdullah);
        System.out.println(" ");

        //character length 
        String msg = "I am learnig java "  ;
        int length = msg.length() ;
        System.out.println("Total number of characters : "+length);
        System.out.println(" ");

              //changing case
        String line = "I love football "  ;
        System.out.println("Upper case : "+line.toUpperCase()); 
        System.out.println("Lower case : "+line.toLowerCase()); 
        System.out.println(" ");

        // replacement
        String sentance = "I'm a doctor "  ;
        String  old = "doctor";
        String  New = "Teacher";
        String replace = sentance.replace(old,New) ;
        System.out.println("Previous sentence : "+ sentance);
        System.out.println("After replacemenmt of word : "+ replace);

  
      










    }
    
}
