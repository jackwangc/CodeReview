package jingdong;

import java.util.stream.Stream;

/**
 * Created by hlq on 2019/8/24.
 */

public class main {
    public static void main(String[] args){
        Stream.of("jd","jd.com","www.jd.com","www.jd.id")
        .mapToInt(String::length)
        .filter(len->len>3)
        .peek(System.out::println)
        .limit(2);
        }
    }

