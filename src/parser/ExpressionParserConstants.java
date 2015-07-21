/* Generated By:JavaCC: Do not edit this line. ExpressionParserConstants.java */
package parser;

public interface ExpressionParserConstants {

  int EOF = 0;
  int SINGLE_LINE_COMMENT = 8;
  int IDENTIFIER = 9;
  int SPECIALVAR = 10;
  int INTEGER = 11;
  int LETTER = 12;
  int DIGIT = 13;
  int STRING = 14;
  int LPAREN = 15;
  int RPAREN = 16;
  int LARROW = 17;
  int RARROW = 18;
  int LBRACE = 19;
  int RBRACE = 20;
  int LBRACKET = 21;
  int RBRACKET = 22;
  int SEMICOLON = 23;
  int DOT = 24;
  int UNDERSCORE = 25;
  int COMMA = 26;
  int COLON = 27;
  int SLASH = 28;

  int DEFAULT = 0;
  int WithinComment = 1;

  String[] tokenImage = {
    "<EOF>",
    "\"\\t\"",
    "\"/*\"",
    "\" \"",
    "\"\\n\"",
    "\"\\r\"",
    "\"*/\"",
    "<token of kind 7>",
    "<SINGLE_LINE_COMMENT>",
    "<IDENTIFIER>",
    "<SPECIALVAR>",
    "<INTEGER>",
    "<LETTER>",
    "<DIGIT>",
    "<STRING>",
    "\"(\"",
    "\")\"",
    "\"<\"",
    "\">\"",
    "\"{\"",
    "\"}\"",
    "\"[\"",
    "\"]\"",
    "\";\"",
    "\".\"",
    "\"_\"",
    "\",\"",
    "\":\"",
    "\"/\"",
    "\"-\"",
    "\"+\"",
    "\"*\"",
    "\"%\"",
  };

}