import java.util.*;
import org.json.*;
    public class Principal {
        public static void main(String args [])
        {
            String examplexml =
                    "<?xml version=\"1.0\" ?><root><test attribute=\"Name\">Bill Gates</test><test attribute=\"RollNumber\">01</test></root>";
            System.out.println(examplexml);
            System.out.println("JSON IS");
            try
            {
                JSONObject json = XML.toJSONObject(examplexml);
                String jsonString = json.toString(4);
                System.out.println(jsonString);
            }catch(Exception e){}
        }
        }
    }

