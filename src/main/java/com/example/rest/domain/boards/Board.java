package com.example.rest.domain.boards;


import com.example.rest.domain.comments.Comment;
import com.example.rest.domain.members.Member;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String title;
    @Column
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id",referencedColumnName = "id")
    private Member member;

    @OneToMany(mappedBy = "board")
    private List<Comment> comments;

}
