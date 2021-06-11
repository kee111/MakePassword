import java.util.Random;
import java.util.Scanner;

public class PasswordMaker {
    public static void main(String[] args) {
        System.out.print("パスワードの長さを入力してください:");

        Scanner sc = new Scanner(System.in);
        int passwordLength = sc.nextInt();
        System.out.println("生成されたパスワードは" + passmaker(passwordLength) + "です");
        sc.close();

    }

    static String passmaker(int hoge) {
        Random r = new Random();
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String _password = ""; // returnする予定のパスワードを入れる変数
        Boolean _HaveNumber = false; // 数字が含まれているかのフラグ
        for (int i = 0; i < hoge; i++) {
            char _insertChar = alphabet.charAt(r.nextInt(alphabet.length())); // 入れる予定の文字
            // charという文字を一度数字にして、それが数字だったらフラグをオンにする。
            if (_insertChar > '0' && _insertChar < '9') {
                _HaveNumber = true;
            }
            _password = _password + _insertChar;
        }

        // もし数字が含まれてなかったら
        if (_HaveNumber == false) {
            _password = addNumber(_password);
        }

        return _password;
    }

    // 文字を受け取って最後の文字を適当な数字に置き換える関数
    static String addNumber(String _NoNumberPassword) {
        Random r = new Random();
        char[] c = _NoNumberPassword.toCharArray();
        c[c.length - 1] = (char) (r.nextInt(10) + '0');
        return new String(c);
    }
}