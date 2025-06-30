package Inflearn.String;

import java.util.Scanner;

/*
한 개의 문자열을 입력받고 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개
,
존재하는지 알아내는 프로그램을 작성하세요 대소문자를 구분하지 않습니다
. .
문자열의 길이는 을 넘지 않습니다
100 .
▣ 입력설명
첫 줄에 문자열이 주어지고 두 번째 줄에 문자가 주어진다
, .
문자열은 영어 알파벳으로만 구성되어 있습니다.
▣ 출력설명
첫 줄에 해당 문자의 개수를 출력한다.
▣ 입력예제 1
Computercooler
c
▣ 출력예제 1
2
 */

public class String_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char c = sc.nextLine().charAt(0);

        str = str.toLowerCase();
        c = Character.toLowerCase(c);

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }

        System.out.println(count);
    }
}
