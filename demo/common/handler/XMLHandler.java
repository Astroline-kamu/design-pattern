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

package common.handler;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * @author Niyredra Astroline_kamu@outlook.com
 */
public class XMLHandler extends DefaultHandler {

    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
    }

    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println(localName);
        //        super.startElement(uri, localName, qName, attributes);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
//        super.endElement(uri, localName, qName);
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        System.out.println(start);
        System.out.println(ch.toString());
//        super.characters(ch, start, length);
    }

    @Override
    public void error(SAXParseException e) throws SAXException {
        super.error(e);
    }
}
