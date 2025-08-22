package org.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Answer {
    @Id
    private int answ_id;

    @Column(name = "answer_id")
    private String answer;

    @OneToOne
    private question question;

    public Answer() {
    }

    public int getAnsw_id() {
        return answ_id;
    }

    public void setAnsw_id(int answ_id) {
        this.answ_id = answ_id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public org.example.question getQuestion() {
        return question;
    }

    public void setQuestion(org.example.question question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "answ_id=" + answ_id +
                ", answer='" + answer + '\'' +
                ", question=" + question +
                '}';
    }
}


