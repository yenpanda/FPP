/*
 * /\/\\/:)||
 * Prog3.UpwardHat : /\
 * Prog3.UpwardHat : /\
 * Prog3.DownwardHat : \/
 * Prog3.FaceMaker : :)
 * Prog3.Vertical : ||
 */
package Prog3;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Figure f[] = new Figure[5];
		f[0] = new UpwardHat();
		f[1] = new UpwardHat();
		f[2]  = new DownwardHat();
		f[3] = new FaceMaker();
		f[4] = new Vertical();
		
		for(Figure i : f){
			i.getFigure();
		}
		System.out.println("");
		for(Figure j : f){
			System.out.print(j.getClass().getName() + " : " );
			j.getFigure();
			System.out.println("");
		}
	}

}
