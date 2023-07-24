package cn.school.thoughtworks.section2;

import java.util.LinkedHashMap;
import java.util.regex.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        if (collection1 == null) {
            throw new IllegalArgumentException("Input collection cannot be null.");
        }

        // ʹ��HashMap������Ԫ�غͶ�Ӧ�ļ���
        Map<String, Integer> resultMap = new HashMap<>();

        // �����б��е�Ԫ��
        for (String element : collection1) {
            if (element.contains("[")) {
                // �������� "h[3]" ���ַ���
                int countStart = element.lastIndexOf('[') + 1;
                int countEnd = element.lastIndexOf(']');
                int value = Integer.parseInt(element.substring(countStart, countEnd));
                String key = element.substring(0, countStart - 1);

                // �����������Ѿ����ڵ�ǰ������ֵ�ۼӣ�����������ֵ��
                resultMap.put(key, resultMap.getOrDefault(key, 0) + value);
            } else if (element.contains(":")) {
                // �������� "c:8" ���ַ���
                int value = Integer.parseInt(element.split(":")[1]);
                String key = element.split(":")[0];

                // �����������Ѿ����ڵ�ǰ������ֵ�ۼӣ�����������ֵ��
                resultMap.put(key, resultMap.getOrDefault(key, 0) + value);
            } else if (element.contains("-")) {
                // �������� "d-5" ���ַ���
                int value = Integer.parseInt(element.split("-")[1]);
                String key = element.split("-")[0];

                // �����������Ѿ����ڵ�ǰ������ֵ�ۼӣ�����������ֵ��
                resultMap.put(key, resultMap.getOrDefault(key, 0) - value);
            } else {
                // û��ƥ�䵽�����ʽ���ַ������򱣳�ԭ������
                resultMap.put(element, resultMap.getOrDefault(element, 0) + 1);
            }
        }

        // ����ͳ�ƽ����ӳ��
        return resultMap;
    }
    }

