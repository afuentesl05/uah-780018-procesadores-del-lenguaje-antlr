// Generated from c:/antlr/muebles_gramatica/mueble_gramatica.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mueble_gramaticaParser}.
 */
public interface mueble_gramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link mueble_gramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(mueble_gramaticaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link mueble_gramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(mueble_gramaticaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link mueble_gramaticaParser#definicionMueble}.
	 * @param ctx the parse tree
	 */
	void enterDefinicionMueble(mueble_gramaticaParser.DefinicionMuebleContext ctx);
	/**
	 * Exit a parse tree produced by {@link mueble_gramaticaParser#definicionMueble}.
	 * @param ctx the parse tree
	 */
	void exitDefinicionMueble(mueble_gramaticaParser.DefinicionMuebleContext ctx);
	/**
	 * Enter a parse tree produced by {@link mueble_gramaticaParser#seccionDefiniciones}.
	 * @param ctx the parse tree
	 */
	void enterSeccionDefiniciones(mueble_gramaticaParser.SeccionDefinicionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link mueble_gramaticaParser#seccionDefiniciones}.
	 * @param ctx the parse tree
	 */
	void exitSeccionDefiniciones(mueble_gramaticaParser.SeccionDefinicionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link mueble_gramaticaParser#definicionHerraje}.
	 * @param ctx the parse tree
	 */
	void enterDefinicionHerraje(mueble_gramaticaParser.DefinicionHerrajeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mueble_gramaticaParser#definicionHerraje}.
	 * @param ctx the parse tree
	 */
	void exitDefinicionHerraje(mueble_gramaticaParser.DefinicionHerrajeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mueble_gramaticaParser#usoHerramienta}.
	 * @param ctx the parse tree
	 */
	void enterUsoHerramienta(mueble_gramaticaParser.UsoHerramientaContext ctx);
	/**
	 * Exit a parse tree produced by {@link mueble_gramaticaParser#usoHerramienta}.
	 * @param ctx the parse tree
	 */
	void exitUsoHerramienta(mueble_gramaticaParser.UsoHerramientaContext ctx);
	/**
	 * Enter a parse tree produced by {@link mueble_gramaticaParser#definicionPieza}.
	 * @param ctx the parse tree
	 */
	void enterDefinicionPieza(mueble_gramaticaParser.DefinicionPiezaContext ctx);
	/**
	 * Exit a parse tree produced by {@link mueble_gramaticaParser#definicionPieza}.
	 * @param ctx the parse tree
	 */
	void exitDefinicionPieza(mueble_gramaticaParser.DefinicionPiezaContext ctx);
	/**
	 * Enter a parse tree produced by {@link mueble_gramaticaParser#nombre}.
	 * @param ctx the parse tree
	 */
	void enterNombre(mueble_gramaticaParser.NombreContext ctx);
	/**
	 * Exit a parse tree produced by {@link mueble_gramaticaParser#nombre}.
	 * @param ctx the parse tree
	 */
	void exitNombre(mueble_gramaticaParser.NombreContext ctx);
	/**
	 * Enter a parse tree produced by {@link mueble_gramaticaParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(mueble_gramaticaParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mueble_gramaticaParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(mueble_gramaticaParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mueble_gramaticaParser#pasoMontaje}.
	 * @param ctx the parse tree
	 */
	void enterPasoMontaje(mueble_gramaticaParser.PasoMontajeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mueble_gramaticaParser#pasoMontaje}.
	 * @param ctx the parse tree
	 */
	void exitPasoMontaje(mueble_gramaticaParser.PasoMontajeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mueble_gramaticaParser#accionLista}.
	 * @param ctx the parse tree
	 */
	void enterAccionLista(mueble_gramaticaParser.AccionListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link mueble_gramaticaParser#accionLista}.
	 * @param ctx the parse tree
	 */
	void exitAccionLista(mueble_gramaticaParser.AccionListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link mueble_gramaticaParser#accion}.
	 * @param ctx the parse tree
	 */
	void enterAccion(mueble_gramaticaParser.AccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mueble_gramaticaParser#accion}.
	 * @param ctx the parse tree
	 */
	void exitAccion(mueble_gramaticaParser.AccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mueble_gramaticaParser#piezaRef}.
	 * @param ctx the parse tree
	 */
	void enterPiezaRef(mueble_gramaticaParser.PiezaRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link mueble_gramaticaParser#piezaRef}.
	 * @param ctx the parse tree
	 */
	void exitPiezaRef(mueble_gramaticaParser.PiezaRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link mueble_gramaticaParser#herrajeRef}.
	 * @param ctx the parse tree
	 */
	void enterHerrajeRef(mueble_gramaticaParser.HerrajeRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link mueble_gramaticaParser#herrajeRef}.
	 * @param ctx the parse tree
	 */
	void exitHerrajeRef(mueble_gramaticaParser.HerrajeRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link mueble_gramaticaParser#herrajeItem}.
	 * @param ctx the parse tree
	 */
	void enterHerrajeItem(mueble_gramaticaParser.HerrajeItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link mueble_gramaticaParser#herrajeItem}.
	 * @param ctx the parse tree
	 */
	void exitHerrajeItem(mueble_gramaticaParser.HerrajeItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link mueble_gramaticaParser#herrajeLista}.
	 * @param ctx the parse tree
	 */
	void enterHerrajeLista(mueble_gramaticaParser.HerrajeListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link mueble_gramaticaParser#herrajeLista}.
	 * @param ctx the parse tree
	 */
	void exitHerrajeLista(mueble_gramaticaParser.HerrajeListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link mueble_gramaticaParser#herramientaRef}.
	 * @param ctx the parse tree
	 */
	void enterHerramientaRef(mueble_gramaticaParser.HerramientaRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link mueble_gramaticaParser#herramientaRef}.
	 * @param ctx the parse tree
	 */
	void exitHerramientaRef(mueble_gramaticaParser.HerramientaRefContext ctx);
}