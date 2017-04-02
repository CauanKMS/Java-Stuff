import java.io.BufferedWriter;
import java.io.FileWriter; 
import java.io.File;
//These are used to write files
public class writer {
    public static void main(String[] args) {
        File newTxt = new File("C:/Users/cauan/Desktop/newTxt.txt");
        
        if(newTxt.exists()) System.out.println("The file already exists!");
        else {
            try{ 
                newTxt.createNewFile();
                FileWriter fw=new FileWriter(newTxt);
                BufferedWriter bw = new BufferedWriter(fw);
                
                bw.write("This is my Prog");
                bw.close();
                
                System.out.println("File written!");
            }
            catch(Exception e){e.printStackTrace();}
        }        
    }    
}
