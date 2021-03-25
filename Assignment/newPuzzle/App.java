package newPuzzle;

import java.util.Scanner;

public class App {
    final static private String EASY = "134862705";
    final static private String MEDIUM = "281043765";
    final static private String HARD = "567408321";
    final static private String GOAL_STATE = "123804765";



    public static void main(String[] args) {
        String rootState = MEDIUM;
        long startTime = System.currentTimeMillis();
        Scanner input = new Scanner (System.in);
        SearchTree search = new SearchTree(new Node(rootState), GOAL_STATE);
        System.out.println("Select which search to use(d/b/i/u/a): ");
        char x = input.next().charAt(0);
        if (x == 'd')
        	search.depthFirstSearch();
        else if (x == 'b')
        	search.breadthFirstSearch();
        else if (x == 'i')
        	search.iterativeDeepening(10);
        else if ( x == 'u')
        	search.uniformCostSearch();
        else if (x == 'a')
        	search.aStar(Heuristic.H_ONE);
        else {
        	System.out.println("invaild input");
        	System.exit(0);
        }
        

        long finishTime = System.currentTimeMillis();
        long totalTime = finishTime - startTime;
        System.out.println("Time  :" + totalTime);


    }
}
