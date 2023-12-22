package Game.Maze;
import java.util.Scanner;

public class Maze {
    static char[][] maze = {
            {'*', '*', '*', '*','*','*','*','*','*','*','*','*','*','*','*'},
            {'*', 'O', ' ', ' ',' ',' ',' ',' ',' ',' ',' ','*',' ',' ','*'},
            {'*', ' ', '*', '*','*',' ','*',' ','*',' ',' ','*',' ',' ','*'},   
            {'*', ' ', '*', ' ',' ',' ','*',' ','*',' ',' ','*',' ',' ','*'},
            {'*', ' ', ' ', ' ',' ',' ','*',' ','*',' ',' ','*','*','*','*'},
            {'*', ' ', '*', '*',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','*'},
            {'*', '*', '*', '*',' ','*',' ',' ','*','*','*','*',' ',' ','*'},
            {'*', ' ', ' ', '*',' ','*',' ',' ','*',' ',' ','*',' ',' ','*'},
            {'*', ' ', ' ', '*',' ','*','*',' ','*',' ','*','*',' ','*','*'},
            {'*', ' ', ' ', ' ',' ','*','*',' ',' ',' ',' ','*','*','*','*'},
            {'*', ' ', ' ', ' ',' ',' ',' ',' ','*',' ',' ','*',' ',' ','*'},
            {'*', ' ', '*', '*',' ','*','*',' ','*',' ',' ','*',' ',' ','*'},
            {'*', ' ', '*', '*',' ','*','*',' ','*',' ',' ','*',' ',' ','*'},
            {'*', ' ', ' ', ' ',' ',' ',' ',' ','*',' ',' ',' ',' ',' ','*'},
            {'*', '*', '*', '*','*','*','*','*','*','*','*','*','*','*','*'},

        };
    public static void main (String [] args){
        int width = 15;
        int height = 15;
        char[][] maze = {
            {'*', '*', '*', '*','*','*','*','*','*','*','*','*','*','*','*'},
            {'*', 'O', ' ', ' ',' ',' ',' ',' ',' ',' ',' ','*',' ',' ','*'},
            {'*', ' ', '*', '*','*',' ','*',' ','*',' ',' ','*',' ',' ','*'},   
            {'*', ' ', '*', ' ',' ',' ','*',' ','*',' ',' ','*',' ',' ','*'},
            {'*', ' ', ' ', ' ',' ',' ','*',' ','*',' ',' ','*','*','*','*'},
            {'*', ' ', '*', '*',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','*'},
            {'*', '*', '*', '*',' ','*',' ',' ','*','*','*','*',' ',' ','*'},
            {'*', ' ', ' ', '*',' ','*',' ',' ','*',' ',' ','*',' ',' ','*'},
            {'*', ' ', ' ', '*',' ','*','*',' ','*',' ','*','*',' ','*','*'},
            {'*', ' ', ' ', ' ',' ','*','*',' ',' ',' ',' ','*','*','*','*'},
            {'*', ' ', ' ', ' ',' ',' ',' ',' ','*',' ',' ','*',' ',' ','*'},
            {'*', ' ', '*', '*',' ','*','*',' ','*',' ',' ','*',' ',' ','*'},
            {'*', ' ', '*', '*',' ','*','*',' ','*',' ',' ','*',' ',' ','*'},
            {'*', ' ', ' ', ' ',' ',' ',' ',' ','*',' ',' ',' ',' ',' ','*'},
            {'*', '*', '*', '*','*','*','*','*','*','*','*','*','*','*','*'},

        };
        
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // Print the current state of the maze
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    System.out.print(maze[i][j]);
                }
                System.out.println();
            }

            // Ask the user for a move
            System.out.println("Enter a move (w/a/s/d): ");
            char move = scanner.next().charAt(0);

            // Find the 'O' character
            int currentX = -1, currentY = -1;
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    if (maze[i][j] == 'O') {
                        currentX = j;
                        currentY = i;
                    }
                }
            }

            // Update the position of the 'O' character based on the user's move
            if (move == 'w' && currentY > 0 && maze[currentY - 1][currentX] == ' ') {
                maze[currentY][currentX] = ' ';
                maze[currentY - 1][currentX] = 'O';
            } else if (move == 'a' && currentX > 0 && maze[currentY][currentX - 1] == ' ') {
                maze[currentY][currentX] = ' ';
                maze[currentY][currentX - 1] = 'O';
            } else if (move == 's' && currentY < height - 1 && maze[currentY + 1][currentX] == ' ') {
                maze[currentY][currentX] = ' ';
                maze[currentY + 1][currentX] = 'O';
            } else if (move == 'd' && currentX < width - 1 && maze[currentY][currentX + 1] == ' ') {
                maze[currentY][currentX] = ' ';
                maze[currentY][currentX + 1] = 'O';
            }
        }
    }
    public static char[][] getMaze(){
    return maze;}
}


