package org.example;//
//package org.example;
//
//
//import java.util.*;
//import java.util.function.Function;
//import java.util.stream.Collectors;
////Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
////Вывести название каждой планеты и количество его повторений в списке.
//public class test1 {
//
//
//    public static void main(String[] args) {
//
//
//        List<String> list = Arrays.asList(
//                "Земля", "Земля", "Земля", "Земля", "Земля", "Земля", "Земля", "Земля",
//                "Марс", "Марс", "Марс", "Марс", "Марс", "Марс", "Марс", "Марс", "Марс", "Марс", "Марс",
//                "Меркурий", "Меркурий", "Меркурий", "Меркурий", "Меркурий", "Меркурий", "Меркурий",
//                "Меркурий", "Меркурий", "Меркурий", "Меркурий", "Меркурий", "Меркурий", "Меркурий",
//                "Меркурий", "Меркурий", "Меркурий", "Меркурий", "Меркурий", "Меркурий",
//                "Меркурий", "Меркурий", "Меркурий", "Меркурий", "Меркурий", "Меркурий", "Меркурий",
//                "Сатурн", "Сатурн", "Сатурн", "Сатурн",
//                "Уран", "Венера", "Венера", "Юпитер", "Юпитер", "Юпитер", "Юпитер", "Юпитер"
//
//        );
//
//        System.out.println(list);
//
//        String elementToFound = "Земля";
//        String elementToFound2 = "Марс";
//        String elementToFound3 = "Меркурий";
//        String elementToFound4 = "Сатурн";
//        String elementToFound5 = "Уран";
//        String elementToFound6 = "Венера";
//        String elementToFound7 = "Юпитер";
//
//        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(),
//                Collectors.counting()));
//        System.out.println(elementToFound + " :" + "количество  повторений в списке: " + collect.get(elementToFound));
//        System.out.println(elementToFound2 + " :" + "количество  повторений в списке: " + collect.get(elementToFound2));
//        System.out.println(elementToFound3 + " :" + "количество  повторений в списке: " + collect.get(elementToFound3));
//        System.out.println(elementToFound4 + " :" + "количество  повторений в списке: " + collect.get(elementToFound4));
//        System.out.println(elementToFound5 + " :" + "количество  повторений в списке: " + collect.get(elementToFound5));
//        System.out.println(elementToFound6 + " :" + "количество  повторений в списке: " + collect.get(elementToFound6));
//        System.out.println(elementToFound7 + " :" + "количество  повторений в списке: " + collect.get(elementToFound7));
//
//
//    }
//}



///////////////////////////////



//
//package org.example;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class test2 {
//    public static void main(String[] args) throws Exception {
//
//
//        //String value = "This is testing Program testing Program";
//
//        ArrayList planets = new ArrayList();
//
//
//        planets.add("Земля");
//
//        planets.add("Марс");planets.add("Марс");
//
//        planets.add("Меркурий");planets.add("Меркурий");planets.add("Меркурий");
//
//        planets.add("Сатурн");planets.add("Сатурн");
//        planets.add("Сатурн");planets.add("Сатурн");
//
//        planets.add("Уран");planets.add("Уран");planets.add("Уран");
//        planets.add("Уран");planets.add("Уран");planets.add("Уран");
//
//        planets.add("Нептун");planets.add("Нептун");planets.add("Нептун");planets.add("Нептун");
//        planets.add("Нептун");planets.add("Нептун");planets.add("Нептун");planets.add("Нептун");
//
//        planets.add("Венера");planets.add("Венера");planets.add("Венера");planets.add("Венера");
//        planets.add("Венера");planets.add("Венера");planets.add("Венера");planets.add("Венера");
//        planets.add("Венера");planets.add("Венера");planets.add("Венера");planets.add("Венера");
//
//        planets.add("Юпитер");planets.add("Юпитер");planets.add("Юпитер");planets.add("Юпитер");
//        planets.add("Юпитер");planets.add("Юпитер");planets.add("Юпитер");planets.add("Юпитер");
//        planets.add("Юпитер");planets.add("Юпитер");planets.add("Юпитер");planets.add("Юпитер");
//        planets.add("Юпитер");planets.add("Юпитер");planets.add("Юпитер");planets.add("Юпитер");
//
//
//
//
//    }
//
//}