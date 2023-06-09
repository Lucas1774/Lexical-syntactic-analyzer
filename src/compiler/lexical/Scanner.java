/* The following code was generated by JFlex 1.4.1 on 29/1/23, 9:48 */

package compiler.lexical;

import compiler.syntax.sym;
import compiler.lexical.Token;
import es.uned.lsi.compiler.lexical.ScannerIF;
import es.uned.lsi.compiler.lexical.LexicalError;
import es.uned.lsi.compiler.lexical.LexicalErrorManager;

// incluir aqui, si es necesario otras importaciones


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.1
 * on 29/1/23, 9:48 from the specification file
 * <tt>D:/Lucas/Documents/uni/PL1/PEC/ArquitecturaPLI-2022-2023/doc/specs/scanner.flex</tt>
 */
public class Scanner implements java_cup.runtime.Scanner, ScannerIF {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\3\2\0\1\2\22\0\1\1\1\0\1\7\5\0"+
    "\1\34\1\35\1\41\1\0\1\36\1\6\1\45\1\43\12\4\1\40"+
    "\1\37\1\0\1\44\1\42\2\0\1\17\1\10\1\20\1\23\1\11"+
    "\1\24\1\12\1\31\1\13\2\5\1\16\1\5\1\14\1\15\1\27"+
    "\1\5\1\26\1\21\1\22\1\25\1\5\1\33\1\5\1\32\1\5"+
    "\4\0\1\30\1\0\1\17\1\10\1\20\1\23\1\11\1\24\1\12"+
    "\1\31\1\13\2\5\1\16\1\5\1\14\1\15\1\27\1\5\1\26"+
    "\1\21\1\22\1\25\1\5\1\33\1\5\1\32\1\5\uff85\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\1\1\3\1\4\1\5\1\1"+
    "\14\4\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\1\1\15\2\0\1\16\5\4\1\17\1\20\15\4"+
    "\1\21\1\22\1\0\2\4\1\23\2\4\1\24\1\4"+
    "\1\25\15\4\1\26\1\4\1\27\1\4\1\30\1\31"+
    "\1\32\4\4\1\0\2\4\1\33\3\4\1\34\3\4"+
    "\1\0\1\4\1\35\4\4\1\36\1\37\1\0\1\4"+
    "\1\40\1\41\2\4\1\0\1\4\1\42\1\43\1\44"+
    "\1\4\1\45";

