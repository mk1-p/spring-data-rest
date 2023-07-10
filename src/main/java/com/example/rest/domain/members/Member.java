package com.example.rest.domain.members;


import com.example.rest.domain.boards.Board;
import com.example.rest.domain.comments.Comment;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@Getter
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 10)
    private String name;
    @Column(name = "email", length = 50)
    private String email;

    @OneToMany(mappedBy = "member")
    private List<Board> boards;
    @OneToMany(mappedBy = "member")
    private List<Comment> comments;

}
