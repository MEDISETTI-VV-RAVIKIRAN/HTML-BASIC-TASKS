import java.util.Arrays;
import java.util.Scanner;

public class StateGovtFrmtn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------------------------------------");
        System.out.println(" Which party should form the  State Goverenment by Election ");
        System.out.println("------------------------------------------------------------");

        System.out.println("   ");

        System.out.println(" Please enter the count of MLA Candidates won by Each  Party ");

        System.out.println("   ");

        // Initialize parties participating in elections and their winnings

        String[] wonCandidates = {" Jenasena Party ", " TDP Party ", " YSRCP Party "};

        int[] wonCount = new int[wonCandidates.length];

        // Get  winning count from users

        for (int i = 0; i < wonCandidates.length; i++) {

            System.out.println("Enter count of MLA seats won by " + wonCandidates[i] + ":");

            wonCount[i] = scanner.nextInt();
        }

        // Calculate total count of winning  MLA seats

        int totalCount = 0;

        for (int count : wonCount) {

            totalCount += count;
        }

        // Print number of MLA seats won by Each party and calculating the majority

        System.out.println("------------------------------------------------------------");
        System.out.println(" Partywise Election won assembly seats count :");
        System.out.println("------------------------------------------------------------");
        System.out.println("   ");

        for (int i = 0; i < wonCandidates.length; i++) {

            System.out.println(wonCandidates[i] + ": " + wonCount[i] + " MLA seats (" + (wonCount[i] * 100.0 / totalCount) + "%)" );

            System.out.println("   ");
        }

        // Determine the winning Party that going to form State Government

        int maxVotes = 0;

        String winningParty = "";

        for (int i = 0; i < wonCandidates.length; i++) {

            if (wonCount[i] > maxVotes) {

                maxVotes = wonCount[i];

                winningParty = wonCandidates[i];
            }
        }

        System.out.println(".............................................................");
        System.out.println(" State Government successfully formed by : " + winningParty);
        System.out.println("   ");

        // State Government should form by winning party with majority of MLA seats

        int majority=0;
        Arrays.sort(wonCount);
        int max = wonCount.length - 1;
        majority = wonCount[max] - wonCount[max-1];

        System.out.println( winningParty + "Going to form State Government  with majority of MLA seats : " + majority +" MLA seats ");

        System.out.println(".............................................................");


    }
    }

