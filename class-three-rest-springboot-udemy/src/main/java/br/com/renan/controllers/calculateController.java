package br.com.renan.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.renan.Math.SimpleMath;
import br.com.renan.converters.NumberConverters;
import br.com.renan.exception.UnsuportMathOperationException;

@RestController
public class calculateController {

    @RequestMapping(value = "sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
        if (!NumberConverters.isNumeric(numberOne) || !NumberConverters.isNumeric(numberTwo))
            throw new UnsuportMathOperationException("please set a numeric value!");

        return SimpleMath.sum(NumberConverters.convertToDouble(numberOne), NumberConverters.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "subtraction/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public double subtraction(@PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo) {

        if (!NumberConverters.isNumeric(numberOne) || !NumberConverters.isNumeric(numberTwo))
            throw new UnsuportMathOperationException("please set a numeric value!");

        return SimpleMath.subtraction(NumberConverters.convertToDouble(numberOne),
                NumberConverters.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "multiplication/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public double multiplication(@PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo

    ) {
        if (!NumberConverters.isNumeric(numberOne) || !NumberConverters.isNumeric(numberTwo))
            throw new UnsuportMathOperationException("please set a numeric value!");

        return SimpleMath.multiplication(NumberConverters.convertToDouble(numberOne),
                NumberConverters.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "division/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public double division(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo

    ) {
        if (!NumberConverters.isNumeric(numberOne) || !NumberConverters.isNumeric(numberTwo))
            throw new UnsuportMathOperationException("please set a numeric value!");

        return SimpleMath.division(NumberConverters.convertToDouble(numberOne),
                NumberConverters.convertToDouble(numberTwo));
    }

}
