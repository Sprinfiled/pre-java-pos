package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> resultmap=new HashMap<>();
        //循环
        for (String a:collection1){
            //a在result中 +1
            if(resultmap.containsKey(a)){
                int count =resultmap.get(a);
                resultmap.put(a,count+1);
            }else{
                //a不在 添加a 设为1
                resultmap.put(a,1);
            }
        }

        return resultmap;
    }
}
