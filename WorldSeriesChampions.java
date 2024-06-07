
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author Ricardo Zelante
 */
public class WorldSeriesChampions {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws IOException {
        /**finds input file to be read from
         */
        Scanner inputFile = new Scanner(new File("C:\\Users\\The Zelante's\\Desktop\\portfolio projects\\WorldSeriesChampions\\WorldSeriesChampions\\src\\WorldSeriesWinners.txt"));
        ArrayList<String> champs = new ArrayList<>();//creates an array list
        
        /**while loop add items from file to the array list
         */
        while (inputFile.hasNextLine()){
            champs.add(inputFile.nextLine());
        }
        
        Scanner keyboard = new Scanner (System.in);//scanner for keyboard strokes
        System.out.println("Please enter a 1903-2009 World Series baseball team you want stats for.");//asks user for input
        String team = keyboard.nextLine();//accepts user input
        
        team = team.toLowerCase();//converts user input to lowercase
        team = Character.toUpperCase(team.charAt(0)) + team.substring(1);//capitalizes the first letter in user input
        
        int counter = 0;//counter variable
        int year = 1903;//year variable
        
        System.out.println();//empty line
        System.out.printf("%1s%20s%30s\n","Year", "Team", "Win Count" );//formats Titles for output
        System.out.println();//empty line
        
        /**for loop searches file for matches with user input and displays encounters
         */
        for (int i = 0; i < champs.size(); i++){
            if (champs.get(i).contains(team)){
                counter++;//increases counter
                System.out.printf("%1s%30s%20s\n", (year+i), champs.get(i), counter);//output for encounters
                
            }
        }
        
        inputFile.close();//closes the file that was read earlier
        System.out.println();//empty line
        System.out.println(team + " has won (" + counter + ") times in the period of 1903-2009 in World Series Championships.");//output for encounters
        
        
    }
    
}
