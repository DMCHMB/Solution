import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
������������� � ������������� �����
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));//�������� ��� ��� ���


        String name = reader.readLine();

        int number = Integer.parseInt(name);

        if (number > 0){
            number = number*2;
        } else if (number<0){
            number = number+1;
        } else {
            number = 0;
        }
        System.out.println(number);
    }

}