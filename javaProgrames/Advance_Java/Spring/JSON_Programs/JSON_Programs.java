import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class JSON_Programs {

    public  void Json_Example1() {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name","Shital");
        jsonObject.put("rollNumber" , 45);
        jsonObject.put("branch","ETC");
        System.out.println(jsonObject);

    }

    public void encode(){
        List list = new ArrayList<>();
        list.add("Shital");
        list.add(27);
        list.add(51);
        String jsonText = JSONValue.toJSONString(list);
        System.out.println(jsonText);

    }


    public  void decode(){


        String value="{\"name\":\"sonoo\",\"salary\":600000.0,\"age\":27}";
        Object object = JSONValue.parse(value);
        JSONObject jsonObject = (JSONObject) object;

        String name = (String) jsonObject.get("name");
        double salary = (Double) jsonObject.get("salary");
        long age = (Long) jsonObject.get("age");
        System.out.println(name+" "+salary+" "+age);

    }

}
