public class MysteryFunction_Improved {
    public static void main(String[] args) {
        int[] data = {12,4,6,9,2,295, 10001, 1234, 8, 654};
        for(int i = 0 ; i < data.length ; i++){
            data[i] = transform(data[i]);
        }

        for(int value: data){
            System.out.println(value);
        }
    }

    public static int transform(int input){
        String inputToString = String.valueOf(input);
        int index = 0;
        int result = 0;
        while(index < inputToString.length()){
            String currentChar = inputToString.substring(index, index + 1);
            result += Integer.parseInt(currentChar) * Integer.parseInt(currentChar);
            index++;
        }
        return result;
    }
}
