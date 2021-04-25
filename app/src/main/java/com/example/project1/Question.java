package com.example.project1;

public class Question {
    private int textResId;
    private int answerTrue;
    private int answerId_1;
    private int answerId_2;
    private int answerId_3;
    private int answerId_4;

    public Question(int textResId, int answerTrue, int answerId_1, int answerId_2, int answerId_3, int answerId_4) {
        this.textResId = textResId;
        this.answerTrue = answerTrue;
        if (answerId_1 != 0) {
            this.answerId_1 = answerId_1;
        }
        if (answerId_2 != 0) {
            this.answerId_2 = answerId_2;
        }
        if (answerId_3 != 0) {
            this.answerId_3 = answerId_3;
        }
        if (answerId_4 != 0) {
            this.answerId_4 = answerId_4;
        }
    }

    public int getTextResId() {
        return textResId;
    }
    public int getTextAnswerId1() { return answerId_1; }
    public int getTextAnswerId2() {
        return answerId_2;
    }
    public int getTextAnswerId3() {
        return answerId_3;
    }
    public int getTextAnswerId4() {
        return answerId_4;
    }


    public int isAnswerTrue() {
        return answerTrue;
    }



    public void setTextResId(int textResId) {
        this.textResId = textResId;
    }

    public void setAnswerTrue(int answerTrue) {
        this.answerTrue = answerTrue;
    }
}
