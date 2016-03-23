import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

public class CalculatorAction {
    private String operation;

    private List<Double> parseQuery(HttpServletRequest request){
        List<Double> operands = new ArrayList<>();
        String query = request.getQueryString();
        int splitIndex = query.indexOf("&");
        operation = query.substring(query.indexOf("=")+1,splitIndex);
        String operandsStr = query.substring(splitIndex+1);
        String first = operandsStr.substring(operandsStr.indexOf("=")+1,operandsStr.indexOf("&"));
        String second = operandsStr.substring(operandsStr.lastIndexOf("=")+1);
        try {
            operands.add(Double.valueOf(first));
            operands.add(Double.valueOf(second));
        } catch(NumberFormatException e){
            e.printStackTrace();
        }
        return operands;
    }

    public Double getResult(HttpServletRequest request) throws Exception {
        List<Double> operands = parseQuery(request);
        switch (operation){
            case "add":
                return operands.get(0) + operands.get(1);
            case "sub":
                return operands.get(0) - operands.get(1);
            case "mul":
                return operands.get(0) * operands.get(1);
            case "div":
                return operands.get(0) / operands.get(1);
            default:
                throw new Exception("wrong values");
        }
    }
}
