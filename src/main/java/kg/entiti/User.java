package kg.entiti;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Entity
@Table(name = "userInst")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nikname",nullable = false)
    private String nikname;
    @OneToMany
    @JoinColumn(name = "posts")
    private List<Posts> posts;


    public User() {

    }

    public User(String nikname) {
        this.nikname = nikname;
    }

    public User(String nikname, Posts posts) {
        this.nikname = nikname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNikname() {
        return nikname;
    }

    public void setNikname(String nikname) {
        this.nikname = nikname;
    }

}
