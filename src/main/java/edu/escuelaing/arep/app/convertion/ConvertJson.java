package edu.escuelaing.arep.app.convertion;


import org.json.JSONObject;

public class ConvertJson {
    JSONObject myObjectJson ;

    public ConvertJson(){
        myObjectJson = new JSONObject();
    }

    public JSONObject stringToJSON(String op,double input,double number){
        myObjectJson.put("operation", op);
        myObjectJson.put("input", input);
        myObjectJson.put("output", number);

        System.out.println(myObjectJson);
        return myObjectJson;

    }

}
