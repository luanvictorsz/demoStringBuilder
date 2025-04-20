package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");
        Post p1 = new Post(sdf.parse("18/04/2025 22:05:12"), "Traveling to New Zeland", "I'm going to visit this wonderful country!", 23);

        p1.AddComment(c1);
        p1.AddComment(c2);
    }
}