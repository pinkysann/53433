// Generated from c:/Users/munoz/OneDrive/Desktop/53433/MiAnalizador/MiniC.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniCParser}.
 */
public interface MiniCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniCParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MiniCParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MiniCParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(MiniCParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(MiniCParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(MiniCParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(MiniCParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#decision}.
	 * @param ctx the parse tree
	 */
	void enterDecision(MiniCParser.DecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#decision}.
	 * @param ctx the parse tree
	 */
	void exitDecision(MiniCParser.DecisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(MiniCParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(MiniCParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#salida}.
	 * @param ctx the parse tree
	 */
	void enterSalida(MiniCParser.SalidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#salida}.
	 * @param ctx the parse tree
	 */
	void exitSalida(MiniCParser.SalidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#terminar}.
	 * @param ctx the parse tree
	 */
	void enterTerminar(MiniCParser.TerminarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#terminar}.
	 * @param ctx the parse tree
	 */
	void exitTerminar(MiniCParser.TerminarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(MiniCParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(MiniCParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniCParser#cadena}.
	 * @param ctx the parse tree
	 */
	void enterCadena(MiniCParser.CadenaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniCParser#cadena}.
	 * @param ctx the parse tree
	 */
	void exitCadena(MiniCParser.CadenaContext ctx);
}