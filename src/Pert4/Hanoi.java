package Pert4;

public class Hanoi {

    public static String towerOfHanoi(int n, int fromPeg, int toPeg) {
        if (n == 1) {
            return "move disk " + n+" from peg "+fromPeg + " to peg " + toPeg + ";";
        }
        else {
            String sol1,sol2,sol3;

            int helpPeg = 6-fromPeg-toPeg;

            sol1 = towerOfHanoi(n-1, fromPeg,helpPeg);
            sol2 = "move disk "+ n +" from peg "+fromPeg + " to peg " + toPeg +";";
            sol3 = towerOfHanoi(n-1, helpPeg,toPeg);

            return sol1+sol2+sol3;
        }
    }

    public static void main(String[] args) {
        int n = 3;
        int count = 0;

        String Step = towerOfHanoi(n,1,3);
        for (String s: Step.split(";")){
            System.out.println("\nstep "+ (count+1) + " :");
            System.out.println(s);
            ++count;
        }
    }
}
