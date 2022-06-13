//Dimitri Rodriguez
//P4.9
//CS234
import java.lang.Math;
public class Lab3_Rodriguez_Dimitri{

     public static void main(String[] args){
		int X = 0;
		int Y = 0;
        int Left = 0;
        int Right = 1;
        int Up = 2;
        int Down = 3;
        int dir[] = {0, 1, 2, 3};
		
        System.out.println(X + ", " + Y);
		
        for (int i = 0; i != 100; i++){
            int chose = (int) (Math.random() * 4);
			
            if (chose == dir[0]) {
                X -= 1;
            }
            if (chose == dir[1]) {
                X += 1;
            }
            if (chose == dir[2]) {
                Y += 1;
            }
            if (chose == dir[3]) {
                Y -= 1;
            }
			//System.out.println(X + " " +Y + " " + i);
        }
        System.out.println(X + ", " + Y);
     }
}