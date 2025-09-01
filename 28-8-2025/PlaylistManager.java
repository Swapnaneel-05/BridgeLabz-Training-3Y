package BridgeLabz.ProblemStatement;

import java.util.Scanner;

public class PlaylistManager {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean play=true;
        String[] songs={"Midnight Dreams","Electric","Rainbow Dance","Heartbeat Song"};
        
        
        while (play) {
            System.out.println("Enter your choice: ");
            System.out.println("1.Play All Songs.");
            System.out.println("2.Play Song by Index");
            System.out.println("3.Search song by name");
            System.out.println("4.Exit");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("It will play all songs.");
                    for(int i=0;i<songs.length;i++){
                        System.out.println(songs[i]+" ");
                    }
                    break;
                case 2:
                    System.out.println("It will play a song by index.Enter Index: ");
                    int index=sc.nextInt();
                    if(index>songs.length){
                        System.out.println("Invalid Input.");
                    }
                    else{
                        System.out.println("Your Song is: "+songs[index]);
                    }
                    break;
                case 3:
                    System.out.println("It will search a song by name.Please Enter name: ");
                    String input=sc.nextLine();
                    for(int i=0;i<songs.length;i++){
                        if(input.equalsIgnoreCase(songs[i])){
                            System.out.println("Your song is "+songs[i]+" at index "+i);
                        }
                        else{
                            System.out.println("not found");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exits Playlist Manager.");
                    play=false;
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }

            System.out.print("Do you want to continue?(y/n)");
            sc.nextLine();
            String action=sc.nextLine();
            if(action.equals("n")){
                play=false;
            }
        }
    }
}
