// Generated from mueble_gramatica.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link mueble_gramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface mueble_gramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link mueble_gramaticaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(mueble_gramaticaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link mueble_gramaticaParser#definicionMueble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicionMueble(mueble_gramaticaParser.DefinicionMuebleContext ctx);
	/**
	 * Visit a parse tree produced by {@link mueble_gramaticaParser#seccionDefiniciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeccionDefiniciones(mueble_gramaticaParser.SeccionDefinicionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link mueble_gramaticaParser#definicionHerraje}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicionHerraje(mueble_gramaticaParser.DefinicionHerrajeContext ctx);
	/**
	 * Visit a parse tree produced by {@link mueble_gramaticaParser#usoHerramienta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsoHerramienta(mueble_gramaticaParser.UsoHerramientaContext ctx);
	/**
	 * Visit a parse tree produced by {@link mueble_gramaticaParser#definicionPieza}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicionPieza(mueble_gramaticaParser.DefinicionPiezaContext ctx);
	/**
	 * Visit a parse tree produced by {@link mueble_gramaticaParser#nombre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNombre(mueble_gramaticaParser.NombreContext ctx);
	/**
	 * Visit a parse tree produced by {@link mueble_gramaticaParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(mueble_gramaticaParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link mueble_gramaticaParser#pasoMontaje}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPasoMontaje(mueble_gramaticaParser.PasoMontajeContext ctx);
	/**
	 * Visit a parse tree produced by {@link mueble_gramaticaParser#accionLista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccionLista(mueble_gramaticaParser.AccionListaContext ctx);
	/**
	 * Visit a parse tree produced by {@link mueble_gramaticaParser#accion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccion(mueble_gramaticaParser.AccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link mueble_gramaticaParser#piezaRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPiezaRef(mueble_gramaticaParser.PiezaRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link mueble_gramaticaParser#herrajeRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHerrajeRef(mueble_gramaticaParser.HerrajeRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link mueble_gramaticaParser#herrajeItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHerrajeItem(mueble_gramaticaParser.HerrajeItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link mueble_gramaticaParser#herrajeLista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHerrajeLista(mueble_gramaticaParser.HerrajeListaContext ctx);
	/**
	 * Visit a parse tree produced by {@link mueble_gramaticaParser#herramientaRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHerramientaRef(mueble_gramaticaParser.HerramientaRefContext ctx);
}