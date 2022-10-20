/*
 * Copyright (c) 2022 Astroline All rights reserved.
 *
 * @date: 10/20/22, 7:33 AM
 * @author: Astroline <Astroline_kamu@outlook.com>
 *
 * https://niyredra.com
 *
 * 在下鸭爪，全宇宙最凶狠的龙！
 * 嗷～
 */

package niyredra.factory.abstr.sc.model.unit.base;

import lombok.Data;

/**
 *
 * model是指单位所引用的的模型，但是这里不做细节
 *
 * @author Niyredra Astroline_kamu@outlook.com
 */
@Data
public class Model {
    public record offset(int x, int y){}

    // 或者是一个InputStream
    private String path;

    private String name;

    private String uv;

    private float scale;
}
