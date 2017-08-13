
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class spiral {
	public static void main(String[] args){
		//34.021249 -118.289046
		double x0,x=0.0,y=0.0;
		double y0, pi = Math.PI;
		double R = 5.0, r=1.0, a=4.0, nRev=10.0;
		x0=R+r-a;
		y0=0.0;
		
		File f = new File("\\Users\\saileerane\\Desktop\\spiro.txt");
		PrintWriter out;
		try {
			out = new PrintWriter(new BufferedWriter(new FileWriter(f)));
		
		System.out.println("I start");

		for(double t=0.0;t<(pi*nRev);t+=0.01){
			x = (R+r)*Math.cos((r/R)*t) - a*Math.cos((1+r/R)*t);
			y = (R+r)*Math.sin((r/R)*t) - a*Math.sin((1+r/R)*t);
			double t2=34.021249;
			double t1=-118.289046;
			out.println((x+t1)+","+(y+t2));
			//out.print(x+y0);
			//System.out.println((x+y0)+","+(y+x0));
			
		}
		

		out.flush();
		out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}