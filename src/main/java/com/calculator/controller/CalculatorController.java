package com.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping("/calculator")
    public String calculator() {
        return "<h3>It's a simple calculator, where user can insert input through query parameter. for example : /sum?num1=10&num2=20 and same for /sub, /mul, /div</h3>";
    }

    //    serve get request for every operation using query param
    @GetMapping("/sum")
    public String sum(@RequestParam("num1") int n1, @RequestParam("num2") int n2) {
        return "<h3>Summation of " + n1 + " + " + n2 + " = " + (n1 + n2) + "<h3>";
    }

    @GetMapping("/sub")
    public String sub(@RequestParam("num1") int n1, @RequestParam("num2") int n2) {
        if (n1 - n2 > 0) {
            return "<h3>Substraction of " + n1 + " - " + n2 + " = " + (n1 - n2) + "<h3>";
        } else {
            return "<h3>Substraction of " + n2 + " - " + n1 + " = " + (n2 - n1) + "<h3>";
        }
    }

    @GetMapping("/mul")
    public String mul(@RequestParam("num1") int n1, @RequestParam("num2") int n2) {
        return "<h3>Multiplication of " + n1 + " * " + n2 + " = " + (n1 * n2) + "<h3>";
    }

    @GetMapping("/div")
    public String div(@RequestParam("num1") int n1, @RequestParam("num2") int n2) {
        return "<h3>Divition of " + n1 + " / " + n2 + " = " + ((double) n1 / n2) + "<h3>";
    }

}
