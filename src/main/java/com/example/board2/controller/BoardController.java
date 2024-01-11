package com.example.board2.controller;

import com.example.board2.dto.BoardDTO;
import com.example.board2.service.BoardService;
import jakarta.annotation.Nullable;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@Log4j2
public class BoardController {

    private final BoardService boardService;

    @GetMapping("main")
    public String boards(Model model, Integer boardId) {
        List<BoardDTO> boardList = boardService.selectBoards(boardId);
        model.addAttribute("boardList", boardList);

        return "main";
    }
}
