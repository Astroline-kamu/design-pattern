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
 * todo 既然都是基于反射，那为何不试试把范型T直接改成RootTest，创建父类，反射子类对象，听着也没毛病对吧～
 * @author Niyredra Astroline_kamu@outlook.com
 */
public class DefaultHandler<T extends RootTest> {

    private Class<T> clazz;

    public DefaultHandler(Class<T> clazz) {
        this.clazz = clazz;
    }

    public void runTests() {

        Method[] declaredMethods = clazz.getDeclaredMethods();

        try {
            T subject = clazz.getDeclaredConstructor().newInstance();
            for (int i = 0; i < declaredMethods.length; i++) {
                Method method = declaredMethods[i];
                if (method.isAnnotationPresent(Test.class)) {
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
