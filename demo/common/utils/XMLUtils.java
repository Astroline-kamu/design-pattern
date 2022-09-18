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

package common.utils;


import com.sun.tools.javac.Main;
import common.handler.XMLHandler;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Niyredra Astroline_kamu@outlook.com
 */
public class XMLUtils {

    public static String getRootContext(String filePath, String nodeName) {

        try {
            InputStream inputStream = Main.class.getResourceAsStream(filePath);
            SAXParserFactory parserFactory = SAXParserFactory.newInstance();
            SAXParser saxParser = parserFactory.newSAXParser();

            // todo Handler做处理返回结果
            saxParser.parse(inputStream, new XMLHandler());
        } catch (
                SAXException
                | ParserConfigurationException
                | IOException
                        e) {
            throw new RuntimeException(e);
        }

        return null;

    }
}
