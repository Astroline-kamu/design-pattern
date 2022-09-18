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

package niyredra.factory.simple.test;

import common.test.RootTest;
import common.test.annotation.Test;
import niyredra.factory.simple.common.constant.PigeonType;
import niyredra.factory.simple.factory.PigeonFactory;
import niyredra.factory.simple.prototype.Pigeon;

/**
 * @author Niyredra Astroline_kamu@outlook.com
 */
public class SimpleFactoryTest extends RootTest {

    @Test
    public void getGodOne() {
        Pigeon pigeon = PigeonFactory.getPigeon(PigeonType.GOD);
        generalBehavior(pigeon);
    }

    @Test
    public void getNormalOne() {
        Pigeon pigeon = PigeonFactory.getPigeon(PigeonType.NORMAL);
        generalBehavior(pigeon);
    }

    @Test
    public void getVariationOne() {
        Pigeon pigeon = PigeonFactory.getPigeon(PigeonType.VARIATION);
        generalBehavior(pigeon);
    }

    private void generalBehavior(Pigeon pigeon) {
        System.out.println();

        pigeon.beingCatched();

        pigeon.eatMethod();
        pigeon.eat();

        pigeon.flyMethod();
        pigeon.fly();
    }

}
