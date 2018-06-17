package clockwork;

public class CorrectWriting {

    String word;

    public CorrectWriting(){

    }

    public String minute(int min){



        if (min%10 == 1) {

            word = "минута";
            return word;
        }else if(min%10 > 1 && min%10 < 5){

            word = "минуты";
            return word;

        } else {

            word = "минут";
            return word;

        }


    }


}
