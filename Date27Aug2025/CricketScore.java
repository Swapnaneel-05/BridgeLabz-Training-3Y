package BridgeLabz.ProblemStatement;

import java.util.Scanner;

public class CricketScore {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the players played");
        int size=sc.nextInt();
        int[] scores=new int[size];
        scores=userInput(size, scores);

        System.out.println("The highest Score is: "+highestScore(scores));

        System.out.println("The lowest Scorer is "+lowestScore(scores));

        System.out.println("The average is "+AverageScore(scores));

        CenturyScorer(scores);
        sc.close();
    }

    // User Input
    public static int[] userInput(int size,int[] scores){
        // User input
        System.out.println("The scores of players are: ");
        for(int i=0;i<scores.length;i++){
            Scanner s= new Scanner(System.in);
            scores[i]=s.nextInt();
        }
        return scores;
    }

    // Highest
    public static int highestScore(int[] scores){
        int highest=scores[0];
        for(int i=0;i<scores.length;i++){
            if(scores[i]>highest){
                highest=scores[i];
            }
        }
        return highest;
    }

    // Lowest
    public static int lowestScore(int[] scores){
        int lowest=scores[0];
        for(int i=0;i<scores.length;i++){
            if(scores[i]<lowest){
                lowest=scores[i];
            }
        }
        return lowest;
    }

    // Average
    public static int AverageScore(int[] score){
        int sum=0;
        for(int i=0;i<score.length;i++){
            sum+=score[i];
        }
        int average=sum/score.length;
        return  average;
    }

    //Century Scorer
    public static void CenturyScorer(int[] score){
        for(int i=0;i<score.length;i++){
            if(score[i]>=100){
                System.out.println("Number "+(i+1)+" is a Centuary Scorer with "+score[i]+" runs.");
            }
        }
        System.out.println("There are no Centuary Scorer.");
    }
}
