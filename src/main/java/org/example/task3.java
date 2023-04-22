
package org.example;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
//Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//Вывести название каждой планеты и количество его повторений в списке.
                public class task3 {


                        public static void main(String[] args) {


                                List<String> list = Arrays.asList(
                                        "Земля","Земля","Земля","Земля","Земля","Земля","Земля","Земля",
                                        "Марс","Марс","Марс","Марс","Марс","Марс","Марс","Марс","Марс","Марс","Марс",
                                        "Меркурий","Меркурий","Меркурий","Меркурий","Меркурий","Меркурий","Меркурий",
                                        "Меркурий","Меркурий","Меркурий","Меркурий","Меркурий","Меркурий","Меркурий",
                                        "Меркурий","Меркурий","Меркурий","Меркурий","Меркурий","Меркурий",
                                        "Меркурий","Меркурий","Меркурий","Меркурий","Меркурий","Меркурий","Меркурий",
                                        "Сатурн","Сатурн","Сатурн","Сатурн",
                                        "Уран","Венера","Венера","Юпитер","Юпитер","Юпитер","Юпитер","Юпитер"

                                );

                                System.out.println(list+"\n");

                                String elementToFound = "Земля";
                                String elementToFound2 = "Марс" ;
                                String elementToFound3 = "Меркурий";
                                String elementToFound4 = "Сатурн";
                                String elementToFound5 = "Уран";
                                String elementToFound6 = "Венера";
                                String elementToFound7 = "Юпитер";

                                Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(),
                                        Collectors.counting()));
                                System.out.println(elementToFound + " :" + "количество  повторений в списке: "+collect.get(elementToFound ));
                                System.out.println(elementToFound2 + " :" + "количество  повторений в списке: "+collect.get(elementToFound2 ));
                                System.out.println(elementToFound3+ " :" + "количество  повторений в списке: "+collect.get(elementToFound3 ));
                                System.out.println(elementToFound4+ " :" + "количество  повторений в списке: "+collect.get(elementToFound4 ));
                                System.out.println(elementToFound5+ " :" + "количество  повторений в списке: "+collect.get(elementToFound5 ));
                                System.out.println(elementToFound6+ " :" + "количество  повторений в списке: "+collect.get(elementToFound6 ));
                                System.out.println(elementToFound7+ " :" + "количество  повторений в списке: "+collect.get(elementToFound7 ));




                        }

                }



