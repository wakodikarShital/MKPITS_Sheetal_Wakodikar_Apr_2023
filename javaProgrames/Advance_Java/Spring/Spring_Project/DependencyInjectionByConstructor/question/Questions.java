/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class Questions {
    
    private int questionNumber;
    private String name;
    private List<Answer> answers;

    public Questions() {
    }
    

    public Questions(int questionNumber, String name, List<Answer> answers) {
        this.questionNumber = questionNumber;
        this.name = name;
        this.answers = answers;
    }
    
    public void showAnswer(){
        System.out.println(questionNumber +" : "+ name);
        System.out.println("Anwser : ");
        Iterator<Answer> iterat = answers.iterator();
        while(iterat.hasNext()){
            System.out.println(iterat.next());
        }
    }
    
}
