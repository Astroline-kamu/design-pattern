/*
 * Copyright (c) 2022 Astroline All rights reserved.
 *
 * @date: 9/23/22, 10:24 AM
 * @author: Astroline <Astroline_kamu@outlook.com>
 *
 * https://niyredra.com
 *
 * 在下鸭爪，全宇宙最凶狠的龙！
 * 嗷～
 */

package niyredra.factory.normal;

import common.test.handler.DefaultHandler;
import niyredra.factory.normal.test.NormalFactoryTest;
import niyredra.factory.simple.test.SimpleFactoryTest;

/**
 * @author Niyredra Astroline_kamu@outlook.com
 */
public class NormalFactoryApplication {

    public static void main(String[] args) {
        new DefaultHandler(NormalFactoryTest.class)
                .runTests();
    }

}
