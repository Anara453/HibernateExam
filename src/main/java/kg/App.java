package kg;

import kg.db.LikesDB;
import kg.db.PostsDB;
import kg.db.UserDB;
import kg.entiti.Likes;
import kg.entiti.Posts;
import kg.entiti.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        User user1 = new User("@anara");
        User user2 = new User("@jarkynai");
        User user3 = new User("@azat");
        User user4 = new User("@timur");
        User user5 = new User("@aliya");
        //Добавление Юзеров
        UserDB.create(user1);
//        UserDB.create(user2);
//        UserDB.create(user3);
//        UserDB.create(user4);`
//        UserDB.create(user5);

         Posts post1 = new Posts(user1,"post1");
         Posts posts2 = new Posts(user2,"Post1","Post2","Post3");
        Posts posts3 = new Posts(user2,"Post1","Post2","Post3","Post4");
        Posts posts4 = new Posts(user2,"Post1","Post2","Post3");
        Posts posts5  = new Posts(user2,"Post1","Post2","Post3");
         PostsDB.createPost(post1);
         PostsDB.createPost(posts2);
         PostsDB.createPost(posts3);
         PostsDB.createPost(posts4);
         PostsDB.createPost(posts5);

        Likes likes = new Likes(post1,4);
        Likes likes2 = new Likes(posts3,30);
        Likes likes3 = new Likes(posts4,20);
        LikesDB.createLike(likes);
        LikesDB.createLike(likes2);
        LikesDB.createLike(likes3);
    }
}
