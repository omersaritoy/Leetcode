class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u',
                'A', 'E', 'I', 'O', 'U');


        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {

            if (!vowels.contains(arr[left])) {
                left++;
                continue;  // Sesli harf değilse sağa kaydırmaya devam et
            }

            if (!vowels.contains(arr[right])) {
                right--;
                continue;  // Sesli harf değilse sola kaydırmaya devam et

            }
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        return new String(arr);

    }
}