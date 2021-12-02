package com.company;


public class AnswerMaker
{
    private AnswerMaker() {}

    private static final String[] answers = new String[]
            {
                    "Кажется, это прекрасное решение!",
                    "Да!",
                    "Определенно да!",
                    "Конечно да!",
                    "Уверен в этом на 100%",

                    "Ох не знаю...",
                    "Будущее туманно...",
                    "Выбор всегда за тобой...",
                    "Сегодня звезды молчат...",

                    "Кажется, это не очень хорошее решение.",
                    "Не уверен, что тебе стоит так поступать.",
                    "Как насчет придумать что-то другое?",
                    "Не думаю, что это хорошая идея",
                    "Кажется, звезды против..."
            };

    public static String GetAnswer()
    {
        int answerNumber = GetRandomNumber(0, answers.length);
        return answers[answerNumber];
    }

    private static int GetRandomNumber(int min, int max)
    {
        return (int) ((Math.random() * ( max - min )) + min);
    }
}
