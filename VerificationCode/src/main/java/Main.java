import edu.zxie0018.util.RandomVerificationUtil;
import edu.zxie0018.util.ConvertImageUtil;

public class Main {
    public static void main(String[] args) {
        RandomVerificationUtil ru = new RandomVerificationUtil();
        ConvertImageUtil ciu = new ConvertImageUtil();
        ciu.convertToImage(ru.randomVerificationCode(6));
    }
}
