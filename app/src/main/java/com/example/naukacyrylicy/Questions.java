package com.example.naukacyrylicy;

public class Questions {

    public String[] questions1 = {
            "Odpowiednik 'w' w cyrylicy, to:",
            "Odpowiednik dźwięku 'jo' w cyrylicy, to:",
            "Odpowiednik 'ż' w cyrylicy, to:",
            "Odpowiednik 'n' w cyrylicy, to:",
            "Odpowiednik 'z' w cyrylicy, to:",
            "Znak 'Й й' w cyrylicy odpowiada polskiemu:",
            "Znak 'Л л' w cyrylicy odpowiada polskiemu:",
            "Znak 'Б б' w cyrylicy odpowiada polskiemu:",
            "Znak 'Г г' w cyrylicy odpowiada polskiemu:",
            "Znak 'М м' w cyrylicy odpowiada polskiemu:"
    };

    private String[][] choices1 = {
            {"А", "В", "Г", "Ж"},
            {"Г", "Д", "Е", "Ё"},
            {"Ж", "Б", "Г", "Й"},
            {"Л", "М", "Н", "И"},
            {"З", "Ж", "Д", "Г"},
            {"N", "J", "Ń", "G"},
            {"T", "I", "A", "L/Ł"},
            {"Ż", "B", "W", "D"},
            {"W", "D", "jo", "G"},
            {"M", "Z", "Ż", "je"}
    };

    private String[] answers1 = {
            "В", "Ё", "Ж", "Н", "З", "J", "L/Ł", "B", "G", "M"
    };

    public String[] questions2 = {
            "Odpowiednik 'u' w cyrylicy, to:",
            "Odpowiednik 'c' w cyrylicy, to:",
            "Znak miękki w cyrylicy, to:",
            "Odpowiednik 'sz' w cyrylicy, to:",
            "Odpowiednik 'f' w cyrylicy, to:",
            "Znak 'Х х' w cyrylicy odpowiada polskiemu:",
            "Znak 'П n' w cyrylicy odpowiada polskiemu:",
            "Znak 'Я я' w cyrylicy odpowiada polskiemu:",
            "Znak 'Ы ы' w cyrylicy odpowiada polskiemu:",
            "Znak 'Р р' w cyrylicy odpowiada polskiemu:"
    };

    private String[][] choices2 = {
            {"Х", "У", "Ц", "Ч"},
            {"Э", "С", "Х", "Ц"},
            {"Ь", "Б", "Ъ", "Ч"},
            {"Ц", "Щ", "Ю", "Ш"},
            {"Х", "Ю", "Ф", "Я"},
            {"Ch", "Cz", "C", "Sz"},
            {"N", "znak twardy", "P", "R"},
            {"jo", "P", "ja", "R"},
            {"Cz", "znak miękki", "B", "Y"},
            {"R", "P", "C", "F"}
    };

    private String[] answers2 = {
            "У", "Ц", "Ь", "Ш", "Ф", "Ch", "P", "ja", "Y", "R"
    };

    public String[] questions3 = {
            ""
    };

    public String getQuestion(int question_no, int quiz_no){
        switch (quiz_no) {
            case 1:
                return questions1[question_no];
            case 2:
                return questions2[question_no];
            default:
                return "";
        }
    }


    public String getChoice1(int choice_selected, int quiz_no){
        switch (quiz_no){
            case 1:
                return choices1[choice_selected][0];
            case 2:
                return choices2[choice_selected][0];
            default:
                return "";
        }
    }

    public String getChoice2(int choice_selected, int quiz_no){
        switch (quiz_no) {
            case 1:
                return choices1[choice_selected][1];
            case 2:
                return choices2[choice_selected][1];
            default:
                return "";
        }
    }

    public String getChoice3(int choice_selected, int quiz_no){
            switch (quiz_no) {
                case 1:
                    return choices1[choice_selected][2];
                case 2:
                    return choices2[choice_selected][2];
                default:
                    return "";
            }
    }

    public String getChoice4(int choice_selected, int quiz_no){
                switch (quiz_no) {
                    case 1:
                        return choices1[choice_selected][3];
                    case 2:
                        return choices2[choice_selected][3];
                    default:
                        return "";
                }
    }

    public String getCorrectAnswer(int answer, int quiz_no){
        switch (quiz_no) {
            case 1:
                return answers1[answer];
            case 2:
                return answers2[answer];
            default:
                return "";
        }
    }
}
