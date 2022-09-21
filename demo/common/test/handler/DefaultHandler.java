/*
 * Copyright (c) 2022 Astroline All rights reserved.
 *
 * @date: 9/18/22, 9:02 PM
 * @author: Astroline <Astroline_kamu@outlook.com>
 *
 * https://niyredra.com
 *
 * 在下鸭爪，全宇宙最凶狠的龙！
 * 嗷～
 */

package common.test.handler;

import common.test.RootTest;
import common.test.annotation.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 * 说实话，我觉得这不太标准呐～
 *
 * 正常Handler是用建造者模式装载的awa
 *
 * @author Niyredra Astroline_kamu@outlook.com
 */
public class DefaultHandler {

    private Class<RootTest> clazz;

    public DefaultHandler(Class clazz) {
        this.clazz = clazz;
    }

    public void runTests() {

        Method[] declaredMethods = clazz.getDeclaredMethods();

        try {
            RootTest subject = clazz.getDeclaredConstructor().newInstance();
            for (int i = 0; i < declaredMethods.length; i++) {
                Method method = declaredMethods[i];
                if (method.isAnnotationPresent(Test.class)) {
                    // todo 抽象出打印方法，将所有内容使用通用方式打印，可以设计UI将内容按行写入框内 目前暂时这么用着
                    System.out.println();
                    System.out.println("::: =========== " + method.getName() + " =========== :::");
                    method.setAccessible(true);
                    method.invoke(subject);
                }
            }
        } catch (IllegalAccessException
                 | InvocationTargetException
                 | NoSuchMethodException
                 | InstantiationException
                e) {
            throw new RuntimeException(e);
        }
    }

}
