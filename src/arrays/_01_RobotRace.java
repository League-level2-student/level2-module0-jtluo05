package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	static int x=800;
static int y=440;
 static Random r=new Random();
 
// 1. make a main method
public static void main(String[] args) {
	Robot[]robots=new Robot[5];

	// 2. create an array of 5 robots.
// done
	// 3. use a for loop to initialize the robots.
for(int i=0; i<5;i++) {
	robots[i]=new Robot("batman");
	robots[i].setSpeed(100);
}
	// 4. make each robot start at the bottom of the screen, side by side, facing up
for(Robot robot:robots) {
robot.moveTo(x, y);
	x=x-180;
}
	
	// 5. use another for loop to iterate through the array and make each robot move
	// a random amount less than 50.

	

for(Robot robot:robots) {
robot.move(r.nextInt(51));
if (robot.getY()<0) {
	break;
}
}



	// 6. use a while loop to repeat step 5 until a robot has reached the top of the
	// screen.

	// 7. declare that robot the winner and throw it a party!

	// 8. try different races with different amounts of robots.

	// 9. make the robots race around a circular track.
}

}