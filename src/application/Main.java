package application;

import entities.Comment;
import entities.Post;

import java.io.Console;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Scanner sc = new Scanner(System.in);

//      Comment c1 = new Comment("Have a nice trip!");
//      Comment c2 = new Comment("Wow that's awesome!");
//      Post p1 = new Post(sdf.parse("18/04/2025 22:05:12"), "Traveling to New Zeland", "I'm going to visit this wonderful country!", 23);
//
//      p1.AddComment(c1);
//      p1.AddComment(c2);
//
//      Comment c3 = new Comment("Good Night");
//      Comment c4 = new Comment("May the force be with you");
//      Post p2 = new Post(sdf.parse("21/04/2025 23:14:19"), "Good Night guys", "See you tomorrow", 5);
//
//      p2.AddComment(c3);
//      p2.AddComment(c4);
//
//      System.out.println(p1);
//      System.out.println(p2);

        System.out.print("Enter the date: (DD/MM/YYYY): ");
        String dateToday = sc.next();
        System.out.print("Title: ");
        String title = sc.next();
        System.out.print("Message: ");
        String message = sc.next();

        Post newPost = new Post(sdf.parse(dateToday), title, message, 23);

        sc.close();
    }
}