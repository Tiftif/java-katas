public class FoundMin {

    // TODO
  public int findMinInArray(int[] intArray){
    int min = intArray[0];

    for(int i = 1; i < intArray.length; i++){
      if(min > intArray[i]){
        min = intArray[i];
      }
    }

    return min;
  }
}
