package _06_Snake;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Snake {
	public static final Color SNAKE_COLOR = Color.BLUE;
	public static final int BODY_SIZE = 50;

	private SnakeSegment head;
	private ArrayList<SnakeSegment> snake;

	private Direction currentDirection;

	private boolean canMove = true;

	public Snake(Location location) {
		snake = new ArrayList<SnakeSegment>();
		head = new SnakeSegment(location, BODY_SIZE);
		snake.add(head);

		currentDirection = Direction.RIGHT;
	}

	public void feed() {
		//1. add a new SnakeSegment object to the snake
		//Location loc = new Location(snake.get(snake.size()-1).getLocation().x+1, snake.get(snake.size()-1).getLocation().y);
		Location newLoc = null;
		switch (currentDirection){
		case RIGHT:
			newLoc = new Location(snake.get(snake.size()-1).getLocation().x-1, snake.get(snake.size()-1).getLocation().y);
			break;
		case LEFT:
			newLoc = new Location(snake.get(snake.size()-1).getLocation().x+1, snake.get(snake.size()-1).getLocation().y);
			break;
		case UP:
			newLoc = new Location(snake.get(snake.size()-1).getLocation().x, snake.get(snake.size()-1).getLocation().y+1);
			break;
		case DOWN:
			newLoc = new Location(snake.get(snake.size()-1).getLocation().x, snake.get(snake.size()-1).getLocation().y-1);
			break;
		}

		SnakeSegment add = new SnakeSegment(newLoc, BODY_SIZE);
		snake.add(add);
		System.out.println(snake.size());
		for(int i=0; i<snake.size(); i++) {
			System.out.println(snake.get(i).getLocation().x+", "+snake.get(i).getLocation().y);
		}
		
	}

	public Location getHeadLocation() {
		//2. return the location of the snake's head
		return head.getLocation();
	}

	public void update() {
		//1. use a switch statement to check on the currentDirection
		//   of the snake and calculate its next x and y position.
		Location newLoc = null;
		switch (currentDirection){
		case RIGHT:
			newLoc = new Location(head.getLocation().x+1, head.getLocation().y);
			break;
		case LEFT:
			newLoc = new Location(head.getLocation().x-1, head.getLocation().y);
			break;
		case UP:
			newLoc = new Location(head.getLocation().x, head.getLocation().y-1);
			break;
		case DOWN:
			newLoc = new Location(head.getLocation().x, head.getLocation().y+1);
			break;
		}

		//2. Iterate through the SnakeSegments in reverse order
		for(int i=snake.size()-1; i>0; i--) {
			//2a. Update each snake segment to the location of the segment 
			//    in front of it.
			//if(i==snake.size()-1) {
			//	snake.get(i).setLocation(newLoc);
			//}else {
				snake.get(i).setLocation(snake.get(i-1).getLocation());
			
			//}
		}
		
		
		//3. set the location of the head to the new location calculated in step 1
		head.setLocation(newLoc);

		//4. set canMove to true
		canMove=true;
	}

	public void setDirection(Direction d) {
		//1. set the current direction equal to the passed in Direction only if canMove is true.
		//   set canMove equal to false.
		//   make sure the snake cannot completely reverse directions.
		if(canMove) {
			if(currentDirection==Direction.UP && d!=Direction.DOWN) {
				currentDirection=d;
				canMove=false;
			}else if(currentDirection==Direction.DOWN && d!=Direction.UP) {
				currentDirection=d;
				canMove=false;
			}else if(currentDirection==Direction.LEFT && d!=Direction.RIGHT) {
				currentDirection=d;
				canMove=false;
			}else if(currentDirection==Direction.RIGHT && d!=Direction.LEFT) {
				currentDirection=d;
				canMove=false;
			}
		}
	}

	public void reset(Location loc) {
		//1. clear the snake
		snake.clear();
		//2. set the location of the head
		head.setLocation(loc);
		//3. add the head to the snake
		snake.add(head);
	}

	public boolean isOutOfBounds() {
		//1. complete the method so it returns true if the head of the snake is outside of the window
		//   and false otherwise
		if(head.getLocation().x>=15) {
			return true;
		}else if(head.getLocation().x<0) {
			return true;
		}else if(head.getLocation().y>=12) {
			return true;
		}else if(head.getLocation().y<0) {
			return true;
		}else {
			return false;
		}

	}
	
	public boolean isHeadCollidingWithBody() {
		//1. complete the method so it returns true if the head is located
		//   in the same location as any other body segment
		/*int i=1; i<snake.size(); i++*/
		for(int i=snake.size()-1; i>0; i--) {
			if(head.getLocation().x==snake.get(i).getLocation().x && head.getLocation().y==snake.get(i).getLocation().y) {
				System.out.println("head collide body");
				return true;
			}
		}
		return false;
	}

	public boolean isLocationOnSnake(Location loc) {
		//1. complete the method so it returns true if the passed in
		//   location is located on the snake
		for(int i=0; i<snake.size(); i++) {
			if(snake.get(i).getLocation()==loc) {
				return true;
			}
		}
		return false;
	}

	public void draw(Graphics g) {
		for (SnakeSegment s : snake) {
			s.draw(g);
		}
	}
}
