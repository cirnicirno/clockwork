package clockwork;

public class CorrectWriting {

    String word;

    public CorrectWriting(){

    }

    public String minute(int min){



        if (min%10 == 1 && min!=11) {

            word = "минута";
            return word;
        }else if(min > 11 && min < 15){

            word = "минут";
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
