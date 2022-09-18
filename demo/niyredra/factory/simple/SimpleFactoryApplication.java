/*
 * Copyright (c) 2022 Astroline All rights reserved.
 *
 * @date: 9/18/22, 4:04 PM
 * @author: Astroline <Astroline_kamu@outlook.com>
 *
 * https://niyredra.com
 *
 * 在下鸭爪，全宇宙最凶狠的龙！
 * 嗷～
 */

package niyredra.factory.simple;

import common.test.handler.DefaultHandler;
import niyredra.factory.simple.test.SimpleFactoryTest;

/**
 * 简单工厂模式
 *
 * @author Niyredra Astroline_kamu@outlook.com
 */
public class SimpleFactoryApplication {

    public static void main(String[] args) {
        new DefaultHandler(SimpleFactoryTest.class)
                .runTests();
    }
}
