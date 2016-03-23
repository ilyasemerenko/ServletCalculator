import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by SemerenkoIlya on 22.03.2016.
 */
public class Calculator {
    private static HashMap<String,Integer> operMap;
    private String operation;
    static{
        operMap = new HashMap();
        operMap.put("add",1);
        operMap.put("sub",-1);
        operMap.put("mul",2);
        operMap.put("div",-2);
    }

    private BigDecimal[] parseQuery(HttpServletRequest request){
        BigDecimal[] operands = new BigDecimal[2];
        String query = request.getQueryString();
        int splitIndex = query.indexOf("&");
        operation = query.substring(query.indexOf("=")+1,splitIndex);
        String operandsStr = query.substring(splitIndex+1);
        String first = operandsStr.substring(operandsStr.indexOf("=")+1,operandsStr.indexOf("&"));
        String second = operandsStr.substring(operandsStr.lastIndexOf("=")+1);
        try {
            operands[0] = BigDecimal.valueOf(Double.valueOf(first));
            operands[1] = BigDecimal.valueOf(Double.valueOf(second));
        } catch(NumberFormatException e){
            e.printStackTrace();
        }
        return operands;
    }

    public BigDecimal getResult(HttpServletRequest request){
        BigDecimal [] operands = parseQuery(request);
        switch (operMap.get(operation)){
            case 1:
                return operands[0].add(operands[1]);
            case -1:
                return operands[0].subtract(operands[1]);
            case 2:
                return operands[0].multiply(operands[1]);
            case -2:
                return operands[0].divide(operands[1]);
            default:
                return null;
        }
    }
}
