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

package niyredra.factory.simple.factory;

import niyredra.factory.simple.common.constant.PigeonType;
import niyredra.factory.simple.prototype.Pigeon;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Niyredra Astroline_kamu@outlook.com
 */
public class PigeonFactory {

    public Pigeon getPigeon(PigeonType pigeonType){
        try {
            return pigeonType.getClazz().getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException("Can not build a pigeon exception.\n" + "Pigeon type is: " + pigeonType.getType());
        }
    }

}
