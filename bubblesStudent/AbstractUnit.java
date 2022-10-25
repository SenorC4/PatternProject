/*type1 30 1.0 4 
health 0 5 10 5 
health 0 -5 10 8 
bubble 0 10 1 5 3 2 2 100 5 
bubble 0 -10 1 5 .5 10 .1 150 2.5

type2 15 .5 2 
health 10 0 5 10 
health -10 0 5 10*/

//Each part of the above is the decorsator for the respective unit.
public class AbstractUnit{
String type; //type 1 is red player? type 2 is blue player?

String name;
double radius;
double speed;
int attributenumber; //Is how many attributes are next to read.
//Attribute has a number, type, posx, posy, radius before the next attribute in the text file. 
String health;
double healthx;
double healthy;
double hp;
double healthradius;
String bubble;
double bubblex;
double bubbley;
int bubbletype;
//This is for the decorator
int decoratorbubblesize;
//end prev comment here
double bubbledamage;
double bubblespeed;
double refiredelay;
int bubblerange;
//Actual size of the projectiles
double bubblesize; 




   public AbstractUnit()
   {
   
   
   
   }
   
   public int getSide()
   {
   
   
      return 0;
   }

}