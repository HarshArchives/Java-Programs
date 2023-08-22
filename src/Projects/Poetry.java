package Projects;

import java.util.Random;
import java.util.Scanner;

public class Poetry {
    public static void main(String[] args) {
        String[] romanticSher = {
                "दिल की धड़कनों में तेरा नाम लिखा है,",
                "यादों के सहारे तेरा दर्द उबरता है,",
                "बेवजह ही तू चाहत का रिश्ता निभाता है,",
                "मोहब्बत की राहों में दिल को बहलाता है।"
        };

        String[] natureSher = {
                "पहाड़ों की चाओं में बसा है ख़ुशी का गीत,",
                "हवाओं में मिलती है शांति की बीत,",
                "प्रकृति की ख़ूबसूरती से रंगी है ज़िन्दगी,",
                "ये नज़ारे हैं अनमोल, ये है हमारी कहानी।"
        };

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("शायरी का विषय चुनें:");
        System.out.println("1. रोमांटिक");
        System.out.println("2. प्राकृतिक");
        int choice = scanner.nextInt();

        int numberOfCouplets;
        if (choice == 1 || choice == 2) {
            System.out.print("कितनी शेरों की शायरी चाहिए? ");
            numberOfCouplets = scanner.nextInt();
        } else {
            System.out.println("अमान्य चयन। डिफ़ॉल्ट में 1 शेर दिखाया जाएगा।");
            choice = 1; // Default to romantic shayari
            numberOfCouplets = 1;
        }

        String[] selectedSherArray = (choice == 1) ? romanticSher : natureSher;

        for (int i = 0; i < numberOfCouplets; i++) {
            String selectedSher1 = selectedSherArray[random.nextInt(selectedSherArray.length)];
            String selectedSher2 = selectedSherArray[random.nextInt(selectedSherArray.length)];

            System.out.println(selectedSher1);
            System.out.println(selectedSher2);
            System.out.println();
        }
    }
}
