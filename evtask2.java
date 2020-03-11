
// class 
// {

// }


// class evtask2
// {
//     public static void main(String[] args) {
        
//     }
// }
import java.util.*;
import java.util.Scanner;

class Cannonball {
	double velocity, position;
	Cannonball(double velocity) {
		this.velocity = velocity;
	}
	void move() { 
		this.position += this.velocity * 0.01;
		this.velocity = this.velocity - 9.81 * 0.01;
	}
	double getX() {
		return this.position;
	}
	double getY() {
		return this.velocity;
	}
	void shoot(double initVelocity) {
		for (int i = 0; this.position >= 0; i++) {
			if (i % 100 == 0) {
				System.out.print(this.getX() + " " + this.getY() + " ");
				System.out.println( " " +  (-0.5 * 9.81 * Math.pow( i / 100, 2) + initVelocity * i / 100));
			}
			this.move();
		}	
	}
}

class evtask2 {
	public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
		double initVelocity = obj.nextDouble();
		Cannonball c = new Cannonball(initVelocity);
		c.shoot(initVelocity);
	}
}