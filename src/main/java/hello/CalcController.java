package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

    private static final String template = "result: %s";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/add")
    public Calc add(@RequestParam(value="number1", defaultValue="1") String number1, 
                    @RequestParam(value="number2", defaultValue="2") String number2) {
        int result = Integer.parseInt(number1) + Integer.parseInt(number2);  
        return new Calc(counter.incrementAndGet(), String.format(template, String.valueOf(result)));
    }

    @RequestMapping("/sub")
    public Calc sub(@RequestParam(value="number1", defaultValue="1") String number1, 
                    @RequestParam(value="number2", defaultValue="2") String number2) {
        int result = Integer.parseInt(number1) - Integer.parseInt(number2);  
        return new Calc(counter.incrementAndGet(), String.format(template, String.valueOf(result)));
    }

    @RequestMapping("/mul")
    public Calc mul(@RequestParam(value="number1", defaultValue="1") String number1, 
                    @RequestParam(value="number2", defaultValue="2") String number2) {
        int result = Integer.parseInt(number1) * Integer.parseInt(number2);  
        return new Calc(counter.incrementAndGet(), String.format(template, String.valueOf(result)));
    }

    @RequestMapping("/div")
    public Calc div(@RequestParam(value="number1", defaultValue="1") String number1, 
                    @RequestParam(value="number2", defaultValue="2") String number2) {
        int result = Integer.parseInt(number1) / Integer.parseInt(number2);  
        return new Calc(counter.incrementAndGet(), String.format(template, String.valueOf(result)));
    }

    @RequestMapping("/mod")
    public Calc mod(@RequestParam(value="number1", defaultValue="1") String number1, 
                    @RequestParam(value="number2", defaultValue="2") String number2) {
        int result = Integer.parseInt(number1) % Integer.parseInt(number2);  
        return new Calc(counter.incrementAndGet(), String.format(template, String.valueOf(result)));
    }
}
