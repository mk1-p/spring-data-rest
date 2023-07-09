package com.example.rest.domain.members;


import com.example.rest.domain.boards.Board;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
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


}
