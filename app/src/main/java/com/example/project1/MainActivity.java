package com.example.project1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_NUMBER_LEVEL = "Levels";
    private Button mButton1;
    private Button mButton2;
    private Button mButton3;
    private Button mButton4;
    private Button mButtonNextquestion;
    private Button mButtonBackquestion;
    private Button mButtonBack;
    private Button mButtonRuLang;
    private TextView mQuestionText;
    private TextView mNumberQuestion;
    private TextView mTextAttempts;
    private ImageView mImageFlowers;
    private int attempt;
    private int numberLevel;
    Toast mTextRight;
    Toast mTextWrong;
    Toast mTextNextQuest;
    Toast mTextBackQuest;
    private int currentIndex = 0;
    private Question[] QuestionSpaceList = new Question[]
            {
                    new Question(R.string.Question_Space_1_ru, 1, R.string.Question_Space_1_answer1_ru, R.string.Question_Space_1_answer2_ru, R.string.Question_Space_1_answer3_ru, R.string.Question_Space_1_answer4_ru),
                    new Question(R.string.Question_Space_2_ru, 2, R.string.Question_Space_2_answer1_ru, R.string.Question_Space_2_answer2_ru, R.string.Question_Space_2_answer3_ru, R.string.Question_Space_2_answer4_ru),
                    new Question(R.string.Question_Space_3_ru, 4, R.string.Question_Space_3_answer1_ru, R.string.Question_Space_3_answer2_ru, R.string.Question_Space_3_answer3_ru, R.string.Question_Space_3_answer4_ru),
                    new Question(R.string.Question_Space_4_ru, 1, R.string.Question_Space_4_answer1_ru, R.string.Question_Space_4_answer2_ru, R.string.Question_Space_4_answer3_ru, R.string.Question_Space_4_answer4_ru),
                    new Question(R.string.Question_Space_5_ru, 1, R.string.Question_Space_5_answer1_ru, R.string.Question_Space_5_answer2_ru, R.string.Question_Space_5_answer3_ru, R.string.Question_Space_5_answer4_ru)
            };
    private Question[] QuestionOceanList = new Question[]
            {
                    new Question(R.string.Question_Ocean_1_ru, 3, R.string.Question_Ocean_1_answer1_ru, R.string.Question_Ocean_1_answer2_ru, R.string.Question_Ocean_1_answer3_ru, R.string.Question_Ocean_1_answer4_ru),
                    new Question(R.string.Question_Ocean_2_ru, 1, R.string.Question_Ocean_2_answer1_ru, R.string.Question_Ocean_2_answer2_ru, R.string.Question_Ocean_2_answer3_ru, R.string.Question_Ocean_2_answer4_ru),
                    new Question(R.string.Question_Ocean_3_ru, 2, R.string.Question_Ocean_3_answer1_ru, R.string.Question_Ocean_3_answer2_ru, R.string.Question_Ocean_3_answer3_ru, R.string.Question_Ocean_3_answer4_ru),
                    new Question(R.string.Question_Ocean_4_ru, 4, R.string.Question_Ocean_4_answer1_ru, R.string.Question_Ocean_4_answer2_ru, R.string.Question_Ocean_4_answer3_ru, R.string.Question_Ocean_4_answer4_ru),
                    new Question(R.string.Question_Ocean_5_ru, 3, R.string.Question_Ocean_5_answer1_ru, R.string.Question_Ocean_5_answer2_ru, R.string.Question_Ocean_5_answer3_ru, R.string.Question_Ocean_5_answer4_ru)
            };
    private Question[] QuestionAnimalsList = new Question[]
            {
                    new Question(R.string.Question_Animals_1_ru, 3, R.string.Question_Animals_1_answer1_ru, R.string.Question_Animals_1_answer2_ru, R.string.Question_Animals_1_answer3_ru, R.string.Question_Animals_1_answer4_ru),
                    new Question(R.string.Question_Animals_2_ru, 4, R.string.Question_Animals_2_answer1_ru, R.string.Question_Animals_2_answer2_ru, R.string.Question_Animals_2_answer3_ru, R.string.Question_Animals_2_answer4_ru),
                    new Question(R.string.Question_Animals_3_ru, 2, R.string.Question_Animals_3_answer1_ru, R.string.Question_Animals_3_answer2_ru, R.string.Question_Animals_3_answer3_ru, R.string.Question_Animals_3_answer4_ru),
                    new Question(R.string.Question_Animals_4_ru, 4, R.string.Question_Animals_4_answer1_ru, R.string.Question_Animals_4_answer2_ru, R.string.Question_Animals_4_answer3_ru, R.string.Question_Animals_4_answer4_ru),
                    new Question(R.string.Question_Animals_5_ru, 2, R.string.Question_Animals_5_answer1_ru, R.string.Question_Animals_5_answer2_ru, R.string.Question_Animals_5_answer3_ru, R.string.Question_Animals_5_answer4_ru)
            };
    private Question[] QuestionPlantsList = new Question[]
            {
                    new Question(R.string.Question_Plants_1_ru, 1, R.string.Question_Plants_1_answer1_ru, R.string.Question_Plants_1_answer2_ru, R.string.Question_Plants_1_answer3_ru, R.string.Question_Plants_1_answer4_ru),
                    new Question(R.string.Question_Plants_2_ru, 2, R.string.Question_Plants_2_answer1_ru, R.string.Question_Plants_2_answer2_ru, R.string.Question_Plants_2_answer3_ru, R.string.Question_Plants_2_answer4_ru),
                    new Question(R.string.Question_Plants_3_ru, 4, R.string.Question_Plants_3_answer1_ru, R.string.Question_Plants_3_answer2_ru, R.string.Question_Plants_3_answer3_ru, R.string.Question_Plants_3_answer4_ru),
                    new Question(R.string.Question_Plants_4_ru, 3, R.string.Question_Plants_4_answer1_ru, R.string.Question_Plants_4_answer2_ru, R.string.Question_Plants_4_answer3_ru, R.string.Question_Plants_4_answer4_ru),
                    new Question(R.string.Question_Plants_5_ru, 1, R.string.Question_Plants_5_answer1_ru, R.string.Question_Plants_5_answer2_ru, R.string.Question_Plants_5_answer3_ru, R.string.Question_Plants_5_answer4_ru)
            };
    private Question[] QuestionProgrammingList = new Question[]
            {
                    new Question(R.string.Question_Programming_1_ru, 4, R.string.Question_Programming_1_answer1_ru, R.string.Question_Programming_1_answer2_ru, R.string.Question_Programming_1_answer3_ru, R.string.Question_Programming_1_answer4_ru),
                    new Question(R.string.Question_Programming_2_ru, 2, R.string.Question_Programming_2_answer1_ru, R.string.Question_Programming_2_answer2_ru, R.string.Question_Programming_2_answer3_ru, R.string.Question_Programming_2_answer4_ru),
                    new Question(R.string.Question_Programming_3_ru, 1, R.string.Question_Programming_3_answer1_ru, R.string.Question_Programming_3_answer2_ru, R.string.Question_Programming_3_answer3_ru, R.string.Question_Programming_3_answer4_ru),
                    new Question(R.string.Question_Programming_4_ru, 2, R.string.Question_Programming_4_answer1_ru, R.string.Question_Programming_4_answer2_ru, R.string.Question_Programming_4_answer3_ru, R.string.Question_Programming_4_answer4_ru),
                    new Question(R.string.Question_Programming_5_ru, 3, R.string.Question_Programming_5_answer1_ru, R.string.Question_Programming_5_answer2_ru, R.string.Question_Programming_5_answer3_ru, R.string.Question_Programming_5_answer4_ru)
            };
    /*
    private Question[] QuestionPlantsList = new Question[]
            {
                    new Question(R.string.Question__1_ru, 3, R.string.Question__1_answer1_ru, R.string.Question__1_answer2_ru, R.string.Question__1_answer3_ru, R.string.Question__1_answer4_ru),
                    new Question(R.string.Question__2_ru, 4, R.string.Question__2_answer1_ru, R.string.Question__2_answer2_ru, R.string.Question__2_answer3_ru, R.string.Question__2_answer4_ru),
                    new Question(R.string.Question__3_ru, 1, R.string.Question__3_answer1_ru, R.string.Question__3_answer2_ru, R.string.Question__3_answer3_ru, R.string.Question__3_answer4_ru),
                    new Question(R.string.Question__4_ru, 1, R.string.Question__4_answer1_ru, R.string.Question__4_answer2_ru, R.string.Question__4_answer3_ru, R.string.Question__4_answer4_ru),
                    new Question(R.string.Question__5_ru, 1, R.string.Question__5_answer1_ru, R.string.Question__5_answer2_ru, R.string.Question__5_answer3_ru, R.string.Question__5_answer4_ru)
            };
            */

    private Question[] QuestionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberLevel = getIntent().getIntExtra(EXTRA_NUMBER_LEVEL, 0);
        switch(numberLevel)
        {
            case 1:QuestionList = QuestionSpaceList; break;
            case 2:QuestionList = QuestionOceanList; break;
            case 3:QuestionList = QuestionAnimalsList; break;
            case 4:QuestionList = QuestionPlantsList; break;
            case 5:QuestionList = QuestionProgrammingList; break;
        }

        mImageFlowers = findViewById(R.id.ImageFlowersId);
        if (numberLevel == 5)
        {
            mImageFlowers.setImageResource(R.drawable.flowers);
            mImageFlowers.setMaxHeight(126);
        }
        else{
            mImageFlowers.setImageResource(0000000);
            mImageFlowers.setMaxHeight(1);
        }

        mQuestionText = findViewById(R.id.QuestionText);
        mTextAttempts = findViewById(R.id.Attempts);
        mNumberQuestion = findViewById(R.id.NumberQuestion);
        mNumberQuestion.setText(getString(R.string.QuestionNum_ru) + " " + (currentIndex+1) + "");
        mButton1 = findViewById(R.id.Button1);// Находим кнопку по ее id
        mButton2 = findViewById(R.id.Button2); // Находим кнопку по ее id
        mButton3 = findViewById(R.id.Button3);// Находим кнопку по ее id
        mButton4 = findViewById(R.id.Button4); // Находим кнопку по ее id
        mButtonBack = findViewById(R.id.ButtonBack);
        updateQuestion();
        attempt = 3;
        mTextAttempts.setText(getString(R.string.Attempts_ru) + " " + attempt);
        mButtonBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainMenu.class);
                startActivity(intent);
            }
        });
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(1);
            }
        });
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(2);
            }
        });
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(3);
            }
        });
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(4);
            }
        });
        // Кнопка "Следущий вопрос"
        mButtonNextquestion = findViewById(R.id.ButtonNextQuestion); // Находим кнопку по ее id
        mButtonNextquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentIndex<QuestionList.length-1) {
                    currentIndex = (currentIndex + 1) % QuestionList.length;
                    updateQuestion();
                    mTextNextQuest = Toast.makeText(MainActivity.this, "Следущий вопрос", Toast.LENGTH_SHORT);
                    mTextNextQuest.setGravity(Gravity.TOP, 0, 50);
                    mTextNextQuest.show();
                }
                else
                {
                    mTextNextQuest = Toast.makeText(MainActivity.this, "Вопросы закончились", Toast.LENGTH_SHORT);
                    mTextNextQuest.setGravity(Gravity.TOP, 0, 50);
                    mTextNextQuest.show();
                }
            }
        });
        mButtonBackquestion = findViewById(R.id.ButtonBackQuestion); // Находим кнопку по ее id
        mButtonBackquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentIndex>0) {
                    currentIndex = (currentIndex - 1) % QuestionList.length;
                    updateQuestion();
                    mTextNextQuest = Toast.makeText(MainActivity.this, "Предыдущий вопрос", Toast.LENGTH_SHORT);
                    mTextNextQuest.setGravity(Gravity.TOP, 0, 50);
                    mTextNextQuest.show();
                }
                else
                {
                    mTextNextQuest = Toast.makeText(MainActivity.this, "Это первый вопрос!", Toast.LENGTH_SHORT);
                    mTextNextQuest.setGravity(Gravity.TOP, 0, 50);
                    mTextNextQuest.show();
                }
            }
        });
    }
    // Меняем вопросы
    private void updateQuestion()
    {
        int question = QuestionList[currentIndex].getTextResId();
        int answer1 = QuestionList[currentIndex].getTextAnswerId1();
        int answer2 = QuestionList[currentIndex].getTextAnswerId2();
        int answer3 = QuestionList[currentIndex].getTextAnswerId3();
        int answer4 = QuestionList[currentIndex].getTextAnswerId4();
        mNumberQuestion.setText(getString(R.string.QuestionNum_ru) + " " + (currentIndex+1) + "");
        mButton1.setText(answer1);
        mButton2.setText(answer2);
        mButton3.setText(answer3);
        mButton4.setText(answer4);
        mQuestionText.setText(question);
    }
    // Проверка ответа на вопрос
    private void checkAnswer(int whatPressed)
    {
        if(QuestionList[currentIndex].isAnswerTrue() == whatPressed)
        {
            System.out.println(currentIndex);
            if(currentIndex < QuestionList.length-1)
            {
                currentIndex++;
                updateQuestion();
            }
            else
                {
                Intent intent = new Intent(MainActivity.this, WinActivity.class);
                startActivity(intent);
            }

            mTextRight = Toast.makeText(MainActivity.this, R.string.Right, Toast.LENGTH_SHORT);
            mTextRight.setGravity(Gravity.TOP, 0, 50);
            mTextRight.show();
        }
        else if(QuestionList[currentIndex].isAnswerTrue() != whatPressed)
        {
            if(currentIndex < QuestionList.length && attempt > 0)
            {
                attempt-=1;
                updateQuestion();
            }
            if(attempt <= 0)
            {
                currentIndex=(0)%QuestionList.length;
                attempt=3;
                updateQuestion();
            }
            mTextAttempts.setText(getString(R.string.Attempts_ru) + " " + attempt);
            mTextWrong = Toast.makeText(MainActivity.this, R.string.Wrong, Toast.LENGTH_SHORT);
            mTextWrong.setGravity(Gravity.TOP, 0, 50);
            mTextWrong.show();
        }
    }

    public static Intent newIntent(Context packageContext, int numberLevel)
    {
        Intent intent = new Intent(packageContext, MainActivity.class);
        intent.putExtra(EXTRA_NUMBER_LEVEL, numberLevel);
        return intent;
    }

    @Override
    public void onBackPressed() {
        openQuitDialog();
    }

    private void openQuitDialog()
    {
        AlertDialog.Builder quitDialog = new AlertDialog.Builder(MainActivity.this);
        quitDialog.setTitle("Выход: Не, ну нормально же общались.");
        quitDialog.setPositiveButton("Выход", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finishAffinity();
            }
        });
        quitDialog.setNegativeButton("Остаться", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        quitDialog.show();
    }
}