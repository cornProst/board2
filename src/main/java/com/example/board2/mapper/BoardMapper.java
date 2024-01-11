package com.example.board2.mapper;

import com.example.board2.dto.BoardDTO;

import java.util.List;

public interface BoardMapper {
    List<BoardDTO> selectBoards(Integer boardId);
}
