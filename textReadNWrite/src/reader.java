import java.io.BufferedReader; //This is very similar to the Scanner lib
import java.io.FileReader; //These two imports are needed to read text files!
public class reader {
    public static void main(String[] args)throws Exception {
        FileReader file = new FileReader("C:/Users/cauan/Desktop/readme.txt"); //this path is the path of the text, obviously
        BufferedReader br = new BufferedReader(file);
        
        String text="";
        String line = br.readLine(); //This is gonna read line after line
        
        //This 'while' is gonna check if there's no line
        while(line!=null){
            text+=line;
            line = br.readLine();
        }
        
        br.close(); //close the process for the reading
        System.out.println(text);
    }    
}
