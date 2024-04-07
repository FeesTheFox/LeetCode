import java.io.*;

public class TenthLine {
    public static void main(String[] args)  {

        try {
            File myFile = new File("C://Users//User//Documents//file.txt");

            //object for reading files
            FileReader readStream = new FileReader(myFile);

            //reading object line by line
            BufferedReader bufferedReader= new BufferedReader(readStream);

            int lineNum = 1;

            String line;
            while ((line = bufferedReader.readLine()) != null){
                if (lineNum==10){
                    System.out.println(line);
                    break;
                }
                lineNum++;
            }

            bufferedReader.close();
            readStream.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
