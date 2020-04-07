package kg.entiti;

import javax.persistence.*;

@Entity
@Table(name = "likes")
public class Likes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "like",nullable = true)
    @JoinColumn(name = "userInst")
    @ManyToOne
    private User user;

    private int like;

    public Likes(Posts post1, int i) {
    }

    public Likes(int like) {
        this.like = like;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }
}
