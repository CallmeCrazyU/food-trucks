package www.coisini.xyz.utils;

import com.alibaba.fastjson2.JSONObject;
import com.univocity.parsers.common.ParsingContext;
import com.univocity.parsers.common.processor.RowProcessor;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;

import java.io.File;
import java.nio.charset.Charset;
import java.util.List;

public class Utils {
    public static void main(String[] args) {
        File file = new File("data/Mobile_Food_Facility_Permit.csv");
        readCsvByUnivocity(file);
    }


    public static List<String[]> readCsvByUnivocity(File file) {

        CsvParserSettings parserSettings = new CsvParserSettings();
        parserSettings.setDelimiterDetectionEnabled(true); //自动探测分隔符
        //把第一个解析行看作文件中每个列的标题
        parserSettings.setHeaderExtractionEnabled(true);

        RowProcessor rowProcessor = new RowProcessor() {
            @Override
            public void processStarted(ParsingContext context) {
                System.out.println("开始处理");
                System.out.println(JSONObject.toJSONString(context));
            }

            @Override
            public void rowProcessed(String[] row, ParsingContext context) {
                System.out.println("开始处理行数据");
                System.out.println(JSONObject.toJSONString(row));
            }

            @Override
            public void processEnded(ParsingContext context) {
                System.out.println(context.currentLine());
                System.out.println(JSONObject.toJSONString(context));
            }
        };
        parserSettings.setMaxCharsPerColumn(40960);
        parserSettings.setMaxColumns(51200);
        parserSettings.setProcessor(rowProcessor);
        CsvParser csvParser =  new CsvParser(parserSettings);
        List<String[]> rows = csvParser.parseAll(file, Charset.defaultCharset());
        System.out.println(rows.size());

//        System.out.println(JSONObject.toJSONString(csvParser.getParsedHeaders()));

         return rows;
    }
}
