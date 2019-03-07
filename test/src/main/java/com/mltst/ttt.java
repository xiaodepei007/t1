package com.mltst;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jayway.jsonpath.JsonPath;
import org.apache.commons.lang.StringUtils;

import java.util.List;

public class ttt {
    public  static  void main(String[] a){
        new ttt().t1();
    }


    public void t1(){
        String sjson = "{\"store\": {\"book\": [{\"category\": \"reference\",\"author\": \"Nigel Rees\",\"title\": \"Sayings of the Century\",\"price\": 8.95},{\"category\": \"fiction\",\"author\": \"Evelyn Waugh\",\"title\": \"Sword of Honour\",\"price\": 12.99},{\"category\": \"fiction\",\"author\": \"Herman Melville\",\"title\": \"Moby Dick\",\"isbn\": \"0-553-21311-3\",\"price\": 8.99},{\"category\": \"fiction\",\"author\": \"J. R. R. Tolkien\",\"title\": \"The Lord of the Rings\",\"isbn\": \"0-395-19395-8\",\"price\": 22.99}],\"bicycle\": {\"color\": \"red\",\"price\": 19.95}},\"expensive\": 10}";
//        List<String> authors1 = JsonPath.read(sjson, "$.store.book[*]");
//        JSONObject jsonObject=new JSONObject(sjson)
//       // System.out.println(authors1.toString());
//       // System.out.println(authors1.size());
//        for(int a=0;a<authors1.size();a++){
//            String author= StringUtils.join(authors1,",");
//            System.out.println(author);
//        }

        JSONObject jsonObject=JSON.parseObject(sjson);
        //JSONObject jsona=jsonObject.getJSONObject("book");
       String

    }
}
