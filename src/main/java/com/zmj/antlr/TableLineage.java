package com.zmj.antlr;

import com.zmj.bean.SourceTarget;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.List;

public class TableLineage extends DemoBaseVisitor<Object>{
    private final List<String> inputsTables = new ArrayList<>();

    private  String outputTable ;

    @Override
    public Object visitInsertStatement(DemoParser.InsertStatementContext ctx) {
        // 提取输出表的表明
        outputTable = ctx.T_QIDENTIFIER().getText();
        return super.visitInsertStatement(ctx);
    }


    @Override
    public Object visitFromClause(DemoParser.FromClauseContext ctx) {
        inputsTables.add(ctx.T_QIDENTIFIER().getText());
        return super.visitFromClause(ctx);
    }

    @Override
    public Object visitJoinClause(DemoParser.JoinClauseContext ctx) {
        inputsTables.add(ctx.T_QIDENTIFIER().getText());
        return super.visitJoinClause(ctx);
    }



    public static List<SourceTarget> lineage(String sql){
        var steam  = CharStreams.fromString(sql);
        var lexer = new DemoLexer(steam);
        var tokens = new CommonTokenStream(lexer);
        var parser = new DemoParser(tokens);

        var tree = parser.statement();

        var tableLineage = new TableLineage();
        tableLineage.visit(tree);

        var edges = new ArrayList<SourceTarget>();
        for (String source : tableLineage.inputsTables) {
            edges.add(new SourceTarget(source, tableLineage.outputTable));

        }
        System.out.println(edges);
        return edges;
    }


    public static void main(String[] args) {
        String sql = "INSERT INTO db.destination SELECT id FROM db.test";

        lineage(sql);


    }

}
