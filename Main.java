class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");
    
    int totalMMs;
    double totalBlueMMs, totalBrownMMs, totalGreenMMs, totalOrangeMMs, totalRedMMs, totalYellowMMs;

    totalMMs = 55 * 11;

    //blue 24%, brown 13%, green 16%, orange 20%, red 13%, and yellow 14%

    totalBlueMMs = totalMMs * .24;
    totalBrownMMs = totalMMs * .13;
    totalGreenMMs = totalMMs * .16;
    totalOrangeMMs = totalMMs * 0.2;
    totalRedMMs = totalMMs * 0.13;
    totalYellowMMs = totalMMs * 0.14;

    System.out.println("Blue: " + totalBlueMMs);
    System.out.println("Brown: " + totalBrownMMs);
    System.out.println("Green: " + totalGreenMMs);
    System.out.println("Orange: " + totalOrangeMMs);
    System.out.println("Red: " + totalRedMMs);
    System.out.println("Yellow: " + totalYellowMMs);

    double sum = totalBlueMMs + totalBrownMMs + totalGreenMMs + totalOrangeMMs + totalRedMMs + totalYellowMMs;

    System.out.println("Sum:" + sum);

    if ((totalBlueMMs < totalBrownMMs) && (totalRedMMs > totalOrangeMMs)){
      System.out.println("Blue under Brown and Red over Orange");
      //Red not over orange so returns false
    }
    
    if (totalBrownMMs >= totalGreenMMs){
      System.out.println("Brown is greater than or equal to Green");
      //Brown is less than green so returns false
    }

    if (sum == (totalBlueMMs + totalBrownMMs + totalGreenMMs + totalOrangeMMs + totalRedMMs + totalYellowMMs)){
      System.out.println("Numbers match");
      //Sum is total number of M&Ms so returns true
    }

  }
}