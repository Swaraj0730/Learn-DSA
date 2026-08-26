package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Filehandling {

    public static void main() {

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("you typed" + br.readLine());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


        // byte to char stream and then read char stream





        try(InputStreamReader isr = new InputStreamReader(System.in)){
            System.out.println("Enter some letter");
            int letters = isr.read();
            while(isr.ready()){
                System.out.print((char) letters + " ");
                letters = isr.read();
            }
            isr.close();
            System.out.println();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        try(FileReader fr =  new FileReader("note.txt")){
            System.out.println("Enter some letter");
            int letters = fr.read();
            while(fr.ready()){
                System.out.print((char) letters + " ");
                letters = fr.read();
            }
            fr.close();
            System.out.println();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
