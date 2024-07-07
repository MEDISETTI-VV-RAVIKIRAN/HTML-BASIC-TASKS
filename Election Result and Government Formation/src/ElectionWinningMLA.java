import java.util.*;

public class ElectionWinningMLA {


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("---------------------------------------------------");
            System.out.println("Election Result of each party MLA contestent");
            System.out.println("---------------------------------------------------");
            System.out.println("   ");

            System.out.println("Number of parties contested  in Assembly Election : ");
            System.out.println("   ");
            System.out.println(" 1.Janesena Party ");
            System.out.println("   ");
            System.out.println(" 2.TDP Party  ");
            System.out.println("   ");
            System.out.println(" 3.YSRCP Party  ");
            System.out.println("   ");
            System.out.println("---------------------------------------------------");
            System.out.println(" Please enter Each  Contested MLA Candidate votes");
            System.out.println("---------------------------------------------------");
            System.out.println("   ");

            // Initialize Party candidates and their votes

            String[] candidates = {" Jenasena MLA Candidate ", " TDP MLA Candidate ", " YSRCP MLA Candidate "};

            int[] votes = new int[candidates.length];

            // Get votes from users

            for (int i = 0; i < candidates.length; i++) {
                System.out.println("   ");
                System.out.println("Enter votes for " + candidates[i] + ":");
                System.out.println("   ");
                votes[i] = scanner.nextInt();
            }

            // Calculate total votes polled for Each candidate

            int totalVotes = 0;

            for (int vote : votes) {

                totalVotes += vote;
            }

            // Print each  party MLA Candidate election results
            System.out.println("---------------------------------------------------");
            System.out.println("Election Results:");
            System.out.println("---------------------------------------------------");
            for (int i = 0; i < candidates.length; i++) {
                System.out.println("   ");
                System.out.println(candidates[i] + ": " + votes[i] + " votes (" + (votes[i] * 100.0 / totalVotes) + "%)");
                System.out.println("   ");
            }

            // Determine the winner according to majority of votes polled

            int maxVotes = 0;

            String winner = "";

            for (int i = 0; i < candidates.length; i++) {

                if (votes[i] > maxVotes) {

                    maxVotes = votes[i];

                    winner = candidates[i];
                }
            }
            System.out.println("...........................................................................");
            System.out.println(" Winner: " + winner);
            System.out.println("  ");

            // To indicate the majority of the winning MLA candidate

            int majority=0;
            Arrays.sort(votes);
            int max = votes.length - 1;
            majority = votes[max] - votes[max-1];

            System.out.println(winner+ " Won by majority : " + majority+"Votes");
            System.out.println(".........................................................................");


                }
            }




