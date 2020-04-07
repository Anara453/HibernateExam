package kg.entiti;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "posts")
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "post")
    private String post;
    @JoinColumn(name = "likes")
    @OneToMany
    private List<Likes> likes;
    public Posts(User user2, String post1, String post2, String post3, String post4) {
    }

    public Posts(User user1, String s, String post, String post3) {
        this.post = post;
    }

    public Posts(User user, String post) {
        this.post = post;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
