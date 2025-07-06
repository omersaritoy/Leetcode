class Solution {
    public List<String> fizzBuzz(int n) {
      List<String> fizzBuzz = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            boolean isFizz = i % 3 == 0;
            boolean isBuzz = i % 5 == 0;
            String result = "";
            if (isFizz)
                result += "Fizz";
            if (isBuzz)
                result += "Buzz";
            if (result.isEmpty())
                result += i;

            fizzBuzz.add(result);
        }
        return fizzBuzz;
    }
}