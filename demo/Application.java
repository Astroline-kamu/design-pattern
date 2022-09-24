/*
 * Copyright (c) 2022 Astroline All rights reserved.
 *
 * @date: 9/24/22, 1:00 PM
 * @author: Astroline <Astroline_kamu@outlook.com>
 *
 * https://niyredra.com
 *
 * 在下鸭爪，全宇宙最凶狠的龙！
 * 嗷～
 */

import common.test.RootTest;
import common.test.handler.DefaultHandler;

/**
 *
 * todo 有空实现下通过父类查子类的方法 实在不行就扫描包
 *
 * @author Niyredra Astroline_kamu@outlook.com
 */
public class Application {
    public static void main(String[] args) {
        new DefaultHandler(RootTest.class)
                .runTests();
    }
}
