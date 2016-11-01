package compiler.FRONTEND;
// Generated from C:\Users\lukas\Dropbox\DTU\Compiler Teknik\ass4\Assignment4grammar.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Assignment4grammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Assignment4grammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Assignment4grammarParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(@NotNull Assignment4grammarParser.DateContext ctx);

	/**
	 * Visit a parse tree produced by {@link Assignment4grammarParser#ipv4ttl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpv4ttl(@NotNull Assignment4grammarParser.Ipv4ttlContext ctx);

	/**
	 * Visit a parse tree produced by {@link Assignment4grammarParser#ipv4flags}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpv4flags(@NotNull Assignment4grammarParser.Ipv4flagsContext ctx);

	/**
	 * Visit a parse tree produced by {@link Assignment4grammarParser#dumpline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDumpline(@NotNull Assignment4grammarParser.DumplineContext ctx);

	/**
	 * Visit a parse tree produced by {@link Assignment4grammarParser#length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLength(@NotNull Assignment4grammarParser.LengthContext ctx);

	/**
	 * Visit a parse tree produced by {@link Assignment4grammarParser#packet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPacket(@NotNull Assignment4grammarParser.PacketContext ctx);

	/**
	 * Visit a parse tree produced by {@link Assignment4grammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull Assignment4grammarParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Assignment4grammarParser#ipv4id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpv4id(@NotNull Assignment4grammarParser.Ipv4idContext ctx);

	/**
	 * Visit a parse tree produced by {@link Assignment4grammarParser#mac}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMac(@NotNull Assignment4grammarParser.MacContext ctx);

	/**
	 * Visit a parse tree produced by {@link Assignment4grammarParser#ipv4offset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpv4offset(@NotNull Assignment4grammarParser.Ipv4offsetContext ctx);

	/**
	 * Visit a parse tree produced by {@link Assignment4grammarParser#entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntry(@NotNull Assignment4grammarParser.EntryContext ctx);

	/**
	 * Visit a parse tree produced by {@link Assignment4grammarParser#entries}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntries(@NotNull Assignment4grammarParser.EntriesContext ctx);

	/**
	 * Visit a parse tree produced by {@link Assignment4grammarParser#protinfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtinfo(@NotNull Assignment4grammarParser.ProtinfoContext ctx);

	/**
	 * Visit a parse tree produced by {@link Assignment4grammarParser#ipv4proto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpv4proto(@NotNull Assignment4grammarParser.Ipv4protoContext ctx);

	/**
	 * Visit a parse tree produced by {@link Assignment4grammarParser#ipv4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpv4(@NotNull Assignment4grammarParser.Ipv4Context ctx);

	/**
	 * Visit a parse tree produced by {@link Assignment4grammarParser#flagvalues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlagvalues(@NotNull Assignment4grammarParser.FlagvaluesContext ctx);

	/**
	 * Visit a parse tree produced by {@link Assignment4grammarParser#ipv4tos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpv4tos(@NotNull Assignment4grammarParser.Ipv4tosContext ctx);

	/**
	 * Visit a parse tree produced by {@link Assignment4grammarParser#protname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtname(@NotNull Assignment4grammarParser.ProtnameContext ctx);

	/**
	 * Visit a parse tree produced by {@link Assignment4grammarParser#ipv4content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpv4content(@NotNull Assignment4grammarParser.Ipv4contentContext ctx);

	/**
	 * Visit a parse tree produced by {@link Assignment4grammarParser#ipv4fields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpv4fields(@NotNull Assignment4grammarParser.Ipv4fieldsContext ctx);

	/**
	 * Visit a parse tree produced by {@link Assignment4grammarParser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(@NotNull Assignment4grammarParser.TimeContext ctx);

	/**
	 * Visit a parse tree produced by {@link Assignment4grammarParser#tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag(@NotNull Assignment4grammarParser.TagContext ctx);
}