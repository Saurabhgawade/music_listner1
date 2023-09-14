import application.Album;
import application.Song;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Welcome to listnify worls!");

        Album newalbum1=new Album("New Hindi Song","honey singh");
        newalbum1.addnewsongtoalbum("apni basti",4.05);
        newalbum1.addnewsongtoalbum("majja he",3.15);
        newalbum1.addnewsongtoalbum("boss",12.4);

        Album newalbum2=new Album("old hindi song","kumar sanu");
        newalbum2.addnewsongtoalbum("deewana",5.04);
        newalbum2.addnewsongtoalbum("masti",4.12);
        newalbum2.addnewsongtoalbum("zumka",12.00);

        List<Song>playlist=new ArrayList<>();
        newalbum1.addsongtoplaylist(1,playlist);
        newalbum1.addsongtoplaylist(2,playlist);

        newalbum2.addsongtoplaylist("deewana",playlist);

        menu();


        performoperation(playlist);


    }
    public static void performoperation(List<Song>playlist){
        System.out.println("select your choice");
        Scanner sc=new Scanner(System.in);


        int index=0;
        System.out.println("Now playing song"+playlist.get(index).toString());
        boolean ans=true;
        while(ans) {
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                    if (index < playlist.size() - 1)
                        index++;
                    else
                        index = 0;
                    System.out.println(playlist.get(index).toString());
                    break;

                case 2:
                    if (index == 0)
                        index = 0;
                    else
                        index--;
                    System.out.println(playlist.get(index).toString());
                    break;

                case 3:
                    System.out.println(playlist.get(index).toString());
                    break;

                case 4:
                    menu();
                    break;

                case 5:
                    playlist.remove(index);
                    break;

                case 6:
                    Collections.shuffle(playlist);
                    break;

                case 7:
                    for(Song song:playlist){
                        System.out.println(song.toString());
                    }
                    break;

                case 8:
                    ans = false;
                    break;

            }
        }

    }
    public static void menu(){
        System.out.println("Welcome Back to the world of Music");

        System.out.println("1.next song");
        System.out.println("2.previous song");
        System.out.println("3.current song");
        System.out.println("4.display menu");
        System.out.println("5.delete current song");
        System.out.println("6.shuffle song");
        System.out.println("7.show all song list");
        System.out.println("8.Exit");


    }
}