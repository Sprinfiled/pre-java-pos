package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //ʵ����ϰҪ�󣬲���д���д���
        Map<String, Integer> counts = new HashMap<>();

        // ���������б�ͳ��ÿ��Ԫ�صĳ��ִ���
        for (String element : collection1) {
            char firstChar = element.charAt(0);
            int count = 1;
            int numberEndIndex = -1;

            // �ж��Ƿ��к�׺��ʾ���ִ���
            for (int i = 1; i < element.length(); i++) {
                char ch = element.charAt(i);
                if (ch == '[') {
                    numberEndIndex = i;
                    break;
                }
            }

            if (numberEndIndex != -1) {
                // ������׺�е�����
                count = Integer.parseInt(element.substring(numberEndIndex + 1, element.length() - 1));
                firstChar = element.charAt(0);
            }

            // ���¼���Map
            String key = String.valueOf(firstChar);
            counts.put(key, counts.getOrDefault(key, 0) + count);
        }

        return counts;
    }
}
