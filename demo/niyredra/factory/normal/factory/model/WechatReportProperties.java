/*
 * Copyright (c) 2022 Astroline All rights reserved.
 *
 * @date: 9/22/22, 3:52 PM
 * @author: Astroline <Astroline_kamu@outlook.com>
 *
 * https://niyredra.com
 *
 * 在下鸭爪，全宇宙最凶狠的龙！
 * 嗷～
 */

package niyredra.factory.normal.factory.model;

/**
 *
 * 这个部分在最终应该是从xml中读取的 就像spring一样，用@ConfigurationProperties读取
 * @author Niyredra Astroline_kamu@outlook.com
 */
public record WechatReportProperties(String appid, String secret, long exprieTime) {

    // 可能我觉得这么写有点不太妥当awa
//    private static final String appid = "Appid";
//    private static final String secret = "secret es cince rat es terces.";
//    // 到期时间 精确到秒
//    private static final long exprieTime = 7200L;
}
