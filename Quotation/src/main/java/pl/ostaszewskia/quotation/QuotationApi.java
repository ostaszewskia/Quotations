package pl.ostaszewskia.quotation;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QuotationApi {

    private List<Quotation> quotations;

    public QuotationApi() {
        this.quotations = new ArrayList<>();
        quotations.add(new Quotation("asdasd","asdasd"));
        quotations.add(new Quotation("zxczxc","zxczxc"));
        quotations.add(new Quotation("qweqwe","qweqwe"));

    }

    @GetMapping("/quotation")
    public List<Quotation> getQuotations() {
        return quotations;
    }


    @PostMapping("/quotation")
    public boolean addQuotation(@RequestBody Quotation quotation){
        return quotations.add(quotation);
    }

    @DeleteMapping("/quotation")
    public void deleteQuotation(@RequestParam int index){
        quotations.remove(index);
    }
}
