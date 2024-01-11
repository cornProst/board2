package com.example.board2.service;

import com.example.board2.dao.BoardDAO;
import com.example.board2.dto.BoardDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardDAO boardDAO;

    public List<BoardDTO> selectBoards(Integer boardId) {
        return boardDAO.selectBoards(boardId);
    }
}
