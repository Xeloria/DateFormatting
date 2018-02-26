import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		LLQueue<Date> q = new LLQueue<>();
		Scanner s = new Scanner(System.in);
		System.out.println("This program separates a date from format YYYYMMDD to format YYYY, MM, DD.");
		System.out.println("Enter the location of the file. Make sure the file is type \".csv\" ");
		String fileDir = s.next();
		
		try {
			s = new Scanner(new File(fileDir));
			String date;
			while(s.hasNextLine()) {
				date = s.nextLine();
				q.enqueue(new Date(date.substring(0, 4),date.substring(4, 6),date.substring(6, 8)));
			}
			s.close();
			PrintWriter p = new PrintWriter(new File(fileDir));
			
			Date d;
			while(!q.isEmpty()) {
				d = q.dequeue();
				p.println(d.year()+","+d.month()+","+d.day());
			}
			p.close();
			
			System.out.println("Done!");
			
		} catch (FileNotFoundException e) {
			System.out.println("Unable to find the file. Please check that you entered the correct directory and try again.");
			s.close();
		} catch (Exception e) {
			System.out.println("Oops! Something went wrong...\n"+e);
			s.close();
		}
		
		
	}
	
	
}
