public class stringCompression {
    static int compress(char[] chars) {
        int n = chars.length;
        int idx = 0, i =0;
        while(i<n) {
            char currCharacter = chars[i];
            int count = 0;
           while (i < n && chars[i] == currCharacter) {
                count++;
                i++;
            }
            chars[idx] = currCharacter;
            idx++;

            if(count > 1) {
                for(char ch : String.valueOf(count).toCharArray()) {
                    chars[idx] = ch;
                    idx++;
                }
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b','b', 'c','c','c'};
        System.out.println(compress(chars));
    }
}
