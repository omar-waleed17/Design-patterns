package FlyWeight;

import java.util.HashMap;

public class TextElementCreator {

    private static HashMap<String, TextElement> textElements = new HashMap<String, TextElement>();

    public  static TextElement creatingTextElement( String type) {
        if(textElements.containsKey(type))
        {
            return textElements.get(type);
        }
        else

        {
            TextElement testy=null;
            if(type.equalsIgnoreCase("Word")) {
                testy = new Word();
                textElements.put(type, testy);

            }
            else if(type.equalsIgnoreCase("Paragraph")) {
                testy = new Paragraph();
                textElements.put(type, testy);
            }
            else if(type.equalsIgnoreCase("Character")) {
                testy = new Character();
                textElements.put(type, testy);

            }
            return testy;

        }

    }

}
