package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        //定义字符串列表
        List<String> result= new ArrayList<>();
        //循环筛value装进字符串列表result
        for (String a:collection1){
            //collecttion2.value有值且等于collectains.a的
            if (collection2.get("value").contains(a)&&collection2.containsKey("value")){
                result.add(a);
            }
        }
                return result;
    }
}
