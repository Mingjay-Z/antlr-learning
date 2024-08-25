import com.zmj.antlr.DemoLexer;
import com.zmj.antlr.DemoParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.atn.PredictionMode;

public class TestSql {
    public static void main(String[] args) {
        String sql = "select * from demo t1 left join nn t2 on t1.id = t2.id";


    }


    public void run(String sql){

        ANTLRInputStream antlrInputStream = new ANTLRInputStream(sql);

        DemoLexer demoLexer = new DemoLexer(antlrInputStream);

        CommonTokenStream commonTokenStream = new CommonTokenStream(demoLexer);
        DemoParser demoParser = new DemoParser(commonTokenStream);
        demoParser.getInterpreter().setPredictionMode(PredictionMode.SLL)

        ;
    }
}
