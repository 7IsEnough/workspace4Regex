package com.clearlove.tegex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 测试正则表达式对象的分割字符串的操作
 *
 * @author promise
 * @date 2021/2/9 - 14:44
 */
public class Demo04 {

  public static void main(String[] args) {
    String str = "a232b4334c3434";
    String[] arrs = str.split("\\d+");
    System.out.println(Arrays.toString(arrs));
  }
}
