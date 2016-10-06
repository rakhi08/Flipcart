import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class fileread {

	public static void main(String[] args) throws IOException {
		/*File f = new File("D:\\testingreadwrite.txt");	
		f.createNewFile();
		// writing
		FileWriter w = new FileWriter("D:\\testingreadwrite.txt");
		BufferedWriter out = new BufferedWriter(w);
		out.write("hello we are writing in a file");
		out.newLine();
		out.write("This is a new line");
		out.flush();*/
		//reading
		FileReader r = new FileReader("D:\\testingreadwrite.txt");
		BufferedReader bfr = new BufferedReader(r);	
		String x ="";
		
		//System.out.println(bfr.readLine());
		//System.out.println(bfr.readLine());
		//System.out.println(bfr.readLine());
		
		
		while((x = bfr.readLine()) != null){
			System.out.println(x);
		}
			
		}

	}
