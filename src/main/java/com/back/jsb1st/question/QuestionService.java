package com.back.jsb1st.question;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionService {

    private final QuestionRepository questionRepository; // 생성자 방식 주입

    public List<Question> getList() {
        return this.questionRepository.findAll();
    }
}
