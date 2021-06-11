import java.util.Random;

public class PasswordMaker{
    public static void main(String[]args){
        System.out.println("パスワードの長さを入力してください");
    }

    public String passmaker(int hoge) {
        Random r = new Random();
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String _password = "";
        for (int i = 0; i < hoge; i++) {
            _password = _password + alphabet.charAt(r.nextInt(alphabet.length()));
        }

        return _password;
    }
}