  private static int [] zzUnpackAction() {
    int [] result = new int[120];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\46\0\46\0\114\0\162\0\230\0\276\0\344"+
    "\0\u010a\0\u0130\0\u0156\0\u017c\0\u01a2\0\u01c8\0\u01ee\0\u0214"+
    "\0\u023a\0\u0260\0\u0286\0\u02ac\0\46\0\46\0\46\0\46"+
    "\0\u02d2\0\46\0\46\0\u02f8\0\46\0\u031e\0\344\0\344"+
    "\0\u0344\0\u036a\0\u0390\0\u03b6\0\u03dc\0\230\0\230\0\u0402"+
    "\0\u0428\0\u044e\0\u0474\0\u049a\0\u04c0\0\u04e6\0\u050c\0\u0532"+
    "\0\u0558\0\u057e\0\u05a4\0\u05ca\0\46\0\46\0\u05f0\0\u0616"+
    "\0\u063c\0\230\0\u0662\0\u0688\0\230\0\u06ae\0\230\0\u06d4"+
    "\0\u06fa\0\u0720\0\u0746\0\u076c\0\u0792\0\u07b8\0\u07de\0\u0804"+
    "\0\u082a\0\u0850\0\u0876\0\u089c\0\230\0\u08c2\0\230\0\u08e8"+
    "\0\230\0\230\0\230\0\u090e\0\u0934\0\u095a\0\u0980\0\u09a6"+
    "\0\u09cc\0\u09f2\0\230\0\u0a18\0\u0a3e\0\u0a64\0\230\0\u0a8a"+
    "\0\u0ab0\0\u0ad6\0\u0afc\0\u0b22\0\230\0\u0b48\0\u0b6e\0\u0b94"+
    "\0\u0bba\0\230\0\230\0\u0be0\0\u0c06\0\230\0\230\0\u0c2c"+
    "\0\u0c52\0\u0c78\0\u0c9e\0\230\0\230\0\46\0\u0cc4\0\230";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[120];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\2\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\6\1\13\1\6\1\14\1\15\1\16"+
    "\1\17\1\6\1\20\1\6\1\21\1\6\1\22\1\23"+
    "\1\2\2\6\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\2\1\35\51\0\1\3\46\0"+
    "\1\5\45\0\2\6\2\0\20\6\1\0\3\6\20\0"+
    "\1\36\37\0\3\37\1\0\3\37\1\40\36\37\4\0"+
    "\2\6\2\0\1\6\1\41\3\6\1\42\12\6\1\0"+
    "\3\6\16\0\2\6\2\0\4\6\1\43\1\6\1\44"+
    "\11\6\1\0\3\6\16\0\2\6\2\0\4\6\1\45"+
    "\4\6\1\46\2\6\1\47\3\6\1\0\3\6\16\0"+
    "\2\6\2\0\15\6\1\50\2\6\1\0\3\6\16\0"+
    "\2\6\2\0\5\6\1\51\12\6\1\0\3\6\16\0"+
    "\2\6\2\0\4\6\1\52\13\6\1\0\3\6\16\0"+
    "\2\6\2\0\5\6\1\53\12\6\1\0\3\6\16\0"+
    "\2\6\2\0\16\6\1\54\1\6\1\0\1\55\1\56"+
    "\1\6\16\0\2\6\2\0\7\6\1\57\5\6\1\60"+
    "\2\6\1\0\3\6\16\0\2\6\2\0\1\6\1\61"+
    "\16\6\1\0\3\6\16\0\2\6\2\0\15\6\1\62"+
    "\1\63\1\6\1\0\3\6\16\0\2\6\2\0\20\6"+
    "\1\0\1\64\2\6\56\0\1\65\45\0\1\66\1\0"+
    "\2\36\1\67\1\0\42\36\4\0\2\6\2\0\2\6"+
    "\1\70\15\6\1\0\3\6\16\0\2\6\2\0\5\6"+
    "\1\71\12\6\1\0\3\6\16\0\2\6\2\0\13\6"+
    "\1\72\4\6\1\0\3\6\16\0\2\6\2\0\11\6"+
    "\1\73\6\6\1\0\3\6\16\0\2\6\2\0\12\6"+
    "\1\74\5\6\1\0\3\6\16\0\2\6\2\0\12\6"+
    "\1\75\5\6\1\0\3\6\16\0\2\6\2\0\5\6"+
    "\1\76\12\6\1\0\3\6\16\0\2\6\2\0\13\6"+
    "\1\77\4\6\1\0\3\6\16\0\2\6\2\0\4\6"+
    "\1\100\13\6\1\0\3\6\16\0\2\6\2\0\15\6"+
    "\1\101\2\6\1\0\3\6\16\0\2\6\2\0\1\6"+
    "\1\102\16\6\1\0\3\6\16\0\2\6\2\0\17\6"+
    "\1\103\1\0\3\6\16\0\2\6\2\0\6\6\1\104"+
    "\11\6\1\0\3\6\16\0\2\6\2\0\4\6\1\105"+
    "\13\6\1\0\3\6\16\0\2\6\2\0\10\6\1\106"+
    "\1\6\1\107\5\6\1\0\3\6\16\0\2\6\2\0"+
    "\12\6\1\110\5\6\1\0\3\6\16\0\2\6\2\0"+
    "\5\6\1\111\12\6\1\0\3\6\16\0\2\6\2\0"+
    "\3\6\1\112\14\6\1\0\3\6\12\0\2\36\1\67"+
    "\1\3\42\36\4\0\2\6\2\0\3\6\1\113\14\6"+
    "\1\0\3\6\16\0\2\6\2\0\6\6\1\114\11\6"+
    "\1\0\3\6\16\0\2\6\2\0\1\6\1\115\16\6"+
    "\1\0\3\6\16\0\2\6\2\0\1\6\1\116\16\6"+
    "\1\0\3\6\16\0\2\6\2\0\17\6\1\117\1\0"+
    "\3\6\16\0\2\6\2\0\11\6\1\120\6\6\1\0"+
    "\3\6\16\0\2\6\2\0\1\6\1\121\16\6\1\0"+
    "\3\6\16\0\2\6\2\0\4\6\1\122\13\6\1\0"+
    "\3\6\16\0\2\6\2\0\1\6\1\123\16\6\1\0"+
    "\3\6\16\0\2\6\2\0\11\6\1\124\6\6\1\0"+
    "\3\6\16\0\2\6\2\0\10\6\1\125\7\6\1\0"+
    "\3\6\16\0\2\6\2\0\5\6\1\126\12\6\1\0"+
    "\3\6\16\0\2\6\2\0\15\6\1\127\2\6\1\0"+
    "\3\6\16\0\2\6\2\0\20\6\1\130\3\6\16\0"+
    "\2\6\2\0\10\6\1\131\7\6\1\0\3\6\16\0"+
    "\2\6\2\0\6\6\1\132\11\6\1\0\3\6\16\0"+
    "\2\6\2\0\4\6\1\133\13\6\1\0\3\6\16\0"+
    "\2\6\2\0\1\6\1\134\16\6\1\0\3\6\16\0"+
    "\2\6\2\0\2\6\1\135\15\6\1\0\3\6\16\0"+
    "\2\6\2\0\12\6\1\136\5\6\1\0\3\6\16\0"+
    "\2\6\2\0\1\6\1\137\16\6\1\0\3\6\16\0"+
    "\2\6\2\0\12\6\1\140\5\6\1\0\3\6\16\0"+
    "\2\6\2\0\16\6\1\141\1\6\1\0\3\6\16\0"+
    "\2\6\2\0\16\6\1\142\1\6\1\0\3\6\30\0"+
    "\1\143\33\0\2\6\2\0\1\6\1\144\16\6\1\0"+
    "\3\6\16\0\2\6\2\0\1\6\1\145\16\6\1\0"+
    "\3\6\16\0\2\6\2\0\7\6\1\146\10\6\1\0"+
    "\3\6\16\0\2\6\2\0\1\6\1\147\16\6\1\0"+
    "\3\6\16\0\2\6\2\0\7\6\1\150\10\6\1\0"+
    "\3\6\16\0\2\6\2\0\3\6\1\151\14\6\1\0"+
    "\3\6\16\0\2\6\2\0\13\6\1\152\4\6\1\0"+
    "\3\6\16\0\2\6\2\0\4\6\1\153\13\6\1\0"+
    "\3\6\25\0\1\154\36\0\2\6\2\0\13\6\1\155"+
    "\4\6\1\0\3\6\16\0\2\6\2\0\4\6\1\156"+
    "\13\6\1\0\3\6\16\0\2\6\2\0\16\6\1\157"+
    "\1\6\1\0\3\6\16\0\2\6\2\0\4\6\1\160"+
    "\13\6\1\0\3\6\16\0\2\6\2\0\5\6\1\161"+
    "\12\6\1\0\3\6\26\0\1\162\35\0\2\6\2\0"+
    "\15\6\1\163\2\6\1\0\3\6\16\0\2\6\2\0"+
    "\12\6\1\164\5\6\1\0\3\6\16\0\2\6\2\0"+
    "\4\6\1\165\13\6\1\0\3\6\23\0\1\166\40\0"+
    "\2\6\2\0\16\6\1\167\1\6\1\0\3\6\16\0"+
    "\2\6\2\0\1\6\1\170\16\6\1\0\3\6\12\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3306];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\21\1\4\11\1\1\2\11\1\1\1\11"+
    "\2\0\25\1\2\11\1\0\40\1\1\0\12\1\1\0"+
    "\10\1\1\0\5\1\1\0\3\1\1\11\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[120];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
 	LexicalErrorManager lexicalErrorManager = new LexicalErrorManager ();
 	private int commentCount = 0;
    
//metodo de creacion de token
	private Token CreateToken (int id){
		Token token = new Token (id);
		token.setLine (yyline + 1);
		token.setColumn (yycolumn + 1);
		token.setLexema (yytext ());
		return token;
	}


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Scanner(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Scanner(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 158) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzPushbackPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead < 0) {
      return true;
    }
    else {
      zzEndRead+= numRead;
      return false;
    }
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = zzPushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) throws LexicalError {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new LexicalError(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  throws LexicalError {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException, LexicalError {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = zzLexicalState;


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 8: 
          { return CreateToken (sym.COMMA);
          }
        case 38: break;
        case 28: 
          { return CreateToken (sym.FALSE);
          }
        case 39: break;
        case 33: 
          { return CreateToken (sym.INTEGER);
          }
        case 40: break;
        case 37: 
          { return CreateToken (sym.PROCEDURE);
          }
        case 41: break;
        case 32: 
          { return CreateToken (sym.BOOLEAN);
          }
        case 42: break;
        case 4: 
          { return CreateToken (sym.ID);
          }
        case 43: break;
        case 9: 
          { return CreateToken (sym.SEMICOLON);
          }
        case 44: break;
        case 31: 
          { return CreateToken (sym.RETURN);
          }
        case 45: break;
        case 30: 
          { return CreateToken (sym.RECORD);
          }
        case 46: break;
        case 27: 
          { return CreateToken (sym.BEGIN);
          }
        case 47: break;
        case 13: 
          { return CreateToken (sym.DOT);
          }
        case 48: break;
        case 15: 
          { return CreateToken (sym.IS);
          }
        case 49: break;
        case 19: 
          { return CreateToken (sym.END);
          }
        case 50: break;
        case 18: 
          { return CreateToken (sym.UNEQUAL);
          }
        case 51: break;
        case 6: 
          { return CreateToken (sym.PAR_L);
          }
        case 52: break;
        case 10: 
          { return CreateToken (sym.COLON);
          }
        case 53: break;
        case 3: 
          { return CreateToken (sym.INT);
          }
        case 54: break;
        case 21: 
          { return CreateToken (sym.AND);
          }
        case 55: break;
        case 29: 
          { return CreateToken (sym.WHILE);
          }
        case 56: break;
        case 23: 
          { return CreateToken (sym.LOOP);
          }
        case 57: break;
        case 17: 
          { return CreateToken (sym.BECOMES);
          }
        case 58: break;
        case 34: 
          { return CreateToken (sym.CONSTANT);
          }
        case 59: break;
        case 24: 
          { return CreateToken (sym.TRUE);
          }
        case 60: break;
        case 35: 
          { return CreateToken (sym.FUNCTION);
          }
        case 61: break;
        case 20: 
          { return CreateToken (sym.OUT);
          }
        case 62: break;
        case 26: 
          { return CreateToken (sym.TYPE);
          }
        case 63: break;
        case 11: 
          { return CreateToken (sym.BY);
          }
        case 64: break;
        case 1: 
          { LexicalError error = new LexicalError ();
                           error.setLine (yyline + 1);
                           error.setColumn (yycolumn + 1);
                           error.setLexema (yytext ());
                           lexicalErrorManager.lexicalError (error);
          }
        case 65: break;
        case 14: 
          { return CreateToken (sym.STRING);
          }
        case 66: break;
        case 5: 
          { return CreateToken (sym.MINUS);
          }
        case 67: break;
        case 12: 
          { return CreateToken (sym.GREATER);
          }
        case 68: break;
        case 22: 
          { return CreateToken (sym.ELSE);
          }
        case 69: break;
        case 7: 
          { return CreateToken (sym.PAR_R);
          }
        case 70: break;
        case 36: 
          { return CreateToken (sym.PUT_LINE);
          }
        case 71: break;
        case 16: 
          { return CreateToken (sym.IF);
          }
        case 72: break;
        case 25: 
          { return CreateToken (sym.THEN);
          }
        case 73: break;
        case 2: 
          { 
          }
        case 74: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
