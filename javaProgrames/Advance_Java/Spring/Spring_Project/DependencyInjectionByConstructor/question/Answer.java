/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question;

/**
 *
 * @author LENOVO
 */
public class Answer {
    
    private String answerNumber;
    private String answer;

    public Answer() {
    }

    public Answer(String answerNumber, String answer) {
        this.answerNumber = answerNumber;
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Answer{" + "answerNumber=" + answerNumber + ", answer=" + answer + '}';
    }
    
    
    
}
