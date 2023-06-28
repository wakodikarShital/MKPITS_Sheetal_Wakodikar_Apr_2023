public class StarPatternService {

    public void patternCalculate(String operator,int number){

        switch (operator){
            case "pattern1":
                UpperDaimondPattern upperDaimondPattern = new UpperDaimondPattern();
                upperDaimondPattern.pattern(number);
                LowerDiamondPattern lowerDiamondPattern = new LowerDiamondPattern();
                lowerDiamondPattern.pattern(number);
                break;



            case "pattern2":
                RightDownwardTrianglePattern rightDownwardTrianglePattern = new RightDownwardTrianglePattern();
                rightDownwardTrianglePattern.pattern(number);
                break;


            case "pattern3":
                ReversedPyramidStarPattern reversedPyramidStarPattern = new ReversedPyramidStarPattern();
                reversedPyramidStarPattern.pattern(number);
                break;



            case "pattern4":
                IncreasingTrianglePattern increasingTrianglePattern = new IncreasingTrianglePattern();
                increasingTrianglePattern.pattern(number);
                DecreasingTrianglePattern decreasingTrianglePattern = new DecreasingTrianglePattern();
                decreasingTrianglePattern.pattern(number);
                break;



            case "pattern5":
                UpwardPyramidStarPattern upwardPyramidStarPattern1 = new UpwardPyramidStarPattern();
                upwardPyramidStarPattern1.pattern(number);
                DownwardPyramidPattern downwardPyramidPattern = new DownwardPyramidPattern();
                downwardPyramidPattern.pattern(number);
                break;



            case "pattern6":
                PyramidNumericPattern pyramidnumericStarPattern =new PyramidNumericPattern();
                pyramidnumericStarPattern.pattern(number);
                ReversedPyramidNumericPattern reversedNumericPattern = new ReversedPyramidNumericPattern();
                reversedNumericPattern.pattern(number);



        }

    }
}
