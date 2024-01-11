package com.example.board2.dao;

import com.example.board2.dto.BoardDTO;
import com.example.board2.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BoardDAO {
    private final SqlSessionFactory sessionFactory;

    public List<BoardDTO> selectBoards(Integer boardId) {
        try (SqlSession session = sessionFactory.openSession()) {
            BoardMapper boardMapper = session.getMapper(BoardMapper.class);
            return boardMapper.selectBoards(boardId);
        }
    }
}
