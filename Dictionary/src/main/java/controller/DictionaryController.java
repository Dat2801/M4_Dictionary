package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
    //@RequestMapping("dictionary")
public class DictionaryController {
    private static Map<String, String > map = new HashMap<>();
    static {
        map.put("search", "Tìm kiếm");
        map.put("dog", "chó");
        map.put("cat", "mèo");
    }
    @GetMapping("dictionary")
    public ModelAndView showDictionary() {
        ModelAndView modelAndView = new ModelAndView("list");
        return modelAndView;
    }
    @PostMapping("dictionary")
    public ModelAndView Dictionary(String word){
        ModelAndView modelAndView = new ModelAndView("list");
        String result = map.get(word);
        modelAndView.addObject("word", word);
        modelAndView.addObject("result", result);
        return modelAndView;
    }
}
