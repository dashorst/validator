/* This code was generated by nu.validator.tools.SaxCompiler. Please regenerate instead of editing. */
package nu.validator.servlet;
public final class NsFilterEmitter {
private NsFilterEmitter() {}
public static void emit(org.xml.sax.ContentHandler contentHandler, nu.validator.servlet.VerifierServletTransaction t) throws org.xml.sax.SAXException {
org.xml.sax.helpers.AttributesImpl __attrs__ = new org.xml.sax.helpers.AttributesImpl();
contentHandler.startPrefixMapping("", "http://www.w3.org/1999/xhtml");
__attrs__.clear();
contentHandler.startElement("http://www.w3.org/1999/xhtml", "th", "th", __attrs__);
__attrs__.clear();
__attrs__.addAttribute("", "for", "for", "CDATA", "nsfilter");
contentHandler.startElement("http://www.w3.org/1999/xhtml", "label", "label", __attrs__);
contentHandler.characters(__chars__, 0, 16);
contentHandler.endElement("http://www.w3.org/1999/xhtml", "label", "label");
contentHandler.endElement("http://www.w3.org/1999/xhtml", "th", "th");
__attrs__.clear();
contentHandler.startElement("http://www.w3.org/1999/xhtml", "td", "td", __attrs__);
t.emitNsfilterField(); 
contentHandler.endElement("http://www.w3.org/1999/xhtml", "td", "td");
contentHandler.endPrefixMapping("");
}
private static final char[] __chars__ = { 'N', 'a', 'm', 'e', 's', 'p', 'a', 'c', 'e', ' ', 'F', 'i', 'l', 't', 'e', 'r' };
}
