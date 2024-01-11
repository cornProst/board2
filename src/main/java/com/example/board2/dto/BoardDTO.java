package com.example.board2.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class BoardDTO {
    private Integer boardId;
    private String userId;
    private String userPw;
    private String title;
    private String content;
    private String categoryName;
}
