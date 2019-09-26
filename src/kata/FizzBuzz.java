public class FizzBuzz {

    public String getWord(int multiple){
      String result = null;
      if (multiple % 3 == 0 && multiple % 5 == 0){
        result = "FizzBuzz";
      } else if(multiple % 5 == 0){
        result = "Buzz";
      } else if (multiple % 3 == 0) {
        result = "Fizz";
      } else{
        result = String.valueOf(multiple);
      }
      return result;
    }
}
