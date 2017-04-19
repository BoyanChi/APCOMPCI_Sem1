import java.util.ArrayList;
public class Satellite
{
   public static void main(String[]args)
   {
       ArrayList<Location> locate = new ArrayList<>();
       double[] honLoc = {5, 6};
       Honda honda = new Honda(honLoc);
       Toyota toyota = new Toyota("8, 9");
       GMC gmc = new GMC(3, 8);
	   locate.add(honda);
	   locate.add(toyota);
	   locate.add(gmc);


       double[] home = {0, 0};


       String printout = "\n\n" +
               "==========================" + "\nStarting locations...";


       for (Location l : locate)
       {
           printout += "\n Location for " + l.getID() + ": (" + getLocation(l.getLoc()) + ")";
       }


       printout += "\n\n" + "==========================" +
                   "\n Distance from home...";


       for (Location l : locate)
       {
           printout += "\n Distance for " + l.getID() + ": (" + getDistance(l.getLoc(), home)+ ")";
       }


       System.out.println(printout);
	   ArrayList<Double> movement = new ArrayList<>();
	   movement.add(Math.random()*100 + 1);
	   movement.add(Math.random()*100 + 1);
	   movement.add(Math.random()*100 + 1);
	   movement.add(Math.random()*100 + 1);
	   movement.add(Math.random()*100 + 1);
	   movement.add(Math.random()*100 + 1);
	   honda.move(movement.get(0), movement.get(1));
	   toyota.move(movement.get(2), movement.get(3));
	   gmc.move(movement.get(4), movement.get(5));
	   int i = 0;
	   printout += "\n=====================================";
	   for(Location l : locate)
			{
				printout += "\n After " + l.getID() + "Moved (" + String.format("%.2f", movement.get(i))  +", " + String.format("%.2f", movement.get(i+1)) + ")" + "\n New Location: (" + getLocation(l.getLoc()) + ")";
				i += 2;
				printout += "\n Distance from home...";
			}
	   for(Location l : locate)
			{
				printout += "\n Distance for " + l.getID() + ": (" + getDistance(l.getLoc(), home) + ")";
			}
	   System.out.println(printout);
   }


   public static String getDistance(double[] car, double[] home)
   {
       return String.format("%.2f", Math.pow((car[0]) - home[0], 2)+ Math.pow(car[1] - home[1], 2));
   }


   public static String getLocation(double[] loc)
   {
       return String.format("%.2f, %.2f", loc[0], loc[1]);
   }
}