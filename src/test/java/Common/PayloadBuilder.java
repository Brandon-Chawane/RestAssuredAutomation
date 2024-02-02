package Common;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PayloadBuilder {

    public static JSONObject createEmployeeObject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Brandon");
        jsonObject.put("job","Soa");


        return jsonObject;

    }
}
