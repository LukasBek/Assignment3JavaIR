package compiler.FRONTEND;

//Generated from C:\Users\lukas\Dropbox\DTU\Compiler Teknik\ass4\Assignment4grammar.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
* This interface defines a complete listener for a parse tree produced by
* {@link Assignment4grammarParser}.
*/
public interface Assignment4grammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Assignment4grammarParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(@NotNull Assignment4grammarParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment4grammarParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(@NotNull Assignment4grammarParser.DateContext ctx);

	/**
	 * Enter a parse tree produced by {@link Assignment4grammarParser#ipv4ttl}.
	 * @param ctx the parse tree
	 */
	void enterIpv4ttl(@NotNull Assignment4grammarParser.Ipv4ttlContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment4grammarParser#ipv4ttl}.
	 * @param ctx the parse tree
	 */
	void exitIpv4ttl(@NotNull Assignment4grammarParser.Ipv4ttlContext ctx);

	/**
	 * Enter a parse tree produced by {@link Assignment4grammarParser#ipv4flags}.
	 * @param ctx the parse tree
	 */
	void enterIpv4flags(@NotNull Assignment4grammarParser.Ipv4flagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment4grammarParser#ipv4flags}.
	 * @param ctx the parse tree
	 */
	void exitIpv4flags(@NotNull Assignment4grammarParser.Ipv4flagsContext ctx);

	/**
	 * Enter a parse tree produced by {@link Assignment4grammarParser#dumpline}.
	 * @param ctx the parse tree
	 */
	void enterDumpline(@NotNull Assignment4grammarParser.DumplineContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment4grammarParser#dumpline}.
	 * @param ctx the parse tree
	 */
	void exitDumpline(@NotNull Assignment4grammarParser.DumplineContext ctx);

	/**
	 * Enter a parse tree produced by {@link Assignment4grammarParser#length}.
	 * @param ctx the parse tree
	 */
	void enterLength(@NotNull Assignment4grammarParser.LengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment4grammarParser#length}.
	 * @param ctx the parse tree
	 */
	void exitLength(@NotNull Assignment4grammarParser.LengthContext ctx);

	/**
	 * Enter a parse tree produced by {@link Assignment4grammarParser#packet}.
	 * @param ctx the parse tree
	 */
	void enterPacket(@NotNull Assignment4grammarParser.PacketContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment4grammarParser#packet}.
	 * @param ctx the parse tree
	 */
	void exitPacket(@NotNull Assignment4grammarParser.PacketContext ctx);

	/**
	 * Enter a parse tree produced by {@link Assignment4grammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull Assignment4grammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment4grammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull Assignment4grammarParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link Assignment4grammarParser#ipv4id}.
	 * @param ctx the parse tree
	 */
	void enterIpv4id(@NotNull Assignment4grammarParser.Ipv4idContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment4grammarParser#ipv4id}.
	 * @param ctx the parse tree
	 */
	void exitIpv4id(@NotNull Assignment4grammarParser.Ipv4idContext ctx);

	/**
	 * Enter a parse tree produced by {@link Assignment4grammarParser#mac}.
	 * @param ctx the parse tree
	 */
	void enterMac(@NotNull Assignment4grammarParser.MacContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment4grammarParser#mac}.
	 * @param ctx the parse tree
	 */
	void exitMac(@NotNull Assignment4grammarParser.MacContext ctx);

	/**
	 * Enter a parse tree produced by {@link Assignment4grammarParser#ipv4offset}.
	 * @param ctx the parse tree
	 */
	void enterIpv4offset(@NotNull Assignment4grammarParser.Ipv4offsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment4grammarParser#ipv4offset}.
	 * @param ctx the parse tree
	 */
	void exitIpv4offset(@NotNull Assignment4grammarParser.Ipv4offsetContext ctx);

	/**
	 * Enter a parse tree produced by {@link Assignment4grammarParser#entry}.
	 * @param ctx the parse tree
	 */
	void enterEntry(@NotNull Assignment4grammarParser.EntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment4grammarParser#entry}.
	 * @param ctx the parse tree
	 */
	void exitEntry(@NotNull Assignment4grammarParser.EntryContext ctx);

	/**
	 * Enter a parse tree produced by {@link Assignment4grammarParser#entries}.
	 * @param ctx the parse tree
	 */
	void enterEntries(@NotNull Assignment4grammarParser.EntriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment4grammarParser#entries}.
	 * @param ctx the parse tree
	 */
	void exitEntries(@NotNull Assignment4grammarParser.EntriesContext ctx);

	/**
	 * Enter a parse tree produced by {@link Assignment4grammarParser#protinfo}.
	 * @param ctx the parse tree
	 */
	void enterProtinfo(@NotNull Assignment4grammarParser.ProtinfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment4grammarParser#protinfo}.
	 * @param ctx the parse tree
	 */
	void exitProtinfo(@NotNull Assignment4grammarParser.ProtinfoContext ctx);

	/**
	 * Enter a parse tree produced by {@link Assignment4grammarParser#ipv4proto}.
	 * @param ctx the parse tree
	 */
	void enterIpv4proto(@NotNull Assignment4grammarParser.Ipv4protoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment4grammarParser#ipv4proto}.
	 * @param ctx the parse tree
	 */
	void exitIpv4proto(@NotNull Assignment4grammarParser.Ipv4protoContext ctx);

	/**
	 * Enter a parse tree produced by {@link Assignment4grammarParser#ipv4}.
	 * @param ctx the parse tree
	 */
	void enterIpv4(@NotNull Assignment4grammarParser.Ipv4Context ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment4grammarParser#ipv4}.
	 * @param ctx the parse tree
	 */
	void exitIpv4(@NotNull Assignment4grammarParser.Ipv4Context ctx);

	/**
	 * Enter a parse tree produced by {@link Assignment4grammarParser#flagvalues}.
	 * @param ctx the parse tree
	 */
	void enterFlagvalues(@NotNull Assignment4grammarParser.FlagvaluesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment4grammarParser#flagvalues}.
	 * @param ctx the parse tree
	 */
	void exitFlagvalues(@NotNull Assignment4grammarParser.FlagvaluesContext ctx);

	/**
	 * Enter a parse tree produced by {@link Assignment4grammarParser#ipv4tos}.
	 * @param ctx the parse tree
	 */
	void enterIpv4tos(@NotNull Assignment4grammarParser.Ipv4tosContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment4grammarParser#ipv4tos}.
	 * @param ctx the parse tree
	 */
	void exitIpv4tos(@NotNull Assignment4grammarParser.Ipv4tosContext ctx);

	/**
	 * Enter a parse tree produced by {@link Assignment4grammarParser#protname}.
	 * @param ctx the parse tree
	 */
	void enterProtname(@NotNull Assignment4grammarParser.ProtnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment4grammarParser#protname}.
	 * @param ctx the parse tree
	 */
	void exitProtname(@NotNull Assignment4grammarParser.ProtnameContext ctx);

	/**
	 * Enter a parse tree produced by {@link Assignment4grammarParser#ipv4content}.
	 * @param ctx the parse tree
	 */
	void enterIpv4content(@NotNull Assignment4grammarParser.Ipv4contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment4grammarParser#ipv4content}.
	 * @param ctx the parse tree
	 */
	void exitIpv4content(@NotNull Assignment4grammarParser.Ipv4contentContext ctx);

	/**
	 * Enter a parse tree produced by {@link Assignment4grammarParser#ipv4fields}.
	 * @param ctx the parse tree
	 */
	void enterIpv4fields(@NotNull Assignment4grammarParser.Ipv4fieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment4grammarParser#ipv4fields}.
	 * @param ctx the parse tree
	 */
	void exitIpv4fields(@NotNull Assignment4grammarParser.Ipv4fieldsContext ctx);

	/**
	 * Enter a parse tree produced by {@link Assignment4grammarParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(@NotNull Assignment4grammarParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment4grammarParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(@NotNull Assignment4grammarParser.TimeContext ctx);

	/**
	 * Enter a parse tree produced by {@link Assignment4grammarParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(@NotNull Assignment4grammarParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link Assignment4grammarParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(@NotNull Assignment4grammarParser.TagContext ctx);
}