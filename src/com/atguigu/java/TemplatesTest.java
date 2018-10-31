package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;

/**
 * @author ykm
 * @date 2018/10/31-9:42
 * <p>
 * 1.idea中代码模板所处的位置：setting-Editor-Live Templates/Postfix Completion
 * 2.常用模板
 */
public class TemplatesTest {

    //模板6:prsf:可生成 private static final
    private static final Customer cust = new Customer();


    //变形:psf
    public static final int NUM = 1;

    //变形:psfi
    public static final int NUM2 = 2;

    //变形:psfs
    public static final String ADC = "China";


    //模板1:psvm
    public static void main(String[] args) {

        //模板2:sout
        System.out.println("hello!");
        //变形:soutp/soutm/soutv/xxx.sout
        System.out.println("TemplatesTest.main");


        //模板3:fori
        String[] arr = new String[]{"Tom", "Jerry", "HanMeimei", "Lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形:iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形:itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板4:list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        for (Object o : list) {

        }
        //变形:list.fori(顺序遍历)
        for (int i = 0; i < list.size(); i++) {

        }
        //变形:list.forr(倒序遍历)
        for (int i = list.size() - 1; i >= 0; i--) {

        }


    }

    public void method() {
        System.out.println("TemplatesTest.main");


        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);

        //模板5:ifn
        if (list == null) {

        }
        //变形:inn
        if (list != null) {

        }
        //变形:xxx.nn/xxx.null
        if (list != null) {

        }

        if (list == null) {

        }

    }
}
