package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //ʵ����ϰҪ�󣬲���д���д���
        //�����ַ����б�
        List<String> result= new ArrayList<>();
        //ѭ��ɸvalueװ���ַ����б�result
        for (String a:collection1){
            //collecttion2.value��ֵ�ҵ���collectains.a��
            if (collection2.get("value").contains(a)&&collection2.containsKey("value")){
                result.add(a);
            }
        }
                return result;
    }
}
