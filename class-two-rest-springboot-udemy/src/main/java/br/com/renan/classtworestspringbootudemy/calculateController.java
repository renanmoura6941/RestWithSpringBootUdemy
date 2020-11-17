package br.com.renan.classtworestspringbootudemy;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calculateController {

    @RequestMapping(value = "sum/number/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)
            throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new Exception();

        }
        double sum = convertToDouble(numberOne) + convertToDouble(numberTwo);

        return sum;
    }

    private boolean isNumeric(String strNumber) {
        if (strNumber == null)
            return false;
        String number = strNumber.replace(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");

    }

    private double convertToDouble(String strNumber) {
        if (strNumber == null)
            return 0D;

        String number = strNumber.replace(",", ".");

        if (isNumeric(number))
            return Double.parseDouble(number);

        return 0D;
    }

}
