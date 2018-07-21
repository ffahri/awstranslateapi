import com.amazonaws.services.translate.AmazonTranslate;
import com.amazonaws.services.translate.AmazonTranslateClient;
import com.amazonaws.services.translate.model.TranslateTextRequest;
import com.amazonaws.services.translate.model.TranslateTextResult;


public class TranslateApp {

    public static void main(String[] args) {
        AmazonTranslate translate = AmazonTranslateClient.builder()
                .withRegion("us-west-2")
                .build();

        TranslateTextRequest request = new TranslateTextRequest()
                .withText("Greetings from webischia :)")
                .withSourceLanguageCode("en")
                .withTargetLanguageCode("it");
        TranslateTextResult result  = translate.translateText(request);
        System.out.println(result.getTranslatedText());
    }
}